
package com.lm.data.edi.model.header;

//import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Composite element. Identifies the recipient of the transmission in code (qualified by DN), plus a sub-address code. The sub-address code for onward routing may be used if the functional grouping facility, (which also provides for sub-addressing), is not used.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "recipientIdentification"
})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterchangeHeaderUNBInterchangeReceiver {

    /**
     * Receiver id. Duns number to be sent here as ID
     * (Required)
     * 
     */
    @JsonProperty("recipientIdentification")
    @JsonPropertyDescription("Receiver id. Duns number to be sent here as ID")
    @Size(max = 35)
    @NotNull
    private String recipientIdentification;

    /**
     * Receiver id. Duns number to be sent here as ID
     * (Required)
     * 
     */
    @JsonProperty("recipientIdentification")
    public String getRecipientIdentification() {
        return recipientIdentification;
    }

    /**
     * Receiver id. Duns number to be sent here as ID
     * (Required)
     * 
     */
    @JsonProperty("recipientIdentification")
    public void setRecipientIdentification(String recipientIdentification) {
        this.recipientIdentification = recipientIdentification;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InterchangeHeaderUNBInterchangeReceiver.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recipientIdentification");
        sb.append('=');
        sb.append(((this.recipientIdentification == null)?"<null>":this.recipientIdentification));
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
        result = ((result* 31)+((this.recipientIdentification == null)? 0 :this.recipientIdentification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InterchangeHeaderUNBInterchangeReceiver) == false) {
            return false;
        }
        InterchangeHeaderUNBInterchangeReceiver rhs = ((InterchangeHeaderUNBInterchangeReceiver) other);
        return ((this.recipientIdentification == rhs.recipientIdentification)||((this.recipientIdentification!= null)&&this.recipientIdentification.equals(rhs.recipientIdentification)));
    }

}
