
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * A segment group 9 Reference PIA - E. Additional Product Information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountingType",
    "previouslyPaidIndicator",
    "lossReserveInterestIndicator",
    "advancePaymentIndicator"
})
public class Group9PIA {

    /**
     * Conditional. Indicates whether a settlement has been automatically processed and that the Settlement amount is guaranteed to match the USM value. ACT
     * 
     */
    @JsonProperty("accountingType")
    @JsonPropertyDescription("Conditional. Indicates whether a settlement has been automatically processed and that the Settlement amount is guaranteed to match the USM value. ACT")
    @Size(max = 1)
    private String accountingType;
    /**
     * Conditional. Indicates that a claim settlement is not being 'settled this time' but that an amount has been entered to update the paid-to-date amount'. can be Y/N. PPI
     * 
     */
    @JsonProperty("previouslyPaidIndicator")
    @JsonPropertyDescription("Conditional. Indicates that a claim settlement is not being 'settled this time' but that an amount has been entered to update the paid-to-date amount'. can be Y/N. PPI")
    @Size(max = 1)
    private String previouslyPaidIndicator;
    /**
     * Conditional. Indicates that whilst the amount advised is the Loss Reserve amount the corresponding USM amount is a composite of the Loss Reserve Interest and the Loss Reserve amounts. can be Y/N. LRI
     * 
     */
    @JsonProperty("lossReserveInterestIndicator")
    @JsonPropertyDescription("Conditional. Indicates that whilst the amount advised is the Loss Reserve amount the corresponding USM amount is a composite of the Loss Reserve Interest and the Loss Reserve amounts. can be Y/N. LRI")
    @Size(max = 1)
    private String lossReserveInterestIndicator;
    /**
     * Conditional. Indicates that funds have been collected from underwriters, but will be held in the account of the third party (e.g. Lloyd’s Broker) prior to receipt by the ultimate payee. can be Y/N. API
     * 
     */
    @JsonProperty("advancePaymentIndicator")
    @JsonPropertyDescription("Conditional. Indicates that funds have been collected from underwriters, but will be held in the account of the third party (e.g. Lloyd\u2019s Broker) prior to receipt by the ultimate payee. can be Y/N. API")
    @Size(max = 1)
    private String advancePaymentIndicator;

    /**
     * Conditional. Indicates whether a settlement has been automatically processed and that the Settlement amount is guaranteed to match the USM value. ACT
     * 
     */
    @JsonProperty("accountingType")
    public String getAccountingType() {
        return accountingType;
    }

    /**
     * Conditional. Indicates whether a settlement has been automatically processed and that the Settlement amount is guaranteed to match the USM value. ACT
     * 
     */
    @JsonProperty("accountingType")
    public void setAccountingType(String accountingType) {
        this.accountingType = accountingType;
    }

    /**
     * Conditional. Indicates that a claim settlement is not being 'settled this time' but that an amount has been entered to update the paid-to-date amount'. can be Y/N. PPI
     * 
     */
    @JsonProperty("previouslyPaidIndicator")
    public String getPreviouslyPaidIndicator() {
        return previouslyPaidIndicator;
    }

    /**
     * Conditional. Indicates that a claim settlement is not being 'settled this time' but that an amount has been entered to update the paid-to-date amount'. can be Y/N. PPI
     * 
     */
    @JsonProperty("previouslyPaidIndicator")
    public void setPreviouslyPaidIndicator(String previouslyPaidIndicator) {
        this.previouslyPaidIndicator = previouslyPaidIndicator;
    }

    /**
     * Conditional. Indicates that whilst the amount advised is the Loss Reserve amount the corresponding USM amount is a composite of the Loss Reserve Interest and the Loss Reserve amounts. can be Y/N. LRI
     * 
     */
    @JsonProperty("lossReserveInterestIndicator")
    public String getLossReserveInterestIndicator() {
        return lossReserveInterestIndicator;
    }

    /**
     * Conditional. Indicates that whilst the amount advised is the Loss Reserve amount the corresponding USM amount is a composite of the Loss Reserve Interest and the Loss Reserve amounts. can be Y/N. LRI
     * 
     */
    @JsonProperty("lossReserveInterestIndicator")
    public void setLossReserveInterestIndicator(String lossReserveInterestIndicator) {
        this.lossReserveInterestIndicator = lossReserveInterestIndicator;
    }

    /**
     * Conditional. Indicates that funds have been collected from underwriters, but will be held in the account of the third party (e.g. Lloyd’s Broker) prior to receipt by the ultimate payee. can be Y/N. API
     * 
     */
    @JsonProperty("advancePaymentIndicator")
    public String getAdvancePaymentIndicator() {
        return advancePaymentIndicator;
    }

    /**
     * Conditional. Indicates that funds have been collected from underwriters, but will be held in the account of the third party (e.g. Lloyd’s Broker) prior to receipt by the ultimate payee. can be Y/N. API
     * 
     */
    @JsonProperty("advancePaymentIndicator")
    public void setAdvancePaymentIndicator(String advancePaymentIndicator) {
        this.advancePaymentIndicator = advancePaymentIndicator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group9PIA.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountingType");
        sb.append('=');
        sb.append(((this.accountingType == null)?"<null>":this.accountingType));
        sb.append(',');
        sb.append("previouslyPaidIndicator");
        sb.append('=');
        sb.append(((this.previouslyPaidIndicator == null)?"<null>":this.previouslyPaidIndicator));
        sb.append(',');
        sb.append("lossReserveInterestIndicator");
        sb.append('=');
        sb.append(((this.lossReserveInterestIndicator == null)?"<null>":this.lossReserveInterestIndicator));
        sb.append(',');
        sb.append("advancePaymentIndicator");
        sb.append('=');
        sb.append(((this.advancePaymentIndicator == null)?"<null>":this.advancePaymentIndicator));
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
        result = ((result* 31)+((this.lossReserveInterestIndicator == null)? 0 :this.lossReserveInterestIndicator.hashCode()));
        result = ((result* 31)+((this.advancePaymentIndicator == null)? 0 :this.advancePaymentIndicator.hashCode()));
        result = ((result* 31)+((this.previouslyPaidIndicator == null)? 0 :this.previouslyPaidIndicator.hashCode()));
        result = ((result* 31)+((this.accountingType == null)? 0 :this.accountingType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group9PIA) == false) {
            return false;
        }
        Group9PIA rhs = ((Group9PIA) other);
        return (((((this.lossReserveInterestIndicator == rhs.lossReserveInterestIndicator)||((this.lossReserveInterestIndicator!= null)&&this.lossReserveInterestIndicator.equals(rhs.lossReserveInterestIndicator)))&&((this.advancePaymentIndicator == rhs.advancePaymentIndicator)||((this.advancePaymentIndicator!= null)&&this.advancePaymentIndicator.equals(rhs.advancePaymentIndicator))))&&((this.previouslyPaidIndicator == rhs.previouslyPaidIndicator)||((this.previouslyPaidIndicator!= null)&&this.previouslyPaidIndicator.equals(rhs.previouslyPaidIndicator))))&&((this.accountingType == rhs.accountingType)||((this.accountingType!= null)&&this.accountingType.equals(rhs.accountingType))));
    }

}
