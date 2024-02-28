
package com.lm.data.edi.model.dsign;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * elments in common for D02- Premium,  D03- Claims and D04- Prop TTY FDO segments
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionTypeCodeIndicator",
    "entryType2",
    "centralSettlementIndicator",
    "carrierIdentificationCode",
    "carrierShortName",
    "carrierReference",
    "carrierSecondaryReference",
    "brokerCodeShort",
    "brokerPseudonym",
    "brokerShortName",
    "brokerReference",
    "secondaryBrokerReference",
    "settlementIndicator",
    "settlementDate",
    "psacSigningReference",
    "policySigningAccountingOfficeNumber",
    "alternativePSACFormNumber",
    "lirmaSigningReferencePreviousTransaction",
    "originalCurrencyILU",
    "originalCurrencyISO",
    "settledInOriginalCurrency",
    "settlementCurrencyCodeILU",
    "settlementCurrencyCodeISO",
    "cedentName",
    "originalPolicyholderName",
    "interestInsured",
    "perilsInsured",
    "locationInsured",
    "narrativeInformation",
    "originalSumInsuredTotal",
    "sumInsuredRevised",
    "additionalPremiumSumInsured",
    "originalSlipOrder",
    "revisedOriginalSlipOrder",
    "additionalPremiumSlipOrder",
    "policyPeriodNarrative",
    "policyOriginalDates",
    "revisedPolicyDates",
    "narrativeInsuredDetails",
    "originalPremiumDates",
    "additionalPremiumDates",
    "additionalNarrativeDetails",
    "additionalTransactionDetails",
    "previousNetAmount",
    "highestClaimEstimate",
    "previouslySettled",
    "outstandingClaimAmount",
    "brokerClaimReference",
    "brokerContacts",
    "statementPeriodNarrative",
    "statementPeriodStartDate",
    "statementPeriodEndDate",
    "adjustmentExpectedIndicator",
    "VATCode",
    "attachmentsIndicator",
    "initialsSigningDataAdministrator",
    "claimBulkSettlementIndicator",
    "multipleSmallRisksIncludedIndicator",
    "slipLeaderShortName",
    "leadingCompanyShortName",
    "estimatedPremiumIncome",
    "estimatedPremiumIncomeISO",
    "writtenLine",
    "tradeDateTerms",
    "slipRegistrationSystemNumber",
    "uniqueTransactionReference",
    "claimMovementSequenceNumber",
    "insurersClaimReference",
    "insurersClaimReference2",
    "rateOfExchange",
    "totaShareBureauMembers",
    "insurersWrittenLine",
    "grossPremium",
    "grossPremiumOriginalCurrencyCompanyShare",
    "grossPremiumSettlementCurrencyCompanyShare",
    "brokerageAmountOriginalCurrency",
    "brokerageAmountSettlementCurrency",
    "taxDeductedOriginalCurrency",
    "taxDeductedSettlementCurrency",
    "otherDeductionsOriginalCurrency",
    "otherDeductionsSettlementCurrency",
    "netPremiumOrClaimProportionOriginalCurrency",
    "netPremiumOrClaimProportionSettlementCurrency",
    "brokeragePercentage",
    "taxPercentage",
    "otherDeductionsPercentage",
    "terrorismIndicator",
    "premiumTaxSettlementCurrency",
    "brokerCode",
    "uniqueClaimReference",
    "uniqueMarketReference",
    "transactionReference",
    "premiumTaxOriginalCurrency",
    "insurancePremiumTaxPercentage",
    "insurancePremiumTaxOnWholeIndicator",
    "taxSettlementIndicator",
    "countryCode",
    "dsignEntryTypeCode",
    "delinkedTransactionIndicator",
    "brokerPhoneNumber"
})
@Data
@EqualsAndHashCode
@ToString
@Builder
public class D02D03D04D05InCommon {

