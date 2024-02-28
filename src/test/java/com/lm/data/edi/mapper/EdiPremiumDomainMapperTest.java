package com.lm.data.edi.mapper;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.lm.data.edi.dto.PremiumSubmissionDTO;
import com.lm.data.edi.model.ipos.PremiumDetail;
import com.lm.data.edi.model.ipos.PremiumGetRec;
import com.lm.data.edi.model.ipos.PremiumSubmission;
import com.lm.data.edi.model.ipos.SigningGetRecord;
import com.lm.data.edi.util.RestClientUtils;
import com.lm.data.edi.util.TestDataUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class EdiPremiumDomainMapperTest {
	
	@Test
	public void testFindPremiumDetails() {
		PremiumGetRec premiumGetRecord = RestClientUtils
				.getInstance(PremiumGetRec.class)
				.transform(TestDataUtils.readString("/premiumDetails.json"));
		
		assertThat(premiumGetRecord, is(notNullValue()));
		
		PremiumSubmissionDTO premiumSettlementsDto = EdiPremiumDomainMapper.withPremiumId(premiumGetRecord.getPremiumId())
			.fetchSettlements(premiumGetRecord)
			.build();
		
		log.debug("Mapped data: " + premiumSettlementsDto);
		assertThat(premiumSettlementsDto, is(notNullValue()));
	}
	
	@Test
	public void testFindPremiumSubmissionSigningDetails() {
		SigningGetRecord signingGetRecord = RestClientUtils
				.getInstance(SigningGetRecord.class)
				.transform(TestDataUtils.readString("/signingDetails.json"));
		
		assertThat(signingGetRecord, is(notNullValue()));

		PremiumSubmissionDTO premiumSettlementsDto = EdiPremiumDomainMapper.withSubmissionId(signingGetRecord.getSubmissionId())
			.fetchSigningPremiumDetails(signingGetRecord)
			.build();
		
		log.debug("Mapped data: " + premiumSettlementsDto);
		assertThat(premiumSettlementsDto, is(notNullValue()));
	}
	
	@Test
	public void testFindPremiumSubmissionDetails() {
		PremiumSubmission premiumSubmission = RestClientUtils
				.getInstance(PremiumSubmission.class)
				.transform(TestDataUtils.readString("/premiumSubmission.json"));
		
		assertThat(premiumSubmission, is(notNullValue()));

		PremiumDetail premiumDetail = premiumSubmission.getPremiumDetail();
		PremiumSubmissionDTO premiumSettlementsDto = EdiPremiumDomainMapper.withPremiumId(premiumDetail.getPremiumId())
				.fetchSettlements(premiumDetail)
				.fetchSigningPremiumDetails(premiumSubmission.getSigningRecord())
				.fetchCompanyReferenceDetails(premiumSubmission.getMarketDetail())
				.build();
		
		log.debug("Premium Details extracted: {}", premiumSettlementsDto);
		assertThat(premiumSettlementsDto, is(notNullValue()));
	}
}
