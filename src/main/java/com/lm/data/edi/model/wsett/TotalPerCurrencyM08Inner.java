
package com.lm.data.edi.model.wsett;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "settlementCurrencyISOCode",
    "settlementCurrencyILUCode",
    "M02RecordsNumberForCurrency",
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
    "companyIdentificationDSIGNGroupCode",
    "WSETTM07SettlementContainers"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TotalPerCurrencyM08Inner {

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
     * Total number of M02 records for currency.
     * (Required)
     * 
     */
    @JsonProperty("M02RecordsNumberForCurrency")
    @JsonPropertyDescription("Total number of M02 records for currency.")
    @Pattern(regexp = "[0-9]{0,5}")
    @NotNull
    private String m02RecordsNumberForCurrency;
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
     * Central Settlement Deferred amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementDeferredAmountTotal")
    @JsonPropertyDescription("Central Settlement Deferred amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String centralSettlementDeferredAmountTotal;
    /**
     * Central Settlement Reserve Release amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementReserveReleaseAmountTotal")
    @JsonPropertyDescription("Central Settlement Reserve Release amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String centralSettlementReserveReleaseAmountTotal;
    /**
     * Central Settlement Treaty Statement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementTTYStatementAmountTotal")
    @JsonPropertyDescription("Central Settlement Treaty Statement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String centralSettlementTTYStatementAmountTotal;
    /**
     * Central Settlement Claim amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). NB! APPLY negative sign even if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementClaimAmountTotal")
    @JsonPropertyDescription("Central Settlement Claim amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). NB! APPLY negative sign even if the amount is zero.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String centralSettlementClaimAmountTotal;
    /**
     * Non Central Settlement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementCashAmountTotal")
    @JsonPropertyDescription("Non Central Settlement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementCashAmountTotal;
    /**
     * Non Central Settlement Deferred amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementDeferredAmountTotal")
    @JsonPropertyDescription("Non Central Settlement Deferred amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementDeferredAmountTotal;
    /**
     * Non Central Settlement Reserve Release amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementReserveReleaseAmountTotal")
    @JsonPropertyDescription("Non Central Settlement Reserve Release amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementReserveReleaseAmountTotal;
    /**
     * The Non Central Settlement Treaty Statement amount.  total. Sign is a separate EDI element and needs to be added after the amount item.Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementTTYStatementAmountTotal")
    @JsonPropertyDescription("The Non Central Settlement Treaty Statement amount.  total. Sign is a separate EDI element and needs to be added after the amount item.Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementTTYStatementAmountTotal;
    /**
     * The Non Central Settlement Treaty Statement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). APPLY  negative sign if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementClaimAmountTotal")
    @JsonPropertyDescription("The Non Central Settlement Treaty Statement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). APPLY  negative sign if the amount is zero.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String nonCentralSettlementClaimAmountTotal;
    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("companyIdentificationDSIGNGroupCode")
    @JsonPropertyDescription("A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.")
    @Pattern(regexp = "[A-Z][0-9]{2}")
    @NotNull
    private String companyIdentificationDSIGNGroupCode;
    /**
     * M07 Control Record- Control after all M02 for Broker for the relevant currency. Mandatory, Max Occurrence - The M07 will repeat under same company group for each broker code for each one of the currencies.
     * 
     */
    @JsonProperty("WSETTM07SettlementContainers")
    @JsonPropertyDescription("M07 Control Record- Control after all M02 for Broker for the relevant currency. Mandatory, Max Occurrence - The M07 will repeat under same company group for each broker code for each one of the currencies.")
    @Valid
    private List<TotalPerBrokerM07Inner> wSETTM07SettlementContainers = new ArrayList<TotalPerBrokerM07Inner>();

    /**
     * The ISO code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. TBC the Settlement curencies used (Obsolete currencies removed-ITL, DEM, FRF, NLG). Note that if JPY- no decimal point is used.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyISOCode")
    public WsettIsoCurrencyCode getSettlementCurrencyISOCode() {
        return settlementCurrencyISOCode;
    }

    /**
     * The ISO code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. TBC the Settlement curencies used (Obsolete currencies removed-ITL, DEM, FRF, NLG). Note that if JPY- no decimal point is used.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyISOCode")
    public void setSettlementCurrencyISOCode(WsettIsoCurrencyCode settlementCurrencyISOCode) {
        this.settlementCurrencyISOCode = settlementCurrencyISOCode;
    }

    /**
     * The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyILUCode")
    public IluCurrencyCode getSettlementCurrencyILUCode() {
        return settlementCurrencyILUCode;
    }

    /**
     * The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyILUCode")
    public void setSettlementCurrencyILUCode(IluCurrencyCode settlementCurrencyILUCode) {
        this.settlementCurrencyILUCode = settlementCurrencyILUCode;
    }

    /**
     * Total number of M02 records for currency.
     * (Required)
     * 
     */
    @JsonProperty("M02RecordsNumberForCurrency")
    public String getM02RecordsNumberForCurrency() {
        return m02RecordsNumberForCurrency;
    }

    /**
     * Total number of M02 records for currency.
     * (Required)
     * 
     */
    @JsonProperty("M02RecordsNumberForCurrency")
    public void setM02RecordsNumberForCurrency(String m02RecordsNumberForCurrency) {
        this.m02RecordsNumberForCurrency = m02RecordsNumberForCurrency;
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
     * Central Settlement Deferred amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementDeferredAmountTotal")
    public String getCentralSettlementDeferredAmountTotal() {
        return centralSettlementDeferredAmountTotal;
    }

    /**
     * Central Settlement Deferred amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementDeferredAmountTotal")
    public void setCentralSettlementDeferredAmountTotal(String centralSettlementDeferredAmountTotal) {
        this.centralSettlementDeferredAmountTotal = centralSettlementDeferredAmountTotal;
    }

    /**
     * Central Settlement Reserve Release amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementReserveReleaseAmountTotal")
    public String getCentralSettlementReserveReleaseAmountTotal() {
        return centralSettlementReserveReleaseAmountTotal;
    }

    /**
     * Central Settlement Reserve Release amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementReserveReleaseAmountTotal")
    public void setCentralSettlementReserveReleaseAmountTotal(String centralSettlementReserveReleaseAmountTotal) {
        this.centralSettlementReserveReleaseAmountTotal = centralSettlementReserveReleaseAmountTotal;
    }

    /**
     * Central Settlement Treaty Statement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementTTYStatementAmountTotal")
    public String getCentralSettlementTTYStatementAmountTotal() {
        return centralSettlementTTYStatementAmountTotal;
    }

    /**
     * Central Settlement Treaty Statement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementTTYStatementAmountTotal")
    public void setCentralSettlementTTYStatementAmountTotal(String centralSettlementTTYStatementAmountTotal) {
        this.centralSettlementTTYStatementAmountTotal = centralSettlementTTYStatementAmountTotal;
    }

    /**
     * Central Settlement Claim amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). NB! APPLY negative sign even if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementClaimAmountTotal")
    public String getCentralSettlementClaimAmountTotal() {
        return centralSettlementClaimAmountTotal;
    }

    /**
     * Central Settlement Claim amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). NB! APPLY negative sign even if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("centralSettlementClaimAmountTotal")
    public void setCentralSettlementClaimAmountTotal(String centralSettlementClaimAmountTotal) {
        this.centralSettlementClaimAmountTotal = centralSettlementClaimAmountTotal;
    }

    /**
     * Non Central Settlement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementCashAmountTotal")
    public String getNonCentralSettlementCashAmountTotal() {
        return nonCentralSettlementCashAmountTotal;
    }

    /**
     * Non Central Settlement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementCashAmountTotal")
    public void setNonCentralSettlementCashAmountTotal(String nonCentralSettlementCashAmountTotal) {
        this.nonCentralSettlementCashAmountTotal = nonCentralSettlementCashAmountTotal;
    }

    /**
     * Non Central Settlement Deferred amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementDeferredAmountTotal")
    public String getNonCentralSettlementDeferredAmountTotal() {
        return nonCentralSettlementDeferredAmountTotal;
    }

    /**
     * Non Central Settlement Deferred amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementDeferredAmountTotal")
    public void setNonCentralSettlementDeferredAmountTotal(String nonCentralSettlementDeferredAmountTotal) {
        this.nonCentralSettlementDeferredAmountTotal = nonCentralSettlementDeferredAmountTotal;
    }

    /**
     * Non Central Settlement Reserve Release amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementReserveReleaseAmountTotal")
    public String getNonCentralSettlementReserveReleaseAmountTotal() {
        return nonCentralSettlementReserveReleaseAmountTotal;
    }

    /**
     * Non Central Settlement Reserve Release amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementReserveReleaseAmountTotal")
    public void setNonCentralSettlementReserveReleaseAmountTotal(String nonCentralSettlementReserveReleaseAmountTotal) {
        this.nonCentralSettlementReserveReleaseAmountTotal = nonCentralSettlementReserveReleaseAmountTotal;
    }

    /**
     * The Non Central Settlement Treaty Statement amount.  total. Sign is a separate EDI element and needs to be added after the amount item.Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementTTYStatementAmountTotal")
    public String getNonCentralSettlementTTYStatementAmountTotal() {
        return nonCentralSettlementTTYStatementAmountTotal;
    }

    /**
     * The Non Central Settlement Treaty Statement amount.  total. Sign is a separate EDI element and needs to be added after the amount item.Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15).
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementTTYStatementAmountTotal")
    public void setNonCentralSettlementTTYStatementAmountTotal(String nonCentralSettlementTTYStatementAmountTotal) {
        this.nonCentralSettlementTTYStatementAmountTotal = nonCentralSettlementTTYStatementAmountTotal;
    }

    /**
     * The Non Central Settlement Treaty Statement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). APPLY  negative sign if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementClaimAmountTotal")
    public String getNonCentralSettlementClaimAmountTotal() {
        return nonCentralSettlementClaimAmountTotal;
    }

    /**
     * The Non Central Settlement Treaty Statement amount total. Sign is a separate EDI element and needs to be added after the amount item. Note- as per TS the length is 9(13)V9(2) but this doesn't matches the samples provided where we have 9(15). APPLY  negative sign if the amount is zero.
     * (Required)
     * 
     */
    @JsonProperty("nonCentralSettlementClaimAmountTotal")
    public void setNonCentralSettlementClaimAmountTotal(String nonCentralSettlementClaimAmountTotal) {
        this.nonCentralSettlementClaimAmountTotal = nonCentralSettlementClaimAmountTotal;
    }

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("companyIdentificationDSIGNGroupCode")
    public String getCompanyIdentificationDSIGNGroupCode() {
        return companyIdentificationDSIGNGroupCode;
    }

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("companyIdentificationDSIGNGroupCode")
    public void setCompanyIdentificationDSIGNGroupCode(String companyIdentificationDSIGNGroupCode) {
        this.companyIdentificationDSIGNGroupCode = companyIdentificationDSIGNGroupCode;
    }

    /**
     * M07 Control Record- Control after all M02 for Broker for the relevant currency. Mandatory, Max Occurrence - The M07 will repeat under same company group for each broker code for each one of the currencies.
     * 
     */
    @JsonProperty("WSETTM07SettlementContainers")
    public List<TotalPerBrokerM07Inner> getWSETTM07SettlementContainers() {
        return wSETTM07SettlementContainers;
    }

    /**
     * M07 Control Record- Control after all M02 for Broker for the relevant currency. Mandatory, Max Occurrence - The M07 will repeat under same company group for each broker code for each one of the currencies.
     * 
     */
    @JsonProperty("WSETTM07SettlementContainers")
    public void setWSETTM07SettlementContainers(List<TotalPerBrokerM07Inner> wSETTM07SettlementContainers) {
        this.wSETTM07SettlementContainers = wSETTM07SettlementContainers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TotalPerCurrencyM08Inner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("settlementCurrencyISOCode");
        sb.append('=');
        sb.append(((this.settlementCurrencyISOCode == null)?"<null>":this.settlementCurrencyISOCode));
        sb.append(',');
        sb.append("settlementCurrencyILUCode");
        sb.append('=');
        sb.append(((this.settlementCurrencyILUCode == null)?"<null>":this.settlementCurrencyILUCode));
        sb.append(',');
        sb.append("m02RecordsNumberForCurrency");
        sb.append('=');
        sb.append(((this.m02RecordsNumberForCurrency == null)?"<null>":this.m02RecordsNumberForCurrency));
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
        sb.append("companyIdentificationDSIGNGroupCode");
        sb.append('=');
        sb.append(((this.companyIdentificationDSIGNGroupCode == null)?"<null>":this.companyIdentificationDSIGNGroupCode));
        sb.append(',');
        sb.append("wSETTM07SettlementContainers");
        sb.append('=');
        sb.append(((this.wSETTM07SettlementContainers == null)?"<null>":this.wSETTM07SettlementContainers));
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
        result = ((result* 31)+((this.settlementCurrencyILUCode == null)? 0 :this.settlementCurrencyILUCode.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementTTYStatementAmountTotal == null)? 0 :this.nonCentralSettlementTTYStatementAmountTotal.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementDeferredAmountTotal == null)? 0 :this.nonCentralSettlementDeferredAmountTotal.hashCode()));
        result = ((result* 31)+((this.wSETTM07SettlementContainers == null)? 0 :this.wSETTM07SettlementContainers.hashCode()));
        result = ((result* 31)+((this.centralSettlementDeferredAmountTotal == null)? 0 :this.centralSettlementDeferredAmountTotal.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementClaimAmountTotal == null)? 0 :this.nonCentralSettlementClaimAmountTotal.hashCode()));
        result = ((result* 31)+((this.centralSettlementClaimAmountTotal == null)? 0 :this.centralSettlementClaimAmountTotal.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementCashAmountTotal == null)? 0 :this.nonCentralSettlementCashAmountTotal.hashCode()));
        result = ((result* 31)+((this.centralSettlementTTYStatementAmountTotal == null)? 0 :this.centralSettlementTTYStatementAmountTotal.hashCode()));
        result = ((result* 31)+((this.companyIdentificationDSIGNGroupCode == null)? 0 :this.companyIdentificationDSIGNGroupCode.hashCode()));
        result = ((result* 31)+((this.settlementCurrencyISOCode == null)? 0 :this.settlementCurrencyISOCode.hashCode()));
        result = ((result* 31)+((this.nonCentralSettlementReserveReleaseAmountTotal == null)? 0 :this.nonCentralSettlementReserveReleaseAmountTotal.hashCode()));
        result = ((result* 31)+((this.m02RecordsNumberForCurrency == null)? 0 :this.m02RecordsNumberForCurrency.hashCode()));
        result = ((result* 31)+((this.centralSettlementCashAmountTotal == null)? 0 :this.centralSettlementCashAmountTotal.hashCode()));
        result = ((result* 31)+((this.centralSettlementReserveReleaseAmountTotal == null)? 0 :this.centralSettlementReserveReleaseAmountTotal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalPerCurrencyM08Inner) == false) {
            return false;
        }
        TotalPerCurrencyM08Inner rhs = ((TotalPerCurrencyM08Inner) other);
        return ((((((((((((((((this.settlementCurrencyILUCode == rhs.settlementCurrencyILUCode)||((this.settlementCurrencyILUCode!= null)&&this.settlementCurrencyILUCode.equals(rhs.settlementCurrencyILUCode)))&&((this.nonCentralSettlementTTYStatementAmountTotal == rhs.nonCentralSettlementTTYStatementAmountTotal)||((this.nonCentralSettlementTTYStatementAmountTotal!= null)&&this.nonCentralSettlementTTYStatementAmountTotal.equals(rhs.nonCentralSettlementTTYStatementAmountTotal))))&&((this.nonCentralSettlementDeferredAmountTotal == rhs.nonCentralSettlementDeferredAmountTotal)||((this.nonCentralSettlementDeferredAmountTotal!= null)&&this.nonCentralSettlementDeferredAmountTotal.equals(rhs.nonCentralSettlementDeferredAmountTotal))))&&((this.wSETTM07SettlementContainers == rhs.wSETTM07SettlementContainers)||((this.wSETTM07SettlementContainers!= null)&&this.wSETTM07SettlementContainers.equals(rhs.wSETTM07SettlementContainers))))&&((this.centralSettlementDeferredAmountTotal == rhs.centralSettlementDeferredAmountTotal)||((this.centralSettlementDeferredAmountTotal!= null)&&this.centralSettlementDeferredAmountTotal.equals(rhs.centralSettlementDeferredAmountTotal))))&&((this.nonCentralSettlementClaimAmountTotal == rhs.nonCentralSettlementClaimAmountTotal)||((this.nonCentralSettlementClaimAmountTotal!= null)&&this.nonCentralSettlementClaimAmountTotal.equals(rhs.nonCentralSettlementClaimAmountTotal))))&&((this.centralSettlementClaimAmountTotal == rhs.centralSettlementClaimAmountTotal)||((this.centralSettlementClaimAmountTotal!= null)&&this.centralSettlementClaimAmountTotal.equals(rhs.centralSettlementClaimAmountTotal))))&&((this.nonCentralSettlementCashAmountTotal == rhs.nonCentralSettlementCashAmountTotal)||((this.nonCentralSettlementCashAmountTotal!= null)&&this.nonCentralSettlementCashAmountTotal.equals(rhs.nonCentralSettlementCashAmountTotal))))&&((this.centralSettlementTTYStatementAmountTotal == rhs.centralSettlementTTYStatementAmountTotal)||((this.centralSettlementTTYStatementAmountTotal!= null)&&this.centralSettlementTTYStatementAmountTotal.equals(rhs.centralSettlementTTYStatementAmountTotal))))&&((this.companyIdentificationDSIGNGroupCode == rhs.companyIdentificationDSIGNGroupCode)||((this.companyIdentificationDSIGNGroupCode!= null)&&this.companyIdentificationDSIGNGroupCode.equals(rhs.companyIdentificationDSIGNGroupCode))))&&((this.settlementCurrencyISOCode == rhs.settlementCurrencyISOCode)||((this.settlementCurrencyISOCode!= null)&&this.settlementCurrencyISOCode.equals(rhs.settlementCurrencyISOCode))))&&((this.nonCentralSettlementReserveReleaseAmountTotal == rhs.nonCentralSettlementReserveReleaseAmountTotal)||((this.nonCentralSettlementReserveReleaseAmountTotal!= null)&&this.nonCentralSettlementReserveReleaseAmountTotal.equals(rhs.nonCentralSettlementReserveReleaseAmountTotal))))&&((this.m02RecordsNumberForCurrency == rhs.m02RecordsNumberForCurrency)||((this.m02RecordsNumberForCurrency!= null)&&this.m02RecordsNumberForCurrency.equals(rhs.m02RecordsNumberForCurrency))))&&((this.centralSettlementCashAmountTotal == rhs.centralSettlementCashAmountTotal)||((this.centralSettlementCashAmountTotal!= null)&&this.centralSettlementCashAmountTotal.equals(rhs.centralSettlementCashAmountTotal))))&&((this.centralSettlementReserveReleaseAmountTotal == rhs.centralSettlementReserveReleaseAmountTotal)||((this.centralSettlementReserveReleaseAmountTotal!= null)&&this.centralSettlementReserveReleaseAmountTotal.equals(rhs.centralSettlementReserveReleaseAmountTotal))));
    }


    /**
     * The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.
     * 
     */
        public enum IluCurrencyCode {

        $("$"),
        US_$("US$"),
        C_$("C$"),
        YEN("YEN"),
        AU_$("AU$"),
        EUR("EUR"),
        SEK("SEK"),
        NOK("NOK"),
        HKD("HKD"),
        DKK("DKK"),
        CHF("CHF"),
        ZAR("ZAR"),
        SGD("SGD"),
        NZD("NZD");
        private final String value;
        private final static Map<String, IluCurrencyCode> CONSTANTS = new HashMap<String, IluCurrencyCode>();

        static {
            for (IluCurrencyCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        IluCurrencyCode(String value) {
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
        public static IluCurrencyCode fromValue(String value) {
            IluCurrencyCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The ISO code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. TBC the Settlement curencies used (Obsolete currencies removed-ITL, DEM, FRF, NLG). Note that if JPY- no decimal point is used.
     * 
     */
        public enum WsettIsoCurrencyCode {

        GBP("GBP"),
        USD("USD"),
        CAD("CAD"),
        JPY("JPY"),
        AUD("AUD"),
        EUR("EUR"),
        SEK("SEK"),
        NOK("NOK"),
        HKD("HKD"),
        DKK("DKK"),
        CHF("CHF"),
        ZAR("ZAR"),
        SGD("SGD"),
        NZD("NZD");
        private final String value;
        private final static Map<String, WsettIsoCurrencyCode> CONSTANTS = new HashMap<String, WsettIsoCurrencyCode>();

        static {
            for (WsettIsoCurrencyCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        WsettIsoCurrencyCode(String value) {
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
        public static WsettIsoCurrencyCode fromValue(String value) {
            WsettIsoCurrencyCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
