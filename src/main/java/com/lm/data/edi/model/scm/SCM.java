
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


/**
 * Syndicate claim message
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "interchangeHeaderUNB",
    "messagePayload",
    "audit"
})
public class SCM {

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
    @JsonProperty("messagePayload")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<MessagePayloadInner> messagePayload = new ArrayList<MessagePayloadInner>();
    /**
     * The data in the audit block is populated directly by the API from the security context when the record is modified
     * 
     */
    @JsonProperty("audit")
    @JsonPropertyDescription("The data in the audit block is populated directly by the API from the security context when the record is modified")
    @Valid
    private AuditBlock audit;

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
    @JsonProperty("messagePayload")
    public List<MessagePayloadInner> getMessagePayload() {
        return messagePayload;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("messagePayload")
    public void setMessagePayload(List<MessagePayloadInner> messagePayload) {
        this.messagePayload = messagePayload;
    }

    /**
     * The data in the audit block is populated directly by the API from the security context when the record is modified
     * 
     */
    @JsonProperty("audit")
    public AuditBlock getAudit() {
        return audit;
    }

    /**
     * The data in the audit block is populated directly by the API from the security context when the record is modified
     * 
     */
    @JsonProperty("audit")
    public void setAudit(AuditBlock audit) {
        this.audit = audit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SCM.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("interchangeHeaderUNB");
        sb.append('=');
        sb.append(((this.interchangeHeaderUNB == null)?"<null>":this.interchangeHeaderUNB));
        sb.append(',');
        sb.append("messagePayload");
        sb.append('=');
        sb.append(((this.messagePayload == null)?"<null>":this.messagePayload));
        sb.append(',');
        sb.append("audit");
        sb.append('=');
        sb.append(((this.audit == null)?"<null>":this.audit));
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
        result = ((result* 31)+((this.interchangeHeaderUNB == null)? 0 :this.interchangeHeaderUNB.hashCode()));
        result = ((result* 31)+((this.messagePayload == null)? 0 :this.messagePayload.hashCode()));
        result = ((result* 31)+((this.audit == null)? 0 :this.audit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SCM) == false) {
            return false;
        }
        SCM rhs = ((SCM) other);
        return ((((this.interchangeHeaderUNB == rhs.interchangeHeaderUNB)||((this.interchangeHeaderUNB!= null)&&this.interchangeHeaderUNB.equals(rhs.interchangeHeaderUNB)))&&((this.messagePayload == rhs.messagePayload)||((this.messagePayload!= null)&&this.messagePayload.equals(rhs.messagePayload))))&&((this.audit == rhs.audit)||((this.audit!= null)&&this.audit.equals(rhs.audit))));
    }

}
