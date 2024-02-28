
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
 * A segment PIA Details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "yearOfAcc",
    "signedInd",
    "basisOfCover",
    "claimTypeCode",
    "blockIndicator",
    "warIndicator",
    "filCode2",
    "filMarketCode",
    "catastropheCode",
    "riskCode",
    "propertyClaimsServicesCode",
    "statusCode"
})
public class PIADetail {

    /**
     * The underwriting year of account for the claim
     * 
     */
    @JsonProperty("yearOfAcc")
    @JsonPropertyDescription("The underwriting year of account for the claim")
    @Pattern(regexp = "[0-9]{4}")
    private String yearOfAcc;
    /**
     * Indicates whether lines on a risk are written or signed down.Value of Written/Signed Ind (Risk) 'W' or 'S'.
     * 
     */
    @JsonProperty("signedInd")
    @JsonPropertyDescription("Indicates whether lines on a risk are written or signed down.Value of Written/Signed Ind (Risk) 'W' or 'S'.")
    @Size(max = 1)
    private String signedInd;
    /**
     * Where a cover/lineslip date is given it qualifies the date
     * 
     */
    @JsonProperty("basisOfCover")
    @JsonPropertyDescription("Where a cover/lineslip date is given it qualifies the date")
    @Size(max = 1)
    private String basisOfCover;
    /**
     * CLM Code used to classify claim entries by type or class of business
     * 
     */
    @JsonProperty("claimTypeCode")
    @JsonPropertyDescription("CLM Code used to classify claim entries by type or class of business")
    @Size(max = 3)
    private String claimTypeCode;
    /**
     * Indicator to show whether the claim entry relates to multiple losses/occurrences
     * 
     */
    @JsonProperty("blockIndicator")
    @JsonPropertyDescription("Indicator to show whether the claim entry relates to multiple losses/occurrences")
    @Size(max = 1)
    private String blockIndicator;
    /**
     * Indicator to show whether the claim results from an act of war.
     * 
     */
    @JsonProperty("warIndicator")
    @JsonPropertyDescription("Indicator to show whether the claim results from an act of war.")
    @Size(max = 1)
    private String warIndicator;
    /**
     * A second FIL Code (4-character Foreign Insurance Legislation Code)
     * 
     */
    @JsonProperty("filCode2")
    @JsonPropertyDescription("A second FIL Code (4-character Foreign Insurance Legislation Code)")
    @Size(max = 4)
    private String filCode2;
    /**
     * A two-character code identifying the region whose legislation is applicable to the transactionr
     * 
     */
    @JsonProperty("filMarketCode")
    @JsonPropertyDescription("A two-character code identifying the region whose legislation is applicable to the transactionr")
    @Size(max = 2)
    private String filMarketCode;
    /**
     * A code allocated by the Claims Office to an event which may give rise to many losses and which identifies all claim entries resulting from that event
     * 
     */
    @JsonProperty("catastropheCode")
    @JsonPropertyDescription("A code allocated by the Claims Office to an event which may give rise to many losses and which identifies all claim entries resulting from that event")
    @Size(max = 4)
    private String catastropheCode;
    /**
     * A code used to classify risks, written for 1991 year of account onwards, and to classify their associated losses
     * 
     */
    @JsonProperty("riskCode")
    @JsonPropertyDescription("A code used to classify risks, written for 1991 year of account onwards, and to classify their associated losses")
    @Size(max = 2)
    private String riskCode;
    /**
     * Shows whether the claim is open or closed
     * 
     */
    @JsonProperty("propertyClaimsServicesCode")
    @JsonPropertyDescription("Shows whether the claim is open or closed")
    @Size(max = 4)
    private String propertyClaimsServicesCode;
    /**
     * Shows whether the claim is open or closed.
     * 
     */
    @JsonProperty("statusCode")
    @JsonPropertyDescription("Shows whether the claim is open or closed.")
    @Size(max = 3)
    private String statusCode;

    /**
     * The underwriting year of account for the claim
     * 
     */
    @JsonProperty("yearOfAcc")
    public String getYearOfAcc() {
        return yearOfAcc;
    }

    /**
     * The underwriting year of account for the claim
     * 
     */
    @JsonProperty("yearOfAcc")
    public void setYearOfAcc(String yearOfAcc) {
        this.yearOfAcc = yearOfAcc;
    }

    /**
     * Indicates whether lines on a risk are written or signed down.Value of Written/Signed Ind (Risk) 'W' or 'S'.
     * 
     */
    @JsonProperty("signedInd")
    public String getSignedInd() {
        return signedInd;
    }

