
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * A segment group 4 Reference
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bureauPrimaryClaimRefBPR",
    "countryCodeCDE",
    "trustFundCodeTRF",
    "fILCodeFFL",
    "stateOfOriginCodeSTA",
    "naiccCodePrefixNAI",
    "naicReinsuredCodeNAI"
})
public class Group7PIA {

    /**
     * Mandatory. The unique reference to identify a claim entry in the Claims Office system, and in the message. Known as the Claims Office Reference. Format is XRRRRRRRRRRR where- X is the Bureau code, with value - A for an Aviation claim entry, - N for a Non-Marine claim entry, - M for a Marine claim entry, and RRRRRRRRRRR is the reference assigned when the claim entry was first recorded in the claims office system
     * (Required)
     * 
     */
    @JsonProperty("bureauPrimaryClaimRefBPR")
    @JsonPropertyDescription("Mandatory. The unique reference to identify a claim entry in the Claims Office system, and in the message. Known as the Claims Office Reference. Format is XRRRRRRRRRRR where- X is the Bureau code, with value - A for an Aviation claim entry, - N for a Non-Marine claim entry, - M for a Marine claim entry, and RRRRRRRRRRR is the reference assigned when the claim entry was first recorded in the claims office system")
    @Size(max = 15)
    @NotNull
    private String bureauPrimaryClaimRefBPR;
    /**
     * Condiitonal. A two character ISO country code prefix that qualifies the country of regulation for the Trust Fund Code, where country is US or CA only.
     * 
     */
    @JsonProperty("countryCodeCDE")
    @JsonPropertyDescription("Condiitonal. A two character ISO country code prefix that qualifies the country of regulation for the Trust Fund Code, where country is US or CA only.")
    @Size(max = 2)
    private String countryCodeCDE;
    /**
     * Condiitonal. For use for USD/CAD/Brexit Part VII business only. A code that determines which Trust Fund the amount should be accounted in
     * 
     */
    @JsonProperty("trustFundCodeTRF")
    @JsonPropertyDescription("Condiitonal. For use for USD/CAD/Brexit Part VII business only. A code that determines which Trust Fund the amount should be accounted in")
    @Size(max = 2)
    private String trustFundCodeTRF;
    /**
     * Condiitonal. This is the 4-character Foreign Insurance Legislation Code
     * 
     */
    @JsonProperty("fILCodeFFL")
    @JsonPropertyDescription("Condiitonal. This is the 4-character Foreign Insurance Legislation Code")
    @Size(max = 4)
    private String fILCodeFFL;
    /**
     * Condiitonal. The State or Province Code of the transaction, i.e. where the risk originated. It will be present on claims where the original currency is US dollars and the Trust Fund Code is SL or S7. It will be present on Canadian Regulated business (CR) and may be present on Canadian Non-Regulated business (CN/7N)
     * 
     */
    @JsonProperty("stateOfOriginCodeSTA")
    @JsonPropertyDescription("Condiitonal. The State or Province Code of the transaction, i.e. where the risk originated. It will be present on claims where the original currency is US dollars and the Trust Fund Code is SL or S7. It will be present on Canadian Regulated business (CR) and may be present on Canadian Non-Regulated business (CN/7N)")
    @Size(max = 9)
    private String stateOfOriginCodeSTA;
    /**
     * Condiitonal. This will take the form of a field containing a code of up to eleven characters prefixed by a one character NAIC Code Prefix. The eleven code character will be used by Lloyd's to provide the United States National Association of Insurance Commissioner statistics relating to the movement of money
     * 
     */
    @JsonProperty("naiccCodePrefixNAI")
    @JsonPropertyDescription("Condiitonal. This will take the form of a field containing a code of up to eleven characters prefixed by a one character NAIC Code Prefix. The eleven code character will be used by Lloyd's to provide the United States National Association of Insurance Commissioner statistics relating to the movement of money")
    @Size(max = 1)
    private String naiccCodePrefixNAI;
    /**
     * Condiitonal. This will take the form of a field containing a code of up to eleven characters prefixed by a one character NAIC Code Prefix. The eleven code character will be used by Lloyd's to provide the United States National Association of Insurance Commissioner statistics relating to the movement of money
     * 
     */
    @JsonProperty("naicReinsuredCodeNAI")
    @JsonPropertyDescription("Condiitonal. This will take the form of a field containing a code of up to eleven characters prefixed by a one character NAIC Code Prefix. The eleven code character will be used by Lloyd's to provide the United States National Association of Insurance Commissioner statistics relating to the movement of money")
    @Size(max = 11)
    private String naicReinsuredCodeNAI;