    /**
     * Action Indicator, Enum values meaning- Space- Normal, A- Adjustment, C- Credit, D-  Debit, F- Rate of Exchange Adjustment AP or RP, I-  Interest, R -  Release of Reserve, T-  Reinstatement, X-  Cancellation, Y -  Replacement.
     * (Required)
     * 
     */
    @JsonProperty("transactionTypeCodeIndicator")
    @NotNull
    private D02D03D04D05InCommon.TransactionTypeCodeIndicator transactionTypeCodeIndicator;

    @JsonProperty("entryType2")
    @NotNull
    private D02D03D04D05InCommon.EntryType2 entryType2;

    @JsonProperty("centralSettlementIndicator")
    @NotNull
    private D02D03D04D05InCommon.CentralSettlementIndicator centralSettlementIndicator;

    @JsonProperty("carrierIdentificationCode")
    @Pattern(regexp = "[A-Z][0-9]{5}")
    @NotNull
    private String carrierIdentificationCode;

    @JsonProperty("carrierShortName")
    @Size(max = 12)
    @NotNull
    private String carrierShortName;

    @JsonProperty("carrierReference")
    @Pattern(regexp = "[A-Za-z0-9]{12}")
    @NotNull
    private String carrierReference;

    @JsonProperty("carrierSecondaryReference")
    @Pattern(regexp = "[A-Za-z0-9]{12}")
    private String carrierSecondaryReference;

    @JsonProperty("brokerCodeShort")
    @Pattern(regexp = "[A-Za-z0-9]{3}")
    @NotNull
    private String brokerCodeShort;

    @JsonProperty("brokerPseudonym")
    @Pattern(regexp = "[A-Za-z]{3}")
    @NotNull
    private String brokerPseudonym;

    @JsonProperty("brokerShortName")
    @Size(max = 20)
    @NotNull
    private String brokerShortName;

    @JsonProperty("brokerReference")
    @Size(max = 12)
    @NotNull
    private String brokerReference;

    @JsonProperty("secondaryBrokerReference")
    @Size(max = 12)
    @NotNull
    private String secondaryBrokerReference;

    @JsonProperty("settlementIndicator")
    @NotNull
    private D02D03D04D05InCommon.SettlementIndicator settlementIndicator;

    @JsonProperty("settlementDate")
    @NotNull
    private String settlementDate;

    @JsonProperty("psacSigningReference")
    @Pattern(regexp = "[0-9]{13}")
    @NotNull
    private String psacSigningReference;

    @JsonProperty("policySigningAccountingOfficeNumber")
    @Pattern(regexp = "[0-9]{13}")
    @NotNull
    private String policySigningAccountingOfficeNumber;

    @JsonProperty("alternativePSACFormNumber")
    @Size(max = 15)
    @NotNull
    private String alternativePSACFormNumber;

    @JsonProperty("lirmaSigningReferencePreviousTransaction")
    @Pattern(regexp = "[0-9]{13}")
    private String lirmaSigningReferencePreviousTransaction;

    @JsonProperty("originalCurrencyILU")
    @Size(max = 3)
    @NotNull
    private String originalCurrencyILU;

    @JsonProperty("originalCurrencyISO")
    @Pattern(regexp = "[A-Z]{3}")
    @NotNull
    private String originalCurrencyISO;

    @JsonProperty("settledInOriginalCurrency")
    @NotNull
    private SettledInOriginalCurrency settledInOriginalCurrency;

    @JsonProperty("settlementCurrencyCodeILU")
    @NotNull
    private SettlementCurrencyCodeILU settlementCurrencyCodeILU;

    @JsonProperty("settlementCurrencyCodeISO")
    @NotNull
    private ControlRecordD08.SettlementCurrencyCodeISO settlementCurrencyCodeISO;

    @JsonProperty("cedentName")
    @Size(max = 50)
    private String cedentName;

    @JsonProperty("originalPolicyholderName")
    @Size(max = 50)
    @NotNull
    private String originalPolicyholderName;

    @JsonProperty("interestInsured")
    @Size(max = 50)
    @NotNull
    private String interestInsured;

    @JsonProperty("perilsInsured")
    @Size(max = 50)
    @NotNull
    private String perilsInsured;

