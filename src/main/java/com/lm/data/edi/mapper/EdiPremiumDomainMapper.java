package com.lm.data.edi.mapper;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.lm.data.edi.dto.PremiumSubmissionDTO;
import com.lm.data.edi.dto.PremiumSubmissionDTO.PremiumSubmissionDTOBuilder;
import com.lm.data.edi.dto.SigningLineDTO;
import com.lm.data.edi.dto.SigningPremiumDTO;
import com.lm.data.edi.dto.SyndicateDetailsDTO;
import com.lm.data.edi.model.ipos.MarketRecord;
import com.lm.data.edi.model.ipos.MarketSyndicate;
import com.lm.data.edi.model.ipos.NaicDetails;
import com.lm.data.edi.model.ipos.PremiumDetail;
import com.lm.data.edi.model.ipos.PremiumEnquiryRecord;
import com.lm.data.edi.model.ipos.PremiumGetRec;
import com.lm.data.edi.model.ipos.SectionDetail;
import com.lm.data.edi.model.ipos.SigningGetRecord;
import com.lm.data.edi.model.ipos.SigningPremiumGet;
import com.lm.data.edi.model.ipos.UsReporting;

public class EdiPremiumDomainMapper {
	
	private PremiumSubmissionDTOBuilder builder;
	
	private EdiPremiumDomainMapper() {
	}
	
	public static EdiPremiumDomainMapper withPremiumId(UUID premiumId) {
		EdiPremiumDomainMapper mapper = new EdiPremiumDomainMapper();
		mapper.builder = PremiumSubmissionDTO.builder().premiumId(premiumId);

		return mapper;
	}
	
	public static EdiPremiumDomainMapper withSubmissionId(UUID submissionId) {
		EdiPremiumDomainMapper mapper = new EdiPremiumDomainMapper();
		mapper.builder = PremiumSubmissionDTO.builder().submissionId(submissionId);

		return mapper;
	}

	public EdiPremiumDomainMapper fetchSettlements(PremiumGetRec premiumGetRecord) {
		this.builder.sectionId(premiumGetRecord.getSectionId());
		this.builder.signingPremium(buildSigningPremium(premiumGetRecord));

		String typeOfCurrency = premiumGetRecord.getSettlementCurrency().getTypeOfCurrency();
		String qualifyingCategoryCode = premiumGetRecord.getQualCatCode().getTypeOfQualCatCode();
		
		buildPremiumSettlements(qualifyingCategoryCode, typeOfCurrency);
	    return this;
	}

	public EdiPremiumDomainMapper fetchSettlements(PremiumDetail premiumDetail) {
		this.builder.signingPremium(buildSigningPremium(premiumDetail));

		
        buildPremiumSettlements(
        		premiumDetail.getQualCatCode().getTypeOfQualCatCode(),
				premiumDetail.getSettlementCurrency().getTypeOfCurrency());
        return this;
	}
	
	public EdiPremiumDomainMapper fetchSettlements(PremiumEnquiryRecord premiumEnquiry) {
		this.builder.signingPremium(buildSigningPremium(premiumEnquiry));
		
		buildPremiumSettlements(null, premiumEnquiry.getSettlementCurrency().getTypeOfCurrency());
        return this;
	}

	public EdiPremiumDomainMapper fetchSigningPremiumDetails(SigningGetRecord signingGetRecord) {
		this.builder.signingPremium(buildSigningPremium(signingGetRecord.getSigningPremiums()));
		
		return this;
	}
	
	public EdiPremiumDomainMapper fetchSigningPremiumDetails(PremiumEnquiryRecord premiumEnquiryRecord) {
		this.builder.signingPremium(buildSigningPremium(premiumEnquiryRecord));
		
		return this;
	}

	public EdiPremiumDomainMapper fetchCompanyReferenceDetails(MarketRecord marketDetail) {
		List<SigningLineDTO> signingLines = marketDetail.getSyndicates().stream()
			.map(syndicate -> new SigningLineDTO(syndicate.getSyndicateReference(), syndicate.getSyndicateSecondaryReference()))
			.collect(Collectors.toList());
		
		this.builder.signingLines(signingLines);
		
		return this;
	}

	private void buildPremiumSettlements(String qualifyingCategoryCode, String settlementCurrencyCode) {
		this.builder.categoryCode(qualifyingCategoryCode);
		this.builder.currencyCode(settlementCurrencyCode);
	}
	
