
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * A segment RFF-A
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lloydsClaimReference",
    "originatingClaimOfficeRefsClaimOffice",
    "uniqueMarketReference",
    "bureauOriginalSigningRef",
    "externalAdjusterReference",
    "lawyerReference",
    "uniqueClaimReference"
})
public class RFFDetails {

    /**
     * A mandatory reference used within the SCM generating system to index each loss or claim entry recorded in the Claims Office systems. The last character is a check digit.  (Always present in the message, in Group 1) Qualifier LCR 
     * (Required)
     * 
     */
    @JsonProperty("lloydsClaimReference")
    @JsonPropertyDescription("A mandatory reference used within the SCM generating system to index each loss or claim entry recorded in the Claims Office systems. The last character is a check digit.  (Always present in the message, in Group 1) Qualifier LCR ")
    @Size(max = 9)
    @NotNull
    private String lloydsClaimReference;
    /**
     * Always advised in Message Group 1. A reference used to help identify, within the SCM, related claim entries. This is now used solely to link the same claim where it may be potentially advised/settled to some Syndicates via the Currency Conversion Service and to others in the natural Settlement Currency.
     * (Required)
     * 
     */
    @JsonProperty("originatingClaimOfficeRefsClaimOffice")
    @JsonPropertyDescription("Always advised in Message Group 1. A reference used to help identify, within the SCM, related claim entries. This is now used solely to link the same claim where it may be potentially advised/settled to some Syndicates via the Currency Conversion Service and to others in the natural Settlement Currency.")
    @Size(max = 12)
    @NotNull
    private String originatingClaimOfficeRefsClaimOffice;
    /**
     * The reference allocated by the originator of the risk (usually a broker) which uniquely identifies a risk submitted to the London Insurance market. The reference may not be available, and may be advised as spaces. See Note 26 Appendix H. UMR
     * 
     */
    @JsonProperty("uniqueMarketReference")
    @JsonPropertyDescription("The reference allocated by the originator of the risk (usually a broker) which uniquely identifies a risk submitted to the London Insurance market. The reference may not be available, and may be advised as spaces. See Note 26 Appendix H. UMR")
    @Size(max = 17)
    private String uniqueMarketReference;
    /**
     * Reference allocated to the original LPSO premium or FDO transaction and used to associate subsequent endorsements and claims to the slip or market. Not the reference for the original policy in a reinsurance claim. Known as Original LPSO Number and Date. Format YYYYMMDDNNNNN, left justified. Value may be spaces OBR
     * 
     */
    @JsonProperty("bureauOriginalSigningRef")
    @JsonPropertyDescription("Reference allocated to the original LPSO premium or FDO transaction and used to associate subsequent endorsements and claims to the slip or market. Not the reference for the original policy in a reinsurance claim. Known as Original LPSO Number and Date. Format YYYYMMDDNNNNN, left justified. Value may be spaces OBR")
    @Size(max = 15)
    private String bureauOriginalSigningRef;
    /**
     * Reference allocated to the claim by the External Adjuster. Value may be space. May be advised for all markets ADR
     * 
     */
    @JsonProperty("externalAdjusterReference")
    @JsonPropertyDescription("Reference allocated to the claim by the External Adjuster. Value may be space. May be advised for all markets ADR")
    @Size(max = 15)
    private String externalAdjusterReference;
    /**
     * Reference allocated to the claim by the Lawyer. May be advised for all markets LAR
     * 
     */
    @JsonProperty("lawyerReference")
    @JsonPropertyDescription("Reference allocated to the claim by the Lawyer. May be advised for all markets LAR")
    @Size(max = 15)
    private String lawyerReference;
    /**
     * The reference allocated by the originator of the claim (usually a broker) which uniquely identifies a claim submitted to the London Insurance market UCR
     * 
     */
    @JsonProperty("uniqueClaimReference")
    @JsonPropertyDescription("The reference allocated by the originator of the claim (usually a broker) which uniquely identifies a claim submitted to the London Insurance market UCR")
    @Size(max = 17)
    private String uniqueClaimReference;

    /**
     * A mandatory reference used within the SCM generating system to index each loss or claim entry recorded in the Claims Office systems. The last character is a check digit.  (Always present in the message, in Group 1) Qualifier LCR 
     * (Required)
     * 
     */
    @JsonProperty("lloydsClaimReference")
    public String getLloydsClaimReference() {
        return lloydsClaimReference;
    }

