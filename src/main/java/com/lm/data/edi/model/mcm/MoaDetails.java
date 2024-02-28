
package com.lm.data.edi.model.mcm;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


/**
 * MONETARY AMOUNT . Refer EDI Message MCM Analysis Document TAB  Detail Record.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "segmentTag",
    "monetoryAmountQualifier",
    "amount",
    "currency"
})
@AllArgsConstructor
@NoArgsConstructor
public class MoaDetails {

    /**
     * Mandatory. SEGMENT TAG.
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    @JsonPropertyDescription("Mandatory. SEGMENT TAG.")
    @Size(max = 3)
    @NotNull
    private String segmentTag = "MOA";
    /**
     * Mandatoty. MONETARY AMOUNT QUALIFIER
     * (Required)
     * 
     */
    @JsonProperty("monetoryAmountQualifier")
    @JsonPropertyDescription("Mandatoty. MONETARY AMOUNT QUALIFIER")
    @NotNull
    private MoaDetails.MonetoryAmountQualifier monetoryAmountQualifier;
    /**
     * Mandatory. AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Mandatory. AMOUNT")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @Size(max = 15)
    @NotNull
    private String amount;
    /**
     * Mandatory. CURRENCY. The currency code is the ISO alpha abbreviation for each settlement currency.
     * (Required)
     * 
     */
    @JsonProperty("currency")
    @JsonPropertyDescription("Mandatory. CURRENCY. The currency code is the ISO alpha abbreviation for each settlement currency.")
    @Size(max = 3)
    @NotNull
    private String currency;

    /**
     * Mandatory. SEGMENT TAG.
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public String getSegmentTag() {
        return segmentTag;
    }

    /**
     * Mandatory. SEGMENT TAG.
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    /**
     * Mandatoty. MONETARY AMOUNT QUALIFIER
     * (Required)
     * 
     */
    @JsonProperty("monetoryAmountQualifier")
    public MonetoryAmountQualifier getMonetoryAmountQualifier() {
        return monetoryAmountQualifier;
    }

    /**
     * Mandatoty. MONETARY AMOUNT QUALIFIER
     * (Required)
     * 
     */
    @JsonProperty("monetoryAmountQualifier")
    public void setMonetoryAmountQualifier(MonetoryAmountQualifier monetoryAmountQualifier) {
        this.monetoryAmountQualifier = monetoryAmountQualifier;
    }

    /**
     * Mandatory. AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * Mandatory. AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Mandatory. CURRENCY. The currency code is the ISO alpha abbreviation for each settlement currency.
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Mandatory. CURRENCY. The currency code is the ISO alpha abbreviation for each settlement currency.
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MoaDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("segmentTag");
        sb.append('=');
        sb.append(((this.segmentTag == null)?"<null>":this.segmentTag));
        sb.append(',');
        sb.append("monetoryAmountQualifier");
        sb.append('=');
        sb.append(((this.monetoryAmountQualifier == null)?"<null>":this.monetoryAmountQualifier));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.segmentTag == null)? 0 :this.segmentTag.hashCode()));
        result = ((result* 31)+((this.monetoryAmountQualifier == null)? 0 :this.monetoryAmountQualifier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MoaDetails) == false) {
            return false;
        }
        MoaDetails rhs = ((MoaDetails) other);
        return (((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.segmentTag == rhs.segmentTag)||((this.segmentTag!= null)&&this.segmentTag.equals(rhs.segmentTag))))&&((this.monetoryAmountQualifier == rhs.monetoryAmountQualifier)||((this.monetoryAmountQualifier!= null)&&this.monetoryAmountQualifier.equals(rhs.monetoryAmountQualifier))));
    }

    public enum MonetoryAmountQualifier {

        NCR("NCR"),
        NDR("NDR"),
        VCR("VCR"),
        VDR("VDR"),
        WCR("WCR"),
        WDR("WDR"),
        CCR("CCR"),
        CDR("CDR");
        private final String value;
        private final static Map<String, MonetoryAmountQualifier> CONSTANTS = new HashMap<String, MonetoryAmountQualifier>();

        static {
            for (MonetoryAmountQualifier c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private MonetoryAmountQualifier(String value) {
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
        public static MonetoryAmountQualifier fromValue(String value) {
            MonetoryAmountQualifier constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
