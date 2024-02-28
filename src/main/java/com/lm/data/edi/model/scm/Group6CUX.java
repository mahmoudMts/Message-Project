
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * A segment group 6 Reference CUX - C. To specify the currencies applicable to a transaction in Reference or original ccy
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "originalCurrencyCode"
})
public class Group6CUX {

    /**
     * Mandatory. The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expresse.
     * (Required)
     * 
     */
    @JsonProperty("originalCurrencyCode")
    @JsonPropertyDescription("Mandatory. The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expresse.")
    @Size(max = 3)
    @NotNull
    private String originalCurrencyCode;

    /**
     * Mandatory. The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expresse.
     * (Required)
     * 
     */
    @JsonProperty("originalCurrencyCode")
    public String getOriginalCurrencyCode() {
        return originalCurrencyCode;
    }

    /**
     * Mandatory. The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expresse.
     * (Required)
     * 
     */
    @JsonProperty("originalCurrencyCode")
    public void setOriginalCurrencyCode(String originalCurrencyCode) {
        this.originalCurrencyCode = originalCurrencyCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group6CUX.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("originalCurrencyCode");
        sb.append('=');
        sb.append(((this.originalCurrencyCode == null)?"<null>":this.originalCurrencyCode));
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
        result = ((result* 31)+((this.originalCurrencyCode == null)? 0 :this.originalCurrencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group6CUX) == false) {
            return false;
        }
        Group6CUX rhs = ((Group6CUX) other);
        return ((this.originalCurrencyCode == rhs.originalCurrencyCode)||((this.originalCurrencyCode!= null)&&this.originalCurrencyCode.equals(rhs.originalCurrencyCode)));
    }

}
