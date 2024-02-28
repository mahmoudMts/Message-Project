package com.lm.data.edi.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SigningPremiumDTO {
	
	/**
	 * SCM->accountingType
	 */
	private String accountingType;
	
	/**
	 * SCM->naiccCodePrefixNAI
	 */
	private List<String> naicCode;

	
	/**
	 * carriersProportionAmountOriginalCurrency
	 * 
	 * originalPremium-SigningPremium/premiumDetails/premiumNet
	 */
	private BigDecimal netPremium;

	
	/**
	 * policySigningAccountingOfficeNumber
	 */
	private String csnd;
	
	/**
	 * processingIndicatorAuditOrRiskCode
	 */
	private String riskCode;
	
	/**
	 * MCM	gisDetails	processingIndicatorBusinessCategoryCode

	 * processingIndicatorBusinessCategoryCode
	 */
	private String usBusinessCategory;
	
}