    /**
     * Mandatory. The unique reference to identify a claim entry in the Claims Office system, and in the message. Known as the Claims Office Reference. Format is XRRRRRRRRRRR where- X is the Bureau code, with value - A for an Aviation claim entry, - N for a Non-Marine claim entry, - M for a Marine claim entry, and RRRRRRRRRRR is the reference assigned when the claim entry was first recorded in the claims office system
     * (Required)
     * 
     */
    @JsonProperty("bureauPrimaryClaimRefBPR")
    public String getBureauPrimaryClaimRefBPR() {
        return bureauPrimaryClaimRefBPR;
    }

    /**
     * Mandatory. The unique reference to identify a claim entry in the Claims Office system, and in the message. Known as the Claims Office Reference. Format is XRRRRRRRRRRR where- X is the Bureau code, with value - A for an Aviation claim entry, - N for a Non-Marine claim entry, - M for a Marine claim entry, and RRRRRRRRRRR is the reference assigned when the claim entry was first recorded in the claims office system
     * (Required)
     * 
     */
    @JsonProperty("bureauPrimaryClaimRefBPR")
    public void setBureauPrimaryClaimRefBPR(String bureauPrimaryClaimRefBPR) {
        this.bureauPrimaryClaimRefBPR = bureauPrimaryClaimRefBPR;
    }

    /**
     * Condiitonal. A two character ISO country code prefix that qualifies the country of regulation for the Trust Fund Code, where country is US or CA only.
     * 
     */
    @JsonProperty("countryCodeCDE")
    public String getCountryCodeCDE() {
        return countryCodeCDE;
    }

    /**
     * Condiitonal. A two character ISO country code prefix that qualifies the country of regulation for the Trust Fund Code, where country is US or CA only.
     * 
     */
    @JsonProperty("countryCodeCDE")
    public void setCountryCodeCDE(String countryCodeCDE) {
        this.countryCodeCDE = countryCodeCDE;
    }

    /**
     * Condiitonal. For use for USD/CAD/Brexit Part VII business only. A code that determines which Trust Fund the amount should be accounted in
     * 
     */
    @JsonProperty("trustFundCodeTRF")
    public String getTrustFundCodeTRF() {
        return trustFundCodeTRF;
    }

    /**
     * Condiitonal. For use for USD/CAD/Brexit Part VII business only. A code that determines which Trust Fund the amount should be accounted in
     * 
     */
    @JsonProperty("trustFundCodeTRF")
    public void setTrustFundCodeTRF(String trustFundCodeTRF) {
        this.trustFundCodeTRF = trustFundCodeTRF;
    }

    /**
     * Condiitonal. This is the 4-character Foreign Insurance Legislation Code
     * 
     */
    @JsonProperty("fILCodeFFL")
    public String getFILCodeFFL() {
        return fILCodeFFL;
    }

    /**
     * Condiitonal. This is the 4-character Foreign Insurance Legislation Code
     * 
     */
    @JsonProperty("fILCodeFFL")
    public void setFILCodeFFL(String fILCodeFFL) {
        this.fILCodeFFL = fILCodeFFL;
    }

    /**
     * Condiitonal. The State or Province Code of the transaction, i.e. where the risk originated. It will be present on claims where the original currency is US dollars and the Trust Fund Code is SL or S7. It will be present on Canadian Regulated business (CR) and may be present on Canadian Non-Regulated business (CN/7N)
     * 
     */
    @JsonProperty("stateOfOriginCodeSTA")
    public String getStateOfOriginCodeSTA() {
        return stateOfOriginCodeSTA;
    }

    /**
     * Condiitonal. The State or Province Code of the transaction, i.e. where the risk originated. It will be present on claims where the original currency is US dollars and the Trust Fund Code is SL or S7. It will be present on Canadian Regulated business (CR) and may be present on Canadian Non-Regulated business (CN/7N)
     * 
     */
    @JsonProperty("stateOfOriginCodeSTA")
    public void setStateOfOriginCodeSTA(String stateOfOriginCodeSTA) {
        this.stateOfOriginCodeSTA = stateOfOriginCodeSTA;
    }

    /**
     * Condiitonal. This will take the form of a field containing a code of up to eleven characters prefixed by a one character NAIC Code Prefix. The eleven code character will be used by Lloyd's to provide the United States National Association of Insurance Commissioner statistics relating to the movement of money
     * 
     */
    @JsonProperty("naiccCodePrefixNAI")
    public String getNaiccCodePrefixNAI() {
        return naiccCodePrefixNAI;
    }

    /**
     * Condiitonal. This will take the form of a field containing a code of up to eleven characters prefixed by a one character NAIC Code Prefix. The eleven code character will be used by Lloyd's to provide the United States National Association of Insurance Commissioner statistics relating to the movement of money
     * 
     */
    @JsonProperty("naiccCodePrefixNAI")
    public void setNaiccCodePrefixNAI(String naiccCodePrefixNAI) {
        this.naiccCodePrefixNAI = naiccCodePrefixNAI;
    }

