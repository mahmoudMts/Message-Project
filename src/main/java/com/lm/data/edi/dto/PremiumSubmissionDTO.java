package com.lm.data.edi.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PremiumSubmissionDTO {
	
	private UUID premiumId;
	
	private UUID sectionId;

	private UUID submissionId;
	
	private List<SigningLineDTO> signingLines;
	
	private List<SigningPremiumDTO> signingPremium;
	
	/**
	 * WSETT -> defferedPaymentIndicator
	 * qualifying_category_code
	 */
	private String categoryCode;
	
	/**
	 * WSETT -> settlementCurrencyISOCode
	 * settlement_currency_code
	 */
	private String currencyCode;
	
	/**
	 * MCM->moaDetails->amount
	 */
	private List<BigDecimal> sumInsuredExcessAmount;
	
	/**
	 * MCM	dateTimeDetails	yearOfAccount
	 * 
	 * OPTIONAL. YEAR OF ACCOUNT .The format is YYYY0000. The value is populated from the view VSMCTL02.YEAR_OF_ACCOUNT for E2 ONLY
	 */
	private String yearOfAccount;
	
	/**
	 * MCM	gisDetails	processingIndicatorAuditOrRiskCode
	 * OPTIONAL.for E3 only. PROCESSING INDICATOR Audit / Risk Code. If qualifier NAC, Values = 000; risk type code <> 2 and audit risk code = blank, value = 00;
	 */
	private String riskCode;
	
	private List<SyndicateDetailsDTO> syndicateDetails;
	
}
