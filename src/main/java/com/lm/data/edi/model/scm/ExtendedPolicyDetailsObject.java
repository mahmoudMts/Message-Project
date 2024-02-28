
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * Reference Number
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "extendedPolicyDetails1",
    "extendedPolicyDetails2",
    "extendedPolicyDetails3",
    "extendedPolicyDetails4",
    "extendedPolicyDetails5",
    "extendedPolicyDetailsParaRef"
})
public class ExtendedPolicyDetailsObject {

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD---1
     * 
     */
    @JsonProperty("extendedPolicyDetails1")
    @JsonPropertyDescription("Reference allocated to a set of 5 lines of Extended Policy Details EPD---1")
    @Size(max = 70)
    private String extendedPolicyDetails1;
    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--2
     * 
     */
    @JsonProperty("extendedPolicyDetails2")
    @JsonPropertyDescription("Reference allocated to a set of 5 lines of Extended Policy Details EPD--2")
    @Size(max = 70)
    private String extendedPolicyDetails2;
    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--3
     * 
     */
    @JsonProperty("extendedPolicyDetails3")
    @JsonPropertyDescription("Reference allocated to a set of 5 lines of Extended Policy Details EPD--3")
    @Size(max = 70)
    private String extendedPolicyDetails3;
    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--4
     * 
     */
    @JsonProperty("extendedPolicyDetails4")
    @JsonPropertyDescription("Reference allocated to a set of 5 lines of Extended Policy Details EPD--4")
    @Size(max = 70)
    private String extendedPolicyDetails4;
    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--5
     * 
     */
    @JsonProperty("extendedPolicyDetails5")
    @JsonPropertyDescription("Reference allocated to a set of 5 lines of Extended Policy Details EPD--5")
    @Size(max = 70)
    private String extendedPolicyDetails5;
    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details. First character indicates the page, second character the 'paragraph' within that page. See Note 11 Appendix F EPD
     * 
     */
    @JsonProperty("extendedPolicyDetailsParaRef")
    @JsonPropertyDescription("Reference allocated to a set of 5 lines of Extended Policy Details. First character indicates the page, second character the 'paragraph' within that page. See Note 11 Appendix F EPD")
    @Size(max = 2)
    private String extendedPolicyDetailsParaRef;

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD---1
     * 
     */
    @JsonProperty("extendedPolicyDetails1")
    public String getExtendedPolicyDetails1() {
        return extendedPolicyDetails1;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD---1
     * 
     */
    @JsonProperty("extendedPolicyDetails1")
    public void setExtendedPolicyDetails1(String extendedPolicyDetails1) {
        this.extendedPolicyDetails1 = extendedPolicyDetails1;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--2
     * 
     */
    @JsonProperty("extendedPolicyDetails2")
    public String getExtendedPolicyDetails2() {
        return extendedPolicyDetails2;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--2
     * 
     */
    @JsonProperty("extendedPolicyDetails2")
    public void setExtendedPolicyDetails2(String extendedPolicyDetails2) {
        this.extendedPolicyDetails2 = extendedPolicyDetails2;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--3
     * 
     */
    @JsonProperty("extendedPolicyDetails3")
    public String getExtendedPolicyDetails3() {
        return extendedPolicyDetails3;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--3
     * 
     */
    @JsonProperty("extendedPolicyDetails3")
    public void setExtendedPolicyDetails3(String extendedPolicyDetails3) {
        this.extendedPolicyDetails3 = extendedPolicyDetails3;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--4
     * 
     */
    @JsonProperty("extendedPolicyDetails4")
    public String getExtendedPolicyDetails4() {
        return extendedPolicyDetails4;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--4
     * 
     */
    @JsonProperty("extendedPolicyDetails4")
    public void setExtendedPolicyDetails4(String extendedPolicyDetails4) {
        this.extendedPolicyDetails4 = extendedPolicyDetails4;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--5
     * 
     */
    @JsonProperty("extendedPolicyDetails5")
    public String getExtendedPolicyDetails5() {
        return extendedPolicyDetails5;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details EPD--5
     * 
     */
    @JsonProperty("extendedPolicyDetails5")
    public void setExtendedPolicyDetails5(String extendedPolicyDetails5) {
        this.extendedPolicyDetails5 = extendedPolicyDetails5;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details. First character indicates the page, second character the 'paragraph' within that page. See Note 11 Appendix F EPD
     * 
     */
    @JsonProperty("extendedPolicyDetailsParaRef")
    public String getExtendedPolicyDetailsParaRef() {
        return extendedPolicyDetailsParaRef;
    }

    /**
     * Reference allocated to a set of 5 lines of Extended Policy Details. First character indicates the page, second character the 'paragraph' within that page. See Note 11 Appendix F EPD
     * 
     */
    @JsonProperty("extendedPolicyDetailsParaRef")
    public void setExtendedPolicyDetailsParaRef(String extendedPolicyDetailsParaRef) {
        this.extendedPolicyDetailsParaRef = extendedPolicyDetailsParaRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtendedPolicyDetailsObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("extendedPolicyDetails1");
        sb.append('=');
        sb.append(((this.extendedPolicyDetails1 == null)?"<null>":this.extendedPolicyDetails1));
        sb.append(',');
        sb.append("extendedPolicyDetails2");
        sb.append('=');
        sb.append(((this.extendedPolicyDetails2 == null)?"<null>":this.extendedPolicyDetails2));
        sb.append(',');
        sb.append("extendedPolicyDetails3");
        sb.append('=');
        sb.append(((this.extendedPolicyDetails3 == null)?"<null>":this.extendedPolicyDetails3));
        sb.append(',');
        sb.append("extendedPolicyDetails4");
        sb.append('=');
        sb.append(((this.extendedPolicyDetails4 == null)?"<null>":this.extendedPolicyDetails4));
        sb.append(',');
        sb.append("extendedPolicyDetails5");
        sb.append('=');
        sb.append(((this.extendedPolicyDetails5 == null)?"<null>":this.extendedPolicyDetails5));
        sb.append(',');
        sb.append("extendedPolicyDetailsParaRef");
        sb.append('=');
        sb.append(((this.extendedPolicyDetailsParaRef == null)?"<null>":this.extendedPolicyDetailsParaRef));
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
        result = ((result* 31)+((this.extendedPolicyDetails3 == null)? 0 :this.extendedPolicyDetails3 .hashCode()));
        result = ((result* 31)+((this.extendedPolicyDetails4 == null)? 0 :this.extendedPolicyDetails4 .hashCode()));
        result = ((result* 31)+((this.extendedPolicyDetails5 == null)? 0 :this.extendedPolicyDetails5 .hashCode()));
        result = ((result* 31)+((this.extendedPolicyDetails1 == null)? 0 :this.extendedPolicyDetails1 .hashCode()));
        result = ((result* 31)+((this.extendedPolicyDetailsParaRef == null)? 0 :this.extendedPolicyDetailsParaRef.hashCode()));
        result = ((result* 31)+((this.extendedPolicyDetails2 == null)? 0 :this.extendedPolicyDetails2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedPolicyDetailsObject) == false) {
            return false;
        }
        ExtendedPolicyDetailsObject rhs = ((ExtendedPolicyDetailsObject) other);
        return (((((((this.extendedPolicyDetails3 == rhs.extendedPolicyDetails3)||((this.extendedPolicyDetails3 != null)&&this.extendedPolicyDetails3 .equals(rhs.extendedPolicyDetails3)))&&((this.extendedPolicyDetails4 == rhs.extendedPolicyDetails4)||((this.extendedPolicyDetails4 != null)&&this.extendedPolicyDetails4 .equals(rhs.extendedPolicyDetails4))))&&((this.extendedPolicyDetails5 == rhs.extendedPolicyDetails5)||((this.extendedPolicyDetails5 != null)&&this.extendedPolicyDetails5 .equals(rhs.extendedPolicyDetails5))))&&((this.extendedPolicyDetails1 == rhs.extendedPolicyDetails1)||((this.extendedPolicyDetails1 != null)&&this.extendedPolicyDetails1 .equals(rhs.extendedPolicyDetails1))))&&((this.extendedPolicyDetailsParaRef == rhs.extendedPolicyDetailsParaRef)||((this.extendedPolicyDetailsParaRef!= null)&&this.extendedPolicyDetailsParaRef.equals(rhs.extendedPolicyDetailsParaRef))))&&((this.extendedPolicyDetails2 == rhs.extendedPolicyDetails2)||((this.extendedPolicyDetails2 != null)&&this.extendedPolicyDetails2 .equals(rhs.extendedPolicyDetails2))));
    }

}
