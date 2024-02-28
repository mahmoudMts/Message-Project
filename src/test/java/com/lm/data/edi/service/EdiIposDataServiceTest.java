package com.lm.data.edi.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.lm.data.edi.dto.PremiumSubmissionDTO;
import com.lm.data.edi.model.ipos.PremiumEnquiryRecords;
import com.lm.data.edi.model.ipos.PremiumGetRec;
import com.lm.data.edi.model.ipos.PremiumSubmission;
import com.lm.data.edi.model.ipos.SigningGetRecord;
import com.lm.data.edi.model.ipos.TypeOfRefPremiums;
import com.lm.data.edi.rest.EdiPremiumSubmissionPortalService;
import com.lm.data.edi.util.RestClientUtils;
import com.lm.data.edi.util.TestDataUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// @ExtendWith(MockitoExtension.class)
@Disabled
public class EdiIposDataServiceTest {
	
	private EdiIposDataService ediIposDataService;	
	private EdiPremiumSubmissionPortalService portalService;

	private static final String PREMIUM_ID = "ba717845-9d19-4843-bdfa-6ff2e7d96ee3";
	
	private static final String SUBMISSION_ID = "24a407e7-dfdf-46ad-94f7-a20ade806f8c";
	
	private static final String TRANSACTION_TYPE_ID = "e41ceeb2-cbe1-4565-8632-fe0bdcd1ac45";
	
	@BeforeEach
    void initService() {
		portalService = mock(EdiPremiumSubmissionPortalService.class);
		ediIposDataService = new EdiIposDataService(portalService);
    }
	
//	@Test
//	public void testFindPremiumDetails() {
//		when(portalService.findPremiumEnquiryRecords()).thenReturn(RestClientUtils
//				.getInstance(PremiumEnquiryRecords.class)
//				.transform(TestDataUtils.readString("/premiumEnquiryRecords.json")));
//
//		PremiumSubmissionDTO premiumDetails = ediIposDataService.findPremiumDetails(PREMIUM_ID, SUBMISSION_ID);
//		
//		log.debug("Mapped data: " + premiumDetails);
//		assertThat(premiumDetails, is(notNullValue()));
//	}
//	
//	// @Test
//	public void testFindPremiumSubmissionWithPremiumuId() {
//		when(portalService.findPremiumSubmission(PREMIUM_ID, SUBMISSION_ID, TRANSACTION_TYPE_ID)).thenReturn(RestClientUtils
//				.getInstance(PremiumSubmission.class)
//				.transform(TestDataUtils.readString("/premiumSubmission.json")));
//
//		PremiumSubmissionDTO premiumDetails = ediIposDataService.findPremiumSubmission(PREMIUM_ID, "TEST_ID");
//		
//		log.debug("Mapped data: " + premiumDetails);
//		assertThat(premiumDetails, is(notNullValue()));
//	}
//	
//	@Test
//	public void testFindPremiumSubmission() {
//		when(portalService.findPremiumSubmission(PREMIUM_ID, SUBMISSION_ID, TRANSACTION_TYPE_ID)).thenReturn(RestClientUtils
//				.getInstance(PremiumSubmission.class)
//				.transform(TestDataUtils.readString("/premiumSubmission.json")));
//
//		PremiumSubmissionDTO premiumDetails = ediIposDataService.findPremiumSubmission(PREMIUM_ID, SUBMISSION_ID, TRANSACTION_TYPE_ID);
//		
//		log.debug("Mapped data: " + premiumDetails);
//		assertThat(premiumDetails, is(notNullValue()));
//	}
//	
//	@Test
//	public void testFindPremiumSettlementsOfOriginalPremium() {
//		when(portalService.findPremiumDetails(eq(PREMIUM_ID), any(TypeOfRefPremiums.class))).thenReturn(RestClientUtils
//				.getInstance(PremiumGetRec.class)
//				.transform(TestDataUtils.readString("/premiumDetails.json")));
//
//		PremiumSubmissionDTO premiumDetails = ediIposDataService.findPremiumSettlementsOfOriginalPremium(PREMIUM_ID);
//		
//		log.debug("Mapped data: " + premiumDetails);
//		assertThat(premiumDetails, is(notNullValue()));
//	}
//	
//	@Test
//	public void testFindPremiumSettlementsOfReturnPremium() {
//		when(portalService.findPremiumDetails(eq(PREMIUM_ID), any(TypeOfRefPremiums.class))).thenReturn(RestClientUtils
//				.getInstance(PremiumGetRec.class)
//				.transform(TestDataUtils.readString("/premiumDetails.json")));
//
//		PremiumSubmissionDTO premiumDetails = ediIposDataService.findPremiumSettlementsOfReturnPremium(PREMIUM_ID);
//		
//		log.debug("Mapped data: " + premiumDetails);
//		assertThat(premiumDetails, is(notNullValue()));
//	}
//	
//	@Test
//	public void testFindPremiumSigningDetails() {
//		when(portalService.findPremiumSubmissionSigningDetails(SUBMISSION_ID)).thenReturn(RestClientUtils
//				.getInstance(SigningGetRecord.class)
//				.transform(TestDataUtils.readString("/signingDetails.json")));
//
//		PremiumSubmissionDTO premiumDetails = ediIposDataService.findPremiumSigningDetails(SUBMISSION_ID);
//		
//		log.debug("Mapped data: " + premiumDetails);
//		
//		assertThat(premiumDetails, is(notNullValue()));
//	}
}
