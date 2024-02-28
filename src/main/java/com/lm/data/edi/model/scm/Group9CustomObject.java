
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
 * This object has the reference of Gr9. LPSO reference and settlement details 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RFFDetails",
    "PIADetails",
    "TRADetails"
})
public class Group9CustomObject {

    /**
     * A segment group 8 Reference RFF - F. To specify an identifying reference associated with a named party claim entry or transaction. 
     * (Required)
     * 
     */
    @JsonProperty("RFFDetails")
    @JsonPropertyDescription("A segment group 8 Reference RFF - F. To specify an identifying reference associated with a named party claim entry or transaction. ")
    @Valid
    @NotNull
    private Group9RFF rFFDetails;
    /**
     * A segment group 9 Reference PIA - E. Additional Product Information
     * 
     */
    @JsonProperty("PIADetails")
    @JsonPropertyDescription("A segment group 9 Reference PIA - E. Additional Product Information")
    @Valid
    private Group9PIA pIADetails;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRADetails")
    @Size(min = 1, max = 4)
    @Valid
    @NotNull
    private List<Group9TRA> tRADetails = new ArrayList<Group9TRA>();

    /**
     * A segment group 8 Reference RFF - F. To specify an identifying reference associated with a named party claim entry or transaction. 
     * (Required)
     * 
     */
    @JsonProperty("RFFDetails")
    public Group9RFF getRFFDetails() {
        return rFFDetails;
    }

    /**
     * A segment group 8 Reference RFF - F. To specify an identifying reference associated with a named party claim entry or transaction. 
     * (Required)
     * 
     */
    @JsonProperty("RFFDetails")
    public void setRFFDetails(Group9RFF rFFDetails) {
        this.rFFDetails = rFFDetails;
    }

    /**
     * A segment group 9 Reference PIA - E. Additional Product Information
     * 
     */
    @JsonProperty("PIADetails")
    public Group9PIA getPIADetails() {
        return pIADetails;
    }

    /**
     * A segment group 9 Reference PIA - E. Additional Product Information
     * 
     */
    @JsonProperty("PIADetails")
    public void setPIADetails(Group9PIA pIADetails) {
        this.pIADetails = pIADetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRADetails")
    public List<Group9TRA> getTRADetails() {
        return tRADetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TRADetails")
    public void setTRADetails(List<Group9TRA> tRADetails) {
        this.tRADetails = tRADetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group9CustomObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rFFDetails");
        sb.append('=');
        sb.append(((this.rFFDetails == null)?"<null>":this.rFFDetails));
        sb.append(',');
        sb.append("pIADetails");
        sb.append('=');
        sb.append(((this.pIADetails == null)?"<null>":this.pIADetails));
        sb.append(',');
        sb.append("tRADetails");
        sb.append('=');
        sb.append(((this.tRADetails == null)?"<null>":this.tRADetails));
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
        result = ((result* 31)+((this.pIADetails == null)? 0 :this.pIADetails.hashCode()));
        result = ((result* 31)+((this.rFFDetails == null)? 0 :this.rFFDetails.hashCode()));
        result = ((result* 31)+((this.tRADetails == null)? 0 :this.tRADetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group9CustomObject) == false) {
            return false;
        }
        Group9CustomObject rhs = ((Group9CustomObject) other);
        return ((((this.pIADetails == rhs.pIADetails)||((this.pIADetails!= null)&&this.pIADetails.equals(rhs.pIADetails)))&&((this.rFFDetails == rhs.rFFDetails)||((this.rFFDetails!= null)&&this.rFFDetails.equals(rhs.rFFDetails))))&&((this.tRADetails == rhs.tRADetails)||((this.tRADetails!= null)&&this.tRADetails.equals(rhs.tRADetails))));
    }

}
