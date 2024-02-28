package com.lm.data.edi.model.ilucsb;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SettlementPaymentRow {
	private String marketId;
	private String settlementDate;
	private String companyAccountingCode;
	private String settlementRunNumber;
	private String companyCode;
	private String actualPaymentDate;
	private String settlementCurrencyCode;
	private String brokerCode;
	private String businessCategory;
	private String iluReference;
	private BigDecimal netPremiumClaim;
	private Date settlementDueDate;
	private Integer instalmentNumber;
}
