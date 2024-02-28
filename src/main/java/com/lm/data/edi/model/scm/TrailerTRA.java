
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


/**
 * Transaction Amounts Segment TRA - B. To provide a message control total, for audit purposes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "paidToDatePIM",
    "paidToDatePFM",
    "settledThisTimeSIM",
    "settledThisTimeSFM",
    "compSyndLinePercentage",
    "currentNettOIM",
    "currentNettOFM",
    "settledThisTimeSNI",
    "settledThisTimeSNF"
})
public class TrailerTRA {

    /**
     * Mandatory. Hash total, for control purposes, of all the indemnity amounts in original currency paid-to-date on the claims advised on this message.
     * (Required)
     * 
     */
    @JsonProperty("paidToDatePIM")
    @JsonPropertyDescription("Mandatory. Hash total, for control purposes, of all the indemnity amounts in original currency paid-to-date on the claims advised on this message.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String paidToDatePIM;
    /**
     * Mandatory. Hash total, for control purposes, of all fee amounts in original currency paid-to-date on the claims advised in this message.
     * (Required)
     * 
     */
    @JsonProperty("paidToDatePFM")
    @JsonPropertyDescription("Mandatory. Hash total, for control purposes, of all fee amounts in original currency paid-to-date on the claims advised in this message.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String paidToDatePFM;
    /**
     * Mandatory. Hash total, for control purposes, of all indemnity amounts settled this time on the claims advised on the message in original currency.
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSIM")
    @JsonPropertyDescription("Mandatory. Hash total, for control purposes, of all indemnity amounts settled this time on the claims advised on the message in original currency.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String settledThisTimeSIM;
    /**
     * Mandatory. Hash total, for control purposes, of all fee amounts settled this time on the claims advised on the message in original currency.
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSFM")
    @JsonPropertyDescription("Mandatory. Hash total, for control purposes, of all fee amounts settled this time on the claims advised on the message in original currency.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String settledThisTimeSFM;
    /**
     * Hash total of syndicate line percentages, Percentage Msg) for message control purposes.
     * (Required)
     * 
     */
    @JsonProperty("compSyndLinePercentage")
    @JsonPropertyDescription("Hash total of syndicate line percentages, Percentage Msg) for message control purposes.")
    @NotNull
    private Double compSyndLinePercentage;
    /**
     * Mandatory. Hash total of the current nett outstanding indemnity amounts in original currency, for message control purposes.
     * (Required)
     * 
     */
    @JsonProperty("currentNettOIM")
    @JsonPropertyDescription("Mandatory. Hash total of the current nett outstanding indemnity amounts in original currency, for message control purposes.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String currentNettOIM;
    /**
     * Mandatory. Hash total of the current nett outstanding fee amounts in original currency, for message control purposes.
     * (Required)
     * 
     */
    @JsonProperty("currentNettOFM")
    @JsonPropertyDescription("Mandatory. Hash total of the current nett outstanding fee amounts in original currency, for message control purposes.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String currentNettOFM;
    /**
     * Mandatory. Hash total, for control purposes, of negative indemnity amounts settled this time on the claims advised on the message in original currency
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSNI")
    @JsonPropertyDescription("Mandatory. Hash total, for control purposes, of negative indemnity amounts settled this time on the claims advised on the message in original currency")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String settledThisTimeSNI;
    /**
     * Mandatory. Hash total, for control purposes, of negative fee amounts settled this time on the claims advised on the message in original currency.
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSNF")
    @JsonPropertyDescription("Mandatory. Hash total, for control purposes, of negative fee amounts settled this time on the claims advised on the message in original currency.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String settledThisTimeSNF;

    /**
     * Mandatory. Hash total, for control purposes, of all the indemnity amounts in original currency paid-to-date on the claims advised on this message.
     * (Required)
     * 
     */
    @JsonProperty("paidToDatePIM")
    public String getPaidToDatePIM() {
        return paidToDatePIM;
    }

    /**
     * Mandatory. Hash total, for control purposes, of all the indemnity amounts in original currency paid-to-date on the claims advised on this message.
     * (Required)
     * 
     */
    @JsonProperty("paidToDatePIM")
    public void setPaidToDatePIM(String paidToDatePIM) {
        this.paidToDatePIM = paidToDatePIM;
    }

    /**
     * Mandatory. Hash total, for control purposes, of all fee amounts in original currency paid-to-date on the claims advised in this message.
     * (Required)
     * 
     */
    @JsonProperty("paidToDatePFM")
    public String getPaidToDatePFM() {
        return paidToDatePFM;
    }

    /**
     * Mandatory. Hash total, for control purposes, of all fee amounts in original currency paid-to-date on the claims advised in this message.
     * (Required)
     * 
     */
    @JsonProperty("paidToDatePFM")
    public void setPaidToDatePFM(String paidToDatePFM) {
        this.paidToDatePFM = paidToDatePFM;
    }

    /**
     * Mandatory. Hash total, for control purposes, of all indemnity amounts settled this time on the claims advised on the message in original currency.
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSIM")
    public String getSettledThisTimeSIM() {
        return settledThisTimeSIM;
    }

    /**
     * Mandatory. Hash total, for control purposes, of all indemnity amounts settled this time on the claims advised on the message in original currency.
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSIM")
    public void setSettledThisTimeSIM(String settledThisTimeSIM) {
        this.settledThisTimeSIM = settledThisTimeSIM;
    }

    /**
     * Mandatory. Hash total, for control purposes, of all fee amounts settled this time on the claims advised on the message in original currency.
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSFM")
    public String getSettledThisTimeSFM() {
        return settledThisTimeSFM;
    }

    /**
     * Mandatory. Hash total, for control purposes, of all fee amounts settled this time on the claims advised on the message in original currency.
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSFM")
    public void setSettledThisTimeSFM(String settledThisTimeSFM) {
        this.settledThisTimeSFM = settledThisTimeSFM;
    }

    /**
     * Hash total of syndicate line percentages, Percentage Msg) for message control purposes.
     * (Required)
     * 
     */
    @JsonProperty("compSyndLinePercentage")
    public Double getCompSyndLinePercentage() {
        return compSyndLinePercentage;
    }

    /**
     * Hash total of syndicate line percentages, Percentage Msg) for message control purposes.
     * (Required)
     * 
     */
    @JsonProperty("compSyndLinePercentage")
    public void setCompSyndLinePercentage(Double compSyndLinePercentage) {
        this.compSyndLinePercentage = compSyndLinePercentage;
    }

    /**
     * Mandatory. Hash total of the current nett outstanding indemnity amounts in original currency, for message control purposes.
     * (Required)
     * 
     */
    @JsonProperty("currentNettOIM")
    public String getCurrentNettOIM() {
        return currentNettOIM;
    }

    /**
     * Mandatory. Hash total of the current nett outstanding indemnity amounts in original currency, for message control purposes.
     * (Required)
     * 
     */
    @JsonProperty("currentNettOIM")
    public void setCurrentNettOIM(String currentNettOIM) {
        this.currentNettOIM = currentNettOIM;
    }

    /**
     * Mandatory. Hash total of the current nett outstanding fee amounts in original currency, for message control purposes.
     * (Required)
     * 
     */
    @JsonProperty("currentNettOFM")
    public String getCurrentNettOFM() {
        return currentNettOFM;
    }

    /**
     * Mandatory. Hash total of the current nett outstanding fee amounts in original currency, for message control purposes.
     * (Required)
     * 
     */
    @JsonProperty("currentNettOFM")
    public void setCurrentNettOFM(String currentNettOFM) {
        this.currentNettOFM = currentNettOFM;
    }

    /**
     * Mandatory. Hash total, for control purposes, of negative indemnity amounts settled this time on the claims advised on the message in original currency
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSNI")
    public String getSettledThisTimeSNI() {
        return settledThisTimeSNI;
    }

    /**
     * Mandatory. Hash total, for control purposes, of negative indemnity amounts settled this time on the claims advised on the message in original currency
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSNI")
    public void setSettledThisTimeSNI(String settledThisTimeSNI) {
        this.settledThisTimeSNI = settledThisTimeSNI;
    }

    /**
     * Mandatory. Hash total, for control purposes, of negative fee amounts settled this time on the claims advised on the message in original currency.
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSNF")
    public String getSettledThisTimeSNF() {
        return settledThisTimeSNF;
    }

    /**
     * Mandatory. Hash total, for control purposes, of negative fee amounts settled this time on the claims advised on the message in original currency.
     * (Required)
     * 
     */
    @JsonProperty("settledThisTimeSNF")
    public void setSettledThisTimeSNF(String settledThisTimeSNF) {
        this.settledThisTimeSNF = settledThisTimeSNF;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TrailerTRA.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paidToDatePIM");
        sb.append('=');
        sb.append(((this.paidToDatePIM == null)?"<null>":this.paidToDatePIM));
        sb.append(',');
        sb.append("paidToDatePFM");
        sb.append('=');
        sb.append(((this.paidToDatePFM == null)?"<null>":this.paidToDatePFM));
        sb.append(',');
        sb.append("settledThisTimeSIM");
        sb.append('=');
        sb.append(((this.settledThisTimeSIM == null)?"<null>":this.settledThisTimeSIM));
        sb.append(',');
        sb.append("settledThisTimeSFM");
        sb.append('=');
        sb.append(((this.settledThisTimeSFM == null)?"<null>":this.settledThisTimeSFM));
        sb.append(',');
        sb.append("compSyndLinePercentage");
        sb.append('=');
        sb.append(((this.compSyndLinePercentage == null)?"<null>":this.compSyndLinePercentage));
        sb.append(',');
        sb.append("currentNettOIM");
        sb.append('=');
        sb.append(((this.currentNettOIM == null)?"<null>":this.currentNettOIM));
        sb.append(',');
        sb.append("currentNettOFM");
        sb.append('=');
        sb.append(((this.currentNettOFM == null)?"<null>":this.currentNettOFM));
        sb.append(',');
        sb.append("settledThisTimeSNI");
        sb.append('=');
        sb.append(((this.settledThisTimeSNI == null)?"<null>":this.settledThisTimeSNI));
        sb.append(',');
        sb.append("settledThisTimeSNF");
        sb.append('=');
        sb.append(((this.settledThisTimeSNF == null)?"<null>":this.settledThisTimeSNF));
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
        result = ((result* 31)+((this.compSyndLinePercentage == null)? 0 :this.compSyndLinePercentage.hashCode()));
        result = ((result* 31)+((this.settledThisTimeSNI == null)? 0 :this.settledThisTimeSNI.hashCode()));
        result = ((result* 31)+((this.paidToDatePFM == null)? 0 :this.paidToDatePFM.hashCode()));
        result = ((result* 31)+((this.currentNettOIM == null)? 0 :this.currentNettOIM.hashCode()));
        result = ((result* 31)+((this.paidToDatePIM == null)? 0 :this.paidToDatePIM.hashCode()));
        result = ((result* 31)+((this.settledThisTimeSIM == null)? 0 :this.settledThisTimeSIM.hashCode()));
        result = ((result* 31)+((this.currentNettOFM == null)? 0 :this.currentNettOFM.hashCode()));
        result = ((result* 31)+((this.settledThisTimeSNF == null)? 0 :this.settledThisTimeSNF.hashCode()));
        result = ((result* 31)+((this.settledThisTimeSFM == null)? 0 :this.settledThisTimeSFM.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrailerTRA) == false) {
            return false;
        }
        TrailerTRA rhs = ((TrailerTRA) other);
        return ((((((((((this.compSyndLinePercentage == rhs.compSyndLinePercentage)||((this.compSyndLinePercentage!= null)&&this.compSyndLinePercentage.equals(rhs.compSyndLinePercentage)))&&((this.settledThisTimeSNI == rhs.settledThisTimeSNI)||((this.settledThisTimeSNI!= null)&&this.settledThisTimeSNI.equals(rhs.settledThisTimeSNI))))&&((this.paidToDatePFM == rhs.paidToDatePFM)||((this.paidToDatePFM!= null)&&this.paidToDatePFM.equals(rhs.paidToDatePFM))))&&((this.currentNettOIM == rhs.currentNettOIM)||((this.currentNettOIM!= null)&&this.currentNettOIM.equals(rhs.currentNettOIM))))&&((this.paidToDatePIM == rhs.paidToDatePIM)||((this.paidToDatePIM!= null)&&this.paidToDatePIM.equals(rhs.paidToDatePIM))))&&((this.settledThisTimeSIM == rhs.settledThisTimeSIM)||((this.settledThisTimeSIM!= null)&&this.settledThisTimeSIM.equals(rhs.settledThisTimeSIM))))&&((this.currentNettOFM == rhs.currentNettOFM)||((this.currentNettOFM!= null)&&this.currentNettOFM.equals(rhs.currentNettOFM))))&&((this.settledThisTimeSNF == rhs.settledThisTimeSNF)||((this.settledThisTimeSNF!= null)&&this.settledThisTimeSNF.equals(rhs.settledThisTimeSNF))))&&((this.settledThisTimeSFM == rhs.settledThisTimeSFM)||((this.settledThisTimeSFM!= null)&&this.settledThisTimeSFM.equals(rhs.settledThisTimeSFM))));
    }

}
