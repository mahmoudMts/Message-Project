
package com.lm.data.edi.model.wsett;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrierIdentificationGroupCode",
    "settlementPeriodEnd",
    "WSETTM08SettlementContainers"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyGroupHeaderM01Inner {

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationGroupCode")
    @JsonPropertyDescription("A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.")
    @Pattern(regexp = "[A-Z][0-9]{2}")
    @NotNull
    private String carrierIdentificationGroupCode;
    /**
     * The end date of the settlement period. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementPeriodEnd")
    @JsonPropertyDescription("The end date of the settlement period. DPS Date Stardard applied.")
    @NotNull
    private String settlementPeriodEnd;
    /**
     * M08 Control Record- Control after all M02/M07 for a Currency. Mandatory, Max Occurrence - One per each currency for one company group.
     * 
     */
    @JsonProperty("WSETTM08SettlementContainers")
    @JsonPropertyDescription("M08 Control Record- Control after all M02/M07 for a Currency. Mandatory, Max Occurrence - One per each currency for one company group.")
    @Size(max = 14)
    @Valid
    private List<TotalPerCurrencyM08Inner> wSETTM08SettlementContainers = new ArrayList<TotalPerCurrencyM08Inner>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationGroupCode")
    public String getCarrierIdentificationGroupCode() {
        return carrierIdentificationGroupCode;
    }

    /**
     * A unique group code allocated by Lirma to a Company for identification purposes or the company member code. Pattern tbc or ignored, but as per the examples provided is matching.
     * (Required)
     * 
     */
    @JsonProperty("carrierIdentificationGroupCode")
    public void setCarrierIdentificationGroupCode(String carrierIdentificationGroupCode) {
        this.carrierIdentificationGroupCode = carrierIdentificationGroupCode;
    }

    /**
     * The end date of the settlement period. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementPeriodEnd")
    public String getSettlementPeriodEnd() {
        return settlementPeriodEnd;
    }

    /**
     * The end date of the settlement period. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("settlementPeriodEnd")
    public void setSettlementPeriodEnd(String settlementPeriodEnd) {
        this.settlementPeriodEnd = settlementPeriodEnd;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CompanyGroupHeaderM01Inner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrierIdentificationGroupCode");
        sb.append('=');
        sb.append(((this.carrierIdentificationGroupCode == null)?"<null>":this.carrierIdentificationGroupCode));
        sb.append(',');
        sb.append("settlementPeriodEnd");
        sb.append('=');
        sb.append(((this.settlementPeriodEnd == null)?"<null>":this.settlementPeriodEnd));
        sb.append(',');
        sb.append("wSETTM08SettlementContainers");
        sb.append('=');
        sb.append(((this.wSETTM08SettlementContainers == null)?"<null>":this.wSETTM08SettlementContainers));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.carrierIdentificationGroupCode == null)? 0 :this.carrierIdentificationGroupCode.hashCode()));
        result = ((result* 31)+((this.wSETTM08SettlementContainers == null)? 0 :this.wSETTM08SettlementContainers.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.settlementPeriodEnd == null)? 0 :this.settlementPeriodEnd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CompanyGroupHeaderM01Inner) == false) {
            return false;
        }
        CompanyGroupHeaderM01Inner rhs = ((CompanyGroupHeaderM01Inner) other);
        return (((((this.carrierIdentificationGroupCode == rhs.carrierIdentificationGroupCode)||((this.carrierIdentificationGroupCode!= null)&&this.carrierIdentificationGroupCode.equals(rhs.carrierIdentificationGroupCode)))&&((this.wSETTM08SettlementContainers == rhs.wSETTM08SettlementContainers)||((this.wSETTM08SettlementContainers!= null)&&this.wSETTM08SettlementContainers.equals(rhs.wSETTM08SettlementContainers))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.settlementPeriodEnd == rhs.settlementPeriodEnd)||((this.settlementPeriodEnd!= null)&&this.settlementPeriodEnd.equals(rhs.settlementPeriodEnd))));
    }

}
