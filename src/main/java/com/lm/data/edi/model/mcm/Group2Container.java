
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
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dateTimeDetail",
    "Group3Container",
    "moaDetails",
    "cntDetails"
})
@AllArgsConstructor
@NoArgsConstructor
public class Group2Container {

    /**
     * DTM - DateTimeDetails, Mandatory. DATE / TIME REFERENCE Refer EDI Message MCM Analysis Document TAB  DTM LD0 (DateTimeRef)
     * (Required)
     * 
     */
    @JsonProperty("dateTimeDetail")
    @JsonPropertyDescription("DTM - DateTimeDetails, Mandatory. DATE / TIME REFERENCE Refer EDI Message MCM Analysis Document TAB  DTM LD0 (DateTimeRef)")
    @Valid
    @NotNull
    private DateTimeDetails dateTimeDetail;
    /**
     * Group3 Containers
     * 
     */
    @JsonProperty("Group3Container")
    @JsonPropertyDescription("Group3 Containers")
    @Size(max = 999)
    @Valid
    private List<Group3Container> group3Container = new ArrayList<Group3Container>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("moaDetails")
    @Size(min = 1, max = 999)
    @Valid
    @NotNull
    private List<MoaDetails> moaDetails = new ArrayList<MoaDetails>();
    /**
     * CONTROL TOTALS. Refer EDI Message MCM Analysis Document TAB  Detail Record.
     * (Required)
     * 
     */
    @JsonProperty("cntDetails")
    @JsonPropertyDescription("CONTROL TOTALS. Refer EDI Message MCM Analysis Document TAB  Detail Record.")
    @Valid
    @NotNull
    private CntDetails cntDetails;

    /**
     * DTM - DateTimeDetails, Mandatory. DATE / TIME REFERENCE Refer EDI Message MCM Analysis Document TAB  DTM LD0 (DateTimeRef)
     * (Required)
     * 
     */
    @JsonProperty("dateTimeDetail")
    public DateTimeDetails getDateTimeDetail() {
        return dateTimeDetail;
    }

    /**
     * DTM - DateTimeDetails, Mandatory. DATE / TIME REFERENCE Refer EDI Message MCM Analysis Document TAB  DTM LD0 (DateTimeRef)
     * (Required)
     * 
     */
    @JsonProperty("dateTimeDetail")
    public void setDateTimeDetail(DateTimeDetails dateTimeDetail) {
        this.dateTimeDetail = dateTimeDetail;
    }

    /**
     * Group3 Containers
     * 
     */
    @JsonProperty("Group3Container")
    public List<Group3Container> getGroup3Container() {
        return group3Container;
    }

    /**
     * Group3 Containers
     * 
     */
    @JsonProperty("Group3Container")
    public void setGroup3Container(List<Group3Container> group3Container) {
        this.group3Container = group3Container;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("moaDetails")
    public List<MoaDetails> getMoaDetails() {
        return moaDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("moaDetails")
    public void setMoaDetails(List<MoaDetails> moaDetails) {
        this.moaDetails = moaDetails;
    }

    /**
     * CONTROL TOTALS. Refer EDI Message MCM Analysis Document TAB  Detail Record.
     * (Required)
     * 
     */
    @JsonProperty("cntDetails")
    public CntDetails getCntDetails() {
        return cntDetails;
    }

    /**
     * CONTROL TOTALS. Refer EDI Message MCM Analysis Document TAB  Detail Record.
     * (Required)
     * 
     */
    @JsonProperty("cntDetails")
    public void setCntDetails(CntDetails cntDetails) {
        this.cntDetails = cntDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group2Container.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dateTimeDetail");
        sb.append('=');
        sb.append(((this.dateTimeDetail == null)?"<null>":this.dateTimeDetail));
        sb.append(',');
        sb.append("group3Container");
        sb.append('=');
        sb.append(((this.group3Container == null)?"<null>":this.group3Container));
        sb.append(',');
        sb.append("moaDetails");
        sb.append('=');
        sb.append(((this.moaDetails == null)?"<null>":this.moaDetails));
        sb.append(',');
        sb.append("cntDetails");
        sb.append('=');
        sb.append(((this.cntDetails == null)?"<null>":this.cntDetails));
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
        result = ((result* 31)+((this.cntDetails == null)? 0 :this.cntDetails.hashCode()));
        result = ((result* 31)+((this.group3Container == null)? 0 :this.group3Container.hashCode()));
        result = ((result* 31)+((this.dateTimeDetail == null)? 0 :this.dateTimeDetail.hashCode()));
        result = ((result* 31)+((this.moaDetails == null)? 0 :this.moaDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group2Container) == false) {
            return false;
        }
        Group2Container rhs = ((Group2Container) other);
        return (((((this.cntDetails == rhs.cntDetails)||((this.cntDetails!= null)&&this.cntDetails.equals(rhs.cntDetails)))&&((this.group3Container == rhs.group3Container)||((this.group3Container!= null)&&this.group3Container.equals(rhs.group3Container))))&&((this.dateTimeDetail == rhs.dateTimeDetail)||((this.dateTimeDetail!= null)&&this.dateTimeDetail.equals(rhs.dateTimeDetail))))&&((this.moaDetails == rhs.moaDetails)||((this.moaDetails!= null)&&this.moaDetails.equals(rhs.moaDetails))));
    }

}
