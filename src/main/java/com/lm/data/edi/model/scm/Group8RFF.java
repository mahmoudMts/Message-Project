
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * A segment group 8 Reference RFF - C. To specify an identifying reference associated with a named party claim entry or transaction
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currencyKey",
    "movementReference"
})
public class Group8RFF {

    /**
     * Mandatory. The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expressed.
     * (Required)
     * 
     */
    @JsonProperty("currencyKey")
    @JsonPropertyDescription("Mandatory. The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expressed.")
    @Size(max = 3)
    @NotNull
    private String currencyKey;
    /**
     * Mandatory. Sequential reference allocated to a change to claim details. Format XXMMYY
     * (Required)
     * 
     */
    @JsonProperty("movementReference")
    @JsonPropertyDescription("Mandatory. Sequential reference allocated to a change to claim details. Format XXMMYY")
    @Size(max = 6)
    @NotNull
    private String movementReference;

    /**
     * Mandatory. The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expressed.
     * (Required)
     * 
     */
    @JsonProperty("currencyKey")
    public String getCurrencyKey() {
        return currencyKey;
    }

    /**
     * Mandatory. The alpha ISO Code used to identify the original currency in which the estimates paid-to-date and amounts settled-this-time are expressed.
     * (Required)
     * 
     */
    @JsonProperty("currencyKey")
    public void setCurrencyKey(String currencyKey) {
        this.currencyKey = currencyKey;
    }

    /**
     * Mandatory. Sequential reference allocated to a change to claim details. Format XXMMYY
     * (Required)
     * 
     */
    @JsonProperty("movementReference")
    public String getMovementReference() {
        return movementReference;
    }

    /**
     * Mandatory. Sequential reference allocated to a change to claim details. Format XXMMYY
     * (Required)
     * 
     */
    @JsonProperty("movementReference")
    public void setMovementReference(String movementReference) {
        this.movementReference = movementReference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group8RFF.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currencyKey");
        sb.append('=');
        sb.append(((this.currencyKey == null)?"<null>":this.currencyKey));
        sb.append(',');
        sb.append("movementReference");
        sb.append('=');
        sb.append(((this.movementReference == null)?"<null>":this.movementReference));
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
        result = ((result* 31)+((this.currencyKey == null)? 0 :this.currencyKey.hashCode()));
        result = ((result* 31)+((this.movementReference == null)? 0 :this.movementReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group8RFF) == false) {
            return false;
        }
        Group8RFF rhs = ((Group8RFF) other);
        return (((this.currencyKey == rhs.currencyKey)||((this.currencyKey!= null)&&this.currencyKey.equals(rhs.currencyKey)))&&((this.movementReference == rhs.movementReference)||((this.movementReference!= null)&&this.movementReference.equals(rhs.movementReference))));
    }

}