	private List<SigningPremiumDTO> buildSigningPremium(PremiumGetRec premiumGetRecord) {
		SigningPremiumDTO signingPremiumDto = SigningPremiumDTO.builder()
			.accountingType(premiumGetRecord.getAccountingType().getValue())
			.netPremium(premiumGetRecord.getPremiumNet())
			.csnd(premiumGetRecord.getCsnd())
			.naicCode(fetchNaicCodes(premiumGetRecord.getNaicDetails()))
			.riskCode(premiumGetRecord.getRiskCode())
			.usBusinessCategory(fetchUsBusinessCategory(premiumGetRecord.getUsReporting()))
			.build();
		return Arrays.asList(signingPremiumDto);
	}

	private List<SigningPremiumDTO> buildSigningPremium(PremiumDetail premiumDetail) {
		SigningPremiumDTO signingPremiumDto = SigningPremiumDTO.builder()
			.accountingType(premiumDetail.getAccountingType().getValue())
			.netPremium(premiumDetail.getPremiumNet())
			.csnd(premiumDetail.getCsnd())
			.naicCode(fetchNaicCodes(premiumDetail.getNaicDetails()))
			.riskCode(null)
			.usBusinessCategory(fetchUsBusinessCategory(premiumDetail.getUsReporting()))
			.build();
		
		return Arrays.asList(signingPremiumDto);
	}

	private String fetchUsBusinessCategory(UsReporting usReporting) {
		return null != usReporting? usReporting.getUsBusinessCategory().getTypeOfUSBusCat() : null;
	}

	private List<SigningPremiumDTO> buildSigningPremium(PremiumEnquiryRecord premiumEnquiry) {
		SigningPremiumDTO signingPremiumDto = SigningPremiumDTO.builder()
			.netPremium(premiumEnquiry.getNetPremium())
			.csnd(premiumEnquiry.getCsnd())
			.riskCode(premiumEnquiry.getRiskCode())
			.build();
		
		return Arrays.asList(signingPremiumDto);
	}

	private List<SigningPremiumDTO> buildSigningPremium(List<SigningPremiumGet> signingPremiums) {
		List<SigningPremiumDTO> signingPremiumList = signingPremiums.stream()
				.map(signingPremium -> SigningPremiumDTO.builder()
						.netPremium(signingPremium.getPremiumNet())
						.csnd(signingPremium.getCsnd())
						.build())
				.collect(Collectors.toList());
		
		return signingPremiumList;
	}

	private List<String> fetchNaicCodes(NaicDetails naicDetails) {
		
		return null != naicDetails? naicDetails.getNaicCarriers().stream()
				.map(naicCarrier -> naicCarrier.getNaicCode())
				.collect(Collectors.toList()) : null;
	}

	public PremiumSubmissionDTO build() {
		return this.builder.build();
	}

	public EdiPremiumDomainMapper fetchSectionDetails(SectionDetail sectionDetail) {
		List<BigDecimal> sumInsuredAmount = sectionDetail.getSumInsured().stream()
				.map(sumInsured -> sumInsured.getExcessAmount())
				.collect(Collectors.toList());
		this.builder.sumInsuredExcessAmount(sumInsuredAmount);
		this.builder.riskCode(sectionDetail.getRiskCode());
		
		return this;
	}

	public EdiPremiumDomainMapper fetchMarketDetails(MarketRecord marketDetail) {
		this.builder.yearOfAccount(String.valueOf(marketDetail.getYearOfAccount()));
		this.builder.syndicateDetails(buildSyndicateDetails(marketDetail.getSyndicates()));
		
		return this;
	}
	
	private List<SyndicateDetailsDTO> buildSyndicateDetails(List<MarketSyndicate> marketSyndicates) {
		List<SyndicateDetailsDTO> syndicateDetails = marketSyndicates.stream()
				.map(syndicateDetail -> SyndicateDetailsDTO.builder()
						.marketId(String.valueOf(syndicateDetail.getMarketId()))
						.partyId(String.valueOf(syndicateDetail.getPartyId()))
						.syndicateNumber(syndicateDetail.getSyndicateNumber())
						.build())
				.collect(Collectors.toList());
		
		return syndicateDetails;
	}
}