    @JsonProperty("locationInsured")
    @Size(max = 75)
    @NotNull
    private String locationInsured;

    @JsonProperty("narrativeInformation")
    @Size(max = 100)
    private String narrativeInformation;

    @JsonProperty("originalSumInsuredTotal")
    @NotNull
    private Object originalSumInsuredTotal;

    @JsonProperty("sumInsuredRevised")
    @Valid
    @NotNull
    private SumInsuredProperties sumInsuredRevised;

    @JsonProperty("additionalPremiumSumInsured")
    @Valid
    private SumInsuredProperties additionalPremiumSumInsured;

    @JsonProperty("originalSlipOrder")
    @NotNull
    private Object originalSlipOrder;

    @JsonProperty("revisedOriginalSlipOrder")
    @NotNull
    private Object revisedOriginalSlipOrder;

    @JsonProperty("additionalPremiumSlipOrder")
    @Valid
    private SlipLineProperties additionalPremiumSlipOrder;

    @JsonProperty("policyPeriodNarrative")
    @Size(max = 36)
    private String policyPeriodNarrative;

    @JsonProperty("policyOriginalDates")
    @NotNull
    private Object policyOriginalDates;
    @JsonProperty("revisedPolicyDates")
    @Valid
    private PeriodProperties revisedPolicyDates;

    @JsonProperty("narrativeInsuredDetails")
    @Size(max = 36)
    private String narrativeInsuredDetails;

    @JsonProperty("originalPremiumDates")
    @NotNull
    private Object originalPremiumDates;

    @JsonProperty("additionalPremiumDates")
    @Valid
    private PeriodProperties additionalPremiumDates;

    @JsonProperty("additionalNarrativeDetails")
    @Size(max = 100)
    private String additionalNarrativeDetails;

    @JsonProperty("additionalTransactionDetails")
    @Size(max = 150)
    private String additionalTransactionDetails;

    @JsonProperty("previousNetAmount")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String previousNetAmount;

    @JsonProperty("highestClaimEstimate")
    @Pattern(regexp = "[0-9]{0,10}(?:[.][0-9]{2})")
    private String highestClaimEstimate;

    @JsonProperty("previouslySettled")
    @Pattern(regexp = "[0-9]{0,10}(?:[.][0-9]{2})")
    private String previouslySettled;

    @JsonProperty("outstandingClaimAmount")
    @Pattern(regexp = "[0-9]{0,10}(?:[.][0-9]{2})")
    private String outstandingClaimAmount;

    @JsonProperty("brokerClaimReference")
    @Size(max = 10)
    private String brokerClaimReference;

    @JsonProperty("brokerContacts")
    @Size(max = 25)
    @NotNull
    private String brokerContacts;

    @JsonProperty("statementPeriodNarrative")
    @Size(max = 36)
    private String statementPeriodNarrative;

    @JsonProperty("statementPeriodStartDate")
    private String statementPeriodStartDate;

    @JsonProperty("statementPeriodEndDate")
    private String statementPeriodEndDate;

    @JsonProperty("adjustmentExpectedIndicator")
    @NotNull
    private D02D03D04D05InCommon.AdjustmentExpectedIndicator adjustmentExpectedIndicator;

    @JsonProperty("VATCode")
    @NotNull
    private D02D03D04D05InCommon.VATCode vATCode;

    @JsonProperty("attachmentsIndicator")
    @NotNull
    private D02D03D04D05InCommon.AttachmentsIndicator attachmentsIndicator;

    @JsonProperty("initialsSigningDataAdministrator")
    @Size(max = 3)
    @NotNull
    private String initialsSigningDataAdministrator;

    @JsonProperty("claimBulkSettlementIndicator")
    @NotNull
    private D02D03D04D05InCommon.ClaimBulkSettlementIndicator claimBulkSettlementIndicator;

    @JsonProperty("multipleSmallRisksIncludedIndicator")
    @NotNull
    private D02D03D04D05InCommon.MultipleSmallRisksIncludedIndicator multipleSmallRisksIncludedIndicator;

