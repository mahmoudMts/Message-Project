
package com.lm.data.edi.model.wsett;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrierIdentificationCode",
    "carrierReference",
    "carrierShortName",
    "brokerShortCode",
    "brokerReference",
    "brokerShortName",
    "settlementCurrencyILUCode",
    "settlementCurrencyISOCode",
    "policySigningAccountingOfficeNumber",
    "entryType",
    "carriersProportionAmountOriginalCurrency",
    "carriersProportionAmountSettlementCurrency",
    "defferedPaymentIndicator",
    "settledInOriginalCurrencyIndicator",
    "originalCurrencyILUCode",
    "originalCurrencyISOCode",
    "centralSettlementIndicator",
    "settlementActualPaymentDate",
    "settlementPeriodStartDate",
    "settlementPeriodEndDate",
    "carrierSecondaryReference",
    "nettInstalmentDateOn",
    "brokerSecondaryReference",
    "brokerCode",
    "carrierIdentificationGroupCode",
    "carrierIdentificationDSIGNGroupCode"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SettlementTransactionDetailM02Inner {

    /**
     * A unique code allocated by Lirma to a Company for identification purposes. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationCode")
    @JsonPropertyDescription("A unique code allocated by Lirma to a Company for identification purposes. Pattern tbc or ignored, but as per the examples provided is matching.")
    @Pattern(regexp = "[A-Z][0-9]{5}")
    @NotNull
    private String carrierIdentificationCode;
    /**
     * The reference allocated by a Company or Syndicate Underwriter at time of writing a Risk
     * (Required)
     * 
     */
    @JsonProperty("carrierReference")
    @JsonPropertyDescription("The reference allocated by a Company or Syndicate Underwriter at time of writing a Risk")
    @Pattern(regexp = "[A-Za-z0-9]{12}")
    @NotNull
    private String carrierReference;
    /**
     * Member short name.
     * (Required)
     * 
     */
    @JsonProperty("carrierShortName")
    @JsonPropertyDescription("Member short name.")
    @Size(max = 12)
    @NotNull
    private String carrierShortName;
    /**
     * The last 3 characters of the 4 character broker code which uniquely identifies each broker. Also see brokerCode (BROKER-CODE-4) for the 4 digit Broker Code logic. Pattern for non lloyd's brokers TBC from Parties
     * (Required)
     * 
     */
    @JsonProperty("brokerShortCode")
    @JsonPropertyDescription("The last 3 characters of the 4 character broker code which uniquely identifies each broker. Also see brokerCode (BROKER-CODE-4) for the 4 digit Broker Code logic. Pattern for non lloyd's brokers TBC from Parties")
    @Pattern(regexp = "[A-Za-z0-9]{3}")
    @NotNull
    private String brokerShortCode;
    /**
     * The primary reference allocated by a Broker to a transaction.
     * (Required)
     * 
     */
    @JsonProperty("brokerReference")
    @JsonPropertyDescription("The primary reference allocated by a Broker to a transaction.")
    @Size(max = 12)
    @NotNull
    private String brokerReference;
    /**
     * Short name of the broker involved.
     * (Required)
     * 
     */
    @JsonProperty("brokerShortName")
    @JsonPropertyDescription("Short name of the broker involved.")
    @Size(max = 20)
    @NotNull
    private String brokerShortName;
    /**
     * The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyILUCode")
    @JsonPropertyDescription("The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.")
    @NotNull
    private TotalPerCurrencyM08Inner.IluCurrencyCode settlementCurrencyILUCode;
    /**
     * The ISO code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. TBC the Settlement curencies used (Obsolete currencies removed-ITL, DEM, FRF, NLG). Note that if JPY- no decimal point is used.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyISOCode")
    @JsonPropertyDescription("The ISO code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. TBC the Settlement curencies used (Obsolete currencies removed-ITL, DEM, FRF, NLG). Note that if JPY- no decimal point is used.")
    @NotNull
    private TotalPerCurrencyM08Inner.WsettIsoCurrencyCode settlementCurrencyISOCode;
    /**
     * A unique reference allocated by Lirma to a Broker transaction it has processed, by which the Bureau is able to identify, access and link associated data. See Appendix 1. PSACNO GROUPS PREFIX, SIGNDATE,TYPE-OF-NO AND REM
     * (Required)
     * 
     */
    @JsonProperty("policySigningAccountingOfficeNumber")
    @JsonPropertyDescription("A unique reference allocated by Lirma to a Broker transaction it has processed, by which the Bureau is able to identify, access and link associated data. See Appendix 1. PSACNO GROUPS PREFIX, SIGNDATE,TYPE-OF-NO AND REM")
    @Size(max = 14)
    @NotNull
    private String policySigningAccountingOfficeNumber;
    /**
     * The two character entry type code allocated to identify the type of transaction. Original Premium (PM), Additional Premium (AP), Return Premium (RP), Claim (CL), Claim Refund (RC), CPA Claim (CP), CPA Claim Refund (CA), Treaty Statement Credit (TC), Treaty Statement Debit (TD).
     * (Required)
     * 
     */
    @JsonProperty("entryType")
    @JsonPropertyDescription("The two character entry type code allocated to identify the type of transaction. Original Premium (PM), Additional Premium (AP), Return Premium (RP), Claim (CL), Claim Refund (RC), CPA Claim (CP), CPA Claim Refund (CA), Treaty Statement Credit (TC), Treaty Statement Debit (TD).")
    @NotNull
    private SettlementTransactionDetailM02Inner.EntryType entryType;
    /**
     * The Company Proportion of the nett premium, or claim, expressed in original currency. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("carriersProportionAmountOriginalCurrency")
    @JsonPropertyDescription("The Company Proportion of the nett premium, or claim, expressed in original currency. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String carriersProportionAmountOriginalCurrency;
    /**
     * The Company Proportion of the nett premium, or claim, expressed in settlement currency. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("carriersProportionAmountSettlementCurrency")
    @JsonPropertyDescription("The Company Proportion of the nett premium, or claim, expressed in settlement currency. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String carriersProportionAmountSettlementCurrency;
    /**
     * This element will only be present if the transaction was signed on a deferred basis. D - Deferred payment Or Blank
     * 
     */
    @JsonProperty("defferedPaymentIndicator")
    @JsonPropertyDescription("This element will only be present if the transaction was signed on a deferred basis. D - Deferred payment Or Blank")
    private DefferedPaymentIndicator defferedPaymentIndicator;
    /**
     * An indicator to denote if the signing has been settled in the original currency. 'Y' - Yes, 'N' - No
     * (Required)
     * 
     */
    @JsonProperty("settledInOriginalCurrencyIndicator")
    @JsonPropertyDescription("An indicator to denote if the signing has been settled in the original currency. 'Y' - Yes, 'N' - No")
    @NotNull
    private SettlementTransactionDetailM02Inner.SettledInOriginalCurrencyIndicator settledInOriginalCurrencyIndicator;
    /**
     * The old ILU style currency code of the currency in which the transaction was closed. Not sent for Treaty FDOs. For Treaty is replaced with ISO code
     * (Required)
     * 
     */
    @JsonProperty("originalCurrencyILUCode")
    @JsonPropertyDescription("The old ILU style currency code of the currency in which the transaction was closed. Not sent for Treaty FDOs. For Treaty is replaced with ISO code")
    @Size(max = 3)
    @NotNull
    private String originalCurrencyILUCode;
    /**
     * The ISO code of the currency in which the transaction was closed. Not sent for Treaty FDOs
     * 
     */
    @JsonProperty("originalCurrencyISOCode")
    @JsonPropertyDescription("The ISO code of the currency in which the transaction was closed. Not sent for Treaty FDOs")
    @Size(max = 3)
    private String originalCurrencyISOCode;
    /**
     * Central settlement indicator, where 'Y'-  Settled via Lirma, 'N' - Settled externally to Lirma and 'S'- Suspended
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementIndicator")
    @JsonPropertyDescription("Central settlement indicator, where 'Y'-  Settled via Lirma, 'N' - Settled externally to Lirma and 'S'- Suspended")
    @NotNull
    private SettlementTransactionDetailM02Inner.CentralSettlementIndicator centralSettlementIndicator;
    /**
     * The actual payment date upon which it is agreed that settlement of a particular transaction amount will take place between the Broker and the Bureau or Underwriter. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementActualPaymentDate")
    @JsonPropertyDescription("The actual payment date upon which it is agreed that settlement of a particular transaction amount will take place between the Broker and the Bureau or Underwriter. DPS Date Stardard applied.")
    @NotNull
    private String settlementActualPaymentDate;
    /**
     * The first date of the settlement period. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementPeriodStartDate")
    @JsonPropertyDescription("The first date of the settlement period. DPS Date Stardard applied.")
    @NotNull
    private String settlementPeriodStartDate;
    /**
     * The last date of the settlement period. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementPeriodEndDate")
    @JsonPropertyDescription("The last date of the settlement period. DPS Date Stardard applied.")
    @NotNull
    private String settlementPeriodEndDate;
    /**
     * TA secondary reference allocated by a Company or Syndicate Underwriter at the time of writing a Risk.
     * 
     */
    @JsonProperty("carrierSecondaryReference")
    @JsonPropertyDescription("TA secondary reference allocated by a Company or Syndicate Underwriter at the time of writing a Risk.")
    @Size(max = 12)
    private String carrierSecondaryReference;
    /**
     * The date on which it was agreed the nett instalment should take place.
     * (Required)
     * 
     */
    @JsonProperty("nettInstalmentDateOn")
    @JsonPropertyDescription("The date on which it was agreed the nett instalment should take place.")
    @NotNull
    private String nettInstalmentDateOn;
    /**
     * The secondary reference allocated by a Broker to a transaction. Pattern hasn't been added as not enough data samples to prove- TS states X(12) and the example given is numeric only.
     * (Required)
     * 
     */
    @JsonProperty("brokerSecondaryReference")
    @JsonPropertyDescription("The secondary reference allocated by a Broker to a transaction. Pattern hasn't been added as not enough data samples to prove- TS states X(12) and the example given is numeric only.")
    @Size(max = 12)
    @NotNull
    private String brokerSecondaryReference;
    /**
     * A four character code which uniquely identifies each broker. For Lloyds it is a four digit code (could start with '0') For Non-Lloyds brokers- Alphanumerical code- pattern to be proved.
     * (Required)
     * 
     */
    @JsonProperty("brokerCode")
    @JsonPropertyDescription("A four character code which uniquely identifies each broker. For Lloyds it is a four digit code (could start with '0') For Non-Lloyds brokers- Alphanumerical code- pattern to be proved.")
    @Pattern(regexp = "[A-Za-z0-9]{4}")
    @NotNull
    private String brokerCode;
    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationGroupCode")
    @JsonPropertyDescription("A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.")
    @Pattern(regexp = "[A-Z][0-9]{2}")
    @NotNull
    private String carrierIdentificationGroupCode;
    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationDSIGNGroupCode")
    @JsonPropertyDescription("A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.")
    @Pattern(regexp = "[A-Z][0-9]{2}")
    @NotNull
    private String carrierIdentificationDSIGNGroupCode;

    /**
     * A unique code allocated by Lirma to a Company for identification purposes. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationCode")
    public String getCarrierIdentificationCode() {
        return carrierIdentificationCode;
    }

    /**
     * A unique code allocated by Lirma to a Company for identification purposes. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationCode")
    public void setCarrierIdentificationCode(String carrierIdentificationCode) {
        this.carrierIdentificationCode = carrierIdentificationCode;
    }

    /**
     * The reference allocated by a Company or Syndicate Underwriter at time of writing a Risk
     * (Required)
     * 
     */
    @JsonProperty("carrierReference")
    public String getCarrierReference() {
        return carrierReference;
    }

    /**
     * The reference allocated by a Company or Syndicate Underwriter at time of writing a Risk
     * (Required)
     * 
     */
    @JsonProperty("carrierReference")
    public void setCarrierReference(String carrierReference) {
        this.carrierReference = carrierReference;
    }

    /**
     * Member short name.
     * (Required)
     * 
     */
    @JsonProperty("carrierShortName")
    public String getCarrierShortName() {
        return carrierShortName;
    }

    /**
     * Member short name.
     * (Required)
     * 
     */
    @JsonProperty("carrierShortName")
    public void setCarrierShortName(String carrierShortName) {
        this.carrierShortName = carrierShortName;
    }

    /**
     * The last 3 characters of the 4 character broker code which uniquely identifies each broker. Also see brokerCode (BROKER-CODE-4) for the 4 digit Broker Code logic. Pattern for non lloyd's brokers TBC from Parties
     * (Required)
     * 
     */
    @JsonProperty("brokerShortCode")
    public String getBrokerShortCode() {
        return brokerShortCode;
    }

    /**
     * The last 3 characters of the 4 character broker code which uniquely identifies each broker. Also see brokerCode (BROKER-CODE-4) for the 4 digit Broker Code logic. Pattern for non lloyd's brokers TBC from Parties
     * (Required)
     * 
     */
    @JsonProperty("brokerShortCode")
    public void setBrokerShortCode(String brokerShortCode) {
        this.brokerShortCode = brokerShortCode;
    }

    /**
     * The primary reference allocated by a Broker to a transaction.
     * (Required)
     * 
     */
    @JsonProperty("brokerReference")
    public String getBrokerReference() {
        return brokerReference;
    }

    /**
     * The primary reference allocated by a Broker to a transaction.
     * (Required)
     * 
     */
    @JsonProperty("brokerReference")
    public void setBrokerReference(String brokerReference) {
        this.brokerReference = brokerReference;
    }

    /**
     * Short name of the broker involved.
     * (Required)
     * 
     */
    @JsonProperty("brokerShortName")
    public String getBrokerShortName() {
        return brokerShortName;
    }

    /**
     * Short name of the broker involved.
     * (Required)
     * 
     */
    @JsonProperty("brokerShortName")
    public void setBrokerShortName(String brokerShortName) {
        this.brokerShortName = brokerShortName;
    }

    /**
     * The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyILUCode")
    public TotalPerCurrencyM08Inner.IluCurrencyCode getSettlementCurrencyILUCode() {
        return settlementCurrencyILUCode;
    }

    /**
     * The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyILUCode")
    public void setSettlementCurrencyILUCode(TotalPerCurrencyM08Inner.IluCurrencyCode settlementCurrencyILUCode) {
        this.settlementCurrencyILUCode = settlementCurrencyILUCode;
    }

    /**
     * The ISO code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. TBC the Settlement curencies used (Obsolete currencies removed-ITL, DEM, FRF, NLG). Note that if JPY- no decimal point is used.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyISOCode")
    public TotalPerCurrencyM08Inner.WsettIsoCurrencyCode getSettlementCurrencyISOCode() {
        return settlementCurrencyISOCode;
    }

    /**
     * The ISO code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. TBC the Settlement curencies used (Obsolete currencies removed-ITL, DEM, FRF, NLG). Note that if JPY- no decimal point is used.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyISOCode")
    public void setSettlementCurrencyISOCode(TotalPerCurrencyM08Inner.WsettIsoCurrencyCode settlementCurrencyISOCode) {
        this.settlementCurrencyISOCode = settlementCurrencyISOCode;
    }

    /**
     * A unique reference allocated by Lirma to a Broker transaction it has processed, by which the Bureau is able to identify, access and link associated data. See Appendix 1. PSACNO GROUPS PREFIX, SIGNDATE,TYPE-OF-NO AND REM
     * (Required)
     * 
     */
    @JsonProperty("policySigningAccountingOfficeNumber")
    public String getPolicySigningAccountingOfficeNumber() {
        return policySigningAccountingOfficeNumber;
    }

    /**
     * A unique reference allocated by Lirma to a Broker transaction it has processed, by which the Bureau is able to identify, access and link associated data. See Appendix 1. PSACNO GROUPS PREFIX, SIGNDATE,TYPE-OF-NO AND REM
     * (Required)
     * 
     */
    @JsonProperty("policySigningAccountingOfficeNumber")
    public void setPolicySigningAccountingOfficeNumber(String policySigningAccountingOfficeNumber) {
        this.policySigningAccountingOfficeNumber = policySigningAccountingOfficeNumber;
    }

    /**
     * The two character entry type code allocated to identify the type of transaction. Original Premium (PM), Additional Premium (AP), Return Premium (RP), Claim (CL), Claim Refund (RC), CPA Claim (CP), CPA Claim Refund (CA), Treaty Statement Credit (TC), Treaty Statement Debit (TD).
     * (Required)
     * 
     */
    @JsonProperty("entryType")
    public EntryType getEntryType() {
        return entryType;
    }

    /**
     * The two character entry type code allocated to identify the type of transaction. Original Premium (PM), Additional Premium (AP), Return Premium (RP), Claim (CL), Claim Refund (RC), CPA Claim (CP), CPA Claim Refund (CA), Treaty Statement Credit (TC), Treaty Statement Debit (TD).
     * (Required)
     * 
     */
    @JsonProperty("entryType")
    public void setEntryType(EntryType entryType) {
        this.entryType = entryType;
    }

    /**
     * The Company Proportion of the nett premium, or claim, expressed in original currency. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("carriersProportionAmountOriginalCurrency")
    public String getCarriersProportionAmountOriginalCurrency() {
        return carriersProportionAmountOriginalCurrency;
    }

    /**
     * The Company Proportion of the nett premium, or claim, expressed in original currency. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("carriersProportionAmountOriginalCurrency")
    public void setCarriersProportionAmountOriginalCurrency(String carriersProportionAmountOriginalCurrency) {
        this.carriersProportionAmountOriginalCurrency = carriersProportionAmountOriginalCurrency;
    }

    /**
     * The Company Proportion of the nett premium, or claim, expressed in settlement currency. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("carriersProportionAmountSettlementCurrency")
    public String getCarriersProportionAmountSettlementCurrency() {
        return carriersProportionAmountSettlementCurrency;
    }

    /**
     * The Company Proportion of the nett premium, or claim, expressed in settlement currency. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("carriersProportionAmountSettlementCurrency")
    public void setCarriersProportionAmountSettlementCurrency(String carriersProportionAmountSettlementCurrency) {
        this.carriersProportionAmountSettlementCurrency = carriersProportionAmountSettlementCurrency;
    }

    /**
     * This element will only be present if the transaction was signed on a deferred basis. D - Deferred payment Or Blank
     * 
     */
    @JsonProperty("defferedPaymentIndicator")
    public DefferedPaymentIndicator getDefferedPaymentIndicator() {
        return defferedPaymentIndicator;
    }

    /**
     * This element will only be present if the transaction was signed on a deferred basis. D - Deferred payment Or Blank
     * 
     */
    @JsonProperty("defferedPaymentIndicator")
    public void setDefferedPaymentIndicator(DefferedPaymentIndicator defferedPaymentIndicator) {
        this.defferedPaymentIndicator = defferedPaymentIndicator;
    }

    /**
     * An indicator to denote if the signing has been settled in the original currency. 'Y' - Yes, 'N' - No
     * (Required)
     * 
     */
    @JsonProperty("settledInOriginalCurrencyIndicator")
    public SettledInOriginalCurrencyIndicator getSettledInOriginalCurrencyIndicator() {
        return settledInOriginalCurrencyIndicator;
    }

    /**
     * An indicator to denote if the signing has been settled in the original currency. 'Y' - Yes, 'N' - No
     * (Required)
     * 
     */
    @JsonProperty("settledInOriginalCurrencyIndicator")
    public void setSettledInOriginalCurrencyIndicator(SettledInOriginalCurrencyIndicator settledInOriginalCurrencyIndicator) {
        this.settledInOriginalCurrencyIndicator = settledInOriginalCurrencyIndicator;
    }

    /**
     * The old ILU style currency code of the currency in which the transaction was closed. Not sent for Treaty FDOs. For Treaty is replaced with ISO code
     * (Required)
     * 
     */
    @JsonProperty("originalCurrencyILUCode")
    public String getOriginalCurrencyILUCode() {
        return originalCurrencyILUCode;
    }

    /**
     * The old ILU style currency code of the currency in which the transaction was closed. Not sent for Treaty FDOs. For Treaty is replaced with ISO code
     * (Required)
     * 
     */
    @JsonProperty("originalCurrencyILUCode")
    public void setOriginalCurrencyILUCode(String originalCurrencyILUCode) {
        this.originalCurrencyILUCode = originalCurrencyILUCode;
    }

    /**
     * The ISO code of the currency in which the transaction was closed. Not sent for Treaty FDOs
     * 
     */
    @JsonProperty("originalCurrencyISOCode")
    public String getOriginalCurrencyISOCode() {
        return originalCurrencyISOCode;
    }

    /**
     * The ISO code of the currency in which the transaction was closed. Not sent for Treaty FDOs
     * 
     */
    @JsonProperty("originalCurrencyISOCode")
    public void setOriginalCurrencyISOCode(String originalCurrencyISOCode) {
        this.originalCurrencyISOCode = originalCurrencyISOCode;
    }

    /**
     * Central settlement indicator, where 'Y'-  Settled via Lirma, 'N' - Settled externally to Lirma and 'S'- Suspended
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementIndicator")
    public CentralSettlementIndicator getCentralSettlementIndicator() {
        return centralSettlementIndicator;
    }

    /**
     * Central settlement indicator, where 'Y'-  Settled via Lirma, 'N' - Settled externally to Lirma and 'S'- Suspended
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementIndicator")
    public void setCentralSettlementIndicator(CentralSettlementIndicator centralSettlementIndicator) {
        this.centralSettlementIndicator = centralSettlementIndicator;
    }

    /**
     * The actual payment date upon which it is agreed that settlement of a particular transaction amount will take place between the Broker and the Bureau or Underwriter. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementActualPaymentDate")
    public String getSettlementActualPaymentDate() {
        return settlementActualPaymentDate;
    }

    /**
     * The actual payment date upon which it is agreed that settlement of a particular transaction amount will take place between the Broker and the Bureau or Underwriter. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementActualPaymentDate")
    public void setSettlementActualPaymentDate(String settlementActualPaymentDate) {
        this.settlementActualPaymentDate = settlementActualPaymentDate;
    }

    /**
     * The first date of the settlement period. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementPeriodStartDate")
    public String getSettlementPeriodStartDate() {
        return settlementPeriodStartDate;
    }

    /**
     * The first date of the settlement period. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementPeriodStartDate")
    public void setSettlementPeriodStartDate(String settlementPeriodStartDate) {
        this.settlementPeriodStartDate = settlementPeriodStartDate;
    }

    /**
     * The last date of the settlement period. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementPeriodEndDate")
    public String getSettlementPeriodEndDate() {
        return settlementPeriodEndDate;
    }

    /**
     * The last date of the settlement period. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementPeriodEndDate")
    public void setSettlementPeriodEndDate(String settlementPeriodEndDate) {
        this.settlementPeriodEndDate = settlementPeriodEndDate;
    }

    /**
     * TA secondary reference allocated by a Company or Syndicate Underwriter at the time of writing a Risk.
     * 
     */
    @JsonProperty("carrierSecondaryReference")
    public String getCarrierSecondaryReference() {
        return carrierSecondaryReference;
    }

    /**
     * TA secondary reference allocated by a Company or Syndicate Underwriter at the time of writing a Risk.
     * 
     */
    @JsonProperty("carrierSecondaryReference")
    public void setCarrierSecondaryReference(String carrierSecondaryReference) {
        this.carrierSecondaryReference = carrierSecondaryReference;
    }

    /**
     * The date on which it was agreed the nett instalment should take place.
     * (Required)
     * 
     */
    @JsonProperty("nettInstalmentDateOn")
    public String getNettInstalmentDateOn() {
        return nettInstalmentDateOn;
    }

    /**
     * The date on which it was agreed the nett instalment should take place.
     * (Required)
     * 
     */
    @JsonProperty("nettInstalmentDateOn")
    public void setNettInstalmentDateOn(String nettInstalmentDateOn) {
        this.nettInstalmentDateOn = nettInstalmentDateOn;
    }

    /**
     * The secondary reference allocated by a Broker to a transaction. Pattern hasn't been added as not enough data samples to prove- TS states X(12) and the example given is numeric only.
     * (Required)
     * 
     */
    @JsonProperty("brokerSecondaryReference")
    public String getBrokerSecondaryReference() {
        return brokerSecondaryReference;
    }

    /**
     * The secondary reference allocated by a Broker to a transaction. Pattern hasn't been added as not enough data samples to prove- TS states X(12) and the example given is numeric only.
     * (Required)
     * 
     */
    @JsonProperty("brokerSecondaryReference")
    public void setBrokerSecondaryReference(String brokerSecondaryReference) {
        this.brokerSecondaryReference = brokerSecondaryReference;
    }

    /**
     * A four character code which uniquely identifies each broker. For Lloyds it is a four digit code (could start with '0') For Non-Lloyds brokers- Alphanumerical code- pattern to be proved.
     * (Required)
     * 
     */
    @JsonProperty("brokerCode")
    public String getBrokerCode() {
        return brokerCode;
    }

    /**
     * A four character code which uniquely identifies each broker. For Lloyds it is a four digit code (could start with '0') For Non-Lloyds brokers- Alphanumerical code- pattern to be proved.
     * (Required)
     * 
     */
    @JsonProperty("brokerCode")
    public void setBrokerCode(String brokerCode) {
        this.brokerCode = brokerCode;
    }

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationGroupCode")
    public String getCarrierIdentificationGroupCode() {
        return carrierIdentificationGroupCode;
    }

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationGroupCode")
    public void setCarrierIdentificationGroupCode(String carrierIdentificationGroupCode) {
        this.carrierIdentificationGroupCode = carrierIdentificationGroupCode;
    }

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationDSIGNGroupCode")
    public String getCarrierIdentificationDSIGNGroupCode() {
        return carrierIdentificationDSIGNGroupCode;
    }

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationDSIGNGroupCode")
    public void setCarrierIdentificationDSIGNGroupCode(String carrierIdentificationDSIGNGroupCode) {
        this.carrierIdentificationDSIGNGroupCode = carrierIdentificationDSIGNGroupCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SettlementTransactionDetailM02Inner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrierIdentificationCode");
        sb.append('=');
        sb.append(((this.carrierIdentificationCode == null)?"<null>":this.carrierIdentificationCode));
        sb.append(',');
        sb.append("carrierReference");
        sb.append('=');
        sb.append(((this.carrierReference == null)?"<null>":this.carrierReference));
        sb.append(',');
        sb.append("carrierShortName");
        sb.append('=');
        sb.append(((this.carrierShortName == null)?"<null>":this.carrierShortName));
        sb.append(',');
        sb.append("brokerShortCode");
        sb.append('=');
        sb.append(((this.brokerShortCode == null)?"<null>":this.brokerShortCode));
        sb.append(',');
        sb.append("brokerReference");
        sb.append('=');
        sb.append(((this.brokerReference == null)?"<null>":this.brokerReference));
        sb.append(',');
        sb.append("brokerShortName");
        sb.append('=');
        sb.append(((this.brokerShortName == null)?"<null>":this.brokerShortName));
        sb.append(',');
        sb.append("settlementCurrencyILUCode");
        sb.append('=');
        sb.append(((this.settlementCurrencyILUCode == null)?"<null>":this.settlementCurrencyILUCode));
        sb.append(',');
        sb.append("settlementCurrencyISOCode");
        sb.append('=');
        sb.append(((this.settlementCurrencyISOCode == null)?"<null>":this.settlementCurrencyISOCode));
        sb.append(',');
        sb.append("policySigningAccountingOfficeNumber");
        sb.append('=');
        sb.append(((this.policySigningAccountingOfficeNumber == null)?"<null>":this.policySigningAccountingOfficeNumber));
        sb.append(',');
        sb.append("entryType");
        sb.append('=');
        sb.append(((this.entryType == null)?"<null>":this.entryType));
        sb.append(',');
        sb.append("carriersProportionAmountOriginalCurrency");
        sb.append('=');
        sb.append(((this.carriersProportionAmountOriginalCurrency == null)?"<null>":this.carriersProportionAmountOriginalCurrency));
        sb.append(',');
        sb.append("carriersProportionAmountSettlementCurrency");
        sb.append('=');
        sb.append(((this.carriersProportionAmountSettlementCurrency == null)?"<null>":this.carriersProportionAmountSettlementCurrency));
        sb.append(',');
        sb.append("defferedPaymentIndicator");
        sb.append('=');
        sb.append(((this.defferedPaymentIndicator == null)?"<null>":this.defferedPaymentIndicator));
        sb.append(',');
        sb.append("settledInOriginalCurrencyIndicator");
        sb.append('=');
        sb.append(((this.settledInOriginalCurrencyIndicator == null)?"<null>":this.settledInOriginalCurrencyIndicator));
        sb.append(',');
        sb.append("originalCurrencyILUCode");
        sb.append('=');
        sb.append(((this.originalCurrencyILUCode == null)?"<null>":this.originalCurrencyILUCode));
        sb.append(',');
        sb.append("originalCurrencyISOCode");
        sb.append('=');
        sb.append(((this.originalCurrencyISOCode == null)?"<null>":this.originalCurrencyISOCode));
        sb.append(',');
        sb.append("centralSettlementIndicator");
        sb.append('=');
        sb.append(((this.centralSettlementIndicator == null)?"<null>":this.centralSettlementIndicator));
        sb.append(',');
        sb.append("settlementActualPaymentDate");
        sb.append('=');
        sb.append(((this.settlementActualPaymentDate == null)?"<null>":this.settlementActualPaymentDate));
        sb.append(',');
        sb.append("settlementPeriodStartDate");
        sb.append('=');
        sb.append(((this.settlementPeriodStartDate == null)?"<null>":this.settlementPeriodStartDate));
        sb.append(',');
        sb.append("settlementPeriodEndDate");
        sb.append('=');
        sb.append(((this.settlementPeriodEndDate == null)?"<null>":this.settlementPeriodEndDate));
        sb.append(',');
        sb.append("carrierSecondaryReference");
        sb.append('=');
        sb.append(((this.carrierSecondaryReference == null)?"<null>":this.carrierSecondaryReference));
        sb.append(',');
        sb.append("nettInstalmentDateOn");
        sb.append('=');
        sb.append(((this.nettInstalmentDateOn == null)?"<null>":this.nettInstalmentDateOn));
        sb.append(',');
        sb.append("brokerSecondaryReference");
        sb.append('=');
        sb.append(((this.brokerSecondaryReference == null)?"<null>":this.brokerSecondaryReference));
        sb.append(',');
        sb.append("brokerCode");
        sb.append('=');
        sb.append(((this.brokerCode == null)?"<null>":this.brokerCode));
        sb.append(',');
        sb.append("carrierIdentificationGroupCode");
        sb.append('=');
        sb.append(((this.carrierIdentificationGroupCode == null)?"<null>":this.carrierIdentificationGroupCode));
        sb.append(',');
        sb.append("carrierIdentificationDSIGNGroupCode");
        sb.append('=');
        sb.append(((this.carrierIdentificationDSIGNGroupCode == null)?"<null>":this.carrierIdentificationDSIGNGroupCode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.brokerShortName == null)? 0 :this.brokerShortName.hashCode()));
        result = ((result* 31)+((this.settlementCurrencyILUCode == null)? 0 :this.settlementCurrencyILUCode.hashCode()));
        result = ((result* 31)+((this.nettInstalmentDateOn == null)? 0 :this.nettInstalmentDateOn.hashCode()));
        result = ((result* 31)+((this.settlementActualPaymentDate == null)? 0 :this.settlementActualPaymentDate.hashCode()));
        result = ((result* 31)+((this.carrierShortName == null)? 0 :this.carrierShortName.hashCode()));
        result = ((result* 31)+((this.policySigningAccountingOfficeNumber == null)? 0 :this.policySigningAccountingOfficeNumber.hashCode()));
        result = ((result* 31)+((this.carrierIdentificationCode == null)? 0 :this.carrierIdentificationCode.hashCode()));
        result = ((result* 31)+((this.carrierIdentificationDSIGNGroupCode == null)? 0 :this.carrierIdentificationDSIGNGroupCode.hashCode()));
        result = ((result* 31)+((this.defferedPaymentIndicator == null)? 0 :this.defferedPaymentIndicator.hashCode()));
        result = ((result* 31)+((this.centralSettlementIndicator == null)? 0 :this.centralSettlementIndicator.hashCode()));
        result = ((result* 31)+((this.settlementPeriodStartDate == null)? 0 :this.settlementPeriodStartDate.hashCode()));
        result = ((result* 31)+((this.brokerCode == null)? 0 :this.brokerCode.hashCode()));
        result = ((result* 31)+((this.carriersProportionAmountSettlementCurrency == null)? 0 :this.carriersProportionAmountSettlementCurrency.hashCode()));
        result = ((result* 31)+((this.entryType == null)? 0 :this.entryType.hashCode()));
        result = ((result* 31)+((this.brokerSecondaryReference == null)? 0 :this.brokerSecondaryReference.hashCode()));
        result = ((result* 31)+((this.settledInOriginalCurrencyIndicator == null)? 0 :this.settledInOriginalCurrencyIndicator.hashCode()));
        result = ((result* 31)+((this.carrierIdentificationGroupCode == null)? 0 :this.carrierIdentificationGroupCode.hashCode()));
        result = ((result* 31)+((this.carrierSecondaryReference == null)? 0 :this.carrierSecondaryReference.hashCode()));
        result = ((result* 31)+((this.originalCurrencyILUCode == null)? 0 :this.originalCurrencyILUCode.hashCode()));
        result = ((result* 31)+((this.carrierReference == null)? 0 :this.carrierReference.hashCode()));
        result = ((result* 31)+((this.settlementPeriodEndDate == null)? 0 :this.settlementPeriodEndDate.hashCode()));
        result = ((result* 31)+((this.brokerShortCode == null)? 0 :this.brokerShortCode.hashCode()));
        result = ((result* 31)+((this.settlementCurrencyISOCode == null)? 0 :this.settlementCurrencyISOCode.hashCode()));
        result = ((result* 31)+((this.brokerReference == null)? 0 :this.brokerReference.hashCode()));
        result = ((result* 31)+((this.carriersProportionAmountOriginalCurrency == null)? 0 :this.carriersProportionAmountOriginalCurrency.hashCode()));
        result = ((result* 31)+((this.originalCurrencyISOCode == null)? 0 :this.originalCurrencyISOCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SettlementTransactionDetailM02Inner) == false) {
            return false;
        }
        SettlementTransactionDetailM02Inner rhs = ((SettlementTransactionDetailM02Inner) other);
        return (((((((((((((((((((((((((((this.brokerShortName == rhs.brokerShortName)||((this.brokerShortName!= null)&&this.brokerShortName.equals(rhs.brokerShortName)))&&((this.settlementCurrencyILUCode == rhs.settlementCurrencyILUCode)||((this.settlementCurrencyILUCode!= null)&&this.settlementCurrencyILUCode.equals(rhs.settlementCurrencyILUCode))))&&((this.nettInstalmentDateOn == rhs.nettInstalmentDateOn)||((this.nettInstalmentDateOn!= null)&&this.nettInstalmentDateOn.equals(rhs.nettInstalmentDateOn))))&&((this.settlementActualPaymentDate == rhs.settlementActualPaymentDate)||((this.settlementActualPaymentDate!= null)&&this.settlementActualPaymentDate.equals(rhs.settlementActualPaymentDate))))&&((this.carrierShortName == rhs.carrierShortName)||((this.carrierShortName!= null)&&this.carrierShortName.equals(rhs.carrierShortName))))&&((this.policySigningAccountingOfficeNumber == rhs.policySigningAccountingOfficeNumber)||((this.policySigningAccountingOfficeNumber!= null)&&this.policySigningAccountingOfficeNumber.equals(rhs.policySigningAccountingOfficeNumber))))&&((this.carrierIdentificationCode == rhs.carrierIdentificationCode)||((this.carrierIdentificationCode!= null)&&this.carrierIdentificationCode.equals(rhs.carrierIdentificationCode))))&&((this.carrierIdentificationDSIGNGroupCode == rhs.carrierIdentificationDSIGNGroupCode)||((this.carrierIdentificationDSIGNGroupCode!= null)&&this.carrierIdentificationDSIGNGroupCode.equals(rhs.carrierIdentificationDSIGNGroupCode))))&&((this.defferedPaymentIndicator == rhs.defferedPaymentIndicator)||((this.defferedPaymentIndicator!= null)&&this.defferedPaymentIndicator.equals(rhs.defferedPaymentIndicator))))&&((this.centralSettlementIndicator == rhs.centralSettlementIndicator)||((this.centralSettlementIndicator!= null)&&this.centralSettlementIndicator.equals(rhs.centralSettlementIndicator))))&&((this.settlementPeriodStartDate == rhs.settlementPeriodStartDate)||((this.settlementPeriodStartDate!= null)&&this.settlementPeriodStartDate.equals(rhs.settlementPeriodStartDate))))&&((this.brokerCode == rhs.brokerCode)||((this.brokerCode!= null)&&this.brokerCode.equals(rhs.brokerCode))))&&((this.carriersProportionAmountSettlementCurrency == rhs.carriersProportionAmountSettlementCurrency)||((this.carriersProportionAmountSettlementCurrency!= null)&&this.carriersProportionAmountSettlementCurrency.equals(rhs.carriersProportionAmountSettlementCurrency))))&&((this.entryType == rhs.entryType)||((this.entryType!= null)&&this.entryType.equals(rhs.entryType))))&&((this.brokerSecondaryReference == rhs.brokerSecondaryReference)||((this.brokerSecondaryReference!= null)&&this.brokerSecondaryReference.equals(rhs.brokerSecondaryReference))))&&((this.settledInOriginalCurrencyIndicator == rhs.settledInOriginalCurrencyIndicator)||((this.settledInOriginalCurrencyIndicator!= null)&&this.settledInOriginalCurrencyIndicator.equals(rhs.settledInOriginalCurrencyIndicator))))&&((this.carrierIdentificationGroupCode == rhs.carrierIdentificationGroupCode)||((this.carrierIdentificationGroupCode!= null)&&this.carrierIdentificationGroupCode.equals(rhs.carrierIdentificationGroupCode))))&&((this.carrierSecondaryReference == rhs.carrierSecondaryReference)||((this.carrierSecondaryReference!= null)&&this.carrierSecondaryReference.equals(rhs.carrierSecondaryReference))))&&((this.originalCurrencyILUCode == rhs.originalCurrencyILUCode)||((this.originalCurrencyILUCode!= null)&&this.originalCurrencyILUCode.equals(rhs.originalCurrencyILUCode))))&&((this.carrierReference == rhs.carrierReference)||((this.carrierReference!= null)&&this.carrierReference.equals(rhs.carrierReference))))&&((this.settlementPeriodEndDate == rhs.settlementPeriodEndDate)||((this.settlementPeriodEndDate!= null)&&this.settlementPeriodEndDate.equals(rhs.settlementPeriodEndDate))))&&((this.brokerShortCode == rhs.brokerShortCode)||((this.brokerShortCode!= null)&&this.brokerShortCode.equals(rhs.brokerShortCode))))&&((this.settlementCurrencyISOCode == rhs.settlementCurrencyISOCode)||((this.settlementCurrencyISOCode!= null)&&this.settlementCurrencyISOCode.equals(rhs.settlementCurrencyISOCode))))&&((this.brokerReference == rhs.brokerReference)||((this.brokerReference!= null)&&this.brokerReference.equals(rhs.brokerReference))))&&((this.carriersProportionAmountOriginalCurrency == rhs.carriersProportionAmountOriginalCurrency)||((this.carriersProportionAmountOriginalCurrency!= null)&&this.carriersProportionAmountOriginalCurrency.equals(rhs.carriersProportionAmountOriginalCurrency))))&&((this.originalCurrencyISOCode == rhs.originalCurrencyISOCode)||((this.originalCurrencyISOCode!= null)&&this.originalCurrencyISOCode.equals(rhs.originalCurrencyISOCode))));
    }


    /**
     * Central settlement indicator, where 'Y'-  Settled via Lirma, 'N' - Settled externally to Lirma and 'S'- Suspended
     * 
     */
        public enum CentralSettlementIndicator {

        Y("Y"),
        N("N"),
        S("S");
        private final String value;
        private final static Map<String, CentralSettlementIndicator> CONSTANTS = new HashMap<String, CentralSettlementIndicator>();

        static {
            for (CentralSettlementIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CentralSettlementIndicator(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CentralSettlementIndicator fromValue(String value) {
            CentralSettlementIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * This element will only be present if the transaction was signed on a deferred basis. D - Deferred payment Or Blank
     * 
     */
        public enum DefferedPaymentIndicator {

        D("D"),
        __EMPTY__("");
        private final String value;
        private final static Map<String, DefferedPaymentIndicator> CONSTANTS = new HashMap<String, DefferedPaymentIndicator>();

        static {
            for (DefferedPaymentIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DefferedPaymentIndicator(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static DefferedPaymentIndicator fromValue(String value) {
            DefferedPaymentIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The two character entry type code allocated to identify the type of transaction. Original Premium (PM), Additional Premium (AP), Return Premium (RP), Claim (CL), Claim Refund (RC), CPA Claim (CP), CPA Claim Refund (CA), Treaty Statement Credit (TC), Treaty Statement Debit (TD).
     * 
     */
        public enum EntryType {

        AP("AP"),
        PM("PM"),
        RP("RP"),
        CL("CL"),
        RC("RC"),
        TC("TC"),
        TD("TD"),
        CA("CA"),
        CP("CP");
        private final String value;
        private final static Map<String, EntryType> CONSTANTS = new HashMap<String, EntryType>();

        static {
            for (EntryType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EntryType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static EntryType fromValue(String value) {
            EntryType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * An indicator to denote if the signing has been settled in the original currency. 'Y' - Yes, 'N' - No
     * 
     */
        public enum SettledInOriginalCurrencyIndicator {

        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, SettledInOriginalCurrencyIndicator> CONSTANTS = new HashMap<String, SettledInOriginalCurrencyIndicator>();

        static {
            for (SettledInOriginalCurrencyIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SettledInOriginalCurrencyIndicator(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static SettledInOriginalCurrencyIndicator fromValue(String value) {
            SettledInOriginalCurrencyIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
