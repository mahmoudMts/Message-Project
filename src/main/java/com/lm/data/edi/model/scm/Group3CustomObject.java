
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
 * This object has the reference  RFF
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "group3RFF",
    "group4Container"
})
public class Group3CustomObject {

    /**
     * A segment group 3 Reference
     * (Required)
     * 
     */
    @JsonProperty("group3RFF")
    @JsonPropertyDescription("A segment group 3 Reference")
    @Valid
    @NotNull
    private Group3RFF group3RFF;
    @JsonProperty("group4Container")
    @Size(min = 0, max = 999)
    @Valid
    private List<Group4CustomObject> group4Container = new ArrayList<Group4CustomObject>();

    /**
     * A segment group 3 Reference
     * (Required)
     * 
     */
    @JsonProperty("group3RFF")
    public Group3RFF getGroup3RFF() {
        return group3RFF;
    }

    /**
     * A segment group 3 Reference
     * (Required)
     * 
     */
    @JsonProperty("group3RFF")
    public void setGroup3RFF(Group3RFF group3RFF) {
        this.group3RFF = group3RFF;
    }

    @JsonProperty("group4Container")
    public List<Group4CustomObject> getGroup4Container() {
        return group4Container;
    }

    @JsonProperty("group4Container")
    public void setGroup4Container(List<Group4CustomObject> group4Container) {
        this.group4Container = group4Container;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group3CustomObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("group3RFF");
        sb.append('=');
        sb.append(((this.group3RFF == null)?"<null>":this.group3RFF));
        sb.append(',');
        sb.append("group4Container");
        sb.append('=');
        sb.append(((this.group4Container == null)?"<null>":this.group4Container));
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
        result = ((result* 31)+((this.group4Container == null)? 0 :this.group4Container.hashCode()));
        result = ((result* 31)+((this.group3RFF == null)? 0 :this.group3RFF.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group3CustomObject) == false) {
            return false;
        }
        Group3CustomObject rhs = ((Group3CustomObject) other);
        return (((this.group4Container == rhs.group4Container)||((this.group4Container!= null)&&this.group4Container.equals(rhs.group4Container)))&&((this.group3RFF == rhs.group3RFF)||((this.group3RFF!= null)&&this.group3RFF.equals(rhs.group3RFF))));
    }

}
