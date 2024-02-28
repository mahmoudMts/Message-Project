
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "DTMAarray",
    "GR1Container",
    "TrailerUNS",
    "TrailerTRAArray"
})
public class MessagePayloadInner {

    /**
     * record unique identifier
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("record unique identifier")
    private UUID id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DTMAarray")
    @Size(min = 1, max = 3)
    @Valid
    @NotNull
    private List<DTMDetail> dTMAarray = new ArrayList<DTMDetail>();
    /**
     * Has group1CustomObjects object
     * (Required)
     * 
     */
    @JsonProperty("GR1Container")
    @JsonPropertyDescription("Has group1CustomObjects object")
    @Size(min = 1, max = 5000)
    @Valid
    @NotNull
    private List<Group1CustomObjects> gR1Container = new ArrayList<Group1CustomObjects>();
    /**
     * Section Control Segment UNS - A. To separate header, detail and summary sections of a message
     * (Required)
     * 
     */
    @JsonProperty("TrailerUNS")
    @JsonPropertyDescription("Section Control Segment UNS - A. To separate header, detail and summary sections of a message")
    @Valid
    @NotNull
    private TrailerUNS trailerUNS;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TrailerTRAArray")
    @Size(min = 1, max = 2)
    @Valid
    @NotNull
    private List<TrailerTRA> trailerTRAArray = new ArrayList<TrailerTRA>();

    /**
     * record unique identifier
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * record unique identifier
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DTMAarray")
    public List<DTMDetail> getDTMAarray() {
        return dTMAarray;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DTMAarray")
    public void setDTMAarray(List<DTMDetail> dTMAarray) {
        this.dTMAarray = dTMAarray;
    }

    /**
     * Has group1CustomObjects object
     * (Required)
     * 
     */
    @JsonProperty("GR1Container")
    public List<Group1CustomObjects> getGR1Container() {
        return gR1Container;
    }

    /**
     * Has group1CustomObjects object
     * (Required)
     * 
     */
    @JsonProperty("GR1Container")
    public void setGR1Container(List<Group1CustomObjects> gR1Container) {
        this.gR1Container = gR1Container;
    }

    /**
     * Section Control Segment UNS - A. To separate header, detail and summary sections of a message
     * (Required)
     * 
     */
    @JsonProperty("TrailerUNS")
    public TrailerUNS getTrailerUNS() {
        return trailerUNS;
    }

    /**
     * Section Control Segment UNS - A. To separate header, detail and summary sections of a message
     * (Required)
     * 
     */
    @JsonProperty("TrailerUNS")
    public void setTrailerUNS(TrailerUNS trailerUNS) {
        this.trailerUNS = trailerUNS;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TrailerTRAArray")
    public List<TrailerTRA> getTrailerTRAArray() {
        return trailerTRAArray;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TrailerTRAArray")
    public void setTrailerTRAArray(List<TrailerTRA> trailerTRAArray) {
        this.trailerTRAArray = trailerTRAArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MessagePayloadInner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("dTMAarray");
        sb.append('=');
        sb.append(((this.dTMAarray == null)?"<null>":this.dTMAarray));
        sb.append(',');
        sb.append("gR1Container");
        sb.append('=');
        sb.append(((this.gR1Container == null)?"<null>":this.gR1Container));
        sb.append(',');
        sb.append("trailerUNS");
        sb.append('=');
        sb.append(((this.trailerUNS == null)?"<null>":this.trailerUNS));
        sb.append(',');
        sb.append("trailerTRAArray");
        sb.append('=');
        sb.append(((this.trailerTRAArray == null)?"<null>":this.trailerTRAArray));
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
        result = ((result* 31)+((this.dTMAarray == null)? 0 :this.dTMAarray.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.gR1Container == null)? 0 :this.gR1Container.hashCode()));
        result = ((result* 31)+((this.trailerUNS == null)? 0 :this.trailerUNS.hashCode()));
        result = ((result* 31)+((this.trailerTRAArray == null)? 0 :this.trailerTRAArray.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessagePayloadInner) == false) {
            return false;
        }
        MessagePayloadInner rhs = ((MessagePayloadInner) other);
        return ((((((this.dTMAarray == rhs.dTMAarray)||((this.dTMAarray!= null)&&this.dTMAarray.equals(rhs.dTMAarray)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.gR1Container == rhs.gR1Container)||((this.gR1Container!= null)&&this.gR1Container.equals(rhs.gR1Container))))&&((this.trailerUNS == rhs.trailerUNS)||((this.trailerUNS!= null)&&this.trailerUNS.equals(rhs.trailerUNS))))&&((this.trailerTRAArray == rhs.trailerTRAArray)||((this.trailerTRAArray!= null)&&this.trailerTRAArray.equals(rhs.trailerTRAArray))));
    }

}
