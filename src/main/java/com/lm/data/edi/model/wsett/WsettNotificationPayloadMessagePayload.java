
package com.lm.data.edi.model.wsett;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wholeMessageHeader",
    "settlementDataDetails",
    "audit"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WsettNotificationPayloadMessagePayload {

    /**
     * Start of a communication interchange between members, containing interchange control details
     * (Required)
     * 
     */
    @JsonProperty("wholeMessageHeader")
    @JsonPropertyDescription("Start of a communication interchange between members, containing interchange control details")
    @Valid
    @NotNull
    private WholeMessageHeader wholeMessageHeader;
    /**
     * The actual settlement detail information and the information in the separate segments (M01-M09) will repeat as many times as needed for each Carrier group. M09 segment will be produced by ASG
     * (Required)
     * 
     */
    @JsonProperty("settlementDataDetails")
    @JsonPropertyDescription("The actual settlement detail information and the information in the separate segments (M01-M09) will repeat as many times as needed for each Carrier group. M09 segment will be produced by ASG")
    @Valid
    @NotNull
    private SettlementDataDetails settlementDataDetails;
    /**
     * The data in the audit block is populated directly by the API from the security context when the record is modified
     * 
     */
    @JsonProperty("audit")
    @JsonPropertyDescription("The data in the audit block is populated directly by the API from the security context when the record is modified")
    @Valid
    private AuditBlock audit;

    /**
     * Start of a communication interchange between members, containing interchange control details
     * (Required)
     * 
     */
    @JsonProperty("wholeMessageHeader")
    public WholeMessageHeader getWholeMessageHeader() {
        return wholeMessageHeader;
    }

    /**
     * Start of a communication interchange between members, containing interchange control details
     * (Required)
     * 
     */
    @JsonProperty("wholeMessageHeader")
    public void setWholeMessageHeader(WholeMessageHeader wholeMessageHeader) {
        this.wholeMessageHeader = wholeMessageHeader;
    }

    /**
     * The actual settlement detail information and the information in the separate segments (M01-M09) will repeat as many times as needed for each Carrier group. M09 segment will be produced by ASG
     * (Required)
     * 
     */
    @JsonProperty("settlementDataDetails")
    public SettlementDataDetails getSettlementDataDetails() {
        return settlementDataDetails;
    }

    /**
     * The actual settlement detail information and the information in the separate segments (M01-M09) will repeat as many times as needed for each Carrier group. M09 segment will be produced by ASG
     * (Required)
     * 
     */
    @JsonProperty("settlementDataDetails")
    public void setSettlementDataDetails(SettlementDataDetails settlementDataDetails) {
        this.settlementDataDetails = settlementDataDetails;
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
        sb.append(WsettNotificationPayloadMessagePayload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wholeMessageHeader");
        sb.append('=');
        sb.append(((this.wholeMessageHeader == null)?"<null>":this.wholeMessageHeader));
        sb.append(',');
        sb.append("settlementDataDetails");
        sb.append('=');
        sb.append(((this.settlementDataDetails == null)?"<null>":this.settlementDataDetails));
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
        result = ((result* 31)+((this.settlementDataDetails == null)? 0 :this.settlementDataDetails.hashCode()));
        result = ((result* 31)+((this.audit == null)? 0 :this.audit.hashCode()));
        result = ((result* 31)+((this.wholeMessageHeader == null)? 0 :this.wholeMessageHeader.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WsettNotificationPayloadMessagePayload) == false) {
            return false;
        }
        WsettNotificationPayloadMessagePayload rhs = ((WsettNotificationPayloadMessagePayload) other);
        return ((((this.settlementDataDetails == rhs.settlementDataDetails)||((this.settlementDataDetails!= null)&&this.settlementDataDetails.equals(rhs.settlementDataDetails)))&&((this.audit == rhs.audit)||((this.audit!= null)&&this.audit.equals(rhs.audit))))&&((this.wholeMessageHeader == rhs.wholeMessageHeader)||((this.wholeMessageHeader!= null)&&this.wholeMessageHeader.equals(rhs.wholeMessageHeader))));
    }

}
