
package com.lm.data.edi.model.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.lm.data.edi.model.header.InterchangeHeaderUNB;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


/**
 * A description of MCM notification
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "interchangeHeaderUNB",
    "payload"
})
@AllArgsConstructor
@NoArgsConstructor
public class MCMNotificationsMessage {

    /**
     * A mandatory segment which starts a communication interchange. It contains sender and recipient addresses and provides a sender’s reference to identify the interchange.
     * (Required)
     * 
     */
    @JsonProperty("interchangeHeaderUNB")
    @JsonPropertyDescription("A mandatory segment which starts a communication interchange. It contains sender and recipient addresses and provides a sender\u2019s reference to identify the interchange.")
    @Valid
    @NotNull
    private InterchangeHeaderUNB interchangeHeaderUNB;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payload")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<Payload> payload = new ArrayList<Payload>();

    /**
     * A mandatory segment which starts a communication interchange. It contains sender and recipient addresses and provides a sender’s reference to identify the interchange.
     * (Required)
     * 
     */
    @JsonProperty("interchangeHeaderUNB")
    public InterchangeHeaderUNB getInterchangeHeaderUNB() {
        return interchangeHeaderUNB;
    }

    /**
     * A mandatory segment which starts a communication interchange. It contains sender and recipient addresses and provides a sender’s reference to identify the interchange.
     * (Required)
     * 
     */
    @JsonProperty("interchangeHeaderUNB")
    public void setInterchangeHeaderUNB(InterchangeHeaderUNB interchangeHeaderUNB) {
        this.interchangeHeaderUNB = interchangeHeaderUNB;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payload")
    public List<Payload> getPayload() {
        return payload;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payload")
    public void setPayload(List<Payload> payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MCMNotificationsMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("interchangeHeaderUNB");
        sb.append('=');
        sb.append(((this.interchangeHeaderUNB == null)?"<null>":this.interchangeHeaderUNB));
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
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
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+((this.interchangeHeaderUNB == null)? 0 :this.interchangeHeaderUNB.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MCMNotificationsMessage) == false) {
            return false;
        }
        MCMNotificationsMessage rhs = ((MCMNotificationsMessage) other);
        return (((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload)))&&((this.interchangeHeaderUNB == rhs.interchangeHeaderUNB)||((this.interchangeHeaderUNB!= null)&&this.interchangeHeaderUNB.equals(rhs.interchangeHeaderUNB))));
    }

}
