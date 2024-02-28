
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * A segment group 8 Reference NAD -C. To identify a specific party
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bureauChecker"
})
public class Group8NAD {

    /**
     * Mandatory. The unique identifier based on the initials of the claims office adjuster/examiner to identify the 'owning' adjuster/examiner responsible for the claim advice and for advising the settlement transaction.
     * 
     */
    @JsonProperty("bureauChecker")
    @JsonPropertyDescription("Mandatory. The unique identifier based on the initials of the claims office adjuster/examiner to identify the 'owning' adjuster/examiner responsible for the claim advice and for advising the settlement transaction.")
    @Size(max = 3)
    private String bureauChecker;

    /**
     * Mandatory. The unique identifier based on the initials of the claims office adjuster/examiner to identify the 'owning' adjuster/examiner responsible for the claim advice and for advising the settlement transaction.
     * 
     */
    @JsonProperty("bureauChecker")
    public String getBureauChecker() {
        return bureauChecker;
    }

    /**
     * Mandatory. The unique identifier based on the initials of the claims office adjuster/examiner to identify the 'owning' adjuster/examiner responsible for the claim advice and for advising the settlement transaction.
     * 
     */
    @JsonProperty("bureauChecker")
    public void setBureauChecker(String bureauChecker) {
        this.bureauChecker = bureauChecker;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group8NAD.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bureauChecker");
        sb.append('=');
        sb.append(((this.bureauChecker == null)?"<null>":this.bureauChecker));
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
        result = ((result* 31)+((this.bureauChecker == null)? 0 :this.bureauChecker.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group8NAD) == false) {
            return false;
        }
        Group8NAD rhs = ((Group8NAD) other);
        return ((this.bureauChecker == rhs.bureauChecker)||((this.bureauChecker!= null)&&this.bureauChecker.equals(rhs.bureauChecker)));
    }

}
