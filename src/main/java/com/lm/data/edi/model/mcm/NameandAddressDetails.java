
package com.lm.data.edi.model.mcm;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Name and Address . NAD
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "segmentTag",
    "nameAndAddressQualifier",
    "partyIdentificationCoded"
})
public class NameandAddressDetails {

    /**
     * A unique tag for NameandAddressDetails . SEGMENT TAG.
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    @JsonPropertyDescription("A unique tag for NameandAddressDetails . SEGMENT TAG.")
    @Size(max = 3)
    @NotNull
    private String segmentTag = "NAD";
    /**
     * QUALIFIER.
     * (Required)
     * 
     */
    @JsonProperty("nameAndAddressQualifier")
    @JsonPropertyDescription("QUALIFIER.")
    @Size(max = 3)
    @NotNull
    private String nameAndAddressQualifier = "SYN";
    /**
     * Right justified. PARTY IDENTIFICATION coded. The Lloyd's syndicate number is advised. Syndicate number is shown with leading blanks.
     * (Required)
     * 
     */
    @JsonProperty("partyIdentificationCoded")
    @JsonPropertyDescription("Right justified. PARTY IDENTIFICATION coded. The Lloyd's syndicate number is advised. Syndicate number is shown with leading blanks.")
    @Size(max = 4)
    @NotNull
    private String partyIdentificationCoded;

    /**
     * A unique tag for NameandAddressDetails . SEGMENT TAG.
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public String getSegmentTag() {
        return segmentTag;
    }

    /**
     * A unique tag for NameandAddressDetails . SEGMENT TAG.
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    /**
     * QUALIFIER.
     * (Required)
     * 
     */
    @JsonProperty("nameAndAddressQualifier")
    public String getNameAndAddressQualifier() {
        return nameAndAddressQualifier;
    }

    /**
     * QUALIFIER.
     * (Required)
     * 
     */
    @JsonProperty("nameAndAddressQualifier")
    public void setNameAndAddressQualifier(String nameAndAddressQualifier) {
        this.nameAndAddressQualifier = nameAndAddressQualifier;
    }

    /**
     * Right justified. PARTY IDENTIFICATION coded. The Lloyd's syndicate number is advised. Syndicate number is shown with leading blanks.
     * (Required)
     * 
     */
    @JsonProperty("partyIdentificationCoded")
    public String getPartyIdentificationCoded() {
        return partyIdentificationCoded;
    }

    /**
     * Right justified. PARTY IDENTIFICATION coded. The Lloyd's syndicate number is advised. Syndicate number is shown with leading blanks.
     * (Required)
     * 
     */
    @JsonProperty("partyIdentificationCoded")
    public void setPartyIdentificationCoded(String partyIdentificationCoded) {
        this.partyIdentificationCoded = partyIdentificationCoded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NameandAddressDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("segmentTag");
        sb.append('=');
        sb.append(((this.segmentTag == null)?"<null>":this.segmentTag));
        sb.append(',');
        sb.append("nameAndAddressQualifier");
        sb.append('=');
        sb.append(((this.nameAndAddressQualifier == null)?"<null>":this.nameAndAddressQualifier));
        sb.append(',');
        sb.append("partyIdentificationCoded");
        sb.append('=');
        sb.append(((this.partyIdentificationCoded == null)?"<null>":this.partyIdentificationCoded));
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
        result = ((result* 31)+((this.segmentTag == null)? 0 :this.segmentTag.hashCode()));
        result = ((result* 31)+((this.partyIdentificationCoded == null)? 0 :this.partyIdentificationCoded.hashCode()));
        result = ((result* 31)+((this.nameAndAddressQualifier == null)? 0 :this.nameAndAddressQualifier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NameandAddressDetails) == false) {
            return false;
        }
        NameandAddressDetails rhs = ((NameandAddressDetails) other);
        return ((((this.segmentTag == rhs.segmentTag)||((this.segmentTag!= null)&&this.segmentTag.equals(rhs.segmentTag)))&&((this.partyIdentificationCoded == rhs.partyIdentificationCoded)||((this.partyIdentificationCoded!= null)&&this.partyIdentificationCoded.equals(rhs.partyIdentificationCoded))))&&((this.nameAndAddressQualifier == rhs.nameAndAddressQualifier)||((this.nameAndAddressQualifier!= null)&&this.nameAndAddressQualifier.equals(rhs.nameAndAddressQualifier))));
    }

}
