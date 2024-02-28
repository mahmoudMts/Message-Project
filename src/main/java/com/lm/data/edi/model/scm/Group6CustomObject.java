
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
 * Original ccy. Claim narrative, date last seen and broker's refs
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cuxDetails",
    "ftxDetails",
    "dtmDetails",
    "rffDetails",
    "group7Container"
})
public class Group6CustomObject {

    /**
     * A segment group 6 Reference CUX - C. To specify the currencies applicable to a transaction in Reference or original ccy
     * (Required)
     * 
     */
    @JsonProperty("cuxDetails")
    @JsonPropertyDescription("A segment group 6 Reference CUX - C. To specify the currencies applicable to a transaction in Reference or original ccy")
    @Valid
    @NotNull
    private Group6CUX cuxDetails;
    /**
     * A segment group 4 Reference FTX - C. To provide free-form textual information
     * 
     */
    @JsonProperty("ftxDetails")
    @JsonPropertyDescription("A segment group 4 Reference FTX - C. To provide free-form textual information")
    @Valid
    private Group6FTX ftxDetails;
    /**
     * A segment group 6 Reference DTM - B. To specify a date.  Time reference is not used
     * 
     */
    @JsonProperty("dtmDetails")
    @JsonPropertyDescription("A segment group 6 Reference DTM - B. To specify a date.  Time reference is not used")
    @Valid
    private Group6DTM dtmDetails;
    @JsonProperty("rffDetails")
    @Size(min = 0, max = 2)
    @Valid
    private List<Group6RFF> rffDetails = new ArrayList<Group6RFF>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group7Container")
    @Size(min = 1, max = 10)
    @Valid
    @NotNull
    private List<Group7CustomObject> group7Container = new ArrayList<Group7CustomObject>();

    /**
     * A segment group 6 Reference CUX - C. To specify the currencies applicable to a transaction in Reference or original ccy
     * (Required)
     * 
     */
    @JsonProperty("cuxDetails")
    public Group6CUX getCuxDetails() {
        return cuxDetails;
    }

    /**
     * A segment group 6 Reference CUX - C. To specify the currencies applicable to a transaction in Reference or original ccy
     * (Required)
     * 
     */
    @JsonProperty("cuxDetails")
    public void setCuxDetails(Group6CUX cuxDetails) {
        this.cuxDetails = cuxDetails;
    }

    /**
     * A segment group 4 Reference FTX - C. To provide free-form textual information
     * 
     */
    @JsonProperty("ftxDetails")
    public Group6FTX getFtxDetails() {
        return ftxDetails;
    }

    /**
     * A segment group 4 Reference FTX - C. To provide free-form textual information
     * 
     */
    @JsonProperty("ftxDetails")
    public void setFtxDetails(Group6FTX ftxDetails) {
        this.ftxDetails = ftxDetails;
    }

    /**
     * A segment group 6 Reference DTM - B. To specify a date.  Time reference is not used
     * 
     */
    @JsonProperty("dtmDetails")
    public Group6DTM getDtmDetails() {
        return dtmDetails;
    }

    /**
     * A segment group 6 Reference DTM - B. To specify a date.  Time reference is not used
     * 
     */
    @JsonProperty("dtmDetails")
    public void setDtmDetails(Group6DTM dtmDetails) {
        this.dtmDetails = dtmDetails;
    }

    @JsonProperty("rffDetails")
    public List<Group6RFF> getRffDetails() {
        return rffDetails;
    }

    @JsonProperty("rffDetails")
    public void setRffDetails(List<Group6RFF> rffDetails) {
        this.rffDetails = rffDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group7Container")
    public List<Group7CustomObject> getGroup7Container() {
        return group7Container;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group7Container")
    public void setGroup7Container(List<Group7CustomObject> group7Container) {
        this.group7Container = group7Container;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group6CustomObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cuxDetails");
        sb.append('=');
        sb.append(((this.cuxDetails == null)?"<null>":this.cuxDetails));
        sb.append(',');
        sb.append("ftxDetails");
        sb.append('=');
        sb.append(((this.ftxDetails == null)?"<null>":this.ftxDetails));
        sb.append(',');
        sb.append("dtmDetails");
        sb.append('=');
        sb.append(((this.dtmDetails == null)?"<null>":this.dtmDetails));
        sb.append(',');
        sb.append("rffDetails");
        sb.append('=');
        sb.append(((this.rffDetails == null)?"<null>":this.rffDetails));
        sb.append(',');
        sb.append("group7Container");
        sb.append('=');
        sb.append(((this.group7Container == null)?"<null>":this.group7Container));
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
        result = ((result* 31)+((this.dtmDetails == null)? 0 :this.dtmDetails.hashCode()));
        result = ((result* 31)+((this.rffDetails == null)? 0 :this.rffDetails.hashCode()));
        result = ((result* 31)+((this.ftxDetails == null)? 0 :this.ftxDetails.hashCode()));
        result = ((result* 31)+((this.group7Container == null)? 0 :this.group7Container.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group6CustomObject) == false) {
            return false;
        }
        Group6CustomObject rhs = ((Group6CustomObject) other);
        return ((((((this.cuxDetails == rhs.cuxDetails)||((this.cuxDetails!= null)&&this.cuxDetails.equals(rhs.cuxDetails)))&&((this.dtmDetails == rhs.dtmDetails)||((this.dtmDetails!= null)&&this.dtmDetails.equals(rhs.dtmDetails))))&&((this.rffDetails == rhs.rffDetails)||((this.rffDetails!= null)&&this.rffDetails.equals(rhs.rffDetails))))&&((this.ftxDetails == rhs.ftxDetails)||((this.ftxDetails!= null)&&this.ftxDetails.equals(rhs.ftxDetails))))&&((this.group7Container == rhs.group7Container)||((this.group7Container!= null)&&this.group7Container.equals(rhs.group7Container))));
    }

}