    @JsonProperty("slipLeaderShortName")
    @Size(max = 20)
    private String slipLeaderShortName;

    @JsonProperty("leadingCompanyShortName")
    @Size(max = 20)
    private String leadingCompanyShortName;

    @JsonProperty("estimatedPremiumIncome")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String estimatedPremiumIncome;

    @JsonProperty("estimatedPremiumIncomeISO")
    @Size(max = 3)
    private String estimatedPremiumIncomeISO;

    @JsonProperty("writtenLine")
    @Pattern(regexp = "[0-9]{0,3}\\.[0-9]{0,7}")
    private String writtenLine;

    @JsonProperty("tradeDateTerms")
    private String tradeDateTerms;

    @JsonProperty("slipRegistrationSystemNumber")
    @Size(max = 24)
    private String slipRegistrationSystemNumber;

    @JsonProperty("uniqueTransactionReference")
    @Size(max = 15)
    private String uniqueTransactionReference;

    @JsonProperty("claimMovementSequenceNumber")
    @Pattern(regexp = "[0-9]{0,3}")
    private String claimMovementSequenceNumber;

    @JsonProperty("insurersClaimReference")
    @Size(max = 12)
    private String insurersClaimReference;

    @JsonProperty("insurersClaimReference2")
    @Size(max = 12)
    private String insurersClaimReference2;

    @JsonProperty("rateOfExchange")
    @NotNull
    private Double rateOfExchange;

    @JsonProperty("totaShareBureauMembers")
    @NotNull
    private Double totaShareBureauMembers;

    @JsonProperty("insurersWrittenLine")
    @NotNull
    private Double insurersWrittenLine;

    @JsonProperty("grossPremium")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String grossPremium;

    @JsonProperty("grossPremiumOriginalCurrencyCompanyShare")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String grossPremiumOriginalCurrencyCompanyShare;

    @JsonProperty("grossPremiumSettlementCurrencyCompanyShare")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String grossPremiumSettlementCurrencyCompanyShare;

