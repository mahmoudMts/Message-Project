
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A segment group 4 Reference PIN - B. To specify a percentage.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "companySyndLinePercentage"
})
public class Group4PIN {

    /**
     * Conditional. The line may be signed or written, and this is advised via the Written/Signed Ind (Risk).
     * 
     */
    @JsonProperty("companySyndLinePercentage")
    @JsonPropertyDescription("Conditional. The line may be signed or written, and this is advised via the Written/Signed Ind (Risk).")
    private Double companySyndLinePercentage;

    /**
     * Conditional. The line may be signed or written, and this is advised via the Written/Signed Ind (Risk).
     * 
     */
    @JsonProperty("companySyndLinePercentage")
    public Double getCompanySyndLinePercentage() {
        return companySyndLinePercentage;
    }

    /**
     * Conditional. The line may be signed or written, and this is advised via the Written/Signed Ind (Risk).
     * 
     */
    @JsonProperty("companySyndLinePercentage")
    public void setCompanySyndLinePercentage(Double companySyndLinePercentage) {
        this.companySyndLinePercentage = companySyndLinePercentage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group4PIN.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("companySyndLinePercentage");
        sb.append('=');
        sb.append(((this.companySyndLinePercentage == null)?"<null>":this.companySyndLinePercentage));
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
        result = ((result* 31)+((this.companySyndLinePercentage == null)? 0 :this.companySyndLinePercentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group4PIN) == false) {
            return false;
        }
        Group4PIN rhs = ((Group4PIN) other);
        return ((this.companySyndLinePercentage == rhs.companySyndLinePercentage)||((this.companySyndLinePercentage!= null)&&this.companySyndLinePercentage.equals(rhs.companySyndLinePercentage)));
    }

}
