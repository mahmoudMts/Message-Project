
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A segment PER Details PER-A
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "periodOfPolicyFromDate",
    "periodOfPolicyToDate",
    "periodOfCoverFromDate",
    "periodOfCoverToDate",
    "lossDateFrom",
    "lossDateTo",
    "dateClaimMadeFrom",
    "dateClaimMadeTo"
})
public class PERDetail {

    /**
     * Inception date of period over which a risk is covered PPF
     * 
     */
    @JsonProperty("periodOfPolicyFromDate")
    @JsonPropertyDescription("Inception date of period over which a risk is covered PPF")
    private String periodOfPolicyFromDate;
    /**
     * Inception date of period over which a risk is covered PPT
     * 
     */
    @JsonProperty("periodOfPolicyToDate")
    @JsonPropertyDescription("Inception date of period over which a risk is covered PPT")
    private String periodOfPolicyToDate;
    /**
     * Expiry date of period over which a risk is covered PCF
     * 
     */
    @JsonProperty("periodOfCoverFromDate")
    @JsonPropertyDescription("Expiry date of period over which a risk is covered PCF")
    private String periodOfCoverFromDate;
    /**
     * The first date of the period of cover to which the premium applies PCT
     * 
     */
    @JsonProperty("periodOfCoverToDate")
    @JsonPropertyDescription("The first date of the period of cover to which the premium applies PCT")
    private String periodOfCoverToDate;
    /**
     * The last date of the period of cover to which the premium applies applies LOF
     * 
     */
    @JsonProperty("lossDateFrom")
    @JsonPropertyDescription("The last date of the period of cover to which the premium applies applies LOF")
    private String lossDateFrom;
    /**
     * The last date of occurrence of a loss if the loss occurs over a period LOT
     * 
     */
    @JsonProperty("lossDateTo")
    @JsonPropertyDescription("The last date of occurrence of a loss if the loss occurs over a period LOT")
    private String lossDateTo;
    /**
     * The last date of occurrence of a loss if the loss occurs over a period CMF
     * 
     */
    @JsonProperty("dateClaimMadeFrom")
    @JsonPropertyDescription("The last date of occurrence of a loss if the loss occurs over a period CMF")
    private String dateClaimMadeFrom;
    /**
     * The last date on which a claim was made when a notification covers claims made over a period CMT
     * 
     */
    @JsonProperty("dateClaimMadeTo")
    @JsonPropertyDescription("The last date on which a claim was made when a notification covers claims made over a period CMT")
    private String dateClaimMadeTo;

    /**
     * Inception date of period over which a risk is covered PPF
     * 
     */
    @JsonProperty("periodOfPolicyFromDate")
    public String getPeriodOfPolicyFromDate() {
        return periodOfPolicyFromDate;
    }

    /**
     * Inception date of period over which a risk is covered PPF
     * 
     */
    @JsonProperty("periodOfPolicyFromDate")
    public void setPeriodOfPolicyFromDate(String periodOfPolicyFromDate) {
        this.periodOfPolicyFromDate = periodOfPolicyFromDate;
    }

    /**
     * Inception date of period over which a risk is covered PPT
     * 
     */
    @JsonProperty("periodOfPolicyToDate")
    public String getPeriodOfPolicyToDate() {
        return periodOfPolicyToDate;
    }

    /**
     * Inception date of period over which a risk is covered PPT
     * 
     */
    @JsonProperty("periodOfPolicyToDate")
    public void setPeriodOfPolicyToDate(String periodOfPolicyToDate) {
        this.periodOfPolicyToDate = periodOfPolicyToDate;
    }

    /**
     * Expiry date of period over which a risk is covered PCF
     * 
     */
    @JsonProperty("periodOfCoverFromDate")
    public String getPeriodOfCoverFromDate() {
        return periodOfCoverFromDate;
    }

    /**
     * Expiry date of period over which a risk is covered PCF
     * 
     */
    @JsonProperty("periodOfCoverFromDate")
    public void setPeriodOfCoverFromDate(String periodOfCoverFromDate) {
        this.periodOfCoverFromDate = periodOfCoverFromDate;
    }

    /**
     * The first date of the period of cover to which the premium applies PCT
     * 
     */
    @JsonProperty("periodOfCoverToDate")
    public String getPeriodOfCoverToDate() {
        return periodOfCoverToDate;
    }

    /**
     * The first date of the period of cover to which the premium applies PCT
     * 
     */
    @JsonProperty("periodOfCoverToDate")
    public void setPeriodOfCoverToDate(String periodOfCoverToDate) {
        this.periodOfCoverToDate = periodOfCoverToDate;
    }

    /**
     * The last date of the period of cover to which the premium applies applies LOF
     * 
     */
    @JsonProperty("lossDateFrom")
    public String getLossDateFrom() {
        return lossDateFrom;
    }

    /**
     * The last date of the period of cover to which the premium applies applies LOF
     * 
     */
    @JsonProperty("lossDateFrom")
    public void setLossDateFrom(String lossDateFrom) {
        this.lossDateFrom = lossDateFrom;
    }

    /**
     * The last date of occurrence of a loss if the loss occurs over a period LOT
     * 
     */
    @JsonProperty("lossDateTo")
    public String getLossDateTo() {
        return lossDateTo;
    }

    /**
     * The last date of occurrence of a loss if the loss occurs over a period LOT
     * 
     */
    @JsonProperty("lossDateTo")
    public void setLossDateTo(String lossDateTo) {
        this.lossDateTo = lossDateTo;
    }

