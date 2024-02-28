
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * A segment group 7 Reference CUX - D. To specify the currencies applicable to a transaction in Settlement ccy
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "settlementCurrencyCode"
})
public class Group7CUX {

    /**
     * The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expresse.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyCode")
    @JsonPropertyDescription("The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expresse.")
    @Size(max = 3)
    @NotNull
    private String settlementCurrencyCode;

    /**
     * The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expresse.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyCode")
    public String getSettlementCurrencyCode() {
        return settlementCurrencyCode;
    }

    /**
     * The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expresse.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyCode")
    public void setSettlementCurrencyCode(String settlementCurrencyCode) {
        this.settlementCurrencyCode = settlementCurrencyCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group7CUX.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("settlementCurrencyCode");
        sb.append('=');
        sb.append(((this.settlementCurrencyCode == null)?"<null>":this.settlementCurrencyCode));
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
        result = ((result* 31)+((this.settlementCurrencyCode == null)? 0 :this.settlementCurrencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group7CUX) == false) {
            return false;
        }
        Group7CUX rhs = ((Group7CUX) other);
        return ((this.settlementCurrencyCode == rhs.settlementCurrencyCode)||((this.settlementCurrencyCode!= null)&&this.settlementCurrencyCode.equals(rhs.settlementCurrencyCode)));
    }

}
