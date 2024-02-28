
package com.lm.data.edi.model.wsett;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


/**
 * The actual settlement detail information and the information in the separate segments (M01-M09) will repeat as many times as needed for each Carrier group. M09 segment will be produced by ASG
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "M01Record",
    "WSETTM08SettlementContainers",
    "WSETTM07SettlementContainers",
    "WSETTM02Array"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SettlementDataDetails {

    /**
     * M01 Header Data Record- Settlement, Mandatory, One occurrence for each company Group in a particular IE Account. Identifies the company to which the settlement applies and the end of the settlement period to which the settlement details apply.
     *
     */
    @JsonProperty("M01Record")
    @JsonPropertyDescription("M01 Header Data Record- Settlement, Mandatory, One occurrence for each company Group in a particular IE Account. Identifies the company to which the settlement applies and the end of the settlement period to which the settlement details apply.")
    @Size(min = 1)
    @Valid
    private List<CompanyGroupHeaderM01Inner> m01Record = new ArrayList<CompanyGroupHeaderM01Inner>();
    /**
     * M08 Control Record- Control after all M02/M07 for a Currency. Mandatory, Max Occurrence - One per each currency for one company group.
     *
     */
    @JsonProperty("WSETTM08SettlementContainers")
    @JsonPropertyDescription("M08 Control Record- Control after all M02/M07 for a Currency. Mandatory, Max Occurrence - One per each currency for one company group.")
    @Size(max = 14)
    @Valid
    private List<TotalPerCurrencyM08Inner> wSETTM08SettlementContainers = new ArrayList<TotalPerCurrencyM08Inner>();
    /**
     * M07 Control Record- Control after all M02 for Broker for the relevant currency. Mandatory, Max Occurrence - The M07 will repeat under same company group for each broker code for each one of the currencies.
     *
     */
    @JsonProperty("WSETTM07SettlementContainers")
    @JsonPropertyDescription("M07 Control Record- Control after all M02 for Broker for the relevant currency. Mandatory, Max Occurrence - The M07 will repeat under same company group for each broker code for each one of the currencies.")
    @Valid
    private List<TotalPerBrokerM07Inner> wSETTM07SettlementContainers = new ArrayList<TotalPerBrokerM07Inner>();
    /**
     * Broker items within currency sequence. Mandatory, Max Occurrence - the M02 will repeat for under same company group for different broker codes and currencies. Each broker code will have one or more M02 records written based on input data. There is an M02 record for each settlement transaction that the company group has to settle. There is no limit to the number of M02 records. It is limited only by the number of transactions to be settled on a particular day (TBC what is this number).
     *
     */
    @JsonProperty("WSETTM02Array")
    @JsonPropertyDescription("Broker items within currency sequence. Mandatory, Max Occurrence - the M02 will repeat for under same company group for different broker codes and currencies. Each broker code will have one or more M02 records written based on input data. There is an M02 record for each settlement transaction that the company group has to settle. There is no limit to the number of M02 records. It is limited only by the number of transactions to be settled on a particular day (TBC what is this number).")
    @Valid
    private List<SettlementTransactionDetailM02Inner> wSETTM02Array = new ArrayList<SettlementTransactionDetailM02Inner>();


    /**
     * M01 Header Data Record- Settlement, Mandatory, One occurrence for each company Group in a particular IE Account. Identifies the company to which the settlement applies and the end of the settlement period to which the settlement details apply.
     *
     */
    @JsonProperty("M01Record")
    public List<CompanyGroupHeaderM01Inner> getM01Record() {
        return m01Record;
    }

    /**
     * M01 Header Data Record- Settlement, Mandatory, One occurrence for each company Group in a particular IE Account. Identifies the company to which the settlement applies and the end of the settlement period to which the settlement details apply.
     *
     */
    @JsonProperty("M01Record")
    public void setM01Record(List<CompanyGroupHeaderM01Inner> m01Record) {
        this.m01Record = m01Record;
    }

    /**
     * M08 Control Record- Control after all M02/M07 for a Currency. Mandatory, Max Occurrence - One per each currency for one company group.
     *
     */
    @JsonProperty("WSETTM08SettlementContainers")
    public List<TotalPerCurrencyM08Inner> getWSETTM08SettlementContainers() {
        return wSETTM08SettlementContainers;
    }

    /**
     * M08 Control Record- Control after all M02/M07 for a Currency. Mandatory, Max Occurrence - One per each currency for one company group.
     *
     */
    @JsonProperty("WSETTM08SettlementContainers")
    public void setWSETTM08SettlementContainers(List<TotalPerCurrencyM08Inner> wSETTM08SettlementContainers) {
        this.wSETTM08SettlementContainers = wSETTM08SettlementContainers;
    }

    /**
     * M07 Control Record- Control after all M02 for Broker for the relevant currency. Mandatory, Max Occurrence - The M07 will repeat under same company group for each broker code for each one of the currencies.
     *
     */
    @JsonProperty("WSETTM07SettlementContainers")
    public List<TotalPerBrokerM07Inner> getWSETTM07SettlementContainers() {
        return wSETTM07SettlementContainers;
    }

    /**
     * M07 Control Record- Control after all M02 for Broker for the relevant currency. Mandatory, Max Occurrence - The M07 will repeat under same company group for each broker code for each one of the currencies.
     *
     */
    @JsonProperty("WSETTM07SettlementContainers")
    public void setWSETTM07SettlementContainers(List<TotalPerBrokerM07Inner> wSETTM07SettlementContainers) {
        this.wSETTM07SettlementContainers = wSETTM07SettlementContainers;
    }

    /**
     * Broker items within currency sequence. Mandatory, Max Occurrence - the M02 will repeat for under same company group for different broker codes and currencies. Each broker code will have one or more M02 records written based on input data. There is an M02 record for each settlement transaction that the company group has to settle. There is no limit to the number of M02 records. It is limited only by the number of transactions to be settled on a particular day (TBC what is this number).
     *
     */
    @JsonProperty("WSETTM02Array")
    public List<SettlementTransactionDetailM02Inner> getWSETTM02Array() {
        return wSETTM02Array;
    }

    /**
     * Broker items within currency sequence. Mandatory, Max Occurrence - the M02 will repeat for under same company group for different broker codes and currencies. Each broker code will have one or more M02 records written based on input data. There is an M02 record for each settlement transaction that the company group has to settle. There is no limit to the number of M02 records. It is limited only by the number of transactions to be settled on a particular day (TBC what is this number).
     *
     */
    @JsonProperty("WSETTM02Array")
    public void setWSETTM02Array(List<SettlementTransactionDetailM02Inner> wSETTM02Array) {
        this.wSETTM02Array = wSETTM02Array;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SettlementDataDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("m01Record");
        sb.append('=');
        sb.append(((this.m01Record == null)?"<null>":this.m01Record));
        sb.append(',');
        sb.append("wSETTM08SettlementContainers");
        sb.append('=');
        sb.append(((this.wSETTM08SettlementContainers == null)?"<null>":this.wSETTM08SettlementContainers));
        sb.append(',');
        sb.append("wSETTM07SettlementContainers");
        sb.append('=');
        sb.append(((this.wSETTM07SettlementContainers == null)?"<null>":this.wSETTM07SettlementContainers));
        sb.append(',');
        sb.append("wSETTM02Array");
        sb.append('=');
        sb.append(((this.wSETTM02Array == null)?"<null>":this.wSETTM02Array));
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
        result = ((result* 31)+((this.wSETTM02Array == null)? 0 :this.wSETTM02Array.hashCode()));
        result = ((result* 31)+((this.wSETTM08SettlementContainers == null)? 0 :this.wSETTM08SettlementContainers.hashCode()));
        result = ((result* 31)+((this.wSETTM07SettlementContainers == null)? 0 :this.wSETTM07SettlementContainers.hashCode()));
        result = ((result* 31)+((this.m01Record == null)? 0 :this.m01Record.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SettlementDataDetails) == false) {
            return false;
        }
        SettlementDataDetails rhs = ((SettlementDataDetails) other);
        return (((((this.wSETTM02Array == rhs.wSETTM02Array)||((this.wSETTM02Array!= null)&&this.wSETTM02Array.equals(rhs.wSETTM02Array)))&&((this.wSETTM08SettlementContainers == rhs.wSETTM08SettlementContainers)||((this.wSETTM08SettlementContainers!= null)&&this.wSETTM08SettlementContainers.equals(rhs.wSETTM08SettlementContainers))))&&((this.wSETTM07SettlementContainers == rhs.wSETTM07SettlementContainers)||((this.wSETTM07SettlementContainers!= null)&&this.wSETTM07SettlementContainers.equals(rhs.wSETTM07SettlementContainers))))&&((this.m01Record == rhs.m01Record)||((this.m01Record!= null)&&this.m01Record.equals(rhs.m01Record))));
    }

}
