
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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerID",
    "ILUCSBContainerArray"
})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Settlement {

    /**
     * A segment that identifies the company to which the settlement applies and the settlement run number and actual payment date to which the settlement details apply.
     * 
     */
    @JsonProperty("containerID")
    @JsonPropertyDescription("A segment that identifies the company to which the settlement applies and the settlement run number and actual payment date to which the settlement details apply.")
    private String containerID;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ILUCSBContainerArray")
    @Size(max = 99)
    @Valid
    @NotNull
    private List<ILUCSBContainerArray> iLUCSBContainerArray = new ArrayList<ILUCSBContainerArray>();

    /**
     * A segment that identifies the company to which the settlement applies and the settlement run number and actual payment date to which the settlement details apply.
     * 
     */
    @JsonProperty("containerID")
    public String getContainerID() {
        return containerID;
    }

    /**
     * A segment that identifies the company to which the settlement applies and the settlement run number and actual payment date to which the settlement details apply.
     * 
     */
    @JsonProperty("containerID")
    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }

    @JsonProperty("ILUCSBContainerArray")
    public List<ILUCSBContainerArray> getILUCSBContainerArray() {
        return iLUCSBContainerArray;
    }

    @JsonProperty("ILUCSBContainerArray")
    public void setILUCSBContainerArray(List<ILUCSBContainerArray> iLUCSBContainerArray) {
        this.iLUCSBContainerArray = iLUCSBContainerArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Settlement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerID");
        sb.append('=');
        sb.append(((this.containerID == null)?"<null>":this.containerID));
        sb.append(',');
        sb.append("iLUCSBContainerArray");
        sb.append('=');
        sb.append(((this.iLUCSBContainerArray == null)?"<null>":this.iLUCSBContainerArray));
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
        result = ((result* 31)+((this.containerID == null)? 0 :this.containerID.hashCode()));
        result = ((result* 31)+((this.iLUCSBContainerArray == null)? 0 :this.iLUCSBContainerArray.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Settlement) == false) {
            return false;
        }
        Settlement rhs = ((Settlement) other);
        return (((this.containerID == rhs.containerID)||((this.containerID!= null)&&this.containerID.equals(rhs.containerID)))&&((this.iLUCSBContainerArray == rhs.iLUCSBContainerArray)||((this.iLUCSBContainerArray!= null)&&this.iLUCSBContainerArray.equals(rhs.iLUCSBContainerArray))));
    }

}
