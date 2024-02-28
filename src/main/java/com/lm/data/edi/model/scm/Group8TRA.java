
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;


/**
 * A segment group 8 Reference TRA - C. Transaction Amounts
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "leadingEstimate",
    "leadingEstimateQualifier",
    "currentNettOSI",
    "currentNettOSIIndicator",
    "currentNettOSF",
    "currentNettOSFIndicator",
    "currentNettOSQ",
    "currentNettOSQIndicator",
    "paidToDatePSI",
    "paidToDatePDI",
    "paidToDatePDF",
    "exchangeRate",
    "highestEstimate",
    "leadingHighestEstimate"
})
public class Group8TRA {

    /**
     * LUR
     * 
     */
    @JsonProperty("leadingEstimate")
    @JsonPropertyDescription("LUR")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String leadingEstimate;
    /**
     * LUR
     * 
     */
    @JsonProperty("leadingEstimateQualifier")
    @JsonPropertyDescription("LUR")
    @Size(max = 1)
    private String leadingEstimateQualifier;
    /**
     * Conditional. Latest estimate of the 100% nett amount of indemnity outstanding for the claim entry, in original currency. 
     * 
     */
    @JsonProperty("currentNettOSI")
    @JsonPropertyDescription("Conditional. Latest estimate of the 100% nett amount of indemnity outstanding for the claim entry, in original currency. ")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String currentNettOSI;
    /**
     * Conditional. Where the Current Nett O/S (I) (Orig) is zero and the indicator is present, it shows whether the amount is to be advised (Y) or is nil (N).
     * 
     */
    @JsonProperty("currentNettOSIIndicator")
    @JsonPropertyDescription("Conditional. Where the Current Nett O/S (I) (Orig) is zero and the indicator is present, it shows whether the amount is to be advised (Y) or is nil (N).")
    private CurrentNettOSIIndicator currentNettOSIIndicator;
    /**
     * Conditional. Latest estimate of the 100% nett amount of feeoutstanding for the claim entry, in original currency. 
     * 
     */
    @JsonProperty("currentNettOSF")
    @JsonPropertyDescription("Conditional. Latest estimate of the 100% nett amount of feeoutstanding for the claim entry, in original currency. ")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String currentNettOSF;
    /**
     * Conditional. Latest estimate of the 100% nett amount of indemnity outstanding for the claim entry, in original currency. 
     * 
     */
    @JsonProperty("currentNettOSFIndicator")
    @JsonPropertyDescription("Conditional. Latest estimate of the 100% nett amount of indemnity outstanding for the claim entry, in original currency. ")
    private CurrentNettOSFIndicator currentNettOSFIndicator;
    /**
     * Current net outstanding claim amount
     * 
     */
    @JsonProperty("currentNettOSQ")
    @JsonPropertyDescription("Current net outstanding claim amount")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String currentNettOSQ;
    /**
     *  If present, the qualifier shows whether a recovery is expected (R), claim notified awaiting report (M), circumstance of loss notified (L), awaiting advice from cedent (A), precautionary (P), subrogation (S), erroneous entry not to be reopened (X) or uber precautionary claim (U).  Value may be a space. The following qualifiers are no longer used but may be advised on claims entered before CLASS changes implemented for the new Qualifier Codes.
     * 
     */
    @JsonProperty("currentNettOSQIndicator")
    @JsonPropertyDescription(" If present, the qualifier shows whether a recovery is expected (R), claim notified awaiting report (M), circumstance of loss notified (L), awaiting advice from cedent (A), precautionary (P), subrogation (S), erroneous entry not to be reopened (X) or uber precautionary claim (U).  Value may be a space. The following qualifiers are no longer used but may be advised on claims entered before CLASS changes implemented for the new Qualifier Codes.")
    private CurrentNettOSQIndicator currentNettOSQIndicator;
    /**
     * Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in settlement currency. Amount may include fees/expenses 
     * 
     */
    @JsonProperty("paidToDatePSI")
    @JsonPropertyDescription("Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in settlement currency. Amount may include fees/expenses ")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String paidToDatePSI;
    /**
     * Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in original currency. Amount may include fees/expenses 
     * 
     */
    @JsonProperty("paidToDatePDI")
    @JsonPropertyDescription("Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in original currency. Amount may include fees/expenses ")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String paidToDatePDI;
    /**
     * Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in original currency. Amount may include VAT 
     * 
     */
    @JsonProperty("paidToDatePDF")
    @JsonPropertyDescription("Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in original currency. Amount may include VAT ")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String paidToDatePDF;
    /**
     * Conditional. Rate of exchange to be used to convert an outstanding amount from original currency to settlement currency. ROE
     * 
     */
    @JsonProperty("exchangeRate")
    @JsonPropertyDescription("Conditional. Rate of exchange to be used to convert an outstanding amount from original currency to settlement currency. ROE")
    private Double exchangeRate;
    /**
     * Conditional. The highest ever estimate designated as outstanding, in original currency. HEM
     * 
     */
    @JsonProperty("highestEstimate")
    @JsonPropertyDescription("Conditional. The highest ever estimate designated as outstanding, in original currency. HEM")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String highestEstimate;
    /**
     * Conditional. Leading Underwriter's highest ever estimate of the total claim amount, in original currency. LUH
     * 
     */
    @JsonProperty("leadingHighestEstimate")
    @JsonPropertyDescription("Conditional. Leading Underwriter's highest ever estimate of the total claim amount, in original currency. LUH")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String leadingHighestEstimate;

    /**
     * LUR
     * 
     */
    @JsonProperty("leadingEstimate")
    public String getLeadingEstimate() {
        return leadingEstimate;
    }

    /**
     * LUR
     * 
     */
    @JsonProperty("leadingEstimate")
    public void setLeadingEstimate(String leadingEstimate) {
        this.leadingEstimate = leadingEstimate;
    }

    /**
     * LUR
     * 
     */
    @JsonProperty("leadingEstimateQualifier")
    public String getLeadingEstimateQualifier() {
        return leadingEstimateQualifier;
    }

    /**
     * LUR
     * 
     */
    @JsonProperty("leadingEstimateQualifier")
    public void setLeadingEstimateQualifier(String leadingEstimateQualifier) {
        this.leadingEstimateQualifier = leadingEstimateQualifier;
    }

    /**
     * Conditional. Latest estimate of the 100% nett amount of indemnity outstanding for the claim entry, in original currency. 
     * 
     */
    @JsonProperty("currentNettOSI")
    public String getCurrentNettOSI() {
        return currentNettOSI;
    }

    /**
     * Conditional. Latest estimate of the 100% nett amount of indemnity outstanding for the claim entry, in original currency. 
     * 
     */
    @JsonProperty("currentNettOSI")
    public void setCurrentNettOSI(String currentNettOSI) {
        this.currentNettOSI = currentNettOSI;
    }

    /**
     * Conditional. Where the Current Nett O/S (I) (Orig) is zero and the indicator is present, it shows whether the amount is to be advised (Y) or is nil (N).
     * 
     */
    @JsonProperty("currentNettOSIIndicator")
    public CurrentNettOSIIndicator getCurrentNettOSIIndicator() {
        return currentNettOSIIndicator;
    }

    /**
     * Conditional. Where the Current Nett O/S (I) (Orig) is zero and the indicator is present, it shows whether the amount is to be advised (Y) or is nil (N).
     * 
     */
    @JsonProperty("currentNettOSIIndicator")
    public void setCurrentNettOSIIndicator(CurrentNettOSIIndicator currentNettOSIIndicator) {
        this.currentNettOSIIndicator = currentNettOSIIndicator;
    }

    /**
     * Conditional. Latest estimate of the 100% nett amount of feeoutstanding for the claim entry, in original currency. 
     * 
     */
    @JsonProperty("currentNettOSF")
    public String getCurrentNettOSF() {
        return currentNettOSF;
    }

    /**
     * Conditional. Latest estimate of the 100% nett amount of feeoutstanding for the claim entry, in original currency. 
     * 
     */
    @JsonProperty("currentNettOSF")
    public void setCurrentNettOSF(String currentNettOSF) {
        this.currentNettOSF = currentNettOSF;
    }

    /**
     * Conditional. Latest estimate of the 100% nett amount of indemnity outstanding for the claim entry, in original currency. 
     * 
     */
    @JsonProperty("currentNettOSFIndicator")
    public CurrentNettOSFIndicator getCurrentNettOSFIndicator() {
        return currentNettOSFIndicator;
    }

    /**
     * Conditional. Latest estimate of the 100% nett amount of indemnity outstanding for the claim entry, in original currency. 
     * 
     */
    @JsonProperty("currentNettOSFIndicator")
    public void setCurrentNettOSFIndicator(CurrentNettOSFIndicator currentNettOSFIndicator) {
        this.currentNettOSFIndicator = currentNettOSFIndicator;
    }

    /**
     * Current net outstanding claim amount
     * 
     */
    @JsonProperty("currentNettOSQ")
    public String getCurrentNettOSQ() {
        return currentNettOSQ;
    }

    /**
     * Current net outstanding claim amount
     * 
     */
    @JsonProperty("currentNettOSQ")
    public void setCurrentNettOSQ(String currentNettOSQ) {
        this.currentNettOSQ = currentNettOSQ;
    }

    /**
     *  If present, the qualifier shows whether a recovery is expected (R), claim notified awaiting report (M), circumstance of loss notified (L), awaiting advice from cedent (A), precautionary (P), subrogation (S), erroneous entry not to be reopened (X) or uber precautionary claim (U).  Value may be a space. The following qualifiers are no longer used but may be advised on claims entered before CLASS changes implemented for the new Qualifier Codes.
     * 
     */
    @JsonProperty("currentNettOSQIndicator")
    public CurrentNettOSQIndicator getCurrentNettOSQIndicator() {
        return currentNettOSQIndicator;
    }

    /**
     *  If present, the qualifier shows whether a recovery is expected (R), claim notified awaiting report (M), circumstance of loss notified (L), awaiting advice from cedent (A), precautionary (P), subrogation (S), erroneous entry not to be reopened (X) or uber precautionary claim (U).  Value may be a space. The following qualifiers are no longer used but may be advised on claims entered before CLASS changes implemented for the new Qualifier Codes.
     * 
     */
    @JsonProperty("currentNettOSQIndicator")
    public void setCurrentNettOSQIndicator(CurrentNettOSQIndicator currentNettOSQIndicator) {
        this.currentNettOSQIndicator = currentNettOSQIndicator;
    }

    /**
     * Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in settlement currency. Amount may include fees/expenses 
     * 
     */
    @JsonProperty("paidToDatePSI")
    public String getPaidToDatePSI() {
        return paidToDatePSI;
    }

    /**
     * Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in settlement currency. Amount may include fees/expenses 
     * 
     */
    @JsonProperty("paidToDatePSI")
    public void setPaidToDatePSI(String paidToDatePSI) {
        this.paidToDatePSI = paidToDatePSI;
    }

    /**
     * Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in original currency. Amount may include fees/expenses 
     * 
     */
    @JsonProperty("paidToDatePDI")
    public String getPaidToDatePDI() {
        return paidToDatePDI;
    }

    /**
     * Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in original currency. Amount may include fees/expenses 
     * 
     */
    @JsonProperty("paidToDatePDI")
    public void setPaidToDatePDI(String paidToDatePDI) {
        this.paidToDatePDI = paidToDatePDI;
    }

    /**
     * Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in original currency. Amount may include VAT 
     * 
     */
    @JsonProperty("paidToDatePDF")
    public String getPaidToDatePDF() {
        return paidToDatePDF;
    }

    /**
     * Conditional. Sum of 100% settlement amounts for indemnity paid-to-date, including any amount currently being settled on the claim, in original currency. Amount may include VAT 
     * 
     */
    @JsonProperty("paidToDatePDF")
    public void setPaidToDatePDF(String paidToDatePDF) {
        this.paidToDatePDF = paidToDatePDF;
    }

    /**
     * Conditional. Rate of exchange to be used to convert an outstanding amount from original currency to settlement currency. ROE
     * 
     */
    @JsonProperty("exchangeRate")
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Conditional. Rate of exchange to be used to convert an outstanding amount from original currency to settlement currency. ROE
     * 
     */
    @JsonProperty("exchangeRate")
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * Conditional. The highest ever estimate designated as outstanding, in original currency. HEM
     * 
     */
    @JsonProperty("highestEstimate")
    public String getHighestEstimate() {
        return highestEstimate;
    }

    /**
     * Conditional. The highest ever estimate designated as outstanding, in original currency. HEM
     * 
     */
    @JsonProperty("highestEstimate")
    public void setHighestEstimate(String highestEstimate) {
        this.highestEstimate = highestEstimate;
    }

    /**
     * Conditional. Leading Underwriter's highest ever estimate of the total claim amount, in original currency. LUH
     * 
     */
    @JsonProperty("leadingHighestEstimate")
    public String getLeadingHighestEstimate() {
        return leadingHighestEstimate;
    }

    /**
     * Conditional. Leading Underwriter's highest ever estimate of the total claim amount, in original currency. LUH
     * 
     */
    @JsonProperty("leadingHighestEstimate")
    public void setLeadingHighestEstimate(String leadingHighestEstimate) {
        this.leadingHighestEstimate = leadingHighestEstimate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group8TRA.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("leadingEstimate");
        sb.append('=');
        sb.append(((this.leadingEstimate == null)?"<null>":this.leadingEstimate));
        sb.append(',');
        sb.append("leadingEstimateQualifier");
        sb.append('=');
        sb.append(((this.leadingEstimateQualifier == null)?"<null>":this.leadingEstimateQualifier));
        sb.append(',');
        sb.append("currentNettOSI");
        sb.append('=');
        sb.append(((this.currentNettOSI == null)?"<null>":this.currentNettOSI));
        sb.append(',');
        sb.append("currentNettOSIIndicator");
        sb.append('=');
        sb.append(((this.currentNettOSIIndicator == null)?"<null>":this.currentNettOSIIndicator));
        sb.append(',');
        sb.append("currentNettOSF");
        sb.append('=');
        sb.append(((this.currentNettOSF == null)?"<null>":this.currentNettOSF));
        sb.append(',');
        sb.append("currentNettOSFIndicator");
        sb.append('=');
        sb.append(((this.currentNettOSFIndicator == null)?"<null>":this.currentNettOSFIndicator));
        sb.append(',');
        sb.append("currentNettOSQ");
        sb.append('=');
        sb.append(((this.currentNettOSQ == null)?"<null>":this.currentNettOSQ));
        sb.append(',');
        sb.append("currentNettOSQIndicator");
        sb.append('=');
        sb.append(((this.currentNettOSQIndicator == null)?"<null>":this.currentNettOSQIndicator));
        sb.append(',');
        sb.append("paidToDatePSI");
        sb.append('=');
        sb.append(((this.paidToDatePSI == null)?"<null>":this.paidToDatePSI));
        sb.append(',');
        sb.append("paidToDatePDI");
        sb.append('=');
        sb.append(((this.paidToDatePDI == null)?"<null>":this.paidToDatePDI));
        sb.append(',');
        sb.append("paidToDatePDF");
        sb.append('=');
        sb.append(((this.paidToDatePDF == null)?"<null>":this.paidToDatePDF));
        sb.append(',');
        sb.append("exchangeRate");
        sb.append('=');
        sb.append(((this.exchangeRate == null)?"<null>":this.exchangeRate));
        sb.append(',');
        sb.append("highestEstimate");
        sb.append('=');
        sb.append(((this.highestEstimate == null)?"<null>":this.highestEstimate));
        sb.append(',');
        sb.append("leadingHighestEstimate");
        sb.append('=');
        sb.append(((this.leadingHighestEstimate == null)?"<null>":this.leadingHighestEstimate));
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
        result = ((result* 31)+((this.currentNettOSQIndicator == null)? 0 :this.currentNettOSQIndicator.hashCode()));
        result = ((result* 31)+((this.leadingEstimate == null)? 0 :this.leadingEstimate.hashCode()));
        result = ((result* 31)+((this.currentNettOSQ == null)? 0 :this.currentNettOSQ.hashCode()));
        result = ((result* 31)+((this.paidToDatePSI == null)? 0 :this.paidToDatePSI.hashCode()));
        result = ((result* 31)+((this.currentNettOSF == null)? 0 :this.currentNettOSF.hashCode()));
        result = ((result* 31)+((this.paidToDatePDF == null)? 0 :this.paidToDatePDF.hashCode()));
        result = ((result* 31)+((this.currentNettOSI == null)? 0 :this.currentNettOSI.hashCode()));
        result = ((result* 31)+((this.highestEstimate == null)? 0 :this.highestEstimate.hashCode()));
        result = ((result* 31)+((this.exchangeRate == null)? 0 :this.exchangeRate.hashCode()));
        result = ((result* 31)+((this.currentNettOSFIndicator == null)? 0 :this.currentNettOSFIndicator.hashCode()));
        result = ((result* 31)+((this.paidToDatePDI == null)? 0 :this.paidToDatePDI.hashCode()));
        result = ((result* 31)+((this.leadingEstimateQualifier == null)? 0 :this.leadingEstimateQualifier.hashCode()));
        result = ((result* 31)+((this.leadingHighestEstimate == null)? 0 :this.leadingHighestEstimate.hashCode()));
        result = ((result* 31)+((this.currentNettOSIIndicator == null)? 0 :this.currentNettOSIIndicator.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group8TRA) == false) {
            return false;
        }
        Group8TRA rhs = ((Group8TRA) other);
        return (((((((((((((((this.currentNettOSQIndicator == rhs.currentNettOSQIndicator)||((this.currentNettOSQIndicator!= null)&&this.currentNettOSQIndicator.equals(rhs.currentNettOSQIndicator)))&&((this.leadingEstimate == rhs.leadingEstimate)||((this.leadingEstimate!= null)&&this.leadingEstimate.equals(rhs.leadingEstimate))))&&((this.currentNettOSQ == rhs.currentNettOSQ)||((this.currentNettOSQ!= null)&&this.currentNettOSQ.equals(rhs.currentNettOSQ))))&&((this.paidToDatePSI == rhs.paidToDatePSI)||((this.paidToDatePSI!= null)&&this.paidToDatePSI.equals(rhs.paidToDatePSI))))&&((this.currentNettOSF == rhs.currentNettOSF)||((this.currentNettOSF!= null)&&this.currentNettOSF.equals(rhs.currentNettOSF))))&&((this.paidToDatePDF == rhs.paidToDatePDF)||((this.paidToDatePDF!= null)&&this.paidToDatePDF.equals(rhs.paidToDatePDF))))&&((this.currentNettOSI == rhs.currentNettOSI)||((this.currentNettOSI!= null)&&this.currentNettOSI.equals(rhs.currentNettOSI))))&&((this.highestEstimate == rhs.highestEstimate)||((this.highestEstimate!= null)&&this.highestEstimate.equals(rhs.highestEstimate))))&&((this.exchangeRate == rhs.exchangeRate)||((this.exchangeRate!= null)&&this.exchangeRate.equals(rhs.exchangeRate))))&&((this.currentNettOSFIndicator == rhs.currentNettOSFIndicator)||((this.currentNettOSFIndicator!= null)&&this.currentNettOSFIndicator.equals(rhs.currentNettOSFIndicator))))&&((this.paidToDatePDI == rhs.paidToDatePDI)||((this.paidToDatePDI!= null)&&this.paidToDatePDI.equals(rhs.paidToDatePDI))))&&((this.leadingEstimateQualifier == rhs.leadingEstimateQualifier)||((this.leadingEstimateQualifier!= null)&&this.leadingEstimateQualifier.equals(rhs.leadingEstimateQualifier))))&&((this.leadingHighestEstimate == rhs.leadingHighestEstimate)||((this.leadingHighestEstimate!= null)&&this.leadingHighestEstimate.equals(rhs.leadingHighestEstimate))))&&((this.currentNettOSIIndicator == rhs.currentNettOSIIndicator)||((this.currentNettOSIIndicator!= null)&&this.currentNettOSIIndicator.equals(rhs.currentNettOSIIndicator))));
    }

    public enum CurrentNettOSFIndicator {

        Y("Y"),
        N("N");
        private final String value;
        private final static Map<String, CurrentNettOSFIndicator> CONSTANTS = new HashMap<String, CurrentNettOSFIndicator>();

        static {
            for (CurrentNettOSFIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CurrentNettOSFIndicator(String value) {
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
        public static CurrentNettOSFIndicator fromValue(String value) {
            CurrentNettOSFIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum CurrentNettOSIIndicator {

        L("L"),
        M("M"),
        A("A"),
        P("P"),
        U("U"),
        E("E"),
        F("F"),
        R("R"),
        S("S"),
        V("V"),
        X("X"),
        Z("Z"),
        Y("Y"),
        N("N"),
        __EMPTY__("");
        private final String value;
        private final static Map<String, CurrentNettOSIIndicator> CONSTANTS = new HashMap<String, CurrentNettOSIIndicator>();

        static {
            for (CurrentNettOSIIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CurrentNettOSIIndicator(String value) {
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
        public static CurrentNettOSIIndicator fromValue(String value) {
            CurrentNettOSIIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum CurrentNettOSQIndicator {

        R("R"),
        M("M"),
        L("L"),
        A("A"),
        P("P"),
        X("X"),
        U("U"),
        S("S"),
        E("E"),
        F("F"),
        V("V"),
        Z("Z"),
        __EMPTY__("");
        private final String value;
        private final static Map<String, CurrentNettOSQIndicator> CONSTANTS = new HashMap<String, CurrentNettOSQIndicator>();

        static {
            for (CurrentNettOSQIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CurrentNettOSQIndicator(String value) {
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
        public static CurrentNettOSQIndicator fromValue(String value) {
            CurrentNettOSQIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
