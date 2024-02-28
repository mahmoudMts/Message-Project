
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * Conditional. Loss details. a two line descriptive narrative of the loss.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionalDetails1",
    "transactionalDetails2",
    "transactionalDetails3",
    "transactionalDetails4",
    "transactionalDetails5"
})
public class TransactionalDetailsObject {

    /**
     * Loss details. a two line descriptive narrative of the loss. 1
     * 
     */
    @JsonProperty("transactionalDetails1")
    @JsonPropertyDescription("Loss details. a two line descriptive narrative of the loss. 1")
    @Size(max = 70)
    private String transactionalDetails1;
    /**
     * Loss details. a two line descriptive narrative of the loss. 2
     * 
     */
    @JsonProperty("transactionalDetails2")
    @JsonPropertyDescription("Loss details. a two line descriptive narrative of the loss. 2")
    @Size(max = 70)
    private String transactionalDetails2;
    /**
     * Loss details. a two line descriptive narrative of the loss. 3
     * 
     */
    @JsonProperty("transactionalDetails3")
    @JsonPropertyDescription("Loss details. a two line descriptive narrative of the loss. 3")
    @Size(max = 70)
    private String transactionalDetails3;
    /**
     * Loss details. a two line descriptive narrative of the loss. 4
     * 
     */
    @JsonProperty("transactionalDetails4")
    @JsonPropertyDescription("Loss details. a two line descriptive narrative of the loss. 4")
    @Size(max = 70)
    private String transactionalDetails4;
    /**
     * Loss details. a two line descriptive narrative of the loss. 5
     * 
     */
    @JsonProperty("transactionalDetails5")
    @JsonPropertyDescription("Loss details. a two line descriptive narrative of the loss. 5")
    @Size(max = 70)
    private String transactionalDetails5;

    /**
     * Loss details. a two line descriptive narrative of the loss. 1
     * 
     */
    @JsonProperty("transactionalDetails1")
    public String getTransactionalDetails1() {
        return transactionalDetails1;
    }

    /**
     * Loss details. a two line descriptive narrative of the loss. 1
     * 
     */
    @JsonProperty("transactionalDetails1")
    public void setTransactionalDetails1(String transactionalDetails1) {
        this.transactionalDetails1 = transactionalDetails1;
    }

    /**
     * Loss details. a two line descriptive narrative of the loss. 2
     * 
     */
    @JsonProperty("transactionalDetails2")
    public String getTransactionalDetails2() {
        return transactionalDetails2;
    }

    /**
     * Loss details. a two line descriptive narrative of the loss. 2
     * 
     */
    @JsonProperty("transactionalDetails2")
    public void setTransactionalDetails2(String transactionalDetails2) {
        this.transactionalDetails2 = transactionalDetails2;
    }

    /**
     * Loss details. a two line descriptive narrative of the loss. 3
     * 
     */
    @JsonProperty("transactionalDetails3")
    public String getTransactionalDetails3() {
        return transactionalDetails3;
    }

    /**
     * Loss details. a two line descriptive narrative of the loss. 3
     * 
     */
    @JsonProperty("transactionalDetails3")
    public void setTransactionalDetails3(String transactionalDetails3) {
        this.transactionalDetails3 = transactionalDetails3;
    }

    /**
     * Loss details. a two line descriptive narrative of the loss. 4
     * 
     */
    @JsonProperty("transactionalDetails4")
    public String getTransactionalDetails4() {
        return transactionalDetails4;
    }

    /**
     * Loss details. a two line descriptive narrative of the loss. 4
     * 
     */
    @JsonProperty("transactionalDetails4")
    public void setTransactionalDetails4(String transactionalDetails4) {
        this.transactionalDetails4 = transactionalDetails4;
    }

    /**
     * Loss details. a two line descriptive narrative of the loss. 5
     * 
     */
    @JsonProperty("transactionalDetails5")
    public String getTransactionalDetails5() {
        return transactionalDetails5;
    }

    /**
     * Loss details. a two line descriptive narrative of the loss. 5
     * 
     */
    @JsonProperty("transactionalDetails5")
    public void setTransactionalDetails5(String transactionalDetails5) {
        this.transactionalDetails5 = transactionalDetails5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionalDetailsObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transactionalDetails1");
        sb.append('=');
        sb.append(((this.transactionalDetails1 == null)?"<null>":this.transactionalDetails1));
        sb.append(',');
        sb.append("transactionalDetails2");
        sb.append('=');
        sb.append(((this.transactionalDetails2 == null)?"<null>":this.transactionalDetails2));
        sb.append(',');
        sb.append("transactionalDetails3");
        sb.append('=');
        sb.append(((this.transactionalDetails3 == null)?"<null>":this.transactionalDetails3));
        sb.append(',');
        sb.append("transactionalDetails4");
        sb.append('=');
        sb.append(((this.transactionalDetails4 == null)?"<null>":this.transactionalDetails4));
        sb.append(',');
        sb.append("transactionalDetails5");
        sb.append('=');
        sb.append(((this.transactionalDetails5 == null)?"<null>":this.transactionalDetails5));
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
        result = ((result* 31)+((this.transactionalDetails5 == null)? 0 :this.transactionalDetails5 .hashCode()));
        result = ((result* 31)+((this.transactionalDetails4 == null)? 0 :this.transactionalDetails4 .hashCode()));
        result = ((result* 31)+((this.transactionalDetails3 == null)? 0 :this.transactionalDetails3 .hashCode()));
        result = ((result* 31)+((this.transactionalDetails2 == null)? 0 :this.transactionalDetails2 .hashCode()));
        result = ((result* 31)+((this.transactionalDetails1 == null)? 0 :this.transactionalDetails1 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionalDetailsObject) == false) {
            return false;
        }
        TransactionalDetailsObject rhs = ((TransactionalDetailsObject) other);
        return ((((((this.transactionalDetails5 == rhs.transactionalDetails5)||((this.transactionalDetails5 != null)&&this.transactionalDetails5 .equals(rhs.transactionalDetails5)))&&((this.transactionalDetails4 == rhs.transactionalDetails4)||((this.transactionalDetails4 != null)&&this.transactionalDetails4 .equals(rhs.transactionalDetails4))))&&((this.transactionalDetails3 == rhs.transactionalDetails3)||((this.transactionalDetails3 != null)&&this.transactionalDetails3 .equals(rhs.transactionalDetails3))))&&((this.transactionalDetails2 == rhs.transactionalDetails2)||((this.transactionalDetails2 != null)&&this.transactionalDetails2 .equals(rhs.transactionalDetails2))))&&((this.transactionalDetails1 == rhs.transactionalDetails1)||((this.transactionalDetails1 != null)&&this.transactionalDetails1 .equals(rhs.transactionalDetails1))));
    }

}
