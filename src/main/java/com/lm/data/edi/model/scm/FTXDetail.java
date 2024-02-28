
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;
import javax.validation.constraints.Size;


/**
 * A segment FTX Details FTX-A
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "textSubjectCode",
    "textFunctionCode",
    "lossDetails"
})
public class FTXDetail {

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
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL
     * 
     */
    @JsonProperty("lossDetails")
    @JsonPropertyDescription("Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL")
    @Valid
    private LossDetailseObject lossDetails;

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
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL
     * 
     */
    @JsonProperty("lossDetails")
    public LossDetailseObject getLossDetails() {
        return lossDetails;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL
     * 
     */
    @JsonProperty("lossDetails")
    public void setLossDetails(LossDetailseObject lossDetails) {
        this.lossDetails = lossDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FTXDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("textSubjectCode");
        sb.append('=');
        sb.append(((this.textSubjectCode == null)?"<null>":this.textSubjectCode));
        sb.append(',');
        sb.append("textFunctionCode");
        sb.append('=');
        sb.append(((this.textFunctionCode == null)?"<null>":this.textFunctionCode));
        sb.append(',');
        sb.append("lossDetails");
        sb.append('=');
        sb.append(((this.lossDetails == null)?"<null>":this.lossDetails));
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
        result = ((result* 31)+((this.lossDetails == null)? 0 :this.lossDetails.hashCode()));
        result = ((result* 31)+((this.textFunctionCode == null)? 0 :this.textFunctionCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FTXDetail) == false) {
            return false;
        }
        FTXDetail rhs = ((FTXDetail) other);
        return ((((this.textSubjectCode == rhs.textSubjectCode)||((this.textSubjectCode!= null)&&this.textSubjectCode.equals(rhs.textSubjectCode)))&&((this.lossDetails == rhs.lossDetails)||((this.lossDetails!= null)&&this.lossDetails.equals(rhs.lossDetails))))&&((this.textFunctionCode == rhs.textFunctionCode)||((this.textFunctionCode!= null)&&this.textFunctionCode.equals(rhs.textFunctionCode))));
    }

}
