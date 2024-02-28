
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;
import javax.validation.constraints.Size;


/**
 * A segment group 8 Reference FTX - D. To provide free-form textual information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "textSubjectCode",
    "textFunctionCode",
    "currentNarrative"
})
public class Group8FTX {

    /**
     * subject code
     * 
     */
    @JsonProperty("textSubjectCode")
    @JsonPropertyDescription("subject code")
    @Size(max = 3)
    private String textSubjectCode;
    /**
     * function code
     * 
     */
    @JsonProperty("textFunctionCode")
    @JsonPropertyDescription("function code")
    @Size(max = 2)
    private String textFunctionCode;
    /**
     * Conditional. Narrative details of the movement being advised. CTN
     * 
     */
    @JsonProperty("currentNarrative")
    @JsonPropertyDescription("Conditional. Narrative details of the movement being advised. CTN")
    @Valid
    private CurrentNarrativeObject currentNarrative;

    /**
     * subject code
     * 
     */
    @JsonProperty("textSubjectCode")
    public String getTextSubjectCode() {
        return textSubjectCode;
    }

    /**
     * subject code
     * 
     */
    @JsonProperty("textSubjectCode")
    public void setTextSubjectCode(String textSubjectCode) {
        this.textSubjectCode = textSubjectCode;
    }

    /**
     * function code
     * 
     */
    @JsonProperty("textFunctionCode")
    public String getTextFunctionCode() {
        return textFunctionCode;
    }

    /**
     * function code
     * 
     */
    @JsonProperty("textFunctionCode")
    public void setTextFunctionCode(String textFunctionCode) {
        this.textFunctionCode = textFunctionCode;
    }

    /**
     * Conditional. Narrative details of the movement being advised. CTN
     * 
     */
    @JsonProperty("currentNarrative")
    public CurrentNarrativeObject getCurrentNarrative() {
        return currentNarrative;
    }

    /**
     * Conditional. Narrative details of the movement being advised. CTN
     * 
     */
    @JsonProperty("currentNarrative")
    public void setCurrentNarrative(CurrentNarrativeObject currentNarrative) {
        this.currentNarrative = currentNarrative;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group8FTX.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("textSubjectCode");
        sb.append('=');
        sb.append(((this.textSubjectCode == null)?"<null>":this.textSubjectCode));
        sb.append(',');
        sb.append("textFunctionCode");
        sb.append('=');
        sb.append(((this.textFunctionCode == null)?"<null>":this.textFunctionCode));
        sb.append(',');
        sb.append("currentNarrative");
        sb.append('=');
        sb.append(((this.currentNarrative == null)?"<null>":this.currentNarrative));
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
        result = ((result* 31)+((this.textSubjectCode == null)? 0 :this.textSubjectCode.hashCode()));
        result = ((result* 31)+((this.textFunctionCode == null)? 0 :this.textFunctionCode.hashCode()));
        result = ((result* 31)+((this.currentNarrative == null)? 0 :this.currentNarrative.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group8FTX) == false) {
            return false;
        }
        Group8FTX rhs = ((Group8FTX) other);
        return ((((this.textSubjectCode == rhs.textSubjectCode)||((this.textSubjectCode!= null)&&this.textSubjectCode.equals(rhs.textSubjectCode)))&&((this.textFunctionCode == rhs.textFunctionCode)||((this.textFunctionCode!= null)&&this.textFunctionCode.equals(rhs.textFunctionCode))))&&((this.currentNarrative == rhs.currentNarrative)||((this.currentNarrative!= null)&&this.currentNarrative.equals(rhs.currentNarrative))));
    }

}
