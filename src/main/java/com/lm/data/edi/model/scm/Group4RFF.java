
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
 * A segment group 4 Reference RFF - C. To specify an identifying reference associated with a named party claim entry or transaction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "compSyndsClaimReference",
    "syndLineSequenceNumber"
})
public class Group4RFF {

    /**
     * Conditional. The reference of the claim allocated by each syndicate.
     * 
     */
    @JsonProperty("compSyndsClaimReference")
    @JsonPropertyDescription("Conditional. The reference of the claim allocated by each syndicate.")
    @Size(max = 15)
    private String compSyndsClaimReference;
    /**
     * Conditional. The number is aunique and unchanging reference given to a syndicate line when the line is first recorded on the claim.
     * 
     */
    @JsonProperty("syndLineSequenceNumber")
    @JsonPropertyDescription("Conditional. The number is aunique and unchanging reference given to a syndicate line when the line is first recorded on the claim.")
    @Pattern(regexp = "[0-9]{0,3}")
    private String syndLineSequenceNumber;

    /**
     * Conditional. The reference of the claim allocated by each syndicate.
     * 
     */
    @JsonProperty("compSyndsClaimReference")
    public String getCompSyndsClaimReference() {
        return compSyndsClaimReference;
    }

    /**
     * Conditional. The reference of the claim allocated by each syndicate.
     * 
     */
    @JsonProperty("compSyndsClaimReference")
    public void setCompSyndsClaimReference(String compSyndsClaimReference) {
        this.compSyndsClaimReference = compSyndsClaimReference;
    }

    /**
     * Conditional. The number is aunique and unchanging reference given to a syndicate line when the line is first recorded on the claim.
     * 
     */
    @JsonProperty("syndLineSequenceNumber")
    public String getSyndLineSequenceNumber() {
        return syndLineSequenceNumber;
    }

    /**
     * Conditional. The number is aunique and unchanging reference given to a syndicate line when the line is first recorded on the claim.
     * 
     */
    @JsonProperty("syndLineSequenceNumber")
    public void setSyndLineSequenceNumber(String syndLineSequenceNumber) {
        this.syndLineSequenceNumber = syndLineSequenceNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group4RFF.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("compSyndsClaimReference");
        sb.append('=');
        sb.append(((this.compSyndsClaimReference == null)?"<null>":this.compSyndsClaimReference));
        sb.append(',');
        sb.append("syndLineSequenceNumber");
        sb.append('=');
        sb.append(((this.syndLineSequenceNumber == null)?"<null>":this.syndLineSequenceNumber));
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
        result = ((result* 31)+((this.syndLineSequenceNumber == null)? 0 :this.syndLineSequenceNumber.hashCode()));
        result = ((result* 31)+((this.compSyndsClaimReference == null)? 0 :this.compSyndsClaimReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group4RFF) == false) {
            return false;
        }
        Group4RFF rhs = ((Group4RFF) other);
        return (((this.syndLineSequenceNumber == rhs.syndLineSequenceNumber)||((this.syndLineSequenceNumber!= null)&&this.syndLineSequenceNumber.equals(rhs.syndLineSequenceNumber)))&&((this.compSyndsClaimReference == rhs.compSyndsClaimReference)||((this.compSyndsClaimReference!= null)&&this.compSyndsClaimReference.equals(rhs.compSyndsClaimReference))));
    }

}
