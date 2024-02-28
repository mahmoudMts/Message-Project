
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
 * Claims office reference and settlement currency
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cuxDetails",
    "piaDetails",
    "group8Container"
})
public class Group7CustomObject {

    /**
     * A segment group 7 Reference CUX - D. To specify the currencies applicable to a transaction in Settlement ccy
     * (Required)
     * 
     */
    @JsonProperty("cuxDetails")
    @JsonPropertyDescription("A segment group 7 Reference CUX - D. To specify the currencies applicable to a transaction in Settlement ccy")
    @Valid
    @NotNull
    private Group7CUX cuxDetails;
    /**
     * A segment group 4 Reference
     * (Required)
     * 
     */
    @JsonProperty("piaDetails")
    @JsonPropertyDescription("A segment group 4 Reference")
    @Valid
    @NotNull
    private Group7PIA piaDetails;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group8Container")
    @Size(min = 1, max = 99)
    @Valid
    @NotNull
    private List<Group8CustomObject> group8Container = new ArrayList<Group8CustomObject>();

    /**
     * A segment group 7 Reference CUX - D. To specify the currencies applicable to a transaction in Settlement ccy
     * (Required)
     * 
     */
    @JsonProperty("cuxDetails")
    public Group7CUX getCuxDetails() {
        return cuxDetails;
    }

    /**
     * A segment group 7 Reference CUX - D. To specify the currencies applicable to a transaction in Settlement ccy
     * (Required)
     * 
     */
    @JsonProperty("cuxDetails")
    public void setCuxDetails(Group7CUX cuxDetails) {
        this.cuxDetails = cuxDetails;
    }

    /**
     * A segment group 4 Reference
     * (Required)
     * 
     */
    @JsonProperty("piaDetails")
    public Group7PIA getPiaDetails() {
        return piaDetails;
    }

    /**
     * A segment group 4 Reference
     * (Required)
     * 
     */
    @JsonProperty("piaDetails")
    public void setPiaDetails(Group7PIA piaDetails) {
        this.piaDetails = piaDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group8Container")
    public List<Group8CustomObject> getGroup8Container() {
        return group8Container;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group8Container")
    public void setGroup8Container(List<Group8CustomObject> group8Container) {
        this.group8Container = group8Container;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group7CustomObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cuxDetails");
        sb.append('=');
        sb.append(((this.cuxDetails == null)?"<null>":this.cuxDetails));
        sb.append(',');
        sb.append("piaDetails");
        sb.append('=');
        sb.append(((this.piaDetails == null)?"<null>":this.piaDetails));
        sb.append(',');
        sb.append("group8Container");
        sb.append('=');
        sb.append(((this.group8Container == null)?"<null>":this.group8Container));
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
        result = ((result* 31)+((this.cuxDetails == null)? 0 :this.cuxDetails.hashCode()));
        result = ((result* 31)+((this.piaDetails == null)? 0 :this.piaDetails.hashCode()));
        result = ((result* 31)+((this.group8Container == null)? 0 :this.group8Container.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group7CustomObject) == false) {
            return false;
        }
        Group7CustomObject rhs = ((Group7CustomObject) other);
        return ((((this.cuxDetails == rhs.cuxDetails)||((this.cuxDetails!= null)&&this.cuxDetails.equals(rhs.cuxDetails)))&&((this.piaDetails == rhs.piaDetails)||((this.piaDetails!= null)&&this.piaDetails.equals(rhs.piaDetails))))&&((this.group8Container == rhs.group8Container)||((this.group8Container!= null)&&this.group8Container.equals(rhs.group8Container))));
    }

}
