
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
 * Composite element. Identifies the sender of the transmission in code with a qualifier of AB to identify the code set being used, followed by a code representing a reverse routing address to which the recipient should address any reply.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "senderIdentification",
    "reverseRoutingAddress"
})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterchangeHeaderUNBInterchangeSender {

    /**
     * Sender id. Duns number to be sent here as ID
     * (Required)
     * 
     */
    @JsonProperty("senderIdentification")
    @JsonPropertyDescription("Sender id. Duns number to be sent here as ID")
    @Size(max = 35)
    @NotNull
    private String senderIdentification;
    /**
     * A code representing a reverse routing address to which the recipient should address any reply.
     * 
     */
    @JsonProperty("reverseRoutingAddress")
    @JsonPropertyDescription("A code representing a reverse routing address to which the recipient should address any reply.")
    @Size(max = 14)
    private String reverseRoutingAddress;

    /**
     * Sender id. Duns number to be sent here as ID
     * (Required)
     * 
     */
    @JsonProperty("senderIdentification")
    public String getSenderIdentification() {
        return senderIdentification;
    }

    /**
     * Sender id. Duns number to be sent here as ID
     * (Required)
     * 
     */
    @JsonProperty("senderIdentification")
    public void setSenderIdentification(String senderIdentification) {
        this.senderIdentification = senderIdentification;
    }

    /**
     * A code representing a reverse routing address to which the recipient should address any reply.
     * 
     */
    @JsonProperty("reverseRoutingAddress")
    public String getReverseRoutingAddress() {
        return reverseRoutingAddress;
    }

    /**
     * A code representing a reverse routing address to which the recipient should address any reply.
     * 
     */
    @JsonProperty("reverseRoutingAddress")
    public void setReverseRoutingAddress(String reverseRoutingAddress) {
        this.reverseRoutingAddress = reverseRoutingAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InterchangeHeaderUNBInterchangeSender.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("senderIdentification");
        sb.append('=');
        sb.append(((this.senderIdentification == null)?"<null>":this.senderIdentification));
        sb.append(',');
        sb.append("reverseRoutingAddress");
        sb.append('=');
        sb.append(((this.reverseRoutingAddress == null)?"<null>":this.reverseRoutingAddress));
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
        result = ((result* 31)+((this.senderIdentification == null)? 0 :this.senderIdentification.hashCode()));
        result = ((result* 31)+((this.reverseRoutingAddress == null)? 0 :this.reverseRoutingAddress.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InterchangeHeaderUNBInterchangeSender) == false) {
            return false;
        }
        InterchangeHeaderUNBInterchangeSender rhs = ((InterchangeHeaderUNBInterchangeSender) other);
        return (((this.senderIdentification == rhs.senderIdentification)||((this.senderIdentification!= null)&&this.senderIdentification.equals(rhs.senderIdentification)))&&((this.reverseRoutingAddress == rhs.reverseRoutingAddress)||((this.reverseRoutingAddress!= null)&&this.reverseRoutingAddress.equals(rhs.reverseRoutingAddress))));
    }

}