    /**
     * Indicates whether lines on a risk are written or signed down.Value of Written/Signed Ind (Risk) 'W' or 'S'.
     * 
     */
    @JsonProperty("signedInd")
    public void setSignedInd(String signedInd) {
        this.signedInd = signedInd;
    }

    /**
     * Where a cover/lineslip date is given it qualifies the date
     * 
     */
    @JsonProperty("basisOfCover")
    public String getBasisOfCover() {
        return basisOfCover;
    }

    /**
     * Where a cover/lineslip date is given it qualifies the date
     * 
     */
    @JsonProperty("basisOfCover")
    public void setBasisOfCover(String basisOfCover) {
        this.basisOfCover = basisOfCover;
    }

    /**
     * CLM Code used to classify claim entries by type or class of business
     * 
     */
    @JsonProperty("claimTypeCode")
    public String getClaimTypeCode() {
        return claimTypeCode;
    }

    /**
     * CLM Code used to classify claim entries by type or class of business
     * 
     */
    @JsonProperty("claimTypeCode")
    public void setClaimTypeCode(String claimTypeCode) {
        this.claimTypeCode = claimTypeCode;
    }

    /**
     * Indicator to show whether the claim entry relates to multiple losses/occurrences
     * 
     */
    @JsonProperty("blockIndicator")
    public String getBlockIndicator() {
        return blockIndicator;
    }

    /**
     * Indicator to show whether the claim entry relates to multiple losses/occurrences
     * 
     */
    @JsonProperty("blockIndicator")
    public void setBlockIndicator(String blockIndicator) {
        this.blockIndicator = blockIndicator;
    }

    /**
     * Indicator to show whether the claim results from an act of war.
     * 
     */
    @JsonProperty("warIndicator")
    public String getWarIndicator() {
        return warIndicator;
    }

    /**
     * Indicator to show whether the claim results from an act of war.
     * 
     */
    @JsonProperty("warIndicator")
    public void setWarIndicator(String warIndicator) {
        this.warIndicator = warIndicator;
    }

    /**
     * A second FIL Code (4-character Foreign Insurance Legislation Code)
     * 
     */
    @JsonProperty("filCode2")
    public String getFilCode2() {
        return filCode2;
    }

    /**
     * A second FIL Code (4-character Foreign Insurance Legislation Code)
     * 
     */
    @JsonProperty("filCode2")
    public void setFilCode2(String filCode2) {
        this.filCode2 = filCode2;
    }

    /**
     * A two-character code identifying the region whose legislation is applicable to the transactionr
     * 
     */
    @JsonProperty("filMarketCode")
    public String getFilMarketCode() {
        return filMarketCode;
    }

    /**
     * A two-character code identifying the region whose legislation is applicable to the transactionr
     * 
     */
    @JsonProperty("filMarketCode")
    public void setFilMarketCode(String filMarketCode) {
        this.filMarketCode = filMarketCode;
    }

    /**
     * A code allocated by the Claims Office to an event which may give rise to many losses and which identifies all claim entries resulting from that event
     * 
     */
    @JsonProperty("catastropheCode")
    public String getCatastropheCode() {
        return catastropheCode;
    }

    /**
     * A code allocated by the Claims Office to an event which may give rise to many losses and which identifies all claim entries resulting from that event
     * 
     */
    @JsonProperty("catastropheCode")
    public void setCatastropheCode(String catastropheCode) {
        this.catastropheCode = catastropheCode;
    }

    /**
     * A code used to classify risks, written for 1991 year of account onwards, and to classify their associated losses
     * 
     */
    @JsonProperty("riskCode")
    public String getRiskCode() {
        return riskCode;
    }

    /**
     * A code used to classify risks, written for 1991 year of account onwards, and to classify their associated losses
     * 
     */
    @JsonProperty("riskCode")
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    /**
     * Shows whether the claim is open or closed
     * 
     */
    @JsonProperty("propertyClaimsServicesCode")
    public String getPropertyClaimsServicesCode() {
        return propertyClaimsServicesCode;
    }

    /**
     * Shows whether the claim is open or closed
     * 
     */
    @JsonProperty("propertyClaimsServicesCode")
    public void setPropertyClaimsServicesCode(String propertyClaimsServicesCode) {
        this.propertyClaimsServicesCode = propertyClaimsServicesCode;
    }

