
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * A segment group 3 Reference
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bureauPrimaryClaimReference"
})
public class Group3RFF {

    /**
     * The unique reference to identify a claim entry in the Claims Office system, and in the message
     * 
     */
    @JsonProperty("bureauPrimaryClaimReference")
    @JsonPropertyDescription("The unique reference to identify a claim entry in the Claims Office system, and in the message")
    @Size(max = 15)
    private String bureauPrimaryClaimReference;

    /**
     * The unique reference to identify a claim entry in the Claims Office system, and in the message
     * 
     */
    @JsonProperty("bureauPrimaryClaimReference")
    public String getBureauPrimaryClaimReference() {
        return bureauPrimaryClaimReference;
    }

    /**
     * The unique reference to identify a claim entry in the Claims Office system, and in the message
     * 
     */
    @JsonProperty("bureauPrimaryClaimReference")
    public void setBureauPrimaryClaimReference(String bureauPrimaryClaimReference) {
        this.bureauPrimaryClaimReference = bureauPrimaryClaimReference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group3RFF.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bureauPrimaryClaimReference");
        sb.append('=');
        sb.append(((this.bureauPrimaryClaimReference == null)?"<null>":this.bureauPrimaryClaimReference));
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
        result = ((result* 31)+((this.bureauPrimaryClaimReference == null)? 0 :this.bureauPrimaryClaimReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group3RFF) == false) {
            return false;
        }
        Group3RFF rhs = ((Group3RFF) other);
        return ((this.bureauPrimaryClaimReference == rhs.bureauPrimaryClaimReference)||((this.bureauPrimaryClaimReference!= null)&&this.bureauPrimaryClaimReference.equals(rhs.bureauPrimaryClaimReference)));
    }

}
