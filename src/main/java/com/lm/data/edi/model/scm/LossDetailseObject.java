
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;
import javax.validation.constraints.Size;


/**
 * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lossDetails1",
    "lossDetails2",
    "lossDetails3",
    "lossDetails4",
    "lossDetails5",
    "extendedLossDetailsParaRef",
    "extendedLossDetails"
})
public class LossDetailseObject {

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL- 1
     * 
     */
    @JsonProperty("lossDetails1")
    @JsonPropertyDescription("Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL- 1")
    @Size(max = 70)
    private String lossDetails1;
    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL- 2
     * 
     */
    @JsonProperty("lossDetails2")
    @JsonPropertyDescription("Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL- 2")
    @Size(max = 70)
    private String lossDetails2;
    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL-3
     * 
     */
    @JsonProperty("lossDetails3")
    @JsonPropertyDescription("Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL-3")
    @Size(max = 70)
    private String lossDetails3;
    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL 4
     * 
     */
    @JsonProperty("lossDetails4")
    @JsonPropertyDescription("Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL 4")
    @Size(max = 70)
    private String lossDetails4;
    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL5 
     * 
     */
    @JsonProperty("lossDetails5")
    @JsonPropertyDescription("Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL5 ")
    @Size(max = 70)
    private String lossDetails5;
    /**
     * sender Reference
     * 
     */
    @JsonProperty("extendedLossDetailsParaRef")
    @JsonPropertyDescription("sender Reference")
    @Size(max = 2)
    private String extendedLossDetailsParaRef;
    /**
     * Reference Number
     * 
     */
    @JsonProperty("extendedLossDetails")
    @JsonPropertyDescription("Reference Number")
    @Valid
    private ExtendedLossDetailseObject extendedLossDetails;

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL- 1
     * 
     */
    @JsonProperty("lossDetails1")
    public String getLossDetails1() {
        return lossDetails1;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL- 1
     * 
     */
    @JsonProperty("lossDetails1")
    public void setLossDetails1(String lossDetails1) {
        this.lossDetails1 = lossDetails1;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL- 2
     * 
     */
    @JsonProperty("lossDetails2")
    public String getLossDetails2() {
        return lossDetails2;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL- 2
     * 
     */
    @JsonProperty("lossDetails2")
    public void setLossDetails2(String lossDetails2) {
        this.lossDetails2 = lossDetails2;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL-3
     * 
     */
    @JsonProperty("lossDetails3")
    public String getLossDetails3() {
        return lossDetails3;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL-3
     * 
     */
    @JsonProperty("lossDetails3")
    public void setLossDetails3(String lossDetails3) {
        this.lossDetails3 = lossDetails3;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL 4
     * 
     */
    @JsonProperty("lossDetails4")
    public String getLossDetails4() {
        return lossDetails4;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL 4
     * 
     */
    @JsonProperty("lossDetails4")
    public void setLossDetails4(String lossDetails4) {
        this.lossDetails4 = lossDetails4;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL5 
     * 
     */
    @JsonProperty("lossDetails5")
    public String getLossDetails5() {
        return lossDetails5;
    }

    /**
     * Previously not populated for Marine Claims. Now advised for all markets. Populated from the first 3 lines of descriptive narrative of loss.  Subsequent lines of text are advised in the Extended Loss Details LDL5 
     * 
     */
    @JsonProperty("lossDetails5")
    public void setLossDetails5(String lossDetails5) {
        this.lossDetails5 = lossDetails5;
    }

    /**
     * sender Reference
     * 
     */
    @JsonProperty("extendedLossDetailsParaRef")
    public String getExtendedLossDetailsParaRef() {
        return extendedLossDetailsParaRef;
    }

    /**
     * sender Reference
     * 
     */
    @JsonProperty("extendedLossDetailsParaRef")
    public void setExtendedLossDetailsParaRef(String extendedLossDetailsParaRef) {
        this.extendedLossDetailsParaRef = extendedLossDetailsParaRef;
    }

    /**
     * Reference Number
     * 
     */
    @JsonProperty("extendedLossDetails")
    public ExtendedLossDetailseObject getExtendedLossDetails() {
        return extendedLossDetails;
    }

    /**
     * Reference Number
     * 
     */
    @JsonProperty("extendedLossDetails")
    public void setExtendedLossDetails(ExtendedLossDetailseObject extendedLossDetails) {
        this.extendedLossDetails = extendedLossDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LossDetailseObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lossDetails1");
        sb.append('=');
        sb.append(((this.lossDetails1 == null)?"<null>":this.lossDetails1));
        sb.append(',');
        sb.append("lossDetails2");
        sb.append('=');
        sb.append(((this.lossDetails2 == null)?"<null>":this.lossDetails2));
        sb.append(',');
        sb.append("lossDetails3");
        sb.append('=');
        sb.append(((this.lossDetails3 == null)?"<null>":this.lossDetails3));
        sb.append(',');
        sb.append("lossDetails4");
        sb.append('=');
        sb.append(((this.lossDetails4 == null)?"<null>":this.lossDetails4));
        sb.append(',');
        sb.append("lossDetails5");
        sb.append('=');
        sb.append(((this.lossDetails5 == null)?"<null>":this.lossDetails5));
        sb.append(',');
        sb.append("extendedLossDetailsParaRef");
        sb.append('=');
        sb.append(((this.extendedLossDetailsParaRef == null)?"<null>":this.extendedLossDetailsParaRef));
        sb.append(',');
        sb.append("extendedLossDetails");
        sb.append('=');
        sb.append(((this.extendedLossDetails == null)?"<null>":this.extendedLossDetails));
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
        result = ((result* 31)+((this.lossDetails5 == null)? 0 :this.lossDetails5 .hashCode()));
        result = ((result* 31)+((this.lossDetails3 == null)? 0 :this.lossDetails3 .hashCode()));
        result = ((result* 31)+((this.lossDetails4 == null)? 0 :this.lossDetails4 .hashCode()));
        result = ((result* 31)+((this.lossDetails1 == null)? 0 :this.lossDetails1 .hashCode()));
        result = ((result* 31)+((this.lossDetails2 == null)? 0 :this.lossDetails2 .hashCode()));
        result = ((result* 31)+((this.extendedLossDetails == null)? 0 :this.extendedLossDetails.hashCode()));
        result = ((result* 31)+((this.extendedLossDetailsParaRef == null)? 0 :this.extendedLossDetailsParaRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LossDetailseObject) == false) {
            return false;
        }
        LossDetailseObject rhs = ((LossDetailseObject) other);
        return ((((((((this.lossDetails5 == rhs.lossDetails5)||((this.lossDetails5 != null)&&this.lossDetails5 .equals(rhs.lossDetails5)))&&((this.lossDetails3 == rhs.lossDetails3)||((this.lossDetails3 != null)&&this.lossDetails3 .equals(rhs.lossDetails3))))&&((this.lossDetails4 == rhs.lossDetails4)||((this.lossDetails4 != null)&&this.lossDetails4 .equals(rhs.lossDetails4))))&&((this.lossDetails1 == rhs.lossDetails1)||((this.lossDetails1 != null)&&this.lossDetails1 .equals(rhs.lossDetails1))))&&((this.lossDetails2 == rhs.lossDetails2)||((this.lossDetails2 != null)&&this.lossDetails2 .equals(rhs.lossDetails2))))&&((this.extendedLossDetails == rhs.extendedLossDetails)||((this.extendedLossDetails!= null)&&this.extendedLossDetails.equals(rhs.extendedLossDetails))))&&((this.extendedLossDetailsParaRef == rhs.extendedLossDetailsParaRef)||((this.extendedLossDetailsParaRef!= null)&&this.extendedLossDetailsParaRef.equals(rhs.extendedLossDetailsParaRef))));
    }

}
