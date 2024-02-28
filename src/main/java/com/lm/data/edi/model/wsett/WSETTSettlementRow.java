package com.lm.data.edi.model.wsett;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WSETTSettlementRow {

    private String settlementCurrencyISOCode;
    private String settlementCurrencyILUCode;
    private String M02RecordsNumberForCurrency;
    private String centralSettlementCashAmountTotal;
    private String centralSettlementDeferredAmountTotal;
    private String centralSettlementReserveReleaseAmountTotal;
    private String centralSettlementTTYStatementAmountTotal;
    private String centralSettlementClaimAmountTotal;
    private String nonCentralSettlementCashAmountTotal;
    private String nonCentralSettlementDeferredAmountTotal;
    private String nonCentralSettlementReserveReleaseAmountTotal;
    private String nonCentralSettlementTTYStatementAmountTotal;
    private String nonCentralSettlementClaimAmountTotal;
    private String companyIdentificationDSIGNGroupCode;


    private String brokerCodeShort;
    private String M02RecordsNumberPerCurrencyAndBroker;
    private String brokerCode;
    private String carrierIdentificationCode;
    private String carrierIdentificationDSIGNGroupCode;


    private String carrierReference;
    private String carrierShortName;
    private String brokerShortCode;
    private String brokerReference;
    private String brokerShortName;
    private String entryType;
    private String policySigningAccountingOfficeNumber;
    private String carriersProportionAmountOriginalCurrency;
    private String carriersProportionAmountSettlementCurrency;
    private String defferedPaymentIndicator;
    private String settledInOriginalCurrencyIndicator;
    private String originalCurrencyILUCode;
    private String originalCurrencyISOCode;
    private String centralSettlementIndicator;
    private String settlementActualPaymentDate;
    private String settlementPeriodStartDate;
    private String settlementPeriodEndDate;
    private String carrierSecondaryReference;
    private String nettInstalmentDateOn;
    private String brokerSecondaryReference;
    private String carrierIdentificationGroupCode;

    private String numberOfRecordsInTheFile;



}
