
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * A segment group 6 Reference RFF - D. To specify an identifying reference associated with a named party claim entry or transaction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brokerReference1",
    "brokerReference2"
})
public class Group6RFF {

    /**
     * Conditional. A reference allocated by a broker to a claim. Value may contain non-level-A characters or may be spaces.
     * 
     */
    @JsonProperty("brokerReference1")
    @JsonPropertyDescription("Conditional. A reference allocated by a broker to a claim. Value may contain non-level-A characters or may be spaces.")
    @Size(max = 12)
    private String brokerReference1;
    /**
     * Conditional. Additional reference allocated by a broker to a claim. Value may contain non-level-A characters or may be spaces.
     * 
     */
    @JsonProperty("brokerReference2")
    @JsonPropertyDescription("Conditional. Additional reference allocated by a broker to a claim. Value may contain non-level-A characters or may be spaces.")
    @Size(max = 12)
    private String brokerReference2;

    /**
     * Conditional. A reference allocated by a broker to a claim. Value may contain non-level-A characters or may be spaces.
     * 
     */
    @JsonProperty("brokerReference1")
    public String getBrokerReference1() {
        return brokerReference1;
    }

    /**
     * Conditional. A reference allocated by a broker to a claim. Value may contain non-level-A characters or may be spaces.
     * 
     */
    @JsonProperty("brokerReference1")
    public void setBrokerReference1(String brokerReference1) {
        this.brokerReference1 = brokerReference1;
    }

    /**
     * Conditional. Additional reference allocated by a broker to a claim. Value may contain non-level-A characters or may be spaces.
     * 
     */
    @JsonProperty("brokerReference2")
    public String getBrokerReference2() {
        return brokerReference2;
    }

    /**
     * Conditional. Additional reference allocated by a broker to a claim. Value may contain non-level-A characters or may be spaces.
     * 
     */
    @JsonProperty("brokerReference2")
    public void setBrokerReference2(String brokerReference2) {
        this.brokerReference2 = brokerReference2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group6RFF.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brokerReference1");
        sb.append('=');
        sb.append(((this.brokerReference1 == null)?"<null>":this.brokerReference1));
        sb.append(',');
        sb.append("brokerReference2");
        sb.append('=');
        sb.append(((this.brokerReference2 == null)?"<null>":this.brokerReference2));
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
        result = ((result* 31)+((this.brokerReference1 == null)? 0 :this.brokerReference1 .hashCode()));
        result = ((result* 31)+((this.brokerReference2 == null)? 0 :this.brokerReference2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group6RFF) == false) {
            return false;
        }
        Group6RFF rhs = ((Group6RFF) other);
        return (((this.brokerReference1 == rhs.brokerReference1)||((this.brokerReference1 != null)&&this.brokerReference1 .equals(rhs.brokerReference1)))&&((this.brokerReference2 == rhs.brokerReference2)||((this.brokerReference2 != null)&&this.brokerReference2 .equals(rhs.brokerReference2))));
    }

}
