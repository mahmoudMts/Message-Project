
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Section Control Segment UNS - A. To separate header, detail and summary sections of a message
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sectionIdentification"
})
public class TrailerUNS {

    /**
     * Mandatory. Indicates start of summary section of message
     * (Required)
     * 
     */
    @JsonProperty("sectionIdentification")
    @JsonPropertyDescription("Mandatory. Indicates start of summary section of message")
    @Size(max = 1)
    @NotNull
    private String sectionIdentification;

    /**
     * Mandatory. Indicates start of summary section of message
     * (Required)
     * 
     */
    @JsonProperty("sectionIdentification")
    public String getSectionIdentification() {
        return sectionIdentification;
    }

    /**
     * Mandatory. Indicates start of summary section of message
     * (Required)
     * 
     */
    @JsonProperty("sectionIdentification")
    public void setSectionIdentification(String sectionIdentification) {
        this.sectionIdentification = sectionIdentification;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TrailerUNS.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sectionIdentification");
        sb.append('=');
        sb.append(((this.sectionIdentification == null)?"<null>":this.sectionIdentification));
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
        result = ((result* 31)+((this.sectionIdentification == null)? 0 :this.sectionIdentification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrailerUNS) == false) {
            return false;
        }
        TrailerUNS rhs = ((TrailerUNS) other);
        return ((this.sectionIdentification == rhs.sectionIdentification)||((this.sectionIdentification!= null)&&this.sectionIdentification.equals(rhs.sectionIdentification)));
    }

}
