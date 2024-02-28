
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * A segment group 8 Reference RFF - F. To specify an identifying reference associated with a named party claim entry or transaction. 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bureauSigningReference"
})
public class Group9RFF {

    /**
     * Reference allocated to a settlement transaction
     * 
     */
    @JsonProperty("bureauSigningReference")
    @JsonPropertyDescription("Reference allocated to a settlement transaction")
    @Size(max = 15)
    private String bureauSigningReference;

    /**
     * Reference allocated to a settlement transaction
     * 
     */
    @JsonProperty("bureauSigningReference")
    public String getBureauSigningReference() {
        return bureauSigningReference;
    }

    /**
     * Reference allocated to a settlement transaction
     * 
     */
    @JsonProperty("bureauSigningReference")
    public void setBureauSigningReference(String bureauSigningReference) {
        this.bureauSigningReference = bureauSigningReference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group9RFF.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bureauSigningReference");
        sb.append('=');
        sb.append(((this.bureauSigningReference == null)?"<null>":this.bureauSigningReference));
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
        result = ((result* 31)+((this.bureauSigningReference == null)? 0 :this.bureauSigningReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group9RFF) == false) {
            return false;
        }
        Group9RFF rhs = ((Group9RFF) other);
        return ((this.bureauSigningReference == rhs.bureauSigningReference)||((this.bureauSigningReference!= null)&&this.bureauSigningReference.equals(rhs.bureauSigningReference)));
    }

}