    /**
     * Shows whether the claim is open or closed.
     * 
     */
    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Shows whether the claim is open or closed.
     * 
     */
    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PIADetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("yearOfAcc");
        sb.append('=');
        sb.append(((this.yearOfAcc == null)?"<null>":this.yearOfAcc));
        sb.append(',');
        sb.append("signedInd");
        sb.append('=');
        sb.append(((this.signedInd == null)?"<null>":this.signedInd));
        sb.append(',');
        sb.append("basisOfCover");
        sb.append('=');
        sb.append(((this.basisOfCover == null)?"<null>":this.basisOfCover));
        sb.append(',');
        sb.append("claimTypeCode");
        sb.append('=');
        sb.append(((this.claimTypeCode == null)?"<null>":this.claimTypeCode));
        sb.append(',');
        sb.append("blockIndicator");
        sb.append('=');
        sb.append(((this.blockIndicator == null)?"<null>":this.blockIndicator));
        sb.append(',');
        sb.append("warIndicator");
        sb.append('=');
        sb.append(((this.warIndicator == null)?"<null>":this.warIndicator));
        sb.append(',');
        sb.append("filCode2");
        sb.append('=');
        sb.append(((this.filCode2 == null)?"<null>":this.filCode2));
        sb.append(',');
        sb.append("filMarketCode");
        sb.append('=');
        sb.append(((this.filMarketCode == null)?"<null>":this.filMarketCode));
        sb.append(',');
        sb.append("catastropheCode");
        sb.append('=');
        sb.append(((this.catastropheCode == null)?"<null>":this.catastropheCode));
        sb.append(',');
        sb.append("riskCode");
        sb.append('=');
        sb.append(((this.riskCode == null)?"<null>":this.riskCode));
        sb.append(',');
        sb.append("propertyClaimsServicesCode");
        sb.append('=');
        sb.append(((this.propertyClaimsServicesCode == null)?"<null>":this.propertyClaimsServicesCode));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
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
        result = ((result* 31)+((this.catastropheCode == null)? 0 :this.catastropheCode.hashCode()));
        result = ((result* 31)+((this.propertyClaimsServicesCode == null)? 0 :this.propertyClaimsServicesCode.hashCode()));
        result = ((result* 31)+((this.claimTypeCode == null)? 0 :this.claimTypeCode.hashCode()));
        result = ((result* 31)+((this.filCode2 == null)? 0 :this.filCode2 .hashCode()));
        result = ((result* 31)+((this.riskCode == null)? 0 :this.riskCode.hashCode()));
        result = ((result* 31)+((this.signedInd == null)? 0 :this.signedInd.hashCode()));
        result = ((result* 31)+((this.yearOfAcc == null)? 0 :this.yearOfAcc.hashCode()));
        result = ((result* 31)+((this.warIndicator == null)? 0 :this.warIndicator.hashCode()));
        result = ((result* 31)+((this.blockIndicator == null)? 0 :this.blockIndicator.hashCode()));
        result = ((result* 31)+((this.basisOfCover == null)? 0 :this.basisOfCover.hashCode()));
        result = ((result* 31)+((this.filMarketCode == null)? 0 :this.filMarketCode.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PIADetail) == false) {
            return false;
        }
        PIADetail rhs = ((PIADetail) other);
        return (((((((((((((this.catastropheCode == rhs.catastropheCode)||((this.catastropheCode!= null)&&this.catastropheCode.equals(rhs.catastropheCode)))&&((this.propertyClaimsServicesCode == rhs.propertyClaimsServicesCode)||((this.propertyClaimsServicesCode!= null)&&this.propertyClaimsServicesCode.equals(rhs.propertyClaimsServicesCode))))&&((this.claimTypeCode == rhs.claimTypeCode)||((this.claimTypeCode!= null)&&this.claimTypeCode.equals(rhs.claimTypeCode))))&&((this.filCode2 == rhs.filCode2)||((this.filCode2 != null)&&this.filCode2 .equals(rhs.filCode2))))&&((this.riskCode == rhs.riskCode)||((this.riskCode!= null)&&this.riskCode.equals(rhs.riskCode))))&&((this.signedInd == rhs.signedInd)||((this.signedInd!= null)&&this.signedInd.equals(rhs.signedInd))))&&((this.yearOfAcc == rhs.yearOfAcc)||((this.yearOfAcc!= null)&&this.yearOfAcc.equals(rhs.yearOfAcc))))&&((this.warIndicator == rhs.warIndicator)||((this.warIndicator!= null)&&this.warIndicator.equals(rhs.warIndicator))))&&((this.blockIndicator == rhs.blockIndicator)||((this.blockIndicator!= null)&&this.blockIndicator.equals(rhs.blockIndicator))))&&((this.basisOfCover == rhs.basisOfCover)||((this.basisOfCover!= null)&&this.basisOfCover.equals(rhs.basisOfCover))))&&((this.filMarketCode == rhs.filMarketCode)||((this.filMarketCode!= null)&&this.filMarketCode.equals(rhs.filMarketCode))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))));
    }

}