    /**
     * A mandatory reference used within the SCM generating system to index each loss or claim entry recorded in the Claims Office systems. The last character is a check digit.  (Always present in the message, in Group 1) Qualifier LCR 
     * (Required)
     * 
     */
    @JsonProperty("lloydsClaimReference")
    public void setLloydsClaimReference(String lloydsClaimReference) {
        this.lloydsClaimReference = lloydsClaimReference;
    }

    /**
     * Always advised in Message Group 1. A reference used to help identify, within the SCM, related claim entries. This is now used solely to link the same claim where it may be potentially advised/settled to some Syndicates via the Currency Conversion Service and to others in the natural Settlement Currency.
     * (Required)
     * 
     */
    @JsonProperty("originatingClaimOfficeRefsClaimOffice")
    public String getOriginatingClaimOfficeRefsClaimOffice() {
        return originatingClaimOfficeRefsClaimOffice;
    }

    /**
     * Always advised in Message Group 1. A reference used to help identify, within the SCM, related claim entries. This is now used solely to link the same claim where it may be potentially advised/settled to some Syndicates via the Currency Conversion Service and to others in the natural Settlement Currency.
     * (Required)
     * 
     */
    @JsonProperty("originatingClaimOfficeRefsClaimOffice")
    public void setOriginatingClaimOfficeRefsClaimOffice(String originatingClaimOfficeRefsClaimOffice) {
        this.originatingClaimOfficeRefsClaimOffice = originatingClaimOfficeRefsClaimOffice;
    }

    /**
     * The reference allocated by the originator of the risk (usually a broker) which uniquely identifies a risk submitted to the London Insurance market. The reference may not be available, and may be advised as spaces. See Note 26 Appendix H. UMR
     * 
     */
    @JsonProperty("uniqueMarketReference")
    public String getUniqueMarketReference() {
        return uniqueMarketReference;
    }

    /**
     * The reference allocated by the originator of the risk (usually a broker) which uniquely identifies a risk submitted to the London Insurance market. The reference may not be available, and may be advised as spaces. See Note 26 Appendix H. UMR
     * 
     */
    @JsonProperty("uniqueMarketReference")
    public void setUniqueMarketReference(String uniqueMarketReference) {
        this.uniqueMarketReference = uniqueMarketReference;
    }

    /**
     * Reference allocated to the original LPSO premium or FDO transaction and used to associate subsequent endorsements and claims to the slip or market. Not the reference for the original policy in a reinsurance claim. Known as Original LPSO Number and Date. Format YYYYMMDDNNNNN, left justified. Value may be spaces OBR
     * 
     */
    @JsonProperty("bureauOriginalSigningRef")
    public String getBureauOriginalSigningRef() {
        return bureauOriginalSigningRef;
    }

    /**
     * Reference allocated to the original LPSO premium or FDO transaction and used to associate subsequent endorsements and claims to the slip or market. Not the reference for the original policy in a reinsurance claim. Known as Original LPSO Number and Date. Format YYYYMMDDNNNNN, left justified. Value may be spaces OBR
     * 
     */
    @JsonProperty("bureauOriginalSigningRef")
    public void setBureauOriginalSigningRef(String bureauOriginalSigningRef) {
        this.bureauOriginalSigningRef = bureauOriginalSigningRef;
    }

    /**
     * Reference allocated to the claim by the External Adjuster. Value may be space. May be advised for all markets ADR
     * 
     */
    @JsonProperty("externalAdjusterReference")
    public String getExternalAdjusterReference() {
        return externalAdjusterReference;
    }

    /**
     * Reference allocated to the claim by the External Adjuster. Value may be space. May be advised for all markets ADR
     * 
     */
    @JsonProperty("externalAdjusterReference")
    public void setExternalAdjusterReference(String externalAdjusterReference) {
        this.externalAdjusterReference = externalAdjusterReference;
    }

    /**
     * Reference allocated to the claim by the Lawyer. May be advised for all markets LAR
     * 
     */
    @JsonProperty("lawyerReference")
    public String getLawyerReference() {
        return lawyerReference;
    }

    /**
     * Reference allocated to the claim by the Lawyer. May be advised for all markets LAR
     * 
     */
    @JsonProperty("lawyerReference")
    public void setLawyerReference(String lawyerReference) {
        this.lawyerReference = lawyerReference;
    }

