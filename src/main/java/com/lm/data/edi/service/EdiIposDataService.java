package com.lm.data.edi.service;

import java.util.Optional;
import java.util.function.Predicate;

import com.lm.data.edi.dto.PremiumSubmissionDTO;
import com.lm.data.edi.mapper.EdiPremiumDomainMapper;
import com.lm.data.edi.model.ipos.PremiumDetail;
import com.lm.data.edi.model.ipos.PremiumEnquiryRecord;
import com.lm.data.edi.model.ipos.PremiumEnquiryRecords;
import com.lm.data.edi.model.ipos.PremiumGetRec;
import com.lm.data.edi.model.ipos.PremiumSubmission;
import com.lm.data.edi.model.ipos.SigningGetRecord;
import com.lm.data.edi.model.ipos.TypeOfRefPremiums;
import com.lm.data.edi.model.ipos.TypeOfTransactionType;
import com.lm.data.edi.rest.EdiPremiumSubmissionPortalService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EdiIposDataService {

	private EdiPremiumSubmissionPortalService portalService = new EdiPremiumSubmissionPortalService();
	
	public EdiIposDataService() {
		// 
	}
	
	public EdiIposDataService(EdiPremiumSubmissionPortalService portalService) {
		this.portalService = portalService;
	}

	public PremiumSubmissionDTO findPremiumDetails(String premiumId, String submissionId) {
		PremiumEnquiryRecords premiumEnquiryRecords = portalService.findPremiumEnquiryRecords();

		Predicate<PremiumEnquiryRecord> premiumIdPredicate = signing -> signing.getPremiumId().toString().equals(premiumId);
		Predicate<PremiumEnquiryRecord> submissionIdPredicate = signing -> signing.getSubmissionId().toString().equals(submissionId);
		Optional<PremiumEnquiryRecord> premiumEnquiryRecord = premiumEnquiryRecords.getSignings().stream()
			.filter(premiumIdPredicate.and(submissionIdPredicate))
			.findFirst();
		
		PremiumSubmissionDTO premiumSettlementsDto = null;
		if (premiumEnquiryRecord.isPresent()) {
			PremiumEnquiryRecord premiumEnquiry = premiumEnquiryRecord.get();
			
			premiumSettlementsDto = EdiPremiumDomainMapper.withPremiumId(premiumEnquiry.getPremiumId())
					.fetchSigningPremiumDetails(premiumEnquiry)
					.fetchSettlements(premiumEnquiry)
					.build();
		}
		
		log.debug("Premium Details extracted: {}", premiumSettlementsDto);
		
		return premiumSettlementsDto;
	}
	
	/**
	 * To be used by WSETT message call to fetch ipos data.
	 * 
	 * @param premiumId
	 * @return
	 */
	public PremiumSubmissionDTO findPremiumSubmission(String premiumId, String settlementId) {
		TypeOfTransactionType transactionType = portalService.findIposSettlements(settlementId, "transactionType");
		String sectionId = portalService.findPremiumDetails(premiumId, transactionType.getTypeOfTransactionType(), "sectionId");
		String submissionId = portalService.findSectionDetails(sectionId, "submissionId");
		
		return findPremiumSubmission(premiumId, submissionId, transactionType.getRefTypeOfTransactionTypeId().toString());
	}
	
	/**
	 * To be used by WSETT message call to fetch ipos data.
	 * 
	 * @param premiumId
	 * @param submissionId
	 * @param transactionTypeId
	 * @return
	 */
	public PremiumSubmissionDTO findPremiumSubmission(String premiumId, String submissionId, String transactionTypeId) {
		PremiumSubmission premiumSubmission = portalService.findPremiumSubmission(premiumId, submissionId, transactionTypeId);

		PremiumDetail premiumDetail = premiumSubmission.getPremiumDetail();
		PremiumSubmissionDTO premiumSettlementsDto = EdiPremiumDomainMapper.withPremiumId(premiumDetail.getPremiumId())
				.fetchSettlements(premiumDetail)
				.fetchSigningPremiumDetails(premiumSubmission.getSigningRecord())
				.fetchCompanyReferenceDetails(premiumSubmission.getMarketDetail())
				.fetchSectionDetails(premiumSubmission.getSectionDetail())
				.fetchMarketDetails(premiumSubmission.getMarketDetail())
				.build();
		
		log.debug("Premium Details extracted: {}", premiumSettlementsDto);
		
		return premiumSettlementsDto;
	}
	
	public PremiumSubmissionDTO findPremiumSettlementsOfOriginalPremium(String premiumId) {
		return findPremiumSettlements(premiumId, TypeOfRefPremiums.PREMIUM);
	}
	
	public PremiumSubmissionDTO findPremiumSettlementsOfReturnPremium(String premiumId) {
		return findPremiumSettlements(premiumId, TypeOfRefPremiums.LM_RETURN_PREMIUM_RP);
	}

	private PremiumSubmissionDTO findPremiumSettlements(String premiumId, TypeOfRefPremiums premiumType) {
		PremiumGetRec premiumGetRecord = portalService.findPremiumDetails(premiumId, premiumType);
		
		PremiumSubmissionDTO premiumSettlementsDto = EdiPremiumDomainMapper.withPremiumId(premiumGetRecord.getPremiumId())
				.fetchSettlements(premiumGetRecord)
				.build();
		
		return premiumSettlementsDto;
	}
	
	/**
	 * For WSETT
	 * 
	 * To fetch originalPremium-signingPremium details. For ex: netPremium
	 * 
	 * @param submissionId
	 * @return
	 */
	public PremiumSubmissionDTO findPremiumSigningDetails(String submissionId) {
		SigningGetRecord signingGetRecord = portalService.findPremiumSubmissionSigningDetails(submissionId);
		PremiumSubmissionDTO signingDetailsDto = EdiPremiumDomainMapper.withSubmissionId(signingGetRecord.getSubmissionId())
				.fetchSigningPremiumDetails(signingGetRecord)
				.build();
		
		return signingDetailsDto;
	}
}
