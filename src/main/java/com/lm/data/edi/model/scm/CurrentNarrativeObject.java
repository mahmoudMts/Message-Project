
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * Conditional. Narrative details of the movement being advised. CTN
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currentNarrative1",
    "currentNarrative2"
})
public class CurrentNarrativeObject {

    /**
     * Narrative details of the movement being advised. 1
     * 
     */
    @JsonProperty("currentNarrative1")
    @JsonPropertyDescription("Narrative details of the movement being advised. 1")
    @Size(max = 50)
    private String currentNarrative1;
    /**
     * Narrative details of the movement being advised. 2
     * 
     */
    @JsonProperty("currentNarrative2")
    @JsonPropertyDescription("Narrative details of the movement being advised. 2")
    @Size(max = 50)
    private String currentNarrative2;

    /**
     * Narrative details of the movement being advised. 1
     * 
     */
    @JsonProperty("currentNarrative1")
    public String getCurrentNarrative1() {
        return currentNarrative1;
    }

    /**
     * Narrative details of the movement being advised. 1
     * 
     */
    @JsonProperty("currentNarrative1")
    public void setCurrentNarrative1(String currentNarrative1) {
        this.currentNarrative1 = currentNarrative1;
    }

    /**
     * Narrative details of the movement being advised. 2
     * 
     */
    @JsonProperty("currentNarrative2")
    public String getCurrentNarrative2() {
        return currentNarrative2;
    }

    /**
     * Narrative details of the movement being advised. 2
     * 
     */
    @JsonProperty("currentNarrative2")
    public void setCurrentNarrative2(String currentNarrative2) {
        this.currentNarrative2 = currentNarrative2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurrentNarrativeObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currentNarrative1");
        sb.append('=');
        sb.append(((this.currentNarrative1 == null)?"<null>":this.currentNarrative1));
        sb.append(',');
        sb.append("currentNarrative2");
        sb.append('=');
        sb.append(((this.currentNarrative2 == null)?"<null>":this.currentNarrative2));
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
        result = ((result* 31)+((this.currentNarrative2 == null)? 0 :this.currentNarrative2 .hashCode()));
        result = ((result* 31)+((this.currentNarrative1 == null)? 0 :this.currentNarrative1 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrentNarrativeObject) == false) {
            return false;
        }
        CurrentNarrativeObject rhs = ((CurrentNarrativeObject) other);
        return (((this.currentNarrative2 == rhs.currentNarrative2)||((this.currentNarrative2 != null)&&this.currentNarrative2 .equals(rhs.currentNarrative2)))&&((this.currentNarrative1 == rhs.currentNarrative1)||((this.currentNarrative1 != null)&&this.currentNarrative1 .equals(rhs.currentNarrative1))));
    }

}
