
package com.lm.data.edi.model.mcm;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BGM SEGMENT .Refer EDI Message MCM Analysis Document TAB  BGM LC0(Beginning of msg seg)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "segmentTag",
    "messageName",
    "userNumber"
})
public class BgmDetails {

    /**
     * Mandatory. Segment . SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    @JsonPropertyDescription("Mandatory. Segment . SEGMENT TAG")
    @Size(max = 3)
    @NotNull
    private String segmentTag = "BGM";
    /**
     * MESSAGE NAME .
     * (Required)
     * 
     */
    @JsonProperty("messageName")
    @JsonPropertyDescription("MESSAGE NAME .")
    @Size(max = 3)
    @NotNull
    private String messageName = "CON";
    /**
     * USER NUMBER . Refer EDI Message MCM Analysis Document TAB BGM LC0 Beginning of msg seg
     * (Required)
     * 
     */
    @JsonProperty("userNumber")
    @JsonPropertyDescription("USER NUMBER . Refer EDI Message MCM Analysis Document TAB BGM LC0 Beginning of msg seg")
    @Size(max = 4)
    @NotNull
    private String userNumber;

    /**
     * Mandatory. Segment . SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public String getSegmentTag() {
        return segmentTag;
    }

    /**
     * Mandatory. Segment . SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    /**
     * MESSAGE NAME .
     * (Required)
     * 
     */
    @JsonProperty("messageName")
    public String getMessageName() {
        return messageName;
    }

    /**
     * MESSAGE NAME .
     * (Required)
     * 
     */
    @JsonProperty("messageName")
    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    /**
     * USER NUMBER . Refer EDI Message MCM Analysis Document TAB BGM LC0 Beginning of msg seg
     * (Required)
     * 
     */
    @JsonProperty("userNumber")
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * USER NUMBER . Refer EDI Message MCM Analysis Document TAB BGM LC0 Beginning of msg seg
     * (Required)
     * 
     */
    @JsonProperty("userNumber")
    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BgmDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("segmentTag");
        sb.append('=');
        sb.append(((this.segmentTag == null)?"<null>":this.segmentTag));
        sb.append(',');
        sb.append("messageName");
        sb.append('=');
        sb.append(((this.messageName == null)?"<null>":this.messageName));
        sb.append(',');
        sb.append("userNumber");
        sb.append('=');
        sb.append(((this.userNumber == null)?"<null>":this.userNumber));
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
        result = ((result* 31)+((this.messageName == null)? 0 :this.messageName.hashCode()));
        result = ((result* 31)+((this.segmentTag == null)? 0 :this.segmentTag.hashCode()));
        result = ((result* 31)+((this.userNumber == null)? 0 :this.userNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BgmDetails) == false) {
            return false;
        }
        BgmDetails rhs = ((BgmDetails) other);
        return ((((this.messageName == rhs.messageName)||((this.messageName!= null)&&this.messageName.equals(rhs.messageName)))&&((this.segmentTag == rhs.segmentTag)||((this.segmentTag!= null)&&this.segmentTag.equals(rhs.segmentTag))))&&((this.userNumber == rhs.userNumber)||((this.userNumber!= null)&&this.userNumber.equals(rhs.userNumber))));
    }

}
