
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


/**
 * This object has the reference to NAD , RFF,PIN,PIA,PER,TXT,FTX
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rffDetails",
    "nadDetails",
    "pinDetails",
    "piaDetails",
    "perDetails",
    "txtDetails",
    "ftxDetails",
    "gR3Container",
    "gR6Container"
})
public class Group1CustomObjects {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rffDetails")
    @Size(min = 1, max = 8)
    @Valid
    @NotNull
    private List<RFFDetails> rffDetails = new ArrayList<RFFDetails>();
    @JsonProperty("nadDetails")
    @Size(min = 1, max = 5)
    @Valid
    private List<NADDetail> nadDetails = new ArrayList<NADDetail>();
    @JsonProperty("pinDetails")
    @Size(min = 1, max = 4)
    @Valid
    private List<PINDetail> pinDetails = new ArrayList<PINDetail>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("piaDetails")
    @Size(min = 1, max = 9)
    @Valid
    @NotNull
    private List<PIADetail> piaDetails = new ArrayList<PIADetail>();
    @JsonProperty("perDetails")
    @Size(min = 1, max = 4)
    @Valid
    private List<PERDetail> perDetails = new ArrayList<PERDetail>();
    @JsonProperty("txtDetails")
    @Size(min = 1, max = 14)
    @Valid
    private List<TXTDetail> txtDetails = new ArrayList<TXTDetail>();
    @JsonProperty("ftxDetails")
    @Size(min = 1, max = 146)
    @Valid
    private List<FTXDetail> ftxDetails = new ArrayList<FTXDetail>();
    @JsonProperty("gR3Container")
    @Size(min = 1, max = 10)
    @Valid
    private List<Group3CustomObject> gR3Container = new ArrayList<Group3CustomObject>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gR6Container")
    @Size(min = 1, max = 10)
    @Valid
    @NotNull
    private List<Group6CustomObject> gR6Container = new ArrayList<Group6CustomObject>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rffDetails")
    public List<RFFDetails> getRffDetails() {
        return rffDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rffDetails")
    public void setRffDetails(List<RFFDetails> rffDetails) {
        this.rffDetails = rffDetails;
    }

    @JsonProperty("nadDetails")
    public List<NADDetail> getNadDetails() {
        return nadDetails;
    }

    @JsonProperty("nadDetails")
    public void setNadDetails(List<NADDetail> nadDetails) {
        this.nadDetails = nadDetails;
    }

    @JsonProperty("pinDetails")
    public List<PINDetail> getPinDetails() {
        return pinDetails;
    }

    @JsonProperty("pinDetails")
    public void setPinDetails(List<PINDetail> pinDetails) {
        this.pinDetails = pinDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("piaDetails")
    public List<PIADetail> getPiaDetails() {
        return piaDetails;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("piaDetails")
    public void setPiaDetails(List<PIADetail> piaDetails) {
        this.piaDetails = piaDetails;
    }

    @JsonProperty("perDetails")
    public List<PERDetail> getPerDetails() {
        return perDetails;
    }

    @JsonProperty("perDetails")
    public void setPerDetails(List<PERDetail> perDetails) {
        this.perDetails = perDetails;
    }

    @JsonProperty("txtDetails")
    public List<TXTDetail> getTxtDetails() {
        return txtDetails;
    }

    @JsonProperty("txtDetails")
    public void setTxtDetails(List<TXTDetail> txtDetails) {
        this.txtDetails = txtDetails;
    }

    @JsonProperty("ftxDetails")
    public List<FTXDetail> getFtxDetails() {
        return ftxDetails;
    }

    @JsonProperty("ftxDetails")
    public void setFtxDetails(List<FTXDetail> ftxDetails) {
        this.ftxDetails = ftxDetails;
    }

    @JsonProperty("gR3Container")
    public List<Group3CustomObject> getGR3Container() {
        return gR3Container;
    }

    @JsonProperty("gR3Container")
    public void setGR3Container(List<Group3CustomObject> gR3Container) {
        this.gR3Container = gR3Container;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gR6Container")
    public List<Group6CustomObject> getGR6Container() {
        return gR6Container;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gR6Container")
    public void setGR6Container(List<Group6CustomObject> gR6Container) {
        this.gR6Container = gR6Container;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group1CustomObjects.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rffDetails");
        sb.append('=');
        sb.append(((this.rffDetails == null)?"<null>":this.rffDetails));
        sb.append(',');
        sb.append("nadDetails");
        sb.append('=');
        sb.append(((this.nadDetails == null)?"<null>":this.nadDetails));
        sb.append(',');
        sb.append("pinDetails");
        sb.append('=');
        sb.append(((this.pinDetails == null)?"<null>":this.pinDetails));
        sb.append(',');
        sb.append("piaDetails");
        sb.append('=');
        sb.append(((this.piaDetails == null)?"<null>":this.piaDetails));
        sb.append(',');
        sb.append("perDetails");
        sb.append('=');
        sb.append(((this.perDetails == null)?"<null>":this.perDetails));
        sb.append(',');
        sb.append("txtDetails");
        sb.append('=');
        sb.append(((this.txtDetails == null)?"<null>":this.txtDetails));
        sb.append(',');
        sb.append("ftxDetails");
        sb.append('=');
        sb.append(((this.ftxDetails == null)?"<null>":this.ftxDetails));
        sb.append(',');
        sb.append("gR3Container");
        sb.append('=');
        sb.append(((this.gR3Container == null)?"<null>":this.gR3Container));
        sb.append(',');
        sb.append("gR6Container");
        sb.append('=');
        sb.append(((this.gR6Container == null)?"<null>":this.gR6Container));
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
        result = ((result* 31)+((this.rffDetails == null)? 0 :this.rffDetails.hashCode()));
        result = ((result* 31)+((this.nadDetails == null)? 0 :this.nadDetails.hashCode()));
        result = ((result* 31)+((this.gR3Container == null)? 0 :this.gR3Container.hashCode()));
        result = ((result* 31)+((this.txtDetails == null)? 0 :this.txtDetails.hashCode()));
        result = ((result* 31)+((this.pinDetails == null)? 0 :this.pinDetails.hashCode()));
        result = ((result* 31)+((this.gR6Container == null)? 0 :this.gR6Container.hashCode()));
        result = ((result* 31)+((this.ftxDetails == null)? 0 :this.ftxDetails.hashCode()));
        result = ((result* 31)+((this.piaDetails == null)? 0 :this.piaDetails.hashCode()));
        result = ((result* 31)+((this.perDetails == null)? 0 :this.perDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group1CustomObjects) == false) {
            return false;
        }
        Group1CustomObjects rhs = ((Group1CustomObjects) other);
        return ((((((((((this.rffDetails == rhs.rffDetails)||((this.rffDetails!= null)&&this.rffDetails.equals(rhs.rffDetails)))&&((this.nadDetails == rhs.nadDetails)||((this.nadDetails!= null)&&this.nadDetails.equals(rhs.nadDetails))))&&((this.gR3Container == rhs.gR3Container)||((this.gR3Container!= null)&&this.gR3Container.equals(rhs.gR3Container))))&&((this.txtDetails == rhs.txtDetails)||((this.txtDetails!= null)&&this.txtDetails.equals(rhs.txtDetails))))&&((this.pinDetails == rhs.pinDetails)||((this.pinDetails!= null)&&this.pinDetails.equals(rhs.pinDetails))))&&((this.gR6Container == rhs.gR6Container)||((this.gR6Container!= null)&&this.gR6Container.equals(rhs.gR6Container))))&&((this.ftxDetails == rhs.ftxDetails)||((this.ftxDetails!= null)&&this.ftxDetails.equals(rhs.ftxDetails))))&&((this.piaDetails == rhs.piaDetails)||((this.piaDetails!= null)&&this.piaDetails.equals(rhs.piaDetails))))&&((this.perDetails == rhs.perDetails)||((this.perDetails!= null)&&this.perDetails.equals(rhs.perDetails))));
    }

}
