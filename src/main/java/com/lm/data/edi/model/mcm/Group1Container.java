
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
    "nameandAddressDetails",
    "Group2Container",
    "moaDetails",
    "cntDetails"
})
@AllArgsConstructor
@NoArgsConstructor
public class Group1Container {

    /**
     * Name and Address . NAD
     * (Required)
     * 
     */
    @JsonProperty("nameandAddressDetails")
    @JsonPropertyDescription("Name and Address . NAD")
    @Valid
    @NotNull
    private NameandAddressDetails nameandAddressDetails;
    /**
     * Group2 Containers
     * 
     */
    @JsonProperty("Group2Container")
    @JsonPropertyDescription("Group2 Containers")
    @Size(max = 99)
    @Valid
    private List<Group2Container> group2Container = new ArrayList<Group2Container>();
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
     * Name and Address . NAD
     * (Required)
     * 
     */
    @JsonProperty("nameandAddressDetails")
    public NameandAddressDetails getNameandAddressDetails() {
        return nameandAddressDetails;
    }

    /**
     * Name and Address . NAD
     * (Required)
     * 
     */
    @JsonProperty("nameandAddressDetails")
    public void setNameandAddressDetails(NameandAddressDetails nameandAddressDetails) {
        this.nameandAddressDetails = nameandAddressDetails;
    }

    /**
     * Group2 Containers
     * 
     */
    @JsonProperty("Group2Container")
    public List<Group2Container> getGroup2Container() {
        return group2Container;
    }

    /**
     * Group2 Containers
     * 
     */
    @JsonProperty("Group2Container")
    public void setGroup2Container(List<Group2Container> group2Container) {
        this.group2Container = group2Container;
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
        sb.append(Group1Container.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nameandAddressDetails");
        sb.append('=');
        sb.append(((this.nameandAddressDetails == null)?"<null>":this.nameandAddressDetails));
        sb.append(',');
        sb.append("group2Container");
        sb.append('=');
        sb.append(((this.group2Container == null)?"<null>":this.group2Container));
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
        result = ((result* 31)+((this.nameandAddressDetails == null)? 0 :this.nameandAddressDetails.hashCode()));
        result = ((result* 31)+((this.group2Container == null)? 0 :this.group2Container.hashCode()));
        result = ((result* 31)+((this.moaDetails == null)? 0 :this.moaDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group1Container) == false) {
            return false;
        }
        Group1Container rhs = ((Group1Container) other);
        return (((((this.cntDetails == rhs.cntDetails)||((this.cntDetails!= null)&&this.cntDetails.equals(rhs.cntDetails)))&&((this.nameandAddressDetails == rhs.nameandAddressDetails)||((this.nameandAddressDetails!= null)&&this.nameandAddressDetails.equals(rhs.nameandAddressDetails))))&&((this.group2Container == rhs.group2Container)||((this.group2Container!= null)&&this.group2Container.equals(rhs.group2Container))))&&((this.moaDetails == rhs.moaDetails)||((this.moaDetails!= null)&&this.moaDetails.equals(rhs.moaDetails))));
    }

}
