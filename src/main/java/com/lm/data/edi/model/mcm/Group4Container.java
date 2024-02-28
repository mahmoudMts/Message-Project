
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
    "moaDetailsArray",
    "cntDetails"
})
@AllArgsConstructor
@NoArgsConstructor
public class Group4Container {

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
     * 
     * (Required)
     * 
     */
    @JsonProperty("moaDetailsArray")
    @Size(min = 1, max = 999)
    @Valid
    @NotNull
    private List<MoaDetails> moaDetailsArray = new ArrayList<MoaDetails>();
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("moaDetailsArray")
    public List<MoaDetails> getMoaDetailsArray() {
        return moaDetailsArray;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("moaDetailsArray")
    public void setMoaDetailsArray(List<MoaDetails> moaDetailsArray) {
        this.moaDetailsArray = moaDetailsArray;
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
        sb.append(Group4Container.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gisDetails");
        sb.append('=');
        sb.append(((this.gisDetails == null)?"<null>":this.gisDetails));
        sb.append(',');
        sb.append("moaDetailsArray");
        sb.append('=');
        sb.append(((this.moaDetailsArray == null)?"<null>":this.moaDetailsArray));
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
        result = ((result* 31)+((this.moaDetailsArray == null)? 0 :this.moaDetailsArray.hashCode()));
        result = ((result* 31)+((this.cntDetails == null)? 0 :this.cntDetails.hashCode()));
        result = ((result* 31)+((this.gisDetails == null)? 0 :this.gisDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group4Container) == false) {
            return false;
        }
        Group4Container rhs = ((Group4Container) other);
        return ((((this.moaDetailsArray == rhs.moaDetailsArray)||((this.moaDetailsArray!= null)&&this.moaDetailsArray.equals(rhs.moaDetailsArray)))&&((this.cntDetails == rhs.cntDetails)||((this.cntDetails!= null)&&this.cntDetails.equals(rhs.cntDetails))))&&((this.gisDetails == rhs.gisDetails)||((this.gisDetails!= null)&&this.gisDetails.equals(rhs.gisDetails))));
    }

}
