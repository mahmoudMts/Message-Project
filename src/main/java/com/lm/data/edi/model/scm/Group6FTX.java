
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;


/**
 * A segment group 4 Reference FTX - C. To provide free-form textual information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionalDetails"
})
public class Group6FTX {

    /**
     * Conditional. Loss details. a two line descriptive narrative of the loss.
     * 
     */
    @JsonProperty("transactionalDetails")
    @JsonPropertyDescription("Conditional. Loss details. a two line descriptive narrative of the loss.")
    @Valid
    private TransactionalDetailsObject transactionalDetails;

    /**
     * Conditional. Loss details. a two line descriptive narrative of the loss.
     * 
     */
    @JsonProperty("transactionalDetails")
    public TransactionalDetailsObject getTransactionalDetails() {
        return transactionalDetails;
    }

    /**
     * Conditional. Loss details. a two line descriptive narrative of the loss.
     * 
     */
    @JsonProperty("transactionalDetails")
    public void setTransactionalDetails(TransactionalDetailsObject transactionalDetails) {
        this.transactionalDetails = transactionalDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group6FTX.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transactionalDetails");
        sb.append('=');
        sb.append(((this.transactionalDetails == null)?"<null>":this.transactionalDetails));
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
        result = ((result* 31)+((this.transactionalDetails == null)? 0 :this.transactionalDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group6FTX) == false) {
            return false;
        }
        Group6FTX rhs = ((Group6FTX) other);
        return ((this.transactionalDetails == rhs.transactionalDetails)||((this.transactionalDetails!= null)&&this.transactionalDetails.equals(rhs.transactionalDetails)));
    }

}
