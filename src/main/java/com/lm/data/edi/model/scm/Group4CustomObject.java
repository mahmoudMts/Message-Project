
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
 * This object has the reference - Syndicate LSRs. Maximum occurrency of the group relating to one claim entry in 1 processing period -999
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Group4RFFContainer",
    "group4NAD",
    "group4PIN"
})
public class Group4CustomObject {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Group4RFFContainer")
    @Size(min = 1, max = 3)
    @Valid
    @NotNull
    private List<Group4RFF> group4RFFContainer = new ArrayList<Group4RFF>();
    /**
     * A segment group 4 Reference NAD - B. To identify a specific party
     * (Required)
     * 
     */
    @JsonProperty("group4NAD")
    @JsonPropertyDescription("A segment group 4 Reference NAD - B. To identify a specific party")
    @Valid
    @NotNull
    private Group4NAD group4NAD;
    /**
     * A segment group 4 Reference PIN - B. To specify a percentage.
     * (Required)
     * 
     */
    @JsonProperty("group4PIN")
    @JsonPropertyDescription("A segment group 4 Reference PIN - B. To specify a percentage.")
    @Valid
    @NotNull
    private Group4PIN group4PIN;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Group4RFFContainer")
    public List<Group4RFF> getGroup4RFFContainer() {
        return group4RFFContainer;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Group4RFFContainer")
    public void setGroup4RFFContainer(List<Group4RFF> group4RFFContainer) {
        this.group4RFFContainer = group4RFFContainer;
    }

    /**
     * A segment group 4 Reference NAD - B. To identify a specific party
     * (Required)
     * 
     */
    @JsonProperty("group4NAD")
    public Group4NAD getGroup4NAD() {
        return group4NAD;
    }

    /**
     * A segment group 4 Reference NAD - B. To identify a specific party
     * (Required)
     * 
     */
    @JsonProperty("group4NAD")
    public void setGroup4NAD(Group4NAD group4NAD) {
        this.group4NAD = group4NAD;
    }

    /**
     * A segment group 4 Reference PIN - B. To specify a percentage.
     * (Required)
     * 
     */
    @JsonProperty("group4PIN")
    public Group4PIN getGroup4PIN() {
        return group4PIN;
    }

    /**
     * A segment group 4 Reference PIN - B. To specify a percentage.
     * (Required)
     * 
     */
    @JsonProperty("group4PIN")
    public void setGroup4PIN(Group4PIN group4PIN) {
        this.group4PIN = group4PIN;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group4CustomObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("group4RFFContainer");
        sb.append('=');
        sb.append(((this.group4RFFContainer == null)?"<null>":this.group4RFFContainer));
        sb.append(',');
        sb.append("group4NAD");
        sb.append('=');
        sb.append(((this.group4NAD == null)?"<null>":this.group4NAD));
        sb.append(',');
        sb.append("group4PIN");
        sb.append('=');
        sb.append(((this.group4PIN == null)?"<null>":this.group4PIN));
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
        result = ((result* 31)+((this.group4NAD == null)? 0 :this.group4NAD.hashCode()));
        result = ((result* 31)+((this.group4PIN == null)? 0 :this.group4PIN.hashCode()));
        result = ((result* 31)+((this.group4RFFContainer == null)? 0 :this.group4RFFContainer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group4CustomObject) == false) {
            return false;
        }
        Group4CustomObject rhs = ((Group4CustomObject) other);
        return ((((this.group4NAD == rhs.group4NAD)||((this.group4NAD!= null)&&this.group4NAD.equals(rhs.group4NAD)))&&((this.group4PIN == rhs.group4PIN)||((this.group4PIN!= null)&&this.group4PIN.equals(rhs.group4PIN))))&&((this.group4RFFContainer == rhs.group4RFFContainer)||((this.group4RFFContainer!= null)&&this.group4RFFContainer.equals(rhs.group4RFFContainer))));
    }

}