    @JsonProperty("brokerageAmountOriginalCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String brokerageAmountOriginalCurrency;

    @JsonProperty("brokerageAmountSettlementCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String brokerageAmountSettlementCurrency;

    @JsonProperty("taxDeductedOriginalCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String taxDeductedOriginalCurrency;

    @JsonProperty("taxDeductedSettlementCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String taxDeductedSettlementCurrency;

    @JsonProperty("otherDeductionsOriginalCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String otherDeductionsOriginalCurrency;

    @JsonProperty("otherDeductionsSettlementCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String otherDeductionsSettlementCurrency;

    @JsonProperty("netPremiumOrClaimProportionOriginalCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String netPremiumOrClaimProportionOriginalCurrency;

    @JsonProperty("netPremiumOrClaimProportionSettlementCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String netPremiumOrClaimProportionSettlementCurrency;

    @JsonProperty("brokeragePercentage")
    @JsonPropertyDescription("Percentage of gross premium to be deducted in respect of brokerage before payment is made.Length 9(3)V9(7)")
    @NotNull
    private Double brokeragePercentage;

    @JsonProperty("taxPercentage")
    @NotNull
    private Double taxPercentage;

    @JsonProperty("otherDeductionsPercentage")
    @NotNull
    private Double otherDeductionsPercentage;

    @JsonProperty("terrorismIndicator")
    @NotNull
    private D02D03D04D05InCommon.TerrorismIndicator terrorismIndicator;

    @JsonProperty("premiumTaxSettlementCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String premiumTaxSettlementCurrency;

    @JsonProperty("brokerCode")
    @Pattern(regexp = "[A-Za-z0-9]{4}")
    @NotNull
    private String brokerCode;

    @JsonProperty("uniqueClaimReference")
    @Size(max = 17)
    private String uniqueClaimReference;

    @JsonProperty("uniqueMarketReference")
    @Size(max = 17)
    @NotNull
    private String uniqueMarketReference;

    @JsonProperty("transactionReference")
    @Size(max = 17)
    private String transactionReference;

    @JsonProperty("premiumTaxOriginalCurrency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String premiumTaxOriginalCurrency;

    @JsonProperty("insurancePremiumTaxPercentage")
    @NotNull
    private Double insurancePremiumTaxPercentage;

    @JsonProperty("insurancePremiumTaxOnWholeIndicator")
    private D02D03D04D05InCommon.InsurancePremiumTaxOnWholeIndicator insurancePremiumTaxOnWholeIndicator;

    @JsonProperty("taxSettlementIndicator")
    private D02D03D04D05InCommon.TaxSettlementIndicator taxSettlementIndicator;

    @JsonProperty("countryCode")
    @Size(max = 3)
    private String countryCode;

    @JsonProperty("dsignEntryTypeCode")
    @Size(max = 3)
    @NotNull
    private String dsignEntryTypeCode;

    @JsonProperty("delinkedTransactionIndicator")
    @NotNull
    private D02D03D04D05InCommon.DelinkedTransactionIndicator delinkedTransactionIndicator;

    @JsonProperty("brokerPhoneNumber")
    @Size(max = 15)
    @NotNull
    private String brokerPhoneNumber;
    public enum AdjustmentExpectedIndicator {

        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.AdjustmentExpectedIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.AdjustmentExpectedIndicator>();

        static {
            for (D02D03D04D05InCommon.AdjustmentExpectedIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AdjustmentExpectedIndicator(String value) {
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
        public static D02D03D04D05InCommon.AdjustmentExpectedIndicator fromValue(String value) {
            D02D03D04D05InCommon.AdjustmentExpectedIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum AttachmentsIndicator {

        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.AttachmentsIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.AttachmentsIndicator>();

        static {
            for (D02D03D04D05InCommon.AttachmentsIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AttachmentsIndicator(String value) {
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
        public static D02D03D04D05InCommon.AttachmentsIndicator fromValue(String value) {
            D02D03D04D05InCommon.AttachmentsIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum CentralSettlementIndicator {

        Y("Y"),
        N("N"),
        S("S");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.CentralSettlementIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.CentralSettlementIndicator>();

        static {
            for (D02D03D04D05InCommon.CentralSettlementIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CentralSettlementIndicator(String value) {
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
        public static D02D03D04D05InCommon.CentralSettlementIndicator fromValue(String value) {
            D02D03D04D05InCommon.CentralSettlementIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ClaimBulkSettlementIndicator {

        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.ClaimBulkSettlementIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.ClaimBulkSettlementIndicator>();

        static {
            for (D02D03D04D05InCommon.ClaimBulkSettlementIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ClaimBulkSettlementIndicator(String value) {
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
        public static D02D03D04D05InCommon.ClaimBulkSettlementIndicator fromValue(String value) {
            D02D03D04D05InCommon.ClaimBulkSettlementIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum DelinkedTransactionIndicator {

        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.DelinkedTransactionIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.DelinkedTransactionIndicator>();

        static {
            for (D02D03D04D05InCommon.DelinkedTransactionIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DelinkedTransactionIndicator(String value) {
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
        public static D02D03D04D05InCommon.DelinkedTransactionIndicator fromValue(String value) {
            D02D03D04D05InCommon.DelinkedTransactionIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum EntryType2 {

        AP("AP"),
        PM("PM"),
        RP("RP"),
        CL("CL"),
        RC("RC"),
        TC("TC"),
        TD("TD"),
        CA("CA"),
        CP("CP"),
        TF("TF"),
        PF("PF");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.EntryType2> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.EntryType2>();

        static {
            for (D02D03D04D05InCommon.EntryType2 c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EntryType2(String value) {
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
        public static D02D03D04D05InCommon.EntryType2 fromValue(String value) {
            D02D03D04D05InCommon.EntryType2 constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum InsurancePremiumTaxOnWholeIndicator {

        P("P"),
        W("W");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.InsurancePremiumTaxOnWholeIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.InsurancePremiumTaxOnWholeIndicator>();

        static {
            for (D02D03D04D05InCommon.InsurancePremiumTaxOnWholeIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private InsurancePremiumTaxOnWholeIndicator(String value) {
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
        public static D02D03D04D05InCommon.InsurancePremiumTaxOnWholeIndicator fromValue(String value) {
            D02D03D04D05InCommon.InsurancePremiumTaxOnWholeIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum MultipleSmallRisksIncludedIndicator {

        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.MultipleSmallRisksIncludedIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.MultipleSmallRisksIncludedIndicator>();

        static {
            for (D02D03D04D05InCommon.MultipleSmallRisksIncludedIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private MultipleSmallRisksIncludedIndicator(String value) {
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
        public static D02D03D04D05InCommon.MultipleSmallRisksIncludedIndicator fromValue(String value) {
            D02D03D04D05InCommon.MultipleSmallRisksIncludedIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SettledInOriginalCurrency {

        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.SettledInOriginalCurrency> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.SettledInOriginalCurrency>();

        static {
            for (D02D03D04D05InCommon.SettledInOriginalCurrency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SettledInOriginalCurrency(String value) {
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
        public static D02D03D04D05InCommon.SettledInOriginalCurrency fromValue(String value) {
            D02D03D04D05InCommon.SettledInOriginalCurrency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SettlementCurrencyCodeILU {

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
        private final static Map<String, D02D03D04D05InCommon.SettlementCurrencyCodeILU> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.SettlementCurrencyCodeILU>();

        static {
            for (D02D03D04D05InCommon.SettlementCurrencyCodeILU c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SettlementCurrencyCodeILU(String value) {
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
        public static D02D03D04D05InCommon.SettlementCurrencyCodeILU fromValue(String value) {
            D02D03D04D05InCommon.SettlementCurrencyCodeILU constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SettlementIndicator {

        A("A"),
        W("W"),
        S("S"),
        D("D"),
        B("B"),
        Z("Z"),
        E("E");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.SettlementIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.SettlementIndicator>();

        static {
            for (D02D03D04D05InCommon.SettlementIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SettlementIndicator(String value) {
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
        public static D02D03D04D05InCommon.SettlementIndicator fromValue(String value) {
            D02D03D04D05InCommon.SettlementIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TaxSettlementIndicator {

        R("R"),
        S("S");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.TaxSettlementIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.TaxSettlementIndicator>();

        static {
            for (D02D03D04D05InCommon.TaxSettlementIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TaxSettlementIndicator(String value) {
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
        public static D02D03D04D05InCommon.TaxSettlementIndicator fromValue(String value) {
            D02D03D04D05InCommon.TaxSettlementIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TerrorismIndicator {

        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.TerrorismIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.TerrorismIndicator>();

        static {
            for (D02D03D04D05InCommon.TerrorismIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TerrorismIndicator(String value) {
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
        public static D02D03D04D05InCommon.TerrorismIndicator fromValue(String value) {
            D02D03D04D05InCommon.TerrorismIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TransactionTypeCodeIndicator {

        SPACE("space"),
        A("A"),
        C("C"),
        D("D"),
        F("F"),
        R("R"),
        T("T"),
        X("X"),
        Y("Y");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.TransactionTypeCodeIndicator> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.TransactionTypeCodeIndicator>();

        static {
            for (D02D03D04D05InCommon.TransactionTypeCodeIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TransactionTypeCodeIndicator(String value) {
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
        public static D02D03D04D05InCommon.TransactionTypeCodeIndicator fromValue(String value) {
            D02D03D04D05InCommon.TransactionTypeCodeIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum VATCode {

        X("X"),
        Z("Z"),
        M("M"),
        E("E"),
        N("N");
        private final String value;
        private final static Map<String, D02D03D04D05InCommon.VATCode> CONSTANTS = new HashMap<String, D02D03D04D05InCommon.VATCode>();

        static {
            for (D02D03D04D05InCommon.VATCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private VATCode(String value) {
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
        public static D02D03D04D05InCommon.VATCode fromValue(String value) {
            D02D03D04D05InCommon.VATCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
