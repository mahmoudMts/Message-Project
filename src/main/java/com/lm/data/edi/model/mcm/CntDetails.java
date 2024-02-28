
package com.lm.data.edi.model.mcm;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


/**
 * CONTROL TOTALS. Refer EDI Message MCM Analysis Document TAB  Detail Record.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "segmentTag",
    "controlQualifier",
    "transactionCount"
})
@AllArgsConstructor
@NoArgsConstructor
public class CntDetails {

    /**
     * Mandatory. SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    @JsonPropertyDescription("Mandatory. SEGMENT TAG")
    @Size(max = 3)
    @NotNull
    private String segmentTag = "CNT";
    /**
     * Mandatory. CONTROL QUALIFIER.
     * (Required)
     * 
     */
    @JsonProperty("controlQualifier")
    @JsonPropertyDescription("Mandatory. CONTROL QUALIFIER.")
    @Size(max = 3)
    @NotNull
    private String controlQualifier = "TXN";
    /**
     * TRANSACTION COUNT.This segment is a count of transactions, for each syndicate year of account, for each audit/risk code, for each business category code
     * (Required)
     * 
     */
    @JsonProperty("transactionCount")
    @JsonPropertyDescription("TRANSACTION COUNT.This segment is a count of transactions, for each syndicate year of account, for each audit/risk code, for each business category code")
    @Pattern(regexp = "[0-9]{0,15}")
    @NotNull
    private String transactionCount;

    /**
     * Mandatory. SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public String getSegmentTag() {
        return segmentTag;
    }

    /**
     * Mandatory. SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    /**
     * Mandatory. CONTROL QUALIFIER.
     * (Required)
     * 
     */
    @JsonProperty("controlQualifier")
    public String getControlQualifier() {
        return controlQualifier;
    }

    /**
     * Mandatory. CONTROL QUALIFIER.
     * (Required)
     * 
     */
    @JsonProperty("controlQualifier")
    public void setControlQualifier(String controlQualifier) {
        this.controlQualifier = controlQualifier;
    }

    /**
     * TRANSACTION COUNT.This segment is a count of transactions, for each syndicate year of account, for each audit/risk code, for each business category code
     * (Required)
     * 
     */
    @JsonProperty("transactionCount")
    public String getTransactionCount() {
        return transactionCount;
    }

    /**
     * TRANSACTION COUNT.This segment is a count of transactions, for each syndicate year of account, for each audit/risk code, for each business category code
     * (Required)
     * 
     */
    @JsonProperty("transactionCount")
    public void setTransactionCount(String transactionCount) {
        this.transactionCount = transactionCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CntDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("segmentTag");
        sb.append('=');
        sb.append(((this.segmentTag == null)?"<null>":this.segmentTag));
        sb.append(',');
        sb.append("controlQualifier");
        sb.append('=');
        sb.append(((this.controlQualifier == null)?"<null>":this.controlQualifier));
        sb.append(',');
        sb.append("transactionCount");
        sb.append('=');
        sb.append(((this.transactionCount == null)?"<null>":this.transactionCount));
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
        result = ((result* 31)+((this.transactionCount == null)? 0 :this.transactionCount.hashCode()));
        result = ((result* 31)+((this.segmentTag == null)? 0 :this.segmentTag.hashCode()));
        result = ((result* 31)+((this.controlQualifier == null)? 0 :this.controlQualifier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CntDetails) == false) {
            return false;
        }
        CntDetails rhs = ((CntDetails) other);
        return ((((this.transactionCount == rhs.transactionCount)||((this.transactionCount!= null)&&this.transactionCount.equals(rhs.transactionCount)))&&((this.segmentTag == rhs.segmentTag)||((this.segmentTag!= null)&&this.segmentTag.equals(rhs.segmentTag))))&&((this.controlQualifier == rhs.controlQualifier)||((this.controlQualifier!= null)&&this.controlQualifier.equals(rhs.controlQualifier))));
    }

}
