
package com.lm.data.edi.model.ilucsb;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "companyAccountingCode",
    "settlementRunNumber",
    "actualPaymentDate",
    "ILUCSBCurrencySettlementTotalArray"
})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ILUCSBContainerArray {

    /**
     * Company Accounting Code. A unique code allocated by the ILU to a company to Group Company codes into settlement accounts. ASG are expecting this to be 4 characters in length. Group entries within the IAJ segment in ascending order of company accounting code
     * (Required)
     * 
     */
    @JsonProperty("companyAccountingCode")
    @JsonPropertyDescription("Company Accounting Code. A unique code allocated by the ILU to a company to Group Company codes into settlement accounts. ASG are expecting this to be 4 characters in length. Group entries within the IAJ segment in ascending order of company accounting code")
    @Pattern(regexp = "[1-9][0-9]{0,3}")
    @NotNull
    private String companyAccountingCode;
    /**
     * Settlement Run Number - contains numbers only. For v1 of this message, it has a length of 4. This is the last 2 digits of the year, followed by the week of the year, giving a maxLength of 4 characters, e.g. 2312 is the 12th week of 2023. For v2 of this message, it has a length of 5. This is the last 2 digits of the year, followed by the sequential run number within the year, giving a maxLength of 5 characters, e.g. 23129 is the 129th run of 2023 (there will be a maximum of 366 runs in a given year). For v2, use leading zeros for the run if necessary to pad the value up to the 5 characters. For the EDI MVP, a v2 message is being produced.
     * (Required)
     * 
     */
    @JsonProperty("settlementRunNumber")
    @JsonPropertyDescription("Settlement Run Number - contains numbers only. For v1 of this message, it has a length of 4. This is the last 2 digits of the year, followed by the week of the year, giving a maxLength of 4 characters, e.g. 2312 is the 12th week of 2023. For v2 of this message, it has a length of 5. This is the last 2 digits of the year, followed by the sequential run number within the year, giving a maxLength of 5 characters, e.g. 23129 is the 129th run of 2023 (there will be a maximum of 366 runs in a given year). For v2, use leading zeros for the run if necessary to pad the value up to the 5 characters. For the EDI MVP, a v2 message is being produced.")
    @Pattern(regexp = "[0-9]{2}(?:36[0-6]|3[0-5][0-9]|[12][0-9]{2}|[012][0-9][1-9]{1}|[1-9][0-9]?)")
    @NotNull
    private String settlementRunNumber;
    /**
     * Actual Payment Date. The date on which the transfer of funds is expected to occur in a standard date format. ASG will convert this on receipt to YYMMDD
     * (Required)
     * 
     */
    @JsonProperty("actualPaymentDate")
    @JsonPropertyDescription("Actual Payment Date. The date on which the transfer of funds is expected to occur in a standard date format. ASG will convert this on receipt to YYMMDD")
    @NotNull
    private String actualPaymentDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBCurrencySettlementTotalArray")
    @Size(max = 25)
    @Valid
    @NotNull
    private List<ILUCSBCurrencySettlementTotalArray> iLUCSBCurrencySettlementTotalArray = new ArrayList<ILUCSBCurrencySettlementTotalArray>();

    /**
     * Company Accounting Code. A unique code allocated by the ILU to a company to Group Company codes into settlement accounts. ASG are expecting this to be 4 characters in length. Group entries within the IAJ segment in ascending order of company accounting code
     * (Required)
     * 
     */
    @JsonProperty("companyAccountingCode")
    public String getCompanyAccountingCode() {
        return companyAccountingCode;
    }

    /**
     * Company Accounting Code. A unique code allocated by the ILU to a company to Group Company codes into settlement accounts. ASG are expecting this to be 4 characters in length. Group entries within the IAJ segment in ascending order of company accounting code
     * (Required)
     * 
     */
    @JsonProperty("companyAccountingCode")
    public void setCompanyAccountingCode(String companyAccountingCode) {
        this.companyAccountingCode = companyAccountingCode;
    }

    /**
     * Settlement Run Number - contains numbers only. For v1 of this message, it has a length of 4. This is the last 2 digits of the year, followed by the week of the year, giving a maxLength of 4 characters, e.g. 2312 is the 12th week of 2023. For v2 of this message, it has a length of 5. This is the last 2 digits of the year, followed by the sequential run number within the year, giving a maxLength of 5 characters, e.g. 23129 is the 129th run of 2023 (there will be a maximum of 366 runs in a given year). For v2, use leading zeros for the run if necessary to pad the value up to the 5 characters. For the EDI MVP, a v2 message is being produced.
     * (Required)
     * 
     */
    @JsonProperty("settlementRunNumber")
    public String getSettlementRunNumber() {
        return settlementRunNumber;
    }

    /**
     * Settlement Run Number - contains numbers only. For v1 of this message, it has a length of 4. This is the last 2 digits of the year, followed by the week of the year, giving a maxLength of 4 characters, e.g. 2312 is the 12th week of 2023. For v2 of this message, it has a length of 5. This is the last 2 digits of the year, followed by the sequential run number within the year, giving a maxLength of 5 characters, e.g. 23129 is the 129th run of 2023 (there will be a maximum of 366 runs in a given year). For v2, use leading zeros for the run if necessary to pad the value up to the 5 characters. For the EDI MVP, a v2 message is being produced.
     * (Required)
     * 
     */
    @JsonProperty("settlementRunNumber")
    public void setSettlementRunNumber(String settlementRunNumber) {
        this.settlementRunNumber = settlementRunNumber;
    }

    /**
     * Actual Payment Date. The date on which the transfer of funds is expected to occur in a standard date format. ASG will convert this on receipt to YYMMDD
     * (Required)
     * 
     */
    @JsonProperty("actualPaymentDate")
    public String getActualPaymentDate() {
        return actualPaymentDate;
    }

    /**
     * Actual Payment Date. The date on which the transfer of funds is expected to occur in a standard date format. ASG will convert this on receipt to YYMMDD
     * (Required)
     * 
     */
    @JsonProperty("actualPaymentDate")
    public void setActualPaymentDate(String actualPaymentDate) {
        this.actualPaymentDate = actualPaymentDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBCurrencySettlementTotalArray")
    public List<ILUCSBCurrencySettlementTotalArray> getILUCSBCurrencySettlementTotalArray() {
        return iLUCSBCurrencySettlementTotalArray;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBCurrencySettlementTotalArray")
    public void setILUCSBCurrencySettlementTotalArray(List<ILUCSBCurrencySettlementTotalArray> iLUCSBCurrencySettlementTotalArray) {
        this.iLUCSBCurrencySettlementTotalArray = iLUCSBCurrencySettlementTotalArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ILUCSBContainerArray.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("companyAccountingCode");
        sb.append('=');
        sb.append(((this.companyAccountingCode == null)?"<null>":this.companyAccountingCode));
        sb.append(',');
        sb.append("settlementRunNumber");
        sb.append('=');
        sb.append(((this.settlementRunNumber == null)?"<null>":this.settlementRunNumber));
        sb.append(',');
        sb.append("actualPaymentDate");
        sb.append('=');
        sb.append(((this.actualPaymentDate == null)?"<null>":this.actualPaymentDate));
        sb.append(',');
        sb.append("iLUCSBCurrencySettlementTotalArray");
        sb.append('=');
        sb.append(((this.iLUCSBCurrencySettlementTotalArray == null)?"<null>":this.iLUCSBCurrencySettlementTotalArray));
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
        result = ((result* 31)+((this.settlementRunNumber == null)? 0 :this.settlementRunNumber.hashCode()));
        result = ((result* 31)+((this.actualPaymentDate == null)? 0 :this.actualPaymentDate.hashCode()));
        result = ((result* 31)+((this.companyAccountingCode == null)? 0 :this.companyAccountingCode.hashCode()));
        result = ((result* 31)+((this.iLUCSBCurrencySettlementTotalArray == null)? 0 :this.iLUCSBCurrencySettlementTotalArray.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ILUCSBContainerArray) == false) {
            return false;
        }
        ILUCSBContainerArray rhs = ((ILUCSBContainerArray) other);
        return (((((this.settlementRunNumber == rhs.settlementRunNumber)||((this.settlementRunNumber!= null)&&this.settlementRunNumber.equals(rhs.settlementRunNumber)))&&((this.actualPaymentDate == rhs.actualPaymentDate)||((this.actualPaymentDate!= null)&&this.actualPaymentDate.equals(rhs.actualPaymentDate))))&&((this.companyAccountingCode == rhs.companyAccountingCode)||((this.companyAccountingCode!= null)&&this.companyAccountingCode.equals(rhs.companyAccountingCode))))&&((this.iLUCSBCurrencySettlementTotalArray == rhs.iLUCSBCurrencySettlementTotalArray)||((this.iLUCSBCurrencySettlementTotalArray!= null)&&this.iLUCSBCurrencySettlementTotalArray.equals(rhs.iLUCSBCurrencySettlementTotalArray))));
    }

}
