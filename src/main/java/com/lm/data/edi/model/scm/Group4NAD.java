
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * A segment group 4 Reference NAD - B. To identify a specific party
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "companySyndIdentification"
})
public class Group4NAD {

    /**
     * Conditional. The syndicate number of a syndicate associated with the claim entry
     * 
     */
    @JsonProperty("companySyndIdentification")
    @JsonPropertyDescription("Conditional. The syndicate number of a syndicate associated with the claim entry")
    @Size(max = 9)
    private String companySyndIdentification;

    /**
     * Conditional. The syndicate number of a syndicate associated with the claim entry
     * 
     */
    @JsonProperty("companySyndIdentification")
    public String getCompanySyndIdentification() {
        return companySyndIdentification;
    }

    /**
     * Conditional. The syndicate number of a syndicate associated with the claim entry
     * 
     */
    @JsonProperty("companySyndIdentification")
    public void setCompanySyndIdentification(String companySyndIdentification) {
        this.companySyndIdentification = companySyndIdentification;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group4NAD.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("companySyndIdentification");
        sb.append('=');
        sb.append(((this.companySyndIdentification == null)?"<null>":this.companySyndIdentification));
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
        result = ((result* 31)+((this.companySyndIdentification == null)? 0 :this.companySyndIdentification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group4NAD) == false) {
            return false;
        }
        Group4NAD rhs = ((Group4NAD) other);
        return ((this.companySyndIdentification == rhs.companySyndIdentification)||((this.companySyndIdentification!= null)&&this.companySyndIdentification.equals(rhs.companySyndIdentification)));
    }

}
