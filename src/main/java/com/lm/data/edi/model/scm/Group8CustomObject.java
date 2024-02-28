
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
 * This object has the reference of Gr8. Movement reference, narrative and O/S & PTD amounts
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rffDetails",
    "nadDetails",
    "traDetails",
    "ftxDetails",
    "group9Container"
})
public class Group8CustomObject {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rffDetails")
    @Size(min = 1, max = 2)
    @Valid
    @NotNull
    private List<Group8RFF> rffDetails = new ArrayList<Group8RFF>();
    /**
     * A segment group 8 Reference NAD -C. To identify a specific party
     * 
     */
    @JsonProperty("nadDetails")
    @JsonPropertyDescription("A segment group 8 Reference NAD -C. To identify a specific party")
    @Valid
    private Group8NAD nadDetails;
    @JsonProperty("traDetails")
    @Size(max = 5)
    @Valid
    private List<Group8TRA> traDetails = new ArrayList<Group8TRA>();
    /**
     * A segment group 8 Reference FTX - D. To provide free-form textual information.
     * 
     */
    @JsonProperty("ftxDetails")
    @JsonPropertyDescription("A segment group 8 Reference FTX - D. To provide free-form textual information.")
    @Valid
    private Group8FTX ftxDetails;
    @JsonProperty("group9Container")
    @Size(min = 1, max = 1)
    @Valid
    private List<Group9CustomObject> group9Container = new ArrayList<Group9CustomObject>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rffDetails")
    public List<Group8RFF> getRffDetails() {
        return rffDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rffDetails")
    public void setRffDetails(List<Group8RFF> rffDetails) {
        this.rffDetails = rffDetails;
    }

    /**
     * A segment group 8 Reference NAD -C. To identify a specific party
     * 
     */
    @JsonProperty("nadDetails")
    public Group8NAD getNadDetails() {
        return nadDetails;
    }

    /**
     * A segment group 8 Reference NAD -C. To identify a specific party
     * 
     */
    @JsonProperty("nadDetails")
    public void setNadDetails(Group8NAD nadDetails) {
        this.nadDetails = nadDetails;
    }

    @JsonProperty("traDetails")
    public List<Group8TRA> getTraDetails() {
        return traDetails;
    }

    @JsonProperty("traDetails")
    public void setTraDetails(List<Group8TRA> traDetails) {
        this.traDetails = traDetails;
    }

    /**
     * A segment group 8 Reference FTX - D. To provide free-form textual information.
     * 
     */
    @JsonProperty("ftxDetails")
    public Group8FTX getFtxDetails() {
        return ftxDetails;
    }

    /**
     * A segment group 8 Reference FTX - D. To provide free-form textual information.
     * 
     */
    @JsonProperty("ftxDetails")
    public void setFtxDetails(Group8FTX ftxDetails) {
        this.ftxDetails = ftxDetails;
    }

    @JsonProperty("group9Container")
    public List<Group9CustomObject> getGroup9Container() {
        return group9Container;
    }

    @JsonProperty("group9Container")
    public void setGroup9Container(List<Group9CustomObject> group9Container) {
        this.group9Container = group9Container;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group8CustomObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rffDetails");
        sb.append('=');
        sb.append(((this.rffDetails == null)?"<null>":this.rffDetails));
        sb.append(',');
        sb.append("nadDetails");
        sb.append('=');
        sb.append(((this.nadDetails == null)?"<null>":this.nadDetails));
        sb.append(',');
        sb.append("traDetails");
        sb.append('=');
        sb.append(((this.traDetails == null)?"<null>":this.traDetails));
        sb.append(',');
        sb.append("ftxDetails");
        sb.append('=');
        sb.append(((this.ftxDetails == null)?"<null>":this.ftxDetails));
        sb.append(',');
        sb.append("group9Container");
        sb.append('=');
        sb.append(((this.group9Container == null)?"<null>":this.group9Container));
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
        result = ((result* 31)+((this.group9Container == null)? 0 :this.group9Container.hashCode()));
        result = ((result* 31)+((this.rffDetails == null)? 0 :this.rffDetails.hashCode()));
        result = ((result* 31)+((this.nadDetails == null)? 0 :this.nadDetails.hashCode()));
        result = ((result* 31)+((this.traDetails == null)? 0 :this.traDetails.hashCode()));
        result = ((result* 31)+((this.ftxDetails == null)? 0 :this.ftxDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group8CustomObject) == false) {
            return false;
        }
        Group8CustomObject rhs = ((Group8CustomObject) other);
        return ((((((this.group9Container == rhs.group9Container)||((this.group9Container!= null)&&this.group9Container.equals(rhs.group9Container)))&&((this.rffDetails == rhs.rffDetails)||((this.rffDetails!= null)&&this.rffDetails.equals(rhs.rffDetails))))&&((this.nadDetails == rhs.nadDetails)||((this.nadDetails!= null)&&this.nadDetails.equals(rhs.nadDetails))))&&((this.traDetails == rhs.traDetails)||((this.traDetails!= null)&&this.traDetails.equals(rhs.traDetails))))&&((this.ftxDetails == rhs.ftxDetails)||((this.ftxDetails!= null)&&this.ftxDetails.equals(rhs.ftxDetails))));
    }

}
