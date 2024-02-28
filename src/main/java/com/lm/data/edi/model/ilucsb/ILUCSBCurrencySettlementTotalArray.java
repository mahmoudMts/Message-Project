
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

/**
 * Array of IAK segments
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "settlementCurrencyCode",
    "currencyTotalForSettlement",
    "ILUCSBBrokerBusinessBalanceArray"
})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ILUCSBCurrencySettlementTotalArray {

    /**
     * Currency code signifying the currency in which settlement is made. This is one of the agreed settlement currencies supported by DPS, using the ISO 4217 standard - 3 character currency code. In the IAK segment, order entries alphabetically on the currency code. Note that ASG do not currently support NZD or SGD, but do support FRF, DEM, NLG, ITL which have all been subsumed into EUR. Discussion with ASG needed.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyCode")
    @JsonPropertyDescription("Currency code signifying the currency in which settlement is made. This is one of the agreed settlement currencies supported by DPS, using the ISO 4217 standard - 3 character currency code. In the IAK segment, order entries alphabetically on the currency code. Note that ASG do not currently support NZD or SGD, but do support FRF, DEM, NLG, ITL which have all been subsumed into EUR. Discussion with ASG needed.")
    @NotNull
    private ILUCSBCurrencySettlementTotalArray.SettlementCurrencyCode settlementCurrencyCode;
    /**
     * The total amount due to be paid to or by a company for the specific settlement currency. Contains either zero or two decimal places. A negative amount is prefixed with a minus sign but a positive amount does NOT need a plus sign. This is using the common module pattern for monetaryAmount.
     * (Required)
     * 
     */
    @JsonProperty("currencyTotalForSettlement")
    @JsonPropertyDescription("The total amount due to be paid to or by a company for the specific settlement currency. Contains either zero or two decimal places. A negative amount is prefixed with a minus sign but a positive amount does NOT need a plus sign. This is using the common module pattern for monetaryAmount.")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    @NotNull
    private String currencyTotalForSettlement;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBBrokerBusinessBalanceArray")
    @Size(max = 9999)
    @Valid
    @NotNull
    private List<ILUCSBBrokerBusinessBalanceArray> iLUCSBBrokerBusinessBalanceArray = new ArrayList<ILUCSBBrokerBusinessBalanceArray>();

    /**
     * Currency code signifying the currency in which settlement is made. This is one of the agreed settlement currencies supported by DPS, using the ISO 4217 standard - 3 character currency code. In the IAK segment, order entries alphabetically on the currency code. Note that ASG do not currently support NZD or SGD, but do support FRF, DEM, NLG, ITL which have all been subsumed into EUR. Discussion with ASG needed.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyCode")
    public ILUCSBCurrencySettlementTotalArray.SettlementCurrencyCode getSettlementCurrencyCode() {
        return settlementCurrencyCode;
    }

    /**
     * Currency code signifying the currency in which settlement is made. This is one of the agreed settlement currencies supported by DPS, using the ISO 4217 standard - 3 character currency code. In the IAK segment, order entries alphabetically on the currency code. Note that ASG do not currently support NZD or SGD, but do support FRF, DEM, NLG, ITL which have all been subsumed into EUR. Discussion with ASG needed.
     * (Required)
     * 
     */
    @JsonProperty("settlementCurrencyCode")
    public void setSettlementCurrencyCode(ILUCSBCurrencySettlementTotalArray.SettlementCurrencyCode settlementCurrencyCode) {
        this.settlementCurrencyCode = settlementCurrencyCode;
    }

    /**
     * The total amount due to be paid to or by a company for the specific settlement currency. Contains either zero or two decimal places. A negative amount is prefixed with a minus sign but a positive amount does NOT need a plus sign. This is using the common module pattern for monetaryAmount.
     * (Required)
     * 
     */
    @JsonProperty("currencyTotalForSettlement")
    public String getCurrencyTotalForSettlement() {
        return currencyTotalForSettlement;
    }

    /**
     * The total amount due to be paid to or by a company for the specific settlement currency. Contains either zero or two decimal places. A negative amount is prefixed with a minus sign but a positive amount does NOT need a plus sign. This is using the common module pattern for monetaryAmount.
     * (Required)
     * 
     */
    @JsonProperty("currencyTotalForSettlement")
    public void setCurrencyTotalForSettlement(String currencyTotalForSettlement) {
        this.currencyTotalForSettlement = currencyTotalForSettlement;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBBrokerBusinessBalanceArray")
    public List<ILUCSBBrokerBusinessBalanceArray> getILUCSBBrokerBusinessBalanceArray() {
        return iLUCSBBrokerBusinessBalanceArray;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBBrokerBusinessBalanceArray")
    public void setILUCSBBrokerBusinessBalanceArray(List<ILUCSBBrokerBusinessBalanceArray> iLUCSBBrokerBusinessBalanceArray) {
        this.iLUCSBBrokerBusinessBalanceArray = iLUCSBBrokerBusinessBalanceArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ILUCSBCurrencySettlementTotalArray.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("settlementCurrencyCode");
        sb.append('=');
        sb.append(((this.settlementCurrencyCode == null)?"<null>":this.settlementCurrencyCode));
        sb.append(',');
        sb.append("currencyTotalForSettlement");
        sb.append('=');
        sb.append(((this.currencyTotalForSettlement == null)?"<null>":this.currencyTotalForSettlement));
        sb.append(',');
        sb.append("iLUCSBBrokerBusinessBalanceArray");
        sb.append('=');
        sb.append(((this.iLUCSBBrokerBusinessBalanceArray == null)?"<null>":this.iLUCSBBrokerBusinessBalanceArray));
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
        result = ((result* 31)+((this.currencyTotalForSettlement == null)? 0 :this.currencyTotalForSettlement.hashCode()));
        result = ((result* 31)+((this.iLUCSBBrokerBusinessBalanceArray == null)? 0 :this.iLUCSBBrokerBusinessBalanceArray.hashCode()));
        result = ((result* 31)+((this.settlementCurrencyCode == null)? 0 :this.settlementCurrencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ILUCSBCurrencySettlementTotalArray) == false) {
            return false;
        }
        ILUCSBCurrencySettlementTotalArray rhs = ((ILUCSBCurrencySettlementTotalArray) other);
        return (((((this.currencyTotalForSettlement == rhs.currencyTotalForSettlement)||((this.currencyTotalForSettlement!= null)&&this.currencyTotalForSettlement.equals(rhs.currencyTotalForSettlement))))&&((this.iLUCSBBrokerBusinessBalanceArray == rhs.iLUCSBBrokerBusinessBalanceArray)||((this.iLUCSBBrokerBusinessBalanceArray!= null)&&this.iLUCSBBrokerBusinessBalanceArray.equals(rhs.iLUCSBBrokerBusinessBalanceArray))))&&((this.settlementCurrencyCode == rhs.settlementCurrencyCode)||((this.settlementCurrencyCode!= null)&&this.settlementCurrencyCode.equals(rhs.settlementCurrencyCode))));
    }


    /**
     * Currency code signifying the currency in which settlement is made. This is one of the agreed settlement currencies supported by DPS, using the ISO 4217 standard - 3 character currency code. In the IAK segment, order entries alphabetically on the currency code. Note that ASG do not currently support NZD or SGD, but do support FRF, DEM, NLG, ITL which have all been subsumed into EUR. Discussion with ASG needed.
     * 
     */
    //@Generated("jsonschema2pojo")
    public enum SettlementCurrencyCode {

        AUD("AUD"),
        CAD("CAD"),
        CHF("CHF"),
        DKK("DKK"),
        EUR("EUR"),
        GBP("GBP"),
        HKD("HKD"),
        JPY("JPY"),
        NZD("NZD"),
        NOK("NOK"),
        SEK("SEK"),
        SGD("SGD"),
        USD("USD"),
        ZAR("ZAR");
        private final String value;
        private final static Map<String, ILUCSBCurrencySettlementTotalArray.SettlementCurrencyCode> CONSTANTS = new HashMap<String, ILUCSBCurrencySettlementTotalArray.SettlementCurrencyCode>();

        static {
            for (ILUCSBCurrencySettlementTotalArray.SettlementCurrencyCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SettlementCurrencyCode(String value) {
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
        public static ILUCSBCurrencySettlementTotalArray.SettlementCurrencyCode fromValue(String value) {
            ILUCSBCurrencySettlementTotalArray.SettlementCurrencyCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
