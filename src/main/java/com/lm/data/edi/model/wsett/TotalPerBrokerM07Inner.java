
package com.lm.data.edi.model.wsett;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "settlementCurrencyISOCode",
    "settlementCurrencyILUCode",
    "brokerCodeShort",
    "M02RecordsNumberPerCurrencyAndBroker",
    "centralSettlementCashAmountTotal",
    "centralSettlementDeferredAmountTotal",
    "centralSettlementReserveReleaseAmountTotal",
    "centralSettlementTTYStatementAmountTotal",
    "centralSettlementClaimAmountTotal",
    "nonCentralSettlementCashAmountTotal",
    "nonCentralSettlementDeferredAmountTotal",
    "nonCentralSettlementReserveReleaseAmountTotal",
    "nonCentralSettlementTTYStatementAmountTotal",
    "nonCentralSettlementClaimAmountTotal",
    "brokerCode",
    "carrierIdentificationCode",
    "carrierIdentificationDSIGNGroupCode",
    "WSETTM02Array"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TotalPerBrokerM07Inner {

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
     * The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyILUCode")
    @JsonPropertyDescription("The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.")
    @NotNull
    private TotalPerCurrencyM08Inner.IluCurrencyCode settlementCurrencyILUCode;
    /**
     * The last 3 characters of the 4 character broker code which uniquely identifies each broker. (also see BrokerCode for the full 4 digit one).
     * (Required)
     * 
     */
    @JsonProperty("brokerCodeShort")
    @JsonPropertyDescription("The last 3 characters of the 4 character broker code which uniquely identifies each broker. (also see BrokerCode for the full 4 digit one).")
    @Pattern(regexp = "[A-Za-z0-9]{3}")
    @NotNull
    private String brokerCodeShort;
    /**
     * The number of M02 records for the Currency and Broker combination.
     * (Required)
     * 
     */
    @JsonProperty("M02RecordsNumberPerCurrencyAndBroker")
    @JsonPropertyDescription("The number of M02 records for the Currency and Broker combination.")
    @Pattern(regexp = "[0-9]{0,5}")
    @NotNull
    private String m02RecordsNumberPerCurrencyAndBroker;
    /**
     * Central Settlement Cash amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementCashAmountTotal")
    @JsonPropertyDescription("Central Settlement Cash amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String centralSettlementCashAmountTotal;
    /**
     * Mandatory, Central Settlement Deferred amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementDeferredAmountTotal")
    @JsonPropertyDescription("Mandatory, Central Settlement Deferred amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String centralSettlementDeferredAmountTotal;
    /**
     * Central Settlement Reserve Release amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementReserveReleaseAmountTotal")
    @JsonPropertyDescription("Central Settlement Reserve Release amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String centralSettlementReserveReleaseAmountTotal;
    /**
     * Mandatory, Central Settlement Treaty Statement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementTTYStatementAmountTotal")
    @JsonPropertyDescription("Mandatory, Central Settlement Treaty Statement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String centralSettlementTTYStatementAmountTotal;
    /**
     * Central Settlement Claim amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). NB! APPLY negative sign if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementClaimAmountTotal")
    @JsonPropertyDescription("Central Settlement Claim amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). NB! APPLY negative sign if the amount is zero.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String centralSettlementClaimAmountTotal;
    /**
     * Non Central Settlement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementCashAmountTotal")
    @JsonPropertyDescription("Non Central Settlement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementCashAmountTotal;
    /**
     * Non Central Settlement Deferred amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementDeferredAmountTotal")
    @JsonPropertyDescription("Non Central Settlement Deferred amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementDeferredAmountTotal;
    /**
     * Non Central Settlement Reserve Release amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementReserveReleaseAmountTotal")
    @JsonPropertyDescription("Non Central Settlement Reserve Release amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementReserveReleaseAmountTotal;
    /**
     * The Non Central Settlement Treaty Statement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementTTYStatementAmountTotal")
    @JsonPropertyDescription("The Non Central Settlement Treaty Statement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementTTYStatementAmountTotal;
    /**
     * The Non Central Settlement Treaty Statement amount total. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).  NB! APPLY negative sign even if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementClaimAmountTotal")
    @JsonPropertyDescription("The Non Central Settlement Treaty Statement amount total. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).  NB! APPLY negative sign even if the amount is zero.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementClaimAmountTotal;
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
    @JsonProperty("carrierIdentificationCode")
    @JsonPropertyDescription("A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.")
    @Pattern(regexp = "[A-Z][0-9]{2}")
    @NotNull
    private String carrierIdentificationCode;
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
     * Broker items within currency sequence. Mandatory, Max Occurrence - the M02 will repeat for under same company group for different broker codes and currencies. Each broker code will have one or more M02 records written based on input data. There is an M02 record for each settlement transaction that the company group has to settle. There is no limit to the number of M02 records. It is limited only by the number of transactions to be settled on a particular day (TBC what is this number).
     * 
     */
    @JsonProperty("WSETTM02Array")
    @JsonPropertyDescription("Broker items within currency sequence. Mandatory, Max Occurrence - the M02 will repeat for under same company group for different broker codes and currencies. Each broker code will have one or more M02 records written based on input data. There is an M02 record for each settlement transaction that the company group has to settle. There is no limit to the number of M02 records. It is limited only by the number of transactions to be settled on a particular day (TBC what is this number).")
    @Valid
    private List<SettlementTransactionDetailM02Inner> wSETTM02Array = new ArrayList<SettlementTransactionDetailM02Inner>();

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
     * The last 3 characters of the 4 character broker code which uniquely identifies each broker. (also see BrokerCode for the full 4 digit one).
     * (Required)
     * 
     */
    @JsonProperty("brokerCodeShort")
    public String getBrokerCodeShort() {
        return brokerCodeShort;
    }

    /**
     * The last 3 characters of the 4 character broker code which uniquely identifies each broker. (also see BrokerCode for the full 4 digit one).
     * (Required)
     * 
     */
    @JsonProperty("brokerCodeShort")
    public void setBrokerCodeShort(String brokerCodeShort) {
        this.brokerCodeShort = brokerCodeShort;
    }

    /**
     * The number of M02 records for the Currency and Broker combination.
     * (Required)
     * 
     */
    @JsonProperty("M02RecordsNumberPerCurrencyAndBroker")
    public String getM02RecordsNumberPerCurrencyAndBroker() {
        return m02RecordsNumberPerCurrencyAndBroker;
    }

    /**
     * The number of M02 records for the Currency and Broker combination.
     * (Required)
     * 
     */
    @JsonProperty("M02RecordsNumberPerCurrencyAndBroker")
    public void setM02RecordsNumberPerCurrencyAndBroker(String m02RecordsNumberPerCurrencyAndBroker) {
        this.m02RecordsNumberPerCurrencyAndBroker = m02RecordsNumberPerCurrencyAndBroker;
    }

    /**
     * Central Settlement Cash amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementCashAmountTotal")
    public String getCentralSettlementCashAmountTotal() {
        return centralSettlementCashAmountTotal;
    }

    /**
     * Central Settlement Cash amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementCashAmountTotal")
    public void setCentralSettlementCashAmountTotal(String centralSettlementCashAmountTotal) {
        this.centralSettlementCashAmountTotal = centralSettlementCashAmountTotal;
    }

    /**
     * Mandatory, Central Settlement Deferred amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementDeferredAmountTotal")
    public String getCentralSettlementDeferredAmountTotal() {
        return centralSettlementDeferredAmountTotal;
    }

    /**
     * Mandatory, Central Settlement Deferred amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementDeferredAmountTotal")
    public void setCentralSettlementDeferredAmountTotal(String centralSettlementDeferredAmountTotal) {
        this.centralSettlementDeferredAmountTotal = centralSettlementDeferredAmountTotal;
    }

    /**
     * Central Settlement Reserve Release amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementReserveReleaseAmountTotal")
    public String getCentralSettlementReserveReleaseAmountTotal() {
        return centralSettlementReserveReleaseAmountTotal;
    }

    /**
     * Central Settlement Reserve Release amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementReserveReleaseAmountTotal")
    public void setCentralSettlementReserveReleaseAmountTotal(String centralSettlementReserveReleaseAmountTotal) {
        this.centralSettlementReserveReleaseAmountTotal = centralSettlementReserveReleaseAmountTotal;
    }

    /**
     * Mandatory, Central Settlement Treaty Statement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementTTYStatementAmountTotal")
    public String getCentralSettlementTTYStatementAmountTotal() {
        return centralSettlementTTYStatementAmountTotal;
    }

    /**
     * Mandatory, Central Settlement Treaty Statement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementTTYStatementAmountTotal")
    public void setCentralSettlementTTYStatementAmountTotal(String centralSettlementTTYStatementAmountTotal) {
        this.centralSettlementTTYStatementAmountTotal = centralSettlementTTYStatementAmountTotal;
    }

    /**
     * Central Settlement Claim amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). NB! APPLY negative sign if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementClaimAmountTotal")
    public String getCentralSettlementClaimAmountTotal() {
        return centralSettlementClaimAmountTotal;
    }

    /**
     * Central Settlement Claim amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). NB! APPLY negative sign if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementClaimAmountTotal")
    public void setCentralSettlementClaimAmountTotal(String centralSettlementClaimAmountTotal) {
        this.centralSettlementClaimAmountTotal = centralSettlementClaimAmountTotal;
    }

    /**
     * Non Central Settlement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementCashAmountTotal")
    public String getNonCentralSettlementCashAmountTotal() {
        return nonCentralSettlementCashAmountTotal;
    }

    /**
     * Non Central Settlement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementCashAmountTotal")
    public void setNonCentralSettlementCashAmountTotal(String nonCentralSettlementCashAmountTotal) {
        this.nonCentralSettlementCashAmountTotal = nonCentralSettlementCashAmountTotal;
    }

    /**
     * Non Central Settlement Deferred amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementDeferredAmountTotal")
    public String getNonCentralSettlementDeferredAmountTotal() {
        return nonCentralSettlementDeferredAmountTotal;
    }

    /**
     * Non Central Settlement Deferred amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementDeferredAmountTotal")
    public void setNonCentralSettlementDeferredAmountTotal(String nonCentralSettlementDeferredAmountTotal) {
        this.nonCentralSettlementDeferredAmountTotal = nonCentralSettlementDeferredAmountTotal;
    }

    /**
     * Non Central Settlement Reserve Release amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementReserveReleaseAmountTotal")
    public String getNonCentralSettlementReserveReleaseAmountTotal() {
        return nonCentralSettlementReserveReleaseAmountTotal;
    }

    /**
     * Non Central Settlement Reserve Release amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementReserveReleaseAmountTotal")
    public void setNonCentralSettlementReserveReleaseAmountTotal(String nonCentralSettlementReserveReleaseAmountTotal) {
        this.nonCentralSettlementReserveReleaseAmountTotal = nonCentralSettlementReserveReleaseAmountTotal;
    }

    /**
     * The Non Central Settlement Treaty Statement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementTTYStatementAmountTotal")
    public String getNonCentralSettlementTTYStatementAmountTotal() {
        return nonCentralSettlementTTYStatementAmountTotal;
    }

    /**
     * The Non Central Settlement Treaty Statement amount total. Sign is a separate EDI element and comes after the amount item on the EDI message. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementTTYStatementAmountTotal")
    public void setNonCentralSettlementTTYStatementAmountTotal(String nonCentralSettlementTTYStatementAmountTotal) {
        this.nonCentralSettlementTTYStatementAmountTotal = nonCentralSettlementTTYStatementAmountTotal;
    }

    /**
     * The Non Central Settlement Treaty Statement amount total. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).  NB! APPLY negative sign even if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementClaimAmountTotal")
    public String getNonCentralSettlementClaimAmountTotal() {
        return nonCentralSettlementClaimAmountTotal;
    }

    /**
     * The Non Central Settlement Treaty Statement amount total. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).  NB! APPLY negative sign even if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementClaimAmountTotal")
    public void setNonCentralSettlementClaimAmountTotal(String nonCentralSettlementClaimAmountTotal) {
        this.nonCentralSettlementClaimAmountTotal = nonCentralSettlementClaimAmountTotal;
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
    @JsonProperty("carrierIdentificationCode")
    public String getCarrierIdentificationCode() {
        return carrierIdentificationCode;
    }

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationCode")
    public void setCarrierIdentificationCode(String carrierIdentificationCode) {
        this.carrierIdentificationCode = carrierIdentificationCode;
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

    /**
     * Broker items within currency sequence. Mandatory, Max Occurrence - the M02 will repeat for under same company group for different broker codes and currencies. Each broker code will have one or more M02 records written based on input data. There is an M02 record for each settlement transaction that the company group has to settle. There is no limit to the number of M02 records. It is limited only by the number of transactions to be settled on a particular day (TBC what is this number).
     * 
     */
    @JsonProperty("WSETTM02Array")
    public List<SettlementTransactionDetailM02Inner> getWSETTM02Array() {
        return wSETTM02Array;
    }

    /**
     * Broker items within currency sequence. Mandatory, Max Occurrence - the M02 will repeat for under same company group for different broker codes and currencies. Each broker code will have one or more M02 records written based on input data. There is an M02 record for each settlement transaction that the company group has to settle. There is no limit to the number of M02 records. It is limited only by the number of transactions to be settled on a particular day (TBC what is this number).
     * 
     */
    @JsonProperty("WSETTM02Array")
    public void setWSETTM02Array(List<SettlementTransactionDetailM02Inner> wSETTM02Array) {
        this.wSETTM02Array = wSETTM02Array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TotalPerBrokerM07Inner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("settlementCurrencyISOCode");
        sb.append('=');
        sb.append(((this.settlementCurrencyISOCode == null)?"<null>":this.settlementCurrencyISOCode));
        sb.append(',');
        sb.append("settlementCurrencyILUCode");
        sb.append('=');
        sb.append(((this.settlementCurrencyILUCode == null)?"<null>":this.settlementCurrencyILUCode));
        sb.append(',');
        sb.append("brokerCodeShort");
        sb.append('=');
        sb.append(((this.brokerCodeShort == null)?"<null>":this.brokerCodeShort));
        sb.append(',');
        sb.append("m02RecordsNumberPerCurrencyAndBroker");
        sb.append('=');
        sb.append(((this.m02RecordsNumberPerCurrencyAndBroker == null)?"<null>":this.m02RecordsNumberPerCurrencyAndBroker));
        sb.append(',');
        sb.append("centralSettlementCashAmountTotal");
        sb.append('=');
        sb.append(((this.centralSettlementCashAmountTotal == null)?"<null>":this.centralSettlementCashAmountTotal));
        sb.append(',');
        sb.append("centralSettlementDeferredAmountTotal");
        sb.append('=');
        sb.append(((this.centralSettlementDeferredAmountTotal == null)?"<null>":this.centralSettlementDeferredAmountTotal));
        sb.append(',');
        sb.append("centralSettlementReserveReleaseAmountTotal");
        sb.append('=');
        sb.append(((this.centralSettlementReserveReleaseAmountTotal == null)?"<null>":this.centralSettlementReserveReleaseAmountTotal));
        sb.append(',');
        sb.append("centralSettlementTTYStatementAmountTotal");
        sb.append('=');
        sb.append(((this.centralSettlementTTYStatementAmountTotal == null)?"<null>":this.centralSettlementTTYStatementAmountTotal));
        sb.append(',');
        sb.append("centralSettlementClaimAmountTotal");
        sb.append('=');
        sb.append(((this.centralSettlementClaimAmountTotal == null)?"<null>":this.centralSettlementClaimAmountTotal));
        sb.append(',');
        sb.append("nonCentralSettlementCashAmountTotal");
        sb.append('=');
        sb.append(((this.nonCentralSettlementCashAmountTotal == null)?"<null>":this.nonCentralSettlementCashAmountTotal));
        sb.append(',');
        sb.append("nonCentralSettlementDeferredAmountTotal");
        sb.append('=');
        sb.append(((this.nonCentralSettlementDeferredAmountTotal == null)?"<null>":this.nonCentralSettlementDeferredAmountTotal));
        sb.append(',');
        sb.append("nonCentralSettlementReserveReleaseAmountTotal");
        sb.append('=');
        sb.append(((this.nonCentralSettlementReserveReleaseAmountTotal == null)?"<null>":this.nonCentralSettlementReserveReleaseAmountTotal));
        sb.append(',');
        sb.append("nonCentralSettlementTTYStatementAmountTotal");
        sb.append('=');
        sb.append(((this.nonCentralSettlementTTYStatementAmountTotal == null)?"<null>":this.nonCentralSettlementTTYStatementAmountTotal));
        sb.append(',');
        sb.append("nonCentralSettlementClaimAmountTotal");
        sb.append('=');
        sb.append(((this.nonCentralSettlementClaimAmountTotal == null)?"<null>":this.nonCentralSettlementClaimAmountTotal));
        sb.append(',');
        sb.append("brokerCode");
        sb.append('=');
        sb.append(((this.brokerCode == null)?"<null>":this.brokerCode));
        sb.append(',');
        sb.append("carrierIdentificationCode");
        sb.append('=');
        sb.append(((this.carrierIdentificationCode == null)?"<null>":this.carrierIdentificationCode));
        sb.append(',');
        sb.append("carrierIdentificationDSIGNGroupCode");
        sb.append('=');
        sb.append(((this.carrierIdentificationDSIGNGroupCode == null)?"<null>":this.carrierIdentificationDSIGNGroupCode));
        sb.append(',');
        sb.append("wSETTM02Array");
        sb.append('=');
        sb.append(((this.wSETTM02Array == null)?"<null>":this.wSETTM02Array));
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
        result = ((result* 31)+((this.wSETTM02Array == null)? 0 :this.wSETTM02Array.hashCode()));
        result = ((result* 31)+((this.settlementCurrencyILUCode == null)? 0 :this.settlementCurrencyILUCode.hashCode()));
        result = ((result* 31)+((this.brokerCodeShort == null)? 0 :this.brokerCodeShort.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementTTYStatementAmountTotal == null)? 0 :this.nonCentralSettlementTTYStatementAmountTotal.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementDeferredAmountTotal == null)? 0 :this.nonCentralSettlementDeferredAmountTotal.hashCode()));
        result = ((result* 31)+((this.m02RecordsNumberPerCurrencyAndBroker == null)? 0 :this.m02RecordsNumberPerCurrencyAndBroker.hashCode()));
        result = ((result* 31)+((this.centralSettlementDeferredAmountTotal == null)? 0 :this.centralSettlementDeferredAmountTotal.hashCode()));
        result = ((result* 31)+((this.carrierIdentificationCode == null)? 0 :this.carrierIdentificationCode.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementClaimAmountTotal == null)? 0 :this.nonCentralSettlementClaimAmountTotal.hashCode()));
        result = ((result* 31)+((this.carrierIdentificationDSIGNGroupCode == null)? 0 :this.carrierIdentificationDSIGNGroupCode.hashCode()));
        result = ((result* 31)+((this.centralSettlementClaimAmountTotal == null)? 0 :this.centralSettlementClaimAmountTotal.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementCashAmountTotal == null)? 0 :this.nonCentralSettlementCashAmountTotal.hashCode()));
        result = ((result* 31)+((this.brokerCode == null)? 0 :this.brokerCode.hashCode()));
        result = ((result* 31)+((this.centralSettlementTTYStatementAmountTotal == null)? 0 :this.centralSettlementTTYStatementAmountTotal.hashCode()));
        result = ((result* 31)+((this.settlementCurrencyISOCode == null)? 0 :this.settlementCurrencyISOCode.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementReserveReleaseAmountTotal == null)? 0 :this.nonCentralSettlementReserveReleaseAmountTotal.hashCode()));
        result = ((result* 31)+((this.centralSettlementCashAmountTotal == null)? 0 :this.centralSettlementCashAmountTotal.hashCode()));
        result = ((result* 31)+((this.centralSettlementReserveReleaseAmountTotal == null)? 0 :this.centralSettlementReserveReleaseAmountTotal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalPerBrokerM07Inner) == false) {
            return false;
        }
        TotalPerBrokerM07Inner rhs = ((TotalPerBrokerM07Inner) other);
        return (((((((((((((((((((this.wSETTM02Array == rhs.wSETTM02Array)||((this.wSETTM02Array!= null)&&this.wSETTM02Array.equals(rhs.wSETTM02Array)))&&((this.settlementCurrencyILUCode == rhs.settlementCurrencyILUCode)||((this.settlementCurrencyILUCode!= null)&&this.settlementCurrencyILUCode.equals(rhs.settlementCurrencyILUCode))))&&((this.brokerCodeShort == rhs.brokerCodeShort)||((this.brokerCodeShort!= null)&&this.brokerCodeShort.equals(rhs.brokerCodeShort))))&&((this.nonCentralSettlementTTYStatementAmountTotal == rhs.nonCentralSettlementTTYStatementAmountTotal)||((this.nonCentralSettlementTTYStatementAmountTotal!= null)&&this.nonCentralSettlementTTYStatementAmountTotal.equals(rhs.nonCentralSettlementTTYStatementAmountTotal))))&&((this.nonCentralSettlementDeferredAmountTotal == rhs.nonCentralSettlementDeferredAmountTotal)||((this.nonCentralSettlementDeferredAmountTotal!= null)&&this.nonCentralSettlementDeferredAmountTotal.equals(rhs.nonCentralSettlementDeferredAmountTotal))))&&((this.m02RecordsNumberPerCurrencyAndBroker == rhs.m02RecordsNumberPerCurrencyAndBroker)||((this.m02RecordsNumberPerCurrencyAndBroker!= null)&&this.m02RecordsNumberPerCurrencyAndBroker.equals(rhs.m02RecordsNumberPerCurrencyAndBroker))))&&((this.centralSettlementDeferredAmountTotal == rhs.centralSettlementDeferredAmountTotal)||((this.centralSettlementDeferredAmountTotal!= null)&&this.centralSettlementDeferredAmountTotal.equals(rhs.centralSettlementDeferredAmountTotal))))&&((this.carrierIdentificationCode == rhs.carrierIdentificationCode)||((this.carrierIdentificationCode!= null)&&this.carrierIdentificationCode.equals(rhs.carrierIdentificationCode))))&&((this.nonCentralSettlementClaimAmountTotal == rhs.nonCentralSettlementClaimAmountTotal)||((this.nonCentralSettlementClaimAmountTotal!= null)&&this.nonCentralSettlementClaimAmountTotal.equals(rhs.nonCentralSettlementClaimAmountTotal))))&&((this.carrierIdentificationDSIGNGroupCode == rhs.carrierIdentificationDSIGNGroupCode)||((this.carrierIdentificationDSIGNGroupCode!= null)&&this.carrierIdentificationDSIGNGroupCode.equals(rhs.carrierIdentificationDSIGNGroupCode))))&&((this.centralSettlementClaimAmountTotal == rhs.centralSettlementClaimAmountTotal)||((this.centralSettlementClaimAmountTotal!= null)&&this.centralSettlementClaimAmountTotal.equals(rhs.centralSettlementClaimAmountTotal))))&&((this.nonCentralSettlementCashAmountTotal == rhs.nonCentralSettlementCashAmountTotal)||((this.nonCentralSettlementCashAmountTotal!= null)&&this.nonCentralSettlementCashAmountTotal.equals(rhs.nonCentralSettlementCashAmountTotal))))&&((this.brokerCode == rhs.brokerCode)||((this.brokerCode!= null)&&this.brokerCode.equals(rhs.brokerCode))))&&((this.centralSettlementTTYStatementAmountTotal == rhs.centralSettlementTTYStatementAmountTotal)||((this.centralSettlementTTYStatementAmountTotal!= null)&&this.centralSettlementTTYStatementAmountTotal.equals(rhs.centralSettlementTTYStatementAmountTotal))))&&((this.settlementCurrencyISOCode == rhs.settlementCurrencyISOCode)||((this.settlementCurrencyISOCode!= null)&&this.settlementCurrencyISOCode.equals(rhs.settlementCurrencyISOCode))))&&((this.nonCentralSettlementReserveReleaseAmountTotal == rhs.nonCentralSettlementReserveReleaseAmountTotal)||((this.nonCentralSettlementReserveReleaseAmountTotal!= null)&&this.nonCentralSettlementReserveReleaseAmountTotal.equals(rhs.nonCentralSettlementReserveReleaseAmountTotal))))&&((this.centralSettlementCashAmountTotal == rhs.centralSettlementCashAmountTotal)||((this.centralSettlementCashAmountTotal!= null)&&this.centralSettlementCashAmountTotal.equals(rhs.centralSettlementCashAmountTotal))))&&((this.centralSettlementReserveReleaseAmountTotal == rhs.centralSettlementReserveReleaseAmountTotal)||((this.centralSettlementReserveReleaseAmountTotal!= null)&&this.centralSettlementReserveReleaseAmountTotal.equals(rhs.centralSettlementReserveReleaseAmountTotal))));
    }

}