    /**
     * The reference allocated by the originator of the claim (usually a broker) which uniquely identifies a claim submitted to the London Insurance market UCR
     * 
     */
    @JsonProperty("uniqueClaimReference")
    public String getUniqueClaimReference() {
        return uniqueClaimReference;
    }

    /**
     * The reference allocated by the originator of the claim (usually a broker) which uniquely identifies a claim submitted to the London Insurance market UCR
     * 
     */
    @JsonProperty("uniqueClaimReference")
    public void setUniqueClaimReference(String uniqueClaimReference) {
        this.uniqueClaimReference = uniqueClaimReference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RFFDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lloydsClaimReference");
        sb.append('=');
        sb.append(((this.lloydsClaimReference == null)?"<null>":this.lloydsClaimReference));
        sb.append(',');
        sb.append("originatingClaimOfficeRefsClaimOffice");
        sb.append('=');
        sb.append(((this.originatingClaimOfficeRefsClaimOffice == null)?"<null>":this.originatingClaimOfficeRefsClaimOffice));
        sb.append(',');
        sb.append("uniqueMarketReference");
        sb.append('=');
        sb.append(((this.uniqueMarketReference == null)?"<null>":this.uniqueMarketReference));
        sb.append(',');
        sb.append("bureauOriginalSigningRef");
        sb.append('=');
        sb.append(((this.bureauOriginalSigningRef == null)?"<null>":this.bureauOriginalSigningRef));
        sb.append(',');
        sb.append("externalAdjusterReference");
        sb.append('=');
        sb.append(((this.externalAdjusterReference == null)?"<null>":this.externalAdjusterReference));
        sb.append(',');
        sb.append("lawyerReference");
        sb.append('=');
        sb.append(((this.lawyerReference == null)?"<null>":this.lawyerReference));
        sb.append(',');
        sb.append("uniqueClaimReference");
        sb.append('=');
        sb.append(((this.uniqueClaimReference == null)?"<null>":this.uniqueClaimReference));
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
        result = ((result* 31)+((this.lawyerReference == null)? 0 :this.lawyerReference.hashCode()));
        result = ((result* 31)+((this.originatingClaimOfficeRefsClaimOffice == null)? 0 :this.originatingClaimOfficeRefsClaimOffice.hashCode()));
        result = ((result* 31)+((this.externalAdjusterReference == null)? 0 :this.externalAdjusterReference.hashCode()));
        result = ((result* 31)+((this.uniqueMarketReference == null)? 0 :this.uniqueMarketReference.hashCode()));
        result = ((result* 31)+((this.lloydsClaimReference == null)? 0 :this.lloydsClaimReference.hashCode()));
        result = ((result* 31)+((this.bureauOriginalSigningRef == null)? 0 :this.bureauOriginalSigningRef.hashCode()));
        result = ((result* 31)+((this.uniqueClaimReference == null)? 0 :this.uniqueClaimReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RFFDetails) == false) {
            return false;
        }
        RFFDetails rhs = ((RFFDetails) other);
        return ((((((((this.lawyerReference == rhs.lawyerReference)||((this.lawyerReference!= null)&&this.lawyerReference.equals(rhs.lawyerReference)))&&((this.originatingClaimOfficeRefsClaimOffice == rhs.originatingClaimOfficeRefsClaimOffice)||((this.originatingClaimOfficeRefsClaimOffice!= null)&&this.originatingClaimOfficeRefsClaimOffice.equals(rhs.originatingClaimOfficeRefsClaimOffice))))&&((this.externalAdjusterReference == rhs.externalAdjusterReference)||((this.externalAdjusterReference!= null)&&this.externalAdjusterReference.equals(rhs.externalAdjusterReference))))&&((this.uniqueMarketReference == rhs.uniqueMarketReference)||((this.uniqueMarketReference!= null)&&this.uniqueMarketReference.equals(rhs.uniqueMarketReference))))&&((this.lloydsClaimReference == rhs.lloydsClaimReference)||((this.lloydsClaimReference!= null)&&this.lloydsClaimReference.equals(rhs.lloydsClaimReference))))&&((this.bureauOriginalSigningRef == rhs.bureauOriginalSigningRef)||((this.bureauOriginalSigningRef!= null)&&this.bureauOriginalSigningRef.equals(rhs.bureauOriginalSigningRef))))&&((this.uniqueClaimReference == rhs.uniqueClaimReference)||((this.uniqueClaimReference!= null)&&this.uniqueClaimReference.equals(rhs.uniqueClaimReference))));
    }

}