    /**
     * The last date of occurrence of a loss if the loss occurs over a period CMF
     * 
     */
    @JsonProperty("dateClaimMadeFrom")
    public String getDateClaimMadeFrom() {
        return dateClaimMadeFrom;
    }

    /**
     * The last date of occurrence of a loss if the loss occurs over a period CMF
     * 
     */
    @JsonProperty("dateClaimMadeFrom")
    public void setDateClaimMadeFrom(String dateClaimMadeFrom) {
        this.dateClaimMadeFrom = dateClaimMadeFrom;
    }

    /**
     * The last date on which a claim was made when a notification covers claims made over a period CMT
     * 
     */
    @JsonProperty("dateClaimMadeTo")
    public String getDateClaimMadeTo() {
        return dateClaimMadeTo;
    }

    /**
     * The last date on which a claim was made when a notification covers claims made over a period CMT
     * 
     */
    @JsonProperty("dateClaimMadeTo")
    public void setDateClaimMadeTo(String dateClaimMadeTo) {
        this.dateClaimMadeTo = dateClaimMadeTo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PERDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("periodOfPolicyFromDate");
        sb.append('=');
        sb.append(((this.periodOfPolicyFromDate == null)?"<null>":this.periodOfPolicyFromDate));
        sb.append(',');
        sb.append("periodOfPolicyToDate");
        sb.append('=');
        sb.append(((this.periodOfPolicyToDate == null)?"<null>":this.periodOfPolicyToDate));
        sb.append(',');
        sb.append("periodOfCoverFromDate");
        sb.append('=');
        sb.append(((this.periodOfCoverFromDate == null)?"<null>":this.periodOfCoverFromDate));
        sb.append(',');
        sb.append("periodOfCoverToDate");
        sb.append('=');
        sb.append(((this.periodOfCoverToDate == null)?"<null>":this.periodOfCoverToDate));
        sb.append(',');
        sb.append("lossDateFrom");
        sb.append('=');
        sb.append(((this.lossDateFrom == null)?"<null>":this.lossDateFrom));
        sb.append(',');
        sb.append("lossDateTo");
        sb.append('=');
        sb.append(((this.lossDateTo == null)?"<null>":this.lossDateTo));
        sb.append(',');
        sb.append("dateClaimMadeFrom");
        sb.append('=');
        sb.append(((this.dateClaimMadeFrom == null)?"<null>":this.dateClaimMadeFrom));
        sb.append(',');
        sb.append("dateClaimMadeTo");
        sb.append('=');
        sb.append(((this.dateClaimMadeTo == null)?"<null>":this.dateClaimMadeTo));
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
        result = ((result* 31)+((this.dateClaimMadeFrom == null)? 0 :this.dateClaimMadeFrom.hashCode()));
        result = ((result* 31)+((this.periodOfCoverFromDate == null)? 0 :this.periodOfCoverFromDate.hashCode()));
        result = ((result* 31)+((this.periodOfCoverToDate == null)? 0 :this.periodOfCoverToDate.hashCode()));
        result = ((result* 31)+((this.dateClaimMadeTo == null)? 0 :this.dateClaimMadeTo.hashCode()));
        result = ((result* 31)+((this.periodOfPolicyFromDate == null)? 0 :this.periodOfPolicyFromDate.hashCode()));
        result = ((result* 31)+((this.periodOfPolicyToDate == null)? 0 :this.periodOfPolicyToDate.hashCode()));
        result = ((result* 31)+((this.lossDateFrom == null)? 0 :this.lossDateFrom.hashCode()));
        result = ((result* 31)+((this.lossDateTo == null)? 0 :this.lossDateTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PERDetail) == false) {
            return false;
        }
        PERDetail rhs = ((PERDetail) other);
        return (((((((((this.dateClaimMadeFrom == rhs.dateClaimMadeFrom)||((this.dateClaimMadeFrom!= null)&&this.dateClaimMadeFrom.equals(rhs.dateClaimMadeFrom)))&&((this.periodOfCoverFromDate == rhs.periodOfCoverFromDate)||((this.periodOfCoverFromDate!= null)&&this.periodOfCoverFromDate.equals(rhs.periodOfCoverFromDate))))&&((this.periodOfCoverToDate == rhs.periodOfCoverToDate)||((this.periodOfCoverToDate!= null)&&this.periodOfCoverToDate.equals(rhs.periodOfCoverToDate))))&&((this.dateClaimMadeTo == rhs.dateClaimMadeTo)||((this.dateClaimMadeTo!= null)&&this.dateClaimMadeTo.equals(rhs.dateClaimMadeTo))))&&((this.periodOfPolicyFromDate == rhs.periodOfPolicyFromDate)||((this.periodOfPolicyFromDate!= null)&&this.periodOfPolicyFromDate.equals(rhs.periodOfPolicyFromDate))))&&((this.periodOfPolicyToDate == rhs.periodOfPolicyToDate)||((this.periodOfPolicyToDate!= null)&&this.periodOfPolicyToDate.equals(rhs.periodOfPolicyToDate))))&&((this.lossDateFrom == rhs.lossDateFrom)||((this.lossDateFrom!= null)&&this.lossDateFrom.equals(rhs.lossDateFrom))))&&((this.lossDateTo == rhs.lossDateTo)||((this.lossDateTo!= null)&&this.lossDateTo.equals(rhs.lossDateTo))));
    }

}
