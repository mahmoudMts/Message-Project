
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.constraints.NotNull;


/**
 * A segment DTM Details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountingMonth",
    "messageAccountingMonth",
    "monthEndDate"
})
public class DTMDetail {

    /**
     * The earliest open accounting month for which new movements can be advised. Format is YYYYMM00., The earliest open accounting month for which new movements can be advised. Format is YYYYMM00
     * (Required)
     * 
     */
    @JsonProperty("accountingMonth")
    @JsonPropertyDescription("The earliest open accounting month for which new movements can be advised. Format is YYYYMM00., The earliest open accounting month for which new movements can be advised. Format is YYYYMM00")
    @NotNull
    private String accountingMonth;
    /**
     * The earliest open accounting month for which new movements can be advised. Format is YYYYMM00., The earliest open accounting month for which new movements can be advised. Format is YYYYMM00
     * (Required)
     * 
     */
    @JsonProperty("messageAccountingMonth")
    @JsonPropertyDescription("The earliest open accounting month for which new movements can be advised. Format is YYYYMM00., The earliest open accounting month for which new movements can be advised. Format is YYYYMM00")
    @NotNull
    private String messageAccountingMonth;
    /**
     * This segment will be advised in the final  Standard Message (SCM) for the last processing period of an Accounting Month with the Year and Month of that month (YYYYMM00)
     * 
     */
    @JsonProperty("monthEndDate")
    @JsonPropertyDescription("This segment will be advised in the final  Standard Message (SCM) for the last processing period of an Accounting Month with the Year and Month of that month (YYYYMM00)")
    private String monthEndDate;

    /**
     * The earliest open accounting month for which new movements can be advised. Format is YYYYMM00., The earliest open accounting month for which new movements can be advised. Format is YYYYMM00
     * (Required)
     * 
     */
    @JsonProperty("accountingMonth")
    public String getAccountingMonth() {
        return accountingMonth;
    }

    /**
     * The earliest open accounting month for which new movements can be advised. Format is YYYYMM00., The earliest open accounting month for which new movements can be advised. Format is YYYYMM00
     * (Required)
     * 
     */
    @JsonProperty("accountingMonth")
    public void setAccountingMonth(String accountingMonth) {
        this.accountingMonth = accountingMonth;
    }

    /**
     * The earliest open accounting month for which new movements can be advised. Format is YYYYMM00., The earliest open accounting month for which new movements can be advised. Format is YYYYMM00
     * (Required)
     * 
     */
    @JsonProperty("messageAccountingMonth")
    public String getMessageAccountingMonth() {
        return messageAccountingMonth;
    }

    /**
     * The earliest open accounting month for which new movements can be advised. Format is YYYYMM00., The earliest open accounting month for which new movements can be advised. Format is YYYYMM00
     * (Required)
     * 
     */
    @JsonProperty("messageAccountingMonth")
    public void setMessageAccountingMonth(String messageAccountingMonth) {
        this.messageAccountingMonth = messageAccountingMonth;
    }

    /**
     * This segment will be advised in the final  Standard Message (SCM) for the last processing period of an Accounting Month with the Year and Month of that month (YYYYMM00)
     * 
     */
    @JsonProperty("monthEndDate")
    public String getMonthEndDate() {
        return monthEndDate;
    }

    /**
     * This segment will be advised in the final  Standard Message (SCM) for the last processing period of an Accounting Month with the Year and Month of that month (YYYYMM00)
     * 
     */
    @JsonProperty("monthEndDate")
    public void setMonthEndDate(String monthEndDate) {
        this.monthEndDate = monthEndDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DTMDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountingMonth");
        sb.append('=');
        sb.append(((this.accountingMonth == null)?"<null>":this.accountingMonth));
        sb.append(',');
        sb.append("messageAccountingMonth");
        sb.append('=');
        sb.append(((this.messageAccountingMonth == null)?"<null>":this.messageAccountingMonth));
        sb.append(',');
        sb.append("monthEndDate");
        sb.append('=');
        sb.append(((this.monthEndDate == null)?"<null>":this.monthEndDate));
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
        result = ((result* 31)+((this.accountingMonth == null)? 0 :this.accountingMonth.hashCode()));
        result = ((result* 31)+((this.monthEndDate == null)? 0 :this.monthEndDate.hashCode()));
        result = ((result* 31)+((this.messageAccountingMonth == null)? 0 :this.messageAccountingMonth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DTMDetail) == false) {
            return false;
        }
        DTMDetail rhs = ((DTMDetail) other);
        return ((((this.accountingMonth == rhs.accountingMonth)||((this.accountingMonth!= null)&&this.accountingMonth.equals(rhs.accountingMonth)))&&((this.monthEndDate == rhs.monthEndDate)||((this.monthEndDate!= null)&&this.monthEndDate.equals(rhs.monthEndDate))))&&((this.messageAccountingMonth == rhs.messageAccountingMonth)||((this.messageAccountingMonth!= null)&&this.messageAccountingMonth.equals(rhs.messageAccountingMonth))));
    }

}
