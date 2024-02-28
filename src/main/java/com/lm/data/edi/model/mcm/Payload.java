
package com.lm.data.edi.model.mcm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "bgmDetails",
    "dateTimeDetails",
    "Group1Containers",
    "audit"
})
@AllArgsConstructor
@NoArgsConstructor
public class Payload {

    /**
     * record unique identifier
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("record unique identifier")
    private UUID id;
    /**
     * BGM SEGMENT .Refer EDI Message MCM Analysis Document TAB  BGM LC0(Beginning of msg seg)
     * (Required)
     * 
     */
    @JsonProperty("bgmDetails")
    @JsonPropertyDescription("BGM SEGMENT .Refer EDI Message MCM Analysis Document TAB  BGM LC0(Beginning of msg seg)")
    @Valid
    @NotNull
    private BgmDetails bgmDetails;
    /**
     * DTM - DateTimeDetails, Mandatory. DATE / TIME REFERENCE Refer EDI Message MCM Analysis Document TAB  DTM LD0 (DateTimeRef)
     * (Required)
     * 
     */
    @JsonProperty("dateTimeDetails")
    @JsonPropertyDescription("DTM - DateTimeDetails, Mandatory. DATE / TIME REFERENCE Refer EDI Message MCM Analysis Document TAB  DTM LD0 (DateTimeRef)")
    @Valid
    @NotNull
    private DateTimeDetails dateTimeDetails;
    /**
     * Conditional, This array This Group1 Containers has NAD-NameandAddressDetails with MOA and CNT & Group2 Container Array
     * (Required)
     * 
     */
    @JsonProperty("Group1Containers")
    @JsonPropertyDescription("Conditional, This array This Group1 Containers has NAD-NameandAddressDetails with MOA and CNT & Group2 Container Array")
    @Size(max = 999)
    @Valid
    @NotNull
    private List<Group1Container> group1Containers = new ArrayList<Group1Container>();
    /**
     * The data in the audit block is populated directly by the API from the security context when the record is modified
     * 
     */
    @JsonProperty("audit")
    @JsonPropertyDescription("The data in the audit block is populated directly by the API from the security context when the record is modified")
    @Valid
    private AuditBlock audit;

    /**
     * record unique identifier
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * record unique identifier
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * BGM SEGMENT .Refer EDI Message MCM Analysis Document TAB  BGM LC0(Beginning of msg seg)
     * (Required)
     * 
     */
    @JsonProperty("bgmDetails")
    public BgmDetails getBgmDetails() {
        return bgmDetails;
    }

    /**
     * BGM SEGMENT .Refer EDI Message MCM Analysis Document TAB  BGM LC0(Beginning of msg seg)
     * (Required)
     * 
     */
    @JsonProperty("bgmDetails")
    public void setBgmDetails(BgmDetails bgmDetails) {
        this.bgmDetails = bgmDetails;
    }

    /**
     * DTM - DateTimeDetails, Mandatory. DATE / TIME REFERENCE Refer EDI Message MCM Analysis Document TAB  DTM LD0 (DateTimeRef)
     * (Required)
     * 
     */
    @JsonProperty("dateTimeDetails")
    public DateTimeDetails getDateTimeDetails() {
        return dateTimeDetails;
    }

    /**
     * DTM - DateTimeDetails, Mandatory. DATE / TIME REFERENCE Refer EDI Message MCM Analysis Document TAB  DTM LD0 (DateTimeRef)
     * (Required)
     * 
     */
    @JsonProperty("dateTimeDetails")
    public void setDateTimeDetails(DateTimeDetails dateTimeDetails) {
        this.dateTimeDetails = dateTimeDetails;
    }

    /**
     * Conditional, This array This Group1 Containers has NAD-NameandAddressDetails with MOA and CNT & Group2 Container Array
     * (Required)
     * 
     */
    @JsonProperty("Group1Containers")
    public List<Group1Container> getGroup1Containers() {
        return group1Containers;
    }

    /**
     * Conditional, This array This Group1 Containers has NAD-NameandAddressDetails with MOA and CNT & Group2 Container Array
     * (Required)
     * 
     */
    @JsonProperty("Group1Containers")
    public void setGroup1Containers(List<Group1Container> group1Containers) {
        this.group1Containers = group1Containers;
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
        sb.append(Payload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("bgmDetails");
        sb.append('=');
        sb.append(((this.bgmDetails == null)?"<null>":this.bgmDetails));
        sb.append(',');
        sb.append("dateTimeDetails");
        sb.append('=');
        sb.append(((this.dateTimeDetails == null)?"<null>":this.dateTimeDetails));
        sb.append(',');
        sb.append("group1Containers");
        sb.append('=');
        sb.append(((this.group1Containers == null)?"<null>":this.group1Containers));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.bgmDetails == null)? 0 :this.bgmDetails.hashCode()));
        result = ((result* 31)+((this.dateTimeDetails == null)? 0 :this.dateTimeDetails.hashCode()));
        result = ((result* 31)+((this.group1Containers == null)? 0 :this.group1Containers.hashCode()));
        result = ((result* 31)+((this.audit == null)? 0 :this.audit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payload) == false) {
            return false;
        }
        Payload rhs = ((Payload) other);
        return ((((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.bgmDetails == rhs.bgmDetails)||((this.bgmDetails!= null)&&this.bgmDetails.equals(rhs.bgmDetails))))&&((this.dateTimeDetails == rhs.dateTimeDetails)||((this.dateTimeDetails!= null)&&this.dateTimeDetails.equals(rhs.dateTimeDetails))))&&((this.group1Containers == rhs.group1Containers)||((this.group1Containers!= null)&&this.group1Containers.equals(rhs.group1Containers))))&&((this.audit == rhs.audit)||((this.audit!= null)&&this.audit.equals(rhs.audit))));
    }

}
