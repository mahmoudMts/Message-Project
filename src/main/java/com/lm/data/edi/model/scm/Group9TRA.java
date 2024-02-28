
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Pattern;


/**
 * A segment group 9 Reference TRA - D . Transaction Amounts
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "settledThisTimeSTI",
    "settledThisTimeSTF",
    "exchangeRate"
})
public class Group9TRA {

    /**
     * Conditional. 100% settlement amount paid or refunded this time against a claim for indemnity, quoted in original currency. Amount may include expenses. STI
     * 
     */
    @JsonProperty("settledThisTimeSTI")
    @JsonPropertyDescription("Conditional. 100% settlement amount paid or refunded this time against a claim for indemnity, quoted in original currency. Amount may include expenses. STI")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String settledThisTimeSTI;
    /**
     * Conditional. 100% settlement amount paid or refunded this time against a claim for indemnity, quoted in original currency. Amount may Include VAT. STF
     * 
     */
    @JsonProperty("settledThisTimeSTF")
    @JsonPropertyDescription("Conditional. 100% settlement amount paid or refunded this time against a claim for indemnity, quoted in original currency. Amount may Include VAT. STF")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String settledThisTimeSTF;
    /**
     * Conditional. The rate of exchange that is advised for each particular settlement advised by the Claims System. The rate is used to convert the settlement transaction amount between the original currencyand the settlement currency. RXS
     * 
     */
    @JsonProperty("exchangeRate")
    @JsonPropertyDescription("Conditional. The rate of exchange that is advised for each particular settlement advised by the Claims System. The rate is used to convert the settlement transaction amount between the original currencyand the settlement currency. RXS")
    private Double exchangeRate;

    /**
     * Conditional. 100% settlement amount paid or refunded this time against a claim for indemnity, quoted in original currency. Amount may include expenses. STI
     * 
     */
    @JsonProperty("settledThisTimeSTI")
    public String getSettledThisTimeSTI() {
        return settledThisTimeSTI;
    }

    /**
     * Conditional. 100% settlement amount paid or refunded this time against a claim for indemnity, quoted in original currency. Amount may include expenses. STI
     * 
     */
    @JsonProperty("settledThisTimeSTI")
    public void setSettledThisTimeSTI(String settledThisTimeSTI) {
        this.settledThisTimeSTI = settledThisTimeSTI;
    }

    /**
     * Conditional. 100% settlement amount paid or refunded this time against a claim for indemnity, quoted in original currency. Amount may Include VAT. STF
     * 
     */
    @JsonProperty("settledThisTimeSTF")
    public String getSettledThisTimeSTF() {
        return settledThisTimeSTF;
    }

    /**
     * Conditional. 100% settlement amount paid or refunded this time against a claim for indemnity, quoted in original currency. Amount may Include VAT. STF
     * 
     */
    @JsonProperty("settledThisTimeSTF")
    public void setSettledThisTimeSTF(String settledThisTimeSTF) {
        this.settledThisTimeSTF = settledThisTimeSTF;
    }

    /**
     * Conditional. The rate of exchange that is advised for each particular settlement advised by the Claims System. The rate is used to convert the settlement transaction amount between the original currencyand the settlement currency. RXS
     * 
     */
    @JsonProperty("exchangeRate")
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Conditional. The rate of exchange that is advised for each particular settlement advised by the Claims System. The rate is used to convert the settlement transaction amount between the original currencyand the settlement currency. RXS
     * 
     */
    @JsonProperty("exchangeRate")
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group9TRA.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("settledThisTimeSTI");
        sb.append('=');
        sb.append(((this.settledThisTimeSTI == null)?"<null>":this.settledThisTimeSTI));
        sb.append(',');
        sb.append("settledThisTimeSTF");
        sb.append('=');
        sb.append(((this.settledThisTimeSTF == null)?"<null>":this.settledThisTimeSTF));
        sb.append(',');
        sb.append("exchangeRate");
        sb.append('=');
        sb.append(((this.exchangeRate == null)?"<null>":this.exchangeRate));
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
        result = ((result* 31)+((this.settledThisTimeSTF == null)? 0 :this.settledThisTimeSTF.hashCode()));
        result = ((result* 31)+((this.settledThisTimeSTI == null)? 0 :this.settledThisTimeSTI.hashCode()));
        result = ((result* 31)+((this.exchangeRate == null)? 0 :this.exchangeRate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group9TRA) == false) {
            return false;
        }
        Group9TRA rhs = ((Group9TRA) other);
        return ((((this.settledThisTimeSTF == rhs.settledThisTimeSTF)||((this.settledThisTimeSTF!= null)&&this.settledThisTimeSTF.equals(rhs.settledThisTimeSTF)))&&((this.settledThisTimeSTI == rhs.settledThisTimeSTI)||((this.settledThisTimeSTI!= null)&&this.settledThisTimeSTI.equals(rhs.settledThisTimeSTI))))&&((this.exchangeRate == rhs.exchangeRate)||((this.exchangeRate!= null)&&this.exchangeRate.equals(rhs.exchangeRate))));
    }

}
