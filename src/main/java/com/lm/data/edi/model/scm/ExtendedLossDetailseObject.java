
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;
import javax.validation.constraints.Size;


/**
 * Reference Number
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "extendedLossDetails1",
    "extendedLossDetails2",
    "extendedLossDetails3",
    "extendedLossDetails4",
    "extendedLossDetails5",
    "extendedPolicyDetails"
})
public class ExtendedLossDetailseObject {

    /**
     * Reference Number -1
     * 
     */
    @JsonProperty("extendedLossDetails1")
    @JsonPropertyDescription("Reference Number -1")
    @Size(max = 70)
    private String extendedLossDetails1;
    /**
     * Reference Number -2
     * 
     */
    @JsonProperty("extendedLossDetails2")
    @JsonPropertyDescription("Reference Number -2")
    @Size(max = 70)
    private String extendedLossDetails2;
    /**
     * Reference Number --3
     * 
     */
    @JsonProperty("extendedLossDetails3")
    @JsonPropertyDescription("Reference Number --3")
    @Size(max = 70)
    private String extendedLossDetails3;
    /**
     * Reference Number--4
     * 
     */
    @JsonProperty("extendedLossDetails4")
    @JsonPropertyDescription("Reference Number--4")
    @Size(max = 70)
    private String extendedLossDetails4;
    /**
     * Reference Number--5
     * 
     */
    @JsonProperty("extendedLossDetails5")
    @JsonPropertyDescription("Reference Number--5")
    @Size(max = 70)
    private String extendedLossDetails5;
    /**
     * Reference Number
     * 
     */
    @JsonProperty("extendedPolicyDetails")
    @JsonPropertyDescription("Reference Number")
    @Valid
    private ExtendedPolicyDetailsObject extendedPolicyDetails;

    /**
     * Reference Number -1
     * 
     */
    @JsonProperty("extendedLossDetails1")
    public String getExtendedLossDetails1() {
        return extendedLossDetails1;
    }

    /**
     * Reference Number -1
     * 
     */
    @JsonProperty("extendedLossDetails1")
    public void setExtendedLossDetails1(String extendedLossDetails1) {
        this.extendedLossDetails1 = extendedLossDetails1;
    }

    /**
     * Reference Number -2
     * 
     */
    @JsonProperty("extendedLossDetails2")
    public String getExtendedLossDetails2() {
        return extendedLossDetails2;
    }

    /**
     * Reference Number -2
     * 
     */
    @JsonProperty("extendedLossDetails2")
    public void setExtendedLossDetails2(String extendedLossDetails2) {
        this.extendedLossDetails2 = extendedLossDetails2;
    }

    /**
     * Reference Number --3
     * 
     */
    @JsonProperty("extendedLossDetails3")
    public String getExtendedLossDetails3() {
        return extendedLossDetails3;
    }

    /**
     * Reference Number --3
     * 
     */
    @JsonProperty("extendedLossDetails3")
    public void setExtendedLossDetails3(String extendedLossDetails3) {
        this.extendedLossDetails3 = extendedLossDetails3;
    }

    /**
     * Reference Number--4
     * 
     */
    @JsonProperty("extendedLossDetails4")
    public String getExtendedLossDetails4() {
        return extendedLossDetails4;
    }

    /**
     * Reference Number--4
     * 
     */
    @JsonProperty("extendedLossDetails4")
    public void setExtendedLossDetails4(String extendedLossDetails4) {
        this.extendedLossDetails4 = extendedLossDetails4;
    }

    /**
     * Reference Number--5
     * 
     */
    @JsonProperty("extendedLossDetails5")
    public String getExtendedLossDetails5() {
        return extendedLossDetails5;
    }

    /**
     * Reference Number--5
     * 
     */
    @JsonProperty("extendedLossDetails5")
    public void setExtendedLossDetails5(String extendedLossDetails5) {
        this.extendedLossDetails5 = extendedLossDetails5;
    }

    /**
     * Reference Number
     * 
     */
    @JsonProperty("extendedPolicyDetails")
    public ExtendedPolicyDetailsObject getExtendedPolicyDetails() {
        return extendedPolicyDetails;
    }

    /**
     * Reference Number
     * 
     */
    @JsonProperty("extendedPolicyDetails")
    public void setExtendedPolicyDetails(ExtendedPolicyDetailsObject extendedPolicyDetails) {
        this.extendedPolicyDetails = extendedPolicyDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtendedLossDetailseObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("extendedLossDetails1");
        sb.append('=');
        sb.append(((this.extendedLossDetails1 == null)?"<null>":this.extendedLossDetails1));
        sb.append(',');
        sb.append("extendedLossDetails2");
        sb.append('=');
        sb.append(((this.extendedLossDetails2 == null)?"<null>":this.extendedLossDetails2));
        sb.append(',');
        sb.append("extendedLossDetails3");
        sb.append('=');
        sb.append(((this.extendedLossDetails3 == null)?"<null>":this.extendedLossDetails3));
        sb.append(',');
        sb.append("extendedLossDetails4");
        sb.append('=');
        sb.append(((this.extendedLossDetails4 == null)?"<null>":this.extendedLossDetails4));
        sb.append(',');
        sb.append("extendedLossDetails5");
        sb.append('=');
        sb.append(((this.extendedLossDetails5 == null)?"<null>":this.extendedLossDetails5));
        sb.append(',');
        sb.append("extendedPolicyDetails");
        sb.append('=');
        sb.append(((this.extendedPolicyDetails == null)?"<null>":this.extendedPolicyDetails));
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
        result = ((result* 31)+((this.extendedLossDetails1 == null)? 0 :this.extendedLossDetails1 .hashCode()));
        result = ((result* 31)+((this.extendedLossDetails4 == null)? 0 :this.extendedLossDetails4 .hashCode()));
        result = ((result* 31)+((this.extendedLossDetails5 == null)? 0 :this.extendedLossDetails5 .hashCode()));
        result = ((result* 31)+((this.extendedLossDetails2 == null)? 0 :this.extendedLossDetails2 .hashCode()));
        result = ((result* 31)+((this.extendedLossDetails3 == null)? 0 :this.extendedLossDetails3 .hashCode()));
        result = ((result* 31)+((this.extendedPolicyDetails == null)? 0 :this.extendedPolicyDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedLossDetailseObject) == false) {
            return false;
        }
        ExtendedLossDetailseObject rhs = ((ExtendedLossDetailseObject) other);
        return (((((((this.extendedLossDetails1 == rhs.extendedLossDetails1)||((this.extendedLossDetails1 != null)&&this.extendedLossDetails1 .equals(rhs.extendedLossDetails1)))&&((this.extendedLossDetails4 == rhs.extendedLossDetails4)||((this.extendedLossDetails4 != null)&&this.extendedLossDetails4 .equals(rhs.extendedLossDetails4))))&&((this.extendedLossDetails5 == rhs.extendedLossDetails5)||((this.extendedLossDetails5 != null)&&this.extendedLossDetails5 .equals(rhs.extendedLossDetails5))))&&((this.extendedLossDetails2 == rhs.extendedLossDetails2)||((this.extendedLossDetails2 != null)&&this.extendedLossDetails2 .equals(rhs.extendedLossDetails2))))&&((this.extendedLossDetails3 == rhs.extendedLossDetails3)||((this.extendedLossDetails3 != null)&&this.extendedLossDetails3 .equals(rhs.extendedLossDetails3))))&&((this.extendedPolicyDetails == rhs.extendedPolicyDetails)||((this.extendedPolicyDetails!= null)&&this.extendedPolicyDetails.equals(rhs.extendedPolicyDetails))));
    }

}
