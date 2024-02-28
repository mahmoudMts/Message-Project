
package com.lm.data.edi.model.wsett;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


/**
 * A description of a WSETT notification to be delivered to a party (or group of parties).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "messagePayload"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegenWSETT {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("messagePayload")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<WsettNotificationPayloadMessagePayload> messagePayload = new ArrayList<WsettNotificationPayloadMessagePayload>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("messagePayload")
    public List<WsettNotificationPayloadMessagePayload> getMessagePayload() {
        return messagePayload;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("messagePayload")
    public void setMessagePayload(List<WsettNotificationPayloadMessagePayload> messagePayload) {
        this.messagePayload = messagePayload;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegenWSETT.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("messagePayload");
        sb.append('=');
        sb.append(((this.messagePayload == null)?"<null>":this.messagePayload));
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
        result = ((result* 31)+((this.messagePayload == null)? 0 :this.messagePayload.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegenWSETT) == false) {
            return false;
        }
        RegenWSETT rhs = ((RegenWSETT) other);
        return (((this.messagePayload == rhs.messagePayload)||((this.messagePayload!= null)&&this.messagePayload.equals(rhs.messagePayload))));
    }

}
