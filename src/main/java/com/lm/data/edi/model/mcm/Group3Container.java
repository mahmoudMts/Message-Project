
package com.lm.data.edi.model.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gisDetails",
    "separatorDetails",
    "Group4Containers",
    "moaDetails",
    "cntDetails"
})
@AllArgsConstructor
@NoArgsConstructor
public class Group3Container {

    /**
     * General Indicator. GIS GENERAL INDICATOR  Refer EDI Message MCM Analysis Document TAB  Detail Record
     * (Required)
     * 
     */
    @JsonProperty("gisDetails")
    @JsonPropertyDescription("General Indicator. GIS GENERAL INDICATOR  Refer EDI Message MCM Analysis Document TAB  Detail Record")
    @Valid
    @NotNull
    private GisDetails gisDetails;
    /**
     * segment SEP. This segment acts as a separator between the GIS segments.Refer MCM Analysis doc Detail Record TAB
     * (Required)
     * 
     */
    @JsonProperty("separatorDetails")
    @JsonPropertyDescription("segment SEP. This segment acts as a separator between the GIS segments.Refer MCM Analysis doc Detail Record TAB")
    @Valid
    @NotNull
    private SeparatorDetails separatorDetails;
    /**
     * Group4 Containers
     * 
     */
    @JsonProperty("Group4Containers")
    @JsonPropertyDescription("Group4 Containers")
    @Size(max = 25)
    @Valid
    private List<Group4Container> group4Containers = new ArrayList<Group4Container>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("moaDetails")
    @Size(min = 1, max = 999)
    @Valid
    @NotNull
    private List<MoaDetails> moaDetails = new ArrayList<MoaDetails>();
    /**
     * CONTROL TOTALS. Refer EDI Message MCM Analysis Document TAB  Detail Record.
     * (Required)
     * 
     */
    @JsonProperty("cntDetails")
    @JsonPropertyDescription("CONTROL TOTALS. Refer EDI Message MCM Analysis Document TAB  Detail Record.")
    @Valid
    @NotNull
    private CntDetails cntDetails;

    /**
     * General Indicator. GIS GENERAL INDICATOR  Refer EDI Message MCM Analysis Document TAB  Detail Record
     * (Required)
     * 
     */
    @JsonProperty("gisDetails")
    public GisDetails getGisDetails() {
        return gisDetails;
    }

    /**
     * General Indicator. GIS GENERAL INDICATOR  Refer EDI Message MCM Analysis Document TAB  Detail Record
     * (Required)
     * 
     */
    @JsonProperty("gisDetails")
    public void setGisDetails(GisDetails gisDetails) {
        this.gisDetails = gisDetails;
    }

    /**
     * segment SEP. This segment acts as a separator between the GIS segments.Refer MCM Analysis doc Detail Record TAB
     * (Required)
     * 
     */
    @JsonProperty("separatorDetails")
    public SeparatorDetails getSeparatorDetails() {
        return separatorDetails;
    }

    /**
     * segment SEP. This segment acts as a separator between the GIS segments.Refer MCM Analysis doc Detail Record TAB
     * (Required)
     * 
     */
    @JsonProperty("separatorDetails")
    public void setSeparatorDetails(SeparatorDetails separatorDetails) {
        this.separatorDetails = separatorDetails;
    }

    /**
     * Group4 Containers
     * 
     */
    @JsonProperty("Group4Containers")
    public List<Group4Container> getGroup4Containers() {
        return group4Containers;
    }

    /**
     * Group4 Containers
     * 
     */
    @JsonProperty("Group4Containers")
    public void setGroup4Containers(List<Group4Container> group4Containers) {
        this.group4Containers = group4Containers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("moaDetails")
    public List<MoaDetails> getMoaDetails() {
        return moaDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("moaDetails")
    public void setMoaDetails(List<MoaDetails> moaDetails) {
        this.moaDetails = moaDetails;
    }

    /**
     * CONTROL TOTALS. Refer EDI Message MCM Analysis Document TAB  Detail Record.
     * (Required)
     * 
     */
    @JsonProperty("cntDetails")
    public CntDetails getCntDetails() {
        return cntDetails;
    }

    /**
     * CONTROL TOTALS. Refer EDI Message MCM Analysis Document TAB  Detail Record.
     * (Required)
     * 
     */
    @JsonProperty("cntDetails")
    public void setCntDetails(CntDetails cntDetails) {
        this.cntDetails = cntDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group3Container.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gisDetails");
        sb.append('=');
        sb.append(((this.gisDetails == null)?"<null>":this.gisDetails));
        sb.append(',');
        sb.append("separatorDetails");
        sb.append('=');
        sb.append(((this.separatorDetails == null)?"<null>":this.separatorDetails));
        sb.append(',');
        sb.append("group4Containers");
        sb.append('=');
        sb.append(((this.group4Containers == null)?"<null>":this.group4Containers));
        sb.append(',');
        sb.append("moaDetails");
        sb.append('=');
        sb.append(((this.moaDetails == null)?"<null>":this.moaDetails));
        sb.append(',');
        sb.append("cntDetails");
        sb.append('=');
        sb.append(((this.cntDetails == null)?"<null>":this.cntDetails));
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
        result = ((result* 31)+((this.cntDetails == null)? 0 :this.cntDetails.hashCode()));
        result = ((result* 31)+((this.separatorDetails == null)? 0 :this.separatorDetails.hashCode()));
        result = ((result* 31)+((this.gisDetails == null)? 0 :this.gisDetails.hashCode()));
        result = ((result* 31)+((this.group4Containers == null)? 0 :this.group4Containers.hashCode()));
        result = ((result* 31)+((this.moaDetails == null)? 0 :this.moaDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group3Container) == false) {
            return false;
        }
        Group3Container rhs = ((Group3Container) other);
        return ((((((this.cntDetails == rhs.cntDetails)||((this.cntDetails!= null)&&this.cntDetails.equals(rhs.cntDetails)))&&((this.separatorDetails == rhs.separatorDetails)||((this.separatorDetails!= null)&&this.separatorDetails.equals(rhs.separatorDetails))))&&((this.gisDetails == rhs.gisDetails)||((this.gisDetails!= null)&&this.gisDetails.equals(rhs.gisDetails))))&&((this.group4Containers == rhs.group4Containers)||((this.group4Containers!= null)&&this.group4Containers.equals(rhs.group4Containers))))&&((this.moaDetails == rhs.moaDetails)||((this.moaDetails!= null)&&this.moaDetails.equals(rhs.moaDetails))));
    }

}
