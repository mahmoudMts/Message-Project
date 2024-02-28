
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A segment group 6 Reference DTM - B. To specify a date.  Time reference is not used
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataLastSeen"
})
public class Group6DTM {

    /**
     * Conditional. The date on which the outstanding for the claim entry was last confirmed or the claim file was last seen.
     * 
     */
    @JsonProperty("dataLastSeen")
    @JsonPropertyDescription("Conditional. The date on which the outstanding for the claim entry was last confirmed or the claim file was last seen.")
    private String dataLastSeen;

    /**
     * Conditional. The date on which the outstanding for the claim entry was last confirmed or the claim file was last seen.
     * 
     */
    @JsonProperty("dataLastSeen")
    public String getDataLastSeen() {
        return dataLastSeen;
    }

    /**
     * Conditional. The date on which the outstanding for the claim entry was last confirmed or the claim file was last seen.
     * 
     */
    @JsonProperty("dataLastSeen")
    public void setDataLastSeen(String dataLastSeen) {
        this.dataLastSeen = dataLastSeen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group6DTM.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataLastSeen");
        sb.append('=');
        sb.append(((this.dataLastSeen == null)?"<null>":this.dataLastSeen));
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
        result = ((result* 31)+((this.dataLastSeen == null)? 0 :this.dataLastSeen.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group6DTM) == false) {
            return false;
        }
        Group6DTM rhs = ((Group6DTM) other);
        return ((this.dataLastSeen == rhs.dataLastSeen)||((this.dataLastSeen!= null)&&this.dataLastSeen.equals(rhs.dataLastSeen)));
    }

}