    /**
     * Condiitonal. This will take the form of a field containing a code of up to eleven characters prefixed by a one character NAIC Code Prefix. The eleven code character will be used by Lloyd's to provide the United States National Association of Insurance Commissioner statistics relating to the movement of money
     * 
     */
    @JsonProperty("naicReinsuredCodeNAI")
    public String getNaicReinsuredCodeNAI() {
        return naicReinsuredCodeNAI;
    }

    /**
     * Condiitonal. This will take the form of a field containing a code of up to eleven characters prefixed by a one character NAIC Code Prefix. The eleven code character will be used by Lloyd's to provide the United States National Association of Insurance Commissioner statistics relating to the movement of money
     * 
     */
    @JsonProperty("naicReinsuredCodeNAI")
    public void setNaicReinsuredCodeNAI(String naicReinsuredCodeNAI) {
        this.naicReinsuredCodeNAI = naicReinsuredCodeNAI;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group7PIA.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bureauPrimaryClaimRefBPR");
        sb.append('=');
        sb.append(((this.bureauPrimaryClaimRefBPR == null)?"<null>":this.bureauPrimaryClaimRefBPR));
        sb.append(',');
        sb.append("countryCodeCDE");
        sb.append('=');
        sb.append(((this.countryCodeCDE == null)?"<null>":this.countryCodeCDE));
        sb.append(',');
        sb.append("trustFundCodeTRF");
        sb.append('=');
        sb.append(((this.trustFundCodeTRF == null)?"<null>":this.trustFundCodeTRF));
        sb.append(',');
        sb.append("fILCodeFFL");
        sb.append('=');
        sb.append(((this.fILCodeFFL == null)?"<null>":this.fILCodeFFL));
        sb.append(',');
        sb.append("stateOfOriginCodeSTA");
        sb.append('=');
        sb.append(((this.stateOfOriginCodeSTA == null)?"<null>":this.stateOfOriginCodeSTA));
        sb.append(',');
        sb.append("naiccCodePrefixNAI");
        sb.append('=');
        sb.append(((this.naiccCodePrefixNAI == null)?"<null>":this.naiccCodePrefixNAI));
        sb.append(',');
        sb.append("naicReinsuredCodeNAI");
        sb.append('=');
        sb.append(((this.naicReinsuredCodeNAI == null)?"<null>":this.naicReinsuredCodeNAI));
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
        result = ((result* 31)+((this.countryCodeCDE == null)? 0 :this.countryCodeCDE.hashCode()));
        result = ((result* 31)+((this.bureauPrimaryClaimRefBPR == null)? 0 :this.bureauPrimaryClaimRefBPR.hashCode()));
        result = ((result* 31)+((this.trustFundCodeTRF == null)? 0 :this.trustFundCodeTRF.hashCode()));
        result = ((result* 31)+((this.naicReinsuredCodeNAI == null)? 0 :this.naicReinsuredCodeNAI.hashCode()));
        result = ((result* 31)+((this.naiccCodePrefixNAI == null)? 0 :this.naiccCodePrefixNAI.hashCode()));
        result = ((result* 31)+((this.fILCodeFFL == null)? 0 :this.fILCodeFFL.hashCode()));
        result = ((result* 31)+((this.stateOfOriginCodeSTA == null)? 0 :this.stateOfOriginCodeSTA.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group7PIA) == false) {
            return false;
        }
        Group7PIA rhs = ((Group7PIA) other);
        return ((((((((this.countryCodeCDE == rhs.countryCodeCDE)||((this.countryCodeCDE!= null)&&this.countryCodeCDE.equals(rhs.countryCodeCDE)))&&((this.bureauPrimaryClaimRefBPR == rhs.bureauPrimaryClaimRefBPR)||((this.bureauPrimaryClaimRefBPR!= null)&&this.bureauPrimaryClaimRefBPR.equals(rhs.bureauPrimaryClaimRefBPR))))&&((this.trustFundCodeTRF == rhs.trustFundCodeTRF)||((this.trustFundCodeTRF!= null)&&this.trustFundCodeTRF.equals(rhs.trustFundCodeTRF))))&&((this.naicReinsuredCodeNAI == rhs.naicReinsuredCodeNAI)||((this.naicReinsuredCodeNAI!= null)&&this.naicReinsuredCodeNAI.equals(rhs.naicReinsuredCodeNAI))))&&((this.naiccCodePrefixNAI == rhs.naiccCodePrefixNAI)||((this.naiccCodePrefixNAI!= null)&&this.naiccCodePrefixNAI.equals(rhs.naiccCodePrefixNAI))))&&((this.fILCodeFFL == rhs.fILCodeFFL)||((this.fILCodeFFL!= null)&&this.fILCodeFFL.equals(rhs.fILCodeFFL))))&&((this.stateOfOriginCodeSTA == rhs.stateOfOriginCodeSTA)||((this.stateOfOriginCodeSTA!= null)&&this.stateOfOriginCodeSTA.equals(rhs.stateOfOriginCodeSTA))));
    }

}
