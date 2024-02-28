
package com.lm.data.edi.model.ilucsb;

import java.util.HashMap;
import java.util.Map;
//import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Array of IAM segments.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "iluReference",
    "companyCode",
    "companyReference",
    "instalmentCode",
    "instalmentNumber",
    "nettPremiumClaim",
    "settlementDueDate"
})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ILUCSBInstalmentDetailsArray {

    /**
     * ILU reference. A unique reference allocated by the ILU to a transaction.
     * (Required)
     * 
     */
    @JsonProperty("iluReference")
    @JsonPropertyDescription("ILU reference. A unique reference allocated by the ILU to a transaction.")
    @Size(max = 15)
    @NotNull
    private String iluReference;
    /**
     * Company code. A unique code allocated by the ILU to a company for purposes of identification. This is the underwriter’s ‘stamp number’.
     * (Required)
     * 
     */
    @JsonProperty("companyCode")
    @JsonPropertyDescription("Company code. A unique code allocated by the ILU to a company for purposes of identification. This is the underwriter\u2019s \u2018stamp number\u2019.")
    @Size(max = 6)
    @NotNull
    private String companyCode;
    /**
     * Company reference. The reference allocated by a company at the time of writing a risk.
     * (Required)
     * 
     */
    @JsonProperty("companyReference")
    @JsonPropertyDescription("Company reference. The reference allocated by a company at the time of writing a risk.")
    @Size(max = 15)
    @NotNull
    private String companyReference;
    /**
     * Instalment code. The method of payment applied to the premium. This element will only be present if the transaction was signed on a deferred basis. Values [ C -  Cash Instalment, D - Deferred Instalment]
     * 
     */
    @JsonProperty("instalmentCode")
    @JsonPropertyDescription("Instalment code. The method of payment applied to the premium. This element will only be present if the transaction was signed on a deferred basis. Values [ C -  Cash Instalment, D - Deferred Instalment]")
    private ILUCSBInstalmentDetailsArray.InstalmentCode instalmentCode;
    /**
     * Instalment Number. The number of the instalment to which this settlement transaction relates. This element will only be present if the transaction was signed on a deferred basis
     * 
     */
    @JsonProperty("instalmentNumber")
    @JsonPropertyDescription("Instalment Number. The number of the instalment to which this settlement transaction relates. This element will only be present if the transaction was signed on a deferred basis")
    @Pattern(regexp = "[1-9][0-9]{0,1}")
    private String instalmentNumber;
    /**
     * Net Premium/Claim. The net amount to be paid in respect of this transaction, expressed in settlement currency. This element will not be present for nil premiums/claims. Otherwise, it could be positive or negative. If negative, it is prefixed with '-'. If positive, there is no need to prefixed with '+'. The sum of these will be represented in brokerBusinessBalanceAmount. The pattern used here is from the common component for monetaryAmount. Note there is a spelling mistake here which may be better corrected in discussion between DXC and ASG. nett should be net
     * 
     */
    @JsonProperty("nettPremiumClaim")
    @JsonPropertyDescription("Net Premium/Claim. The net amount to be paid in respect of this transaction, expressed in settlement currency. This element will not be present for nil premiums/claims. Otherwise, it could be positive or negative. If negative, it is prefixed with '-'. If positive, there is no need to prefixed with '+'. The sum of these will be represented in brokerBusinessBalanceAmount. The pattern used here is from the common component for monetaryAmount. Note there is a spelling mistake here which may be better corrected in discussion between DXC and ASG. nett should be net")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String nettPremiumClaim;
    /**
     * Settlement due date. The date on which it is agreed that settlement of a particular transaction should take place. This element will only be present if the settlement due date was provided at time of signing. This uses the standard date format although in the final message ASG will send out, it will be converted to YYMMDD by ASG.
     * 
     */
    @JsonProperty("settlementDueDate")
    @JsonPropertyDescription("Settlement due date. The date on which it is agreed that settlement of a particular transaction should take place. This element will only be present if the settlement due date was provided at time of signing. This uses the standard date format although in the final message ASG will send out, it will be converted to YYMMDD by ASG.")
    private String settlementDueDate;

    /**
     * ILU reference. A unique reference allocated by the ILU to a transaction.
     * (Required)
     * 
     */
    @JsonProperty("iluReference")
    public String getIluReference() {
        return iluReference;
    }

    /**
     * ILU reference. A unique reference allocated by the ILU to a transaction.
     * (Required)
     * 
     */
    @JsonProperty("iluReference")
    public void setIluReference(String iluReference) {
        this.iluReference = iluReference;
    }

    /**
     * Company code. A unique code allocated by the ILU to a company for purposes of identification. This is the underwriter’s ‘stamp number’.
     * (Required)
     * 
     */
    @JsonProperty("companyCode")
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Company code. A unique code allocated by the ILU to a company for purposes of identification. This is the underwriter’s ‘stamp number’.
     * (Required)
     * 
     */
    @JsonProperty("companyCode")
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * Company reference. The reference allocated by a company at the time of writing a risk.
     * (Required)
     * 
     */
    @JsonProperty("companyReference")
    public String getCompanyReference() {
        return companyReference;
    }

    /**
     * Company reference. The reference allocated by a company at the time of writing a risk.
     * (Required)
     * 
     */
    @JsonProperty("companyReference")
    public void setCompanyReference(String companyReference) {
        this.companyReference = companyReference;
    }

    /**
     * Instalment code. The method of payment applied to the premium. This element will only be present if the transaction was signed on a deferred basis. Values [ C -  Cash Instalment, D - Deferred Instalment]
     * 
     */
    @JsonProperty("instalmentCode")
    public ILUCSBInstalmentDetailsArray.InstalmentCode getInstalmentCode() {
        return instalmentCode;
    }

    /**
     * Instalment code. The method of payment applied to the premium. This element will only be present if the transaction was signed on a deferred basis. Values [ C -  Cash Instalment, D - Deferred Instalment]
     * 
     */
    @JsonProperty("instalmentCode")
    public void setInstalmentCode(ILUCSBInstalmentDetailsArray.InstalmentCode instalmentCode) {
        this.instalmentCode = instalmentCode;
    }

    /**
     * Instalment Number. The number of the instalment to which this settlement transaction relates. This element will only be present if the transaction was signed on a deferred basis
     * 
     */
    @JsonProperty("instalmentNumber")
    public String getInstalmentNumber() {
        return instalmentNumber;
    }

    /**
     * Instalment Number. The number of the instalment to which this settlement transaction relates. This element will only be present if the transaction was signed on a deferred basis
     * 
     */
    @JsonProperty("instalmentNumber")
    public void setInstalmentNumber(String instalmentNumber) {
        this.instalmentNumber = instalmentNumber;
    }

    /**
     * Net Premium/Claim. The net amount to be paid in respect of this transaction, expressed in settlement currency. This element will not be present for nil premiums/claims. Otherwise, it could be positive or negative. If negative, it is prefixed with '-'. If positive, there is no need to prefixed with '+'. The sum of these will be represented in brokerBusinessBalanceAmount. The pattern used here is from the common component for monetaryAmount. Note there is a spelling mistake here which may be better corrected in discussion between DXC and ASG. nett should be net
     * 
     */
    @JsonProperty("nettPremiumClaim")
    public String getNettPremiumClaim() {
        return nettPremiumClaim;
    }

    /**
     * Net Premium/Claim. The net amount to be paid in respect of this transaction, expressed in settlement currency. This element will not be present for nil premiums/claims. Otherwise, it could be positive or negative. If negative, it is prefixed with '-'. If positive, there is no need to prefixed with '+'. The sum of these will be represented in brokerBusinessBalanceAmount. The pattern used here is from the common component for monetaryAmount. Note there is a spelling mistake here which may be better corrected in discussion between DXC and ASG. nett should be net
     * 
     */
    @JsonProperty("nettPremiumClaim")
    public void setNettPremiumClaim(String nettPremiumClaim) {
        this.nettPremiumClaim = nettPremiumClaim;
    }

    /**
     * Settlement due date. The date on which it is agreed that settlement of a particular transaction should take place. This element will only be present if the settlement due date was provided at time of signing. This uses the standard date format although in the final message ASG will send out, it will be converted to YYMMDD by ASG.
     * 
     */
    @JsonProperty("settlementDueDate")
    public String getSettlementDueDate() {
        return settlementDueDate;
    }

    /**
     * Settlement due date. The date on which it is agreed that settlement of a particular transaction should take place. This element will only be present if the settlement due date was provided at time of signing. This uses the standard date format although in the final message ASG will send out, it will be converted to YYMMDD by ASG.
     * 
     */
    @JsonProperty("settlementDueDate")
    public void setSettlementDueDate(String settlementDueDate) {
        this.settlementDueDate = settlementDueDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ILUCSBInstalmentDetailsArray.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iluReference");
        sb.append('=');
        sb.append(((this.iluReference == null)?"<null>":this.iluReference));
        sb.append(',');
        sb.append("companyCode");
        sb.append('=');
        sb.append(((this.companyCode == null)?"<null>":this.companyCode));
        sb.append(',');
        sb.append("companyReference");
        sb.append('=');
        sb.append(((this.companyReference == null)?"<null>":this.companyReference));
        sb.append(',');
        sb.append("instalmentCode");
        sb.append('=');
        sb.append(((this.instalmentCode == null)?"<null>":this.instalmentCode));
        sb.append(',');
        sb.append("instalmentNumber");
        sb.append('=');
        sb.append(((this.instalmentNumber == null)?"<null>":this.instalmentNumber));
        sb.append(',');
        sb.append("nettPremiumClaim");
        sb.append('=');
        sb.append(((this.nettPremiumClaim == null)?"<null>":this.nettPremiumClaim));
        sb.append(',');
        sb.append("settlementDueDate");
        sb.append('=');
        sb.append(((this.settlementDueDate == null)?"<null>":this.settlementDueDate));
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
        result = ((result* 31)+((this.companyCode == null)? 0 :this.companyCode.hashCode()));
        result = ((result* 31)+((this.nettPremiumClaim == null)? 0 :this.nettPremiumClaim.hashCode()));
        result = ((result* 31)+((this.settlementDueDate == null)? 0 :this.settlementDueDate.hashCode()));
        result = ((result* 31)+((this.instalmentNumber == null)? 0 :this.instalmentNumber.hashCode()));
        result = ((result* 31)+((this.companyReference == null)? 0 :this.companyReference.hashCode()));
        result = ((result* 31)+((this.instalmentCode == null)? 0 :this.instalmentCode.hashCode()));
        result = ((result* 31)+((this.iluReference == null)? 0 :this.iluReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ILUCSBInstalmentDetailsArray) == false) {
            return false;
        }
        ILUCSBInstalmentDetailsArray rhs = ((ILUCSBInstalmentDetailsArray) other);
        return ((((((((this.companyCode == rhs.companyCode)||((this.companyCode!= null)&&this.companyCode.equals(rhs.companyCode)))&&((this.nettPremiumClaim == rhs.nettPremiumClaim)||((this.nettPremiumClaim!= null)&&this.nettPremiumClaim.equals(rhs.nettPremiumClaim))))&&((this.settlementDueDate == rhs.settlementDueDate)||((this.settlementDueDate!= null)&&this.settlementDueDate.equals(rhs.settlementDueDate))))&&((this.instalmentNumber == rhs.instalmentNumber)||((this.instalmentNumber!= null)&&this.instalmentNumber.equals(rhs.instalmentNumber))))&&((this.companyReference == rhs.companyReference)||((this.companyReference!= null)&&this.companyReference.equals(rhs.companyReference))))&&((this.instalmentCode == rhs.instalmentCode)||((this.instalmentCode!= null)&&this.instalmentCode.equals(rhs.instalmentCode))))&&((this.iluReference == rhs.iluReference)||((this.iluReference!= null)&&this.iluReference.equals(rhs.iluReference))));
    }


    /**
     * Instalment code. The method of payment applied to the premium. This element will only be present if the transaction was signed on a deferred basis. Values [ C -  Cash Instalment, D - Deferred Instalment]
     * 
     */
    //@Generated("jsonschema2pojo")
    public enum InstalmentCode {

        C("C"),
        D("D");
        private final String value;
        private final static Map<String, ILUCSBInstalmentDetailsArray.InstalmentCode> CONSTANTS = new HashMap<String, ILUCSBInstalmentDetailsArray.InstalmentCode>();

        static {
            for (ILUCSBInstalmentDetailsArray.InstalmentCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        InstalmentCode(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ILUCSBInstalmentDetailsArray.InstalmentCode fromValue(String value) {
            ILUCSBInstalmentDetailsArray.InstalmentCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
