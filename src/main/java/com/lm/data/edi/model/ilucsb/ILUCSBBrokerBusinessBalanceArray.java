
package com.lm.data.edi.model.ilucsb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import javax.annotation.processing.Generated;
import javax.validation.Valid;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brokerCode",
    "businessCategory",
    "brokerBusinessBalanceAmount",
    "ILUCSBInstalmentDetailsArray"
})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ILUCSBBrokerBusinessBalanceArray {

    /**
     * Broker Code. A unique number allocated to a broker for identification.This element will always be present. There is no need for leading zeros if less than 4 characters. Order entries in the IAL segment by ascending order of broker code.
     * (Required)
     * 
     */
    @JsonProperty("brokerCode")
    @JsonPropertyDescription("Broker Code. A unique number allocated to a broker for identification.This element will always be present. There is no need for leading zeros if less than 4 characters. Order entries in the IAL segment by ascending order of broker code.")
    @Pattern(regexp = "[1-9][0-9]{0,3}")
    @NotNull
    private String brokerCode;
    /**
     * Business category used to group transactions. A code used to group transactions for totalling on settlement documentation produced by the ILU. There are 22 options - 1-11 & 801-811 inclusive. Note that for 1-11, there is no need to include  leading zeros as per the ASG payload
     * (Required)
     * 
     */
    @JsonProperty("businessCategory")
    @JsonPropertyDescription("Business category used to group transactions. A code used to group transactions for totalling on settlement documentation produced by the ILU. There are 22 options - 1-11 & 801-811 inclusive. Note that for 1-11, there is no need to include  leading zeros as per the ASG payload")
    @NotNull
    private String businessCategory;
    /**
     * Broker or Business Balance amount. This value will equal the sum of the nettPremiumOrClaim values nested beneath in IAM.  This element will not be present for nil premiums/claims. Otherwise, it could be positive or negative. If negative, it is prefixed with '-'. If positive, there is no need to prefix it with '+'. The pattern used is from the common components element monetaryAmount.
     * 
     */
    @JsonProperty("brokerBusinessBalanceAmount")
    @JsonPropertyDescription("Broker or Business Balance amount. This value will equal the sum of the nettPremiumOrClaim values nested beneath in IAM.  This element will not be present for nil premiums/claims. Otherwise, it could be positive or negative. If negative, it is prefixed with '-'. If positive, there is no need to prefix it with '+'. The pattern used is from the common components element monetaryAmount.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String brokerBusinessBalanceAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBInstalmentDetailsArray")
    @Size(max = 9999)
    @Valid
    @NotNull
    private List<ILUCSBInstalmentDetailsArray> iLUCSBInstalmentDetailsArray = new ArrayList<ILUCSBInstalmentDetailsArray>();

    /**
     * Broker Code. A unique number allocated to a broker for identification.This element will always be present. There is no need for leading zeros if less than 4 characters. Order entries in the IAL segment by ascending order of broker code.
     * (Required)
     * 
     */
    @JsonProperty("brokerCode")
    public String getBrokerCode() {
        return brokerCode;
    }

    /**
     * Broker Code. A unique number allocated to a broker for identification.This element will always be present. There is no need for leading zeros if less than 4 characters. Order entries in the IAL segment by ascending order of broker code.
     * (Required)
     * 
     */
    @JsonProperty("brokerCode")
    public void setBrokerCode(String brokerCode) {
        this.brokerCode = brokerCode;
    }

    /**
     * Business category used to group transactions. A code used to group transactions for totalling on settlement documentation produced by the ILU. There are 22 options - 1-11 & 801-811 inclusive. Note that for 1-11, there is no need to include  leading zeros as per the ASG payload
     * (Required)
     * 
     */
    @JsonProperty("businessCategory")
    public String getBusinessCategory() {
        return businessCategory;
    }

    /**
     * Business category used to group transactions. A code used to group transactions for totalling on settlement documentation produced by the ILU. There are 22 options - 1-11 & 801-811 inclusive. Note that for 1-11, there is no need to include  leading zeros as per the ASG payload
     * (Required)
     * 
     */
    @JsonProperty("businessCategory")
    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    /**
     * Broker or Business Balance amount. This value will equal the sum of the nettPremiumOrClaim values nested beneath in IAM.  This element will not be present for nil premiums/claims. Otherwise, it could be positive or negative. If negative, it is prefixed with '-'. If positive, there is no need to prefix it with '+'. The pattern used is from the common components element monetaryAmount.
     * 
     */
    @JsonProperty("brokerBusinessBalanceAmount")
    public String getBrokerBusinessBalanceAmount() {
        return brokerBusinessBalanceAmount;
    }

    /**
     * Broker or Business Balance amount. This value will equal the sum of the nettPremiumOrClaim values nested beneath in IAM.  This element will not be present for nil premiums/claims. Otherwise, it could be positive or negative. If negative, it is prefixed with '-'. If positive, there is no need to prefix it with '+'. The pattern used is from the common components element monetaryAmount.
     * 
     */
    @JsonProperty("brokerBusinessBalanceAmount")
    public void setBrokerBusinessBalanceAmount(String brokerBusinessBalanceAmount) {
        this.brokerBusinessBalanceAmount = brokerBusinessBalanceAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBInstalmentDetailsArray")
    public List<ILUCSBInstalmentDetailsArray> getILUCSBInstalmentDetailsArray() {
        return iLUCSBInstalmentDetailsArray;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBInstalmentDetailsArray")
    public void setILUCSBInstalmentDetailsArray(List<ILUCSBInstalmentDetailsArray> iLUCSBInstalmentDetailsArray) {
        this.iLUCSBInstalmentDetailsArray = iLUCSBInstalmentDetailsArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ILUCSBBrokerBusinessBalanceArray.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brokerCode");
        sb.append('=');
        sb.append(((this.brokerCode == null)?"<null>":this.brokerCode));
        sb.append(',');
        sb.append("businessCategory");
        sb.append('=');
        sb.append(((this.businessCategory == null)?"<null>":this.businessCategory));
        sb.append(',');
        sb.append("brokerBusinessBalanceAmount");
        sb.append('=');
        sb.append(((this.brokerBusinessBalanceAmount == null)?"<null>":this.brokerBusinessBalanceAmount));
        sb.append(',');
        sb.append("iLUCSBInstalmentDetailsArray");
        sb.append('=');
        sb.append(((this.iLUCSBInstalmentDetailsArray == null)?"<null>":this.iLUCSBInstalmentDetailsArray));
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
        result = ((result* 31)+((this.businessCategory == null)? 0 :this.businessCategory.hashCode()));
        result = ((result* 31)+((this.brokerCode == null)? 0 :this.brokerCode.hashCode()));
        result = ((result* 31)+((this.brokerBusinessBalanceAmount == null)? 0 :this.brokerBusinessBalanceAmount.hashCode()));
        result = ((result* 31)+((this.iLUCSBInstalmentDetailsArray == null)? 0 :this.iLUCSBInstalmentDetailsArray.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ILUCSBBrokerBusinessBalanceArray) == false) {
            return false;
        }
        ILUCSBBrokerBusinessBalanceArray rhs = ((ILUCSBBrokerBusinessBalanceArray) other);
        return (((((this.businessCategory == rhs.businessCategory)||((this.businessCategory!= null)&&this.businessCategory.equals(rhs.businessCategory)))&&((this.brokerCode == rhs.brokerCode)||((this.brokerCode!= null)&&this.brokerCode.equals(rhs.brokerCode))))&&((this.brokerBusinessBalanceAmount == rhs.brokerBusinessBalanceAmount)||((this.brokerBusinessBalanceAmount!= null)&&this.brokerBusinessBalanceAmount.equals(rhs.brokerBusinessBalanceAmount))))&&((this.iLUCSBInstalmentDetailsArray == rhs.iLUCSBInstalmentDetailsArray)||((this.iLUCSBInstalmentDetailsArray!= null)&&this.iLUCSBInstalmentDetailsArray.equals(rhs.iLUCSBInstalmentDetailsArray))));
    }


    /**
     * Business category used to group transactions. A code used to group transactions for totalling on settlement documentation produced by the ILU. There are 22 options - 1-11 & 801-811 inclusive. Note that for 1-11, there is no need to include  leading zeros as per the ASG payload
     * 
     */
    //@Generated("jsonschema2pojo")
    public enum BusinessCategory {

        _1("1"),
        _2("2"),
        _3("3"),
        _4("4"),
        _5("5"),
        _6("6"),
        _7("7"),
        _8("8"),
        _9("9"),
        _10("10"),
        _11("11"),
        _801("801"),
        _802("802"),
        _803("803"),
        _804("804"),
        _805("805"),
        _806("806"),
        _807("807"),
        _808("808"),
        _809("809"),
        _810("810"),
        _811("811");
        private final String value;
        private final static Map<String, ILUCSBBrokerBusinessBalanceArray.BusinessCategory> CONSTANTS = new HashMap<String, ILUCSBBrokerBusinessBalanceArray.BusinessCategory>();

        static {
            for (ILUCSBBrokerBusinessBalanceArray.BusinessCategory c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private BusinessCategory(String value) {
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
        public static ILUCSBBrokerBusinessBalanceArray.BusinessCategory fromValue(String value) {
            ILUCSBBrokerBusinessBalanceArray.BusinessCategory constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
