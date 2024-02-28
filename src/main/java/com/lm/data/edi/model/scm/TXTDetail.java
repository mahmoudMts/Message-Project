
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Size;


/**
 * A segment TXT Details TXT-A
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lossDateNarrative",
    "vesselAircraftConveyance",
    "perils",
    "interest",
    "principalInsured",
    "limitsInsValue",
    "dateClaimMadeNarrative",
    "location",
    "lossLocation"
})
public class TXTDetail {

    /**
     * Description of when the loss occurred when not available in a date format DLN
     * 
     */
    @JsonProperty("lossDateNarrative")
    @JsonPropertyDescription("Description of when the loss occurred when not available in a date format DLN")
    @Size(max = 40)
    private String lossDateNarrative;
    /**
     * VACName of Vessel/Aircraft or description of Conveyance involved in the claim VAC
     * 
     */
    @JsonProperty("vesselAircraftConveyance")
    @JsonPropertyDescription("VACName of Vessel/Aircraft or description of Conveyance involved in the claim VAC")
    @Size(max = 50)
    private String vesselAircraftConveyance;
    /**
     * Description of the events or perils against which the interest is insured.
     * 
     */
    @JsonProperty("perils")
    @JsonPropertyDescription("Description of the events or perils against which the interest is insured.")
    @Size(max = 70)
    private String perils;
    /**
     * Description of an item, or the interest in an Item covered by the insurance. Previously populated for Marine Claims only. May now be advised for all Markets. May be advised in EPD.
     * 
     */
    @JsonProperty("interest")
    @JsonPropertyDescription("Description of an item, or the interest in an Item covered by the insurance. Previously populated for Marine Claims only. May now be advised for all Markets. May be advised in EPD.")
    @Size(max = 70)
    private String interest;
    /**
     * Populated for all claim advices and re-advices from one of four fields in the following hierarchy. If Reinsured is populated then this will be used. If Insured is populated then this will be used. If Coverholder is populated then this will be used. If Original Insured is populated then this will be used. Will also be populated in EPD.
     * 
     */
    @JsonProperty("principalInsured")
    @JsonPropertyDescription("Populated for all claim advices and re-advices from one of four fields in the following hierarchy. If Reinsured is populated then this will be used. If Insured is populated then this will be used. If Coverholder is populated then this will be used. If Original Insured is populated then this will be used. Will also be populated in EPD.")
    @Size(max = 50)
    private String principalInsured;
    /**
     * Brief details of the value of the insured interest/limits of liability and excess which applies to the claim. Value may be spaces. Previously populated for Marine Claims only. May now be advised for all Markets. May also be advised in EPD
     * 
     */
    @JsonProperty("limitsInsValue")
    @JsonPropertyDescription("Brief details of the value of the insured interest/limits of liability and excess which applies to the claim. Value may be spaces. Previously populated for Marine Claims only. May now be advised for all Markets. May also be advised in EPD")
    @Size(max = 32)
    private String limitsInsValue;
    /**
     * Description of the events or perils against which the interest is insured.
     * 
     */
    @JsonProperty("dateClaimMadeNarrative")
    @JsonPropertyDescription("Description of the events or perils against which the interest is insured.")
    @Size(max = 40)
    private String dateClaimMadeNarrative;
    /**
     * For a claim entry, the description of situation of interest or journey/voyage over which interest is insured. Previously populated for Marine Claims only. May now be advised for all Markets.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("For a claim entry, the description of situation of interest or journey/voyage over which interest is insured. Previously populated for Marine Claims only. May now be advised for all Markets.")
    @Size(max = 70)
    private String location;
    /**
     * The location of the loss.
     * 
     */
    @JsonProperty("lossLocation")
    @JsonPropertyDescription("The location of the loss.")
    @Size(max = 50)
    private String lossLocation;

    /**
     * Description of when the loss occurred when not available in a date format DLN
     * 
     */
    @JsonProperty("lossDateNarrative")
    public String getLossDateNarrative() {
        return lossDateNarrative;
    }

    /**
     * Description of when the loss occurred when not available in a date format DLN
     * 
     */
    @JsonProperty("lossDateNarrative")
    public void setLossDateNarrative(String lossDateNarrative) {
        this.lossDateNarrative = lossDateNarrative;
    }

    /**
     * VACName of Vessel/Aircraft or description of Conveyance involved in the claim VAC
     * 
     */
    @JsonProperty("vesselAircraftConveyance")
    public String getVesselAircraftConveyance() {
        return vesselAircraftConveyance;
    }

    /**
     * VACName of Vessel/Aircraft or description of Conveyance involved in the claim VAC
     * 
     */
    @JsonProperty("vesselAircraftConveyance")
    public void setVesselAircraftConveyance(String vesselAircraftConveyance) {
        this.vesselAircraftConveyance = vesselAircraftConveyance;
    }

    /**
     * Description of the events or perils against which the interest is insured.
     * 
     */
    @JsonProperty("perils")
    public String getPerils() {
        return perils;
    }

    /**
     * Description of the events or perils against which the interest is insured.
     * 
     */
    @JsonProperty("perils")
    public void setPerils(String perils) {
        this.perils = perils;
    }

    /**
     * Description of an item, or the interest in an Item covered by the insurance. Previously populated for Marine Claims only. May now be advised for all Markets. May be advised in EPD.
     * 
     */
    @JsonProperty("interest")
    public String getInterest() {
        return interest;
    }

    /**
     * Description of an item, or the interest in an Item covered by the insurance. Previously populated for Marine Claims only. May now be advised for all Markets. May be advised in EPD.
     * 
     */
    @JsonProperty("interest")
    public void setInterest(String interest) {
        this.interest = interest;
    }

    /**
     * Populated for all claim advices and re-advices from one of four fields in the following hierarchy. If Reinsured is populated then this will be used. If Insured is populated then this will be used. If Coverholder is populated then this will be used. If Original Insured is populated then this will be used. Will also be populated in EPD.
     * 
     */
    @JsonProperty("principalInsured")
    public String getPrincipalInsured() {
        return principalInsured;
    }

    /**
     * Populated for all claim advices and re-advices from one of four fields in the following hierarchy. If Reinsured is populated then this will be used. If Insured is populated then this will be used. If Coverholder is populated then this will be used. If Original Insured is populated then this will be used. Will also be populated in EPD.
     * 
     */
    @JsonProperty("principalInsured")
    public void setPrincipalInsured(String principalInsured) {
        this.principalInsured = principalInsured;
    }

    /**
     * Brief details of the value of the insured interest/limits of liability and excess which applies to the claim. Value may be spaces. Previously populated for Marine Claims only. May now be advised for all Markets. May also be advised in EPD
     * 
     */
    @JsonProperty("limitsInsValue")
    public String getLimitsInsValue() {
        return limitsInsValue;
    }

    /**
     * Brief details of the value of the insured interest/limits of liability and excess which applies to the claim. Value may be spaces. Previously populated for Marine Claims only. May now be advised for all Markets. May also be advised in EPD
     * 
     */
    @JsonProperty("limitsInsValue")
    public void setLimitsInsValue(String limitsInsValue) {
        this.limitsInsValue = limitsInsValue;
    }

    /**
     * Description of the events or perils against which the interest is insured.
     * 
     */
    @JsonProperty("dateClaimMadeNarrative")
    public String getDateClaimMadeNarrative() {
        return dateClaimMadeNarrative;
    }

    /**
     * Description of the events or perils against which the interest is insured.
     * 
     */
    @JsonProperty("dateClaimMadeNarrative")
    public void setDateClaimMadeNarrative(String dateClaimMadeNarrative) {
        this.dateClaimMadeNarrative = dateClaimMadeNarrative;
    }

    /**
     * For a claim entry, the description of situation of interest or journey/voyage over which interest is insured. Previously populated for Marine Claims only. May now be advised for all Markets.
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * For a claim entry, the description of situation of interest or journey/voyage over which interest is insured. Previously populated for Marine Claims only. May now be advised for all Markets.
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * The location of the loss.
     * 
     */
    @JsonProperty("lossLocation")
    public String getLossLocation() {
        return lossLocation;
    }

    /**
     * The location of the loss.
     * 
     */
    @JsonProperty("lossLocation")
    public void setLossLocation(String lossLocation) {
        this.lossLocation = lossLocation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TXTDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lossDateNarrative");
        sb.append('=');
        sb.append(((this.lossDateNarrative == null)?"<null>":this.lossDateNarrative));
        sb.append(',');
        sb.append("vesselAircraftConveyance");
        sb.append('=');
        sb.append(((this.vesselAircraftConveyance == null)?"<null>":this.vesselAircraftConveyance));
        sb.append(',');
        sb.append("perils");
        sb.append('=');
        sb.append(((this.perils == null)?"<null>":this.perils));
        sb.append(',');
        sb.append("interest");
        sb.append('=');
        sb.append(((this.interest == null)?"<null>":this.interest));
        sb.append(',');
        sb.append("principalInsured");
        sb.append('=');
        sb.append(((this.principalInsured == null)?"<null>":this.principalInsured));
        sb.append(',');
        sb.append("limitsInsValue");
        sb.append('=');
        sb.append(((this.limitsInsValue == null)?"<null>":this.limitsInsValue));
        sb.append(',');
        sb.append("dateClaimMadeNarrative");
        sb.append('=');
        sb.append(((this.dateClaimMadeNarrative == null)?"<null>":this.dateClaimMadeNarrative));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("lossLocation");
        sb.append('=');
        sb.append(((this.lossLocation == null)?"<null>":this.lossLocation));
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
        result = ((result* 31)+((this.perils == null)? 0 :this.perils.hashCode()));
        result = ((result* 31)+((this.interest == null)? 0 :this.interest.hashCode()));
        result = ((result* 31)+((this.limitsInsValue == null)? 0 :this.limitsInsValue.hashCode()));
        result = ((result* 31)+((this.dateClaimMadeNarrative == null)? 0 :this.dateClaimMadeNarrative.hashCode()));
        result = ((result* 31)+((this.lossLocation == null)? 0 :this.lossLocation.hashCode()));
        result = ((result* 31)+((this.vesselAircraftConveyance == null)? 0 :this.vesselAircraftConveyance.hashCode()));
        result = ((result* 31)+((this.lossDateNarrative == null)? 0 :this.lossDateNarrative.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.principalInsured == null)? 0 :this.principalInsured.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TXTDetail) == false) {
            return false;
        }
        TXTDetail rhs = ((TXTDetail) other);
        return ((((((((((this.perils == rhs.perils)||((this.perils!= null)&&this.perils.equals(rhs.perils)))&&((this.interest == rhs.interest)||((this.interest!= null)&&this.interest.equals(rhs.interest))))&&((this.limitsInsValue == rhs.limitsInsValue)||((this.limitsInsValue!= null)&&this.limitsInsValue.equals(rhs.limitsInsValue))))&&((this.dateClaimMadeNarrative == rhs.dateClaimMadeNarrative)||((this.dateClaimMadeNarrative!= null)&&this.dateClaimMadeNarrative.equals(rhs.dateClaimMadeNarrative))))&&((this.lossLocation == rhs.lossLocation)||((this.lossLocation!= null)&&this.lossLocation.equals(rhs.lossLocation))))&&((this.vesselAircraftConveyance == rhs.vesselAircraftConveyance)||((this.vesselAircraftConveyance!= null)&&this.vesselAircraftConveyance.equals(rhs.vesselAircraftConveyance))))&&((this.lossDateNarrative == rhs.lossDateNarrative)||((this.lossDateNarrative!= null)&&this.lossDateNarrative.equals(rhs.lossDateNarrative))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.principalInsured == rhs.principalInsured)||((this.principalInsured!= null)&&this.principalInsured.equals(rhs.principalInsured))));
    }

}
