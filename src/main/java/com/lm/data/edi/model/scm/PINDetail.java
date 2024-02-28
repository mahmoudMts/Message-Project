
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A segment PIN Details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "slipOrder",
    "bureauShare"
})
public class PINDetail {

    /**
     * The percentage representing that proportion of the total sum insured/limits placed on the London Market by the broker
     * 
     */
    @JsonProperty("slipOrder")
    @JsonPropertyDescription("The percentage representing that proportion of the total sum insured/limits placed on the London Market by the broker")
    private Double slipOrder;
    /**
     * Total participation of Lloyd's in a claim, expressed as a percentage
     * 
     */
    @JsonProperty("bureauShare")
    @JsonPropertyDescription("Total participation of Lloyd's in a claim, expressed as a percentage")
    private Double bureauShare;

    /**
     * The percentage representing that proportion of the total sum insured/limits placed on the London Market by the broker
     * 
     */
    @JsonProperty("slipOrder")
    public Double getSlipOrder() {
        return slipOrder;
    }

    /**
     * The percentage representing that proportion of the total sum insured/limits placed on the London Market by the broker
     * 
     */
    @JsonProperty("slipOrder")
    public void setSlipOrder(Double slipOrder) {
        this.slipOrder = slipOrder;
    }

    /**
     * Total participation of Lloyd's in a claim, expressed as a percentage
     * 
     */
    @JsonProperty("bureauShare")
    public Double getBureauShare() {
        return bureauShare;
    }

    /**
     * Total participation of Lloyd's in a claim, expressed as a percentage
     * 
     */
    @JsonProperty("bureauShare")
    public void setBureauShare(Double bureauShare) {
        this.bureauShare = bureauShare;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PINDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("slipOrder");
        sb.append('=');
        sb.append(((this.slipOrder == null)?"<null>":this.slipOrder));
        sb.append(',');
        sb.append("bureauShare");
        sb.append('=');
        sb.append(((this.bureauShare == null)?"<null>":this.bureauShare));
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
        result = ((result* 31)+((this.slipOrder == null)? 0 :this.slipOrder.hashCode()));
        result = ((result* 31)+((this.bureauShare == null)? 0 :this.bureauShare.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PINDetail) == false) {
            return false;
        }
        PINDetail rhs = ((PINDetail) other);
        return (((this.slipOrder == rhs.slipOrder)||((this.slipOrder!= null)&&this.slipOrder.equals(rhs.slipOrder)))&&((this.bureauShare == rhs.bureauShare)||((this.bureauShare!= null)&&this.bureauShare.equals(rhs.bureauShare))));
    }

}
