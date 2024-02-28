package com.lm.data.edi.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import com.lm.data.edi.config.EdiSecretsConfig;
import com.lm.data.edi.model.ipos.PremiumEnquiryRecords;
import com.lm.data.edi.model.ipos.PremiumGetRec;
import com.lm.data.edi.model.ipos.PremiumSubmission;
import com.lm.data.edi.model.ipos.SigningGetRecord;
import com.lm.data.edi.model.ipos.TypeOfRefPremiums;
import com.lm.data.edi.model.ipos.TypeOfTransactionType;
import com.lm.data.edi.util.RestClientUtils;

public class EdiPremiumSubmissionPortalService {
	
	private static final String PREMIUMS_PORTAL_REST_BASE_URI = EdiSecretsConfig.INSTANCE.getPremiumsPortalServiceBaseUri();
	
	private static final String PREMIUMS_API_REST_BASE_URI = "https://www.lm-dev101.com/premiums/prgbst/api/v2";
	
	private static final String URI_PREMIUM_ENQUIRY_POST = "/premiumEnquiry";
	
	private static final String URI_IPOS_SETTLEMENTS_GET = "/ipos/settlements/{settlementId}";
	
	private static final String URI_PREMIUM_DETAILS_GET = "/premiumDetails";
	
	private static final String URI_SECTION_DETAILS_GET = "/sectionDetails";
	
	private static final String URI_PREMIUM_SUBMISSION_GET = "/premiumSubmission";
	
	private static final String URI_PREMIUM_SUBMISSION_SIGNING_GET = "/signingDetails";
	
	public PremiumEnquiryRecords findPremiumEnquiryRecords() {
		PremiumEnquiryRecords premiumGetRecord = RestClientUtils
				.getInstance(PremiumEnquiryRecords.class)
				.withAccessToken(AccessTokenRequest.defaultInstance())
				.executePost(PREMIUMS_PORTAL_REST_BASE_URI + URI_PREMIUM_ENQUIRY_POST);
		
		return premiumGetRecord;
	}
	
	public PremiumSubmission findPremiumSubmission(String premiumId, String submissionId, String transactionTypeId) {
		Map<String, String> queryParams = new LinkedHashMap<>();
		queryParams.put("premiumId", premiumId);
		queryParams.put("submissionId", premiumId);
		queryParams.put("transactionTypeId", transactionTypeId);
		
		PremiumSubmission premiumSubmission = RestClientUtils
				.getInstance(PremiumSubmission.class)
				.withAccessToken(AccessTokenRequest.defaultInstance())
				.executeGet(PREMIUMS_PORTAL_REST_BASE_URI + URI_PREMIUM_SUBMISSION_GET, queryParams);
		
		return premiumSubmission;
	}
	
	public PremiumGetRec findPremiumDetails(String premiumId, TypeOfRefPremiums transactionType) {
		Map<String, String> queryParams = new LinkedHashMap<>();
		queryParams.put("premiumId", premiumId);
		queryParams.put("transactionType", transactionType.getValue());
		
		PremiumGetRec premiumGetRecord = RestClientUtils
				.getInstance(PremiumGetRec.class)
				.withAccessToken(AccessTokenRequest.defaultInstance())
				.executeGet(PREMIUMS_PORTAL_REST_BASE_URI + URI_PREMIUM_DETAILS_GET, queryParams);
		
		return premiumGetRecord;
	}
	
	public TypeOfTransactionType findIposSettlements(String settlementId, String fieldToFetch) {
		String url = PREMIUMS_API_REST_BASE_URI + URI_IPOS_SETTLEMENTS_GET;
		url = url.replace("{settlementId}", settlementId);
		
		TypeOfTransactionType fieldValue = RestClientUtils
				.getInstance(TypeOfTransactionType.class, fieldToFetch)
				.withAccessToken(AccessTokenRequest.defaultInstance())
				.executeGet(url);
		
		return fieldValue;
	}
	
	public String findPremiumDetails(String premiumId, String transactionType, String fieldToFetch) {
		Map<String, String> queryParams = new LinkedHashMap<>();
		queryParams.put("premiumId", premiumId);
		queryParams.put("transactionType", transactionType);
		
		String fieldValue = RestClientUtils
				.getInstance(String.class, fieldToFetch)
				.withAccessToken(AccessTokenRequest.defaultInstance())
				.executeGet(PREMIUMS_PORTAL_REST_BASE_URI + URI_PREMIUM_DETAILS_GET, queryParams);
		
		return fieldValue.toString();
	}
	
	public String findSectionDetails(String sectionId, String fieldToFetch) {
		Map<String, String> queryParams = new LinkedHashMap<>();
		queryParams.put("sectionId", sectionId);
		
		String fieldValue = RestClientUtils
				.getInstance(String.class, fieldToFetch)
				.withAccessToken(AccessTokenRequest.defaultInstance())
				.executeGet(PREMIUMS_PORTAL_REST_BASE_URI + URI_SECTION_DETAILS_GET, queryParams);
		
		return fieldValue.toString();
	}

	public SigningGetRecord findPremiumSubmissionSigningDetails(String submissionId) {
		Map<String, String> queryParams = new LinkedHashMap<>();
		queryParams.put("submissionId", submissionId);
		
		SigningGetRecord signingGetRecord = RestClientUtils
				.getInstance(SigningGetRecord.class)
				.withAccessToken(AccessTokenRequest.defaultInstance())
				.executeGet(PREMIUMS_PORTAL_REST_BASE_URI + URI_PREMIUM_SUBMISSION_SIGNING_GET, queryParams);
		
		return signingGetRecord;
	}
}
