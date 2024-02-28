
package com.lm.data.edi.model.ilucsb;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.lm.data.edi.model.header.InterchangeHeaderUNB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "interchangeHeaderUNB",
    "Settlement"
})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ILUCSBNotificationPayload {

    /**
     * A mandatory segment which starts a communication interchange. It contains sender and recipient addresses and provides a senders reference to identify the interchange.
     * (Required)
     * 
     */
    @JsonProperty("interchangeHeaderUNB")
    @JsonPropertyDescription("A mandatory segment which starts a communication interchange. It contains sender and recipient addresses and provides a sender\u2019s reference to identify the interchange.")
    @Valid
    @NotNull
    private InterchangeHeaderUNB interchangeHeaderUNB;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Settlement")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<Settlement> settlement = new ArrayList<Settlement>();

    /**
     * A mandatory segment which starts a communication interchange. It contains sender and recipient addresses and provides a senders reference to identify the interchange.
     * (Required)
     * 
     */
    @JsonProperty("interchangeHeaderUNB")
    public InterchangeHeaderUNB getInterchangeHeaderUNB() {
        return interchangeHeaderUNB;
    }

    /**
     * A mandatory segment which starts a communication interchange. It contains sender and recipient addresses and provides a senders reference to identify the interchange.
     * (Required)
     * 
     */
    @JsonProperty("interchangeHeaderUNB")
    public void setInterchangeHeaderUNB(InterchangeHeaderUNB interchangeHeaderUNB) {
        this.interchangeHeaderUNB = interchangeHeaderUNB;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Settlement")
    public List<Settlement> getSettlement() {
        return settlement;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Settlement")
    public void setSettlement(List<Settlement> settlement) {
        this.settlement = settlement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ILUCSBNotificationPayload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("interchangeHeaderUNB");
        sb.append('=');
        sb.append(((this.interchangeHeaderUNB == null)?"<null>":this.interchangeHeaderUNB));
        sb.append(',');
        sb.append("settlement");
        sb.append('=');
        sb.append(((this.settlement == null)?"<null>":this.settlement));
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
        result = ((result* 31)+((this.interchangeHeaderUNB == null)? 0 :this.interchangeHeaderUNB.hashCode()));
        result = ((result* 31)+((this.settlement == null)? 0 :this.settlement.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ILUCSBNotificationPayload) == false) {
            return false;
        }
        ILUCSBNotificationPayload rhs = ((ILUCSBNotificationPayload) other);
        return (((this.interchangeHeaderUNB == rhs.interchangeHeaderUNB)||((this.interchangeHeaderUNB!= null)&&this.interchangeHeaderUNB.equals(rhs.interchangeHeaderUNB)))&&((this.settlement == rhs.settlement)||((this.settlement!= null)&&this.settlement.equals(rhs.settlement))));
    }

}
