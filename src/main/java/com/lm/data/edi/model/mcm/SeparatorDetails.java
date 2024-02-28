
package com.lm.data.edi.model.mcm;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * segment SEP. This segment acts as a separator between the GIS segments.Refer MCM Analysis doc Detail Record TAB
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "segmentTag",
    "separatorId"
})
public class SeparatorDetails {

    /**
     * Mandatory.  SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    @JsonPropertyDescription("Mandatory.  SEGMENT TAG")
    @Size(max = 3)
    @NotNull
    private String segmentTag = "SEP";
    /**
     * Separator ID . SEPERATOR ID
     * (Required)
     * 
     */
    @JsonProperty("separatorId")
    @JsonPropertyDescription("Separator ID . SEPERATOR ID")
    @Size(max = 1)
    @NotNull
    private String separatorId = "1";

    /**
     * Mandatory.  SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public String getSegmentTag() {
        return segmentTag;
    }

    /**
     * Mandatory.  SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    /**
     * Separator ID . SEPERATOR ID
     * (Required)
     * 
     */
    @JsonProperty("separatorId")
    public String getSeparatorId() {
        return separatorId;
    }

    /**
     * Separator ID . SEPERATOR ID
     * (Required)
     * 
     */
    @JsonProperty("separatorId")
    public void setSeparatorId(String separatorId) {
        this.separatorId = separatorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SeparatorDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("segmentTag");
        sb.append('=');
        sb.append(((this.segmentTag == null)?"<null>":this.segmentTag));
        sb.append(',');
        sb.append("separatorId");
        sb.append('=');
        sb.append(((this.separatorId == null)?"<null>":this.separatorId));
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
        result = ((result* 31)+((this.separatorId == null)? 0 :this.separatorId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeparatorDetails) == false) {
            return false;
        }
        SeparatorDetails rhs = ((SeparatorDetails) other);
        return (((this.segmentTag == rhs.segmentTag)||((this.segmentTag!= null)&&this.segmentTag.equals(rhs.segmentTag)))&&((this.separatorId == rhs.separatorId)||((this.separatorId!= null)&&this.separatorId.equals(rhs.separatorId))));
    }

}
