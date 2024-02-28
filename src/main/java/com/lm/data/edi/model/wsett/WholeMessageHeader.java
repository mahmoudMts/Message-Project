
package com.lm.data.edi.model.wsett;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
 * Start of a communication interchange between members, containing interchange control details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrierName",
    "messageNo",
    "lastDate",
    "currentDate",
    "carrierIdentificationGroupCode"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WholeMessageHeader {

    /**
     * Name of the carrier. Obtained from IE Database – using IE Account, IE User ID and Company Code.
     * (Required)
     * 
     */
    @JsonProperty("carrierName")
    @JsonPropertyDescription("Name of the carrier. Obtained from IE Database \u2013 using IE Account, IE User ID and Company Code.")
    @Size(max = 9)
    @NotNull
    private String carrierName;
    /**
     * Message running sequence number number, allocated to each settlement message, incremented each day.
     * (Required)
     * 
     */
    @JsonProperty("messageNo")
    @JsonPropertyDescription("Message running sequence number number, allocated to each settlement message, incremented each day.")
    @Pattern(regexp = "[0-9]{0,4}")
    @NotNull
    private String messageNo;
    /**
     * Last date a settlement message has been sent. DPS Date Standard applied.
     * (Required)
     * 
     */
    @JsonProperty("lastDate")
    @JsonPropertyDescription("Last date a settlement message has been sent. DPS Date Standard applied.")
    @NotNull
    private String lastDate;
    /**
     * Todays date. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("currentDate")
    @JsonPropertyDescription("Todays date. DPS Date Stardard applied.")
    @NotNull
    private String currentDate;
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
     * Name of the carrier. Obtained from IE Database – using IE Account, IE User ID and Company Code.
     * (Required)
     * 
     */
    @JsonProperty("carrierName")
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Name of the carrier. Obtained from IE Database – using IE Account, IE User ID and Company Code.
     * (Required)
     * 
     */
    @JsonProperty("carrierName")
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Message running sequence number number, allocated to each settlement message, incremented each day.
     * (Required)
     * 
     */
    @JsonProperty("messageNo")
    public String getMessageNo() {
        return messageNo;
    }

    /**
     * Message running sequence number number, allocated to each settlement message, incremented each day.
     * (Required)
     * 
     */
    @JsonProperty("messageNo")
    public void setMessageNo(String messageNo) {
        this.messageNo = messageNo;
    }

    /**
     * Last date a settlement message has been sent. DPS Date Standard applied.
     * (Required)
     * 
     */
    @JsonProperty("lastDate")
    public String getLastDate() {
        return lastDate;
    }

    /**
     * Last date a settlement message has been sent. DPS Date Standard applied.
     * (Required)
     * 
     */
    @JsonProperty("lastDate")
    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    /**
     * Todays date. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("currentDate")
    public String getCurrentDate() {
        return currentDate;
    }

    /**
     * Todays date. DPS Date Stardard applied.
     * (Required)
     * 
     */
    @JsonProperty("currentDate")
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WholeMessageHeader.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrierName");
        sb.append('=');
        sb.append(((this.carrierName == null)?"<null>":this.carrierName));
        sb.append(',');
        sb.append("messageNo");
        sb.append('=');
        sb.append(((this.messageNo == null)?"<null>":this.messageNo));
        sb.append(',');
        sb.append("lastDate");
        sb.append('=');
        sb.append(((this.lastDate == null)?"<null>":this.lastDate));
        sb.append(',');
        sb.append("currentDate");
        sb.append('=');
        sb.append(((this.currentDate == null)?"<null>":this.currentDate));
        sb.append(',');
        sb.append("carrierIdentificationGroupCode");
        sb.append('=');
        sb.append(((this.carrierIdentificationGroupCode == null)?"<null>":this.carrierIdentificationGroupCode));
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
        result = ((result* 31)+((this.messageNo == null)? 0 :this.messageNo.hashCode()));
        result = ((result* 31)+((this.carrierName == null)? 0 :this.carrierName.hashCode()));
        result = ((result* 31)+((this.currentDate == null)? 0 :this.currentDate.hashCode()));
        result = ((result* 31)+((this.carrierIdentificationGroupCode == null)? 0 :this.carrierIdentificationGroupCode.hashCode()));
        result = ((result* 31)+((this.lastDate == null)? 0 :this.lastDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WholeMessageHeader) == false) {
            return false;
        }
        WholeMessageHeader rhs = ((WholeMessageHeader) other);
        return (((((((this.messageNo == rhs.messageNo)||((this.messageNo!= null)&&this.messageNo.equals(rhs.messageNo)))&&((this.carrierName == rhs.carrierName)||((this.carrierName!= null)&&this.carrierName.equals(rhs.carrierName))))&&((this.currentDate == rhs.currentDate)||((this.currentDate!= null)&&this.currentDate.equals(rhs.currentDate))))&&((this.carrierIdentificationGroupCode == rhs.carrierIdentificationGroupCode)||((this.carrierIdentificationGroupCode!= null)&&this.carrierIdentificationGroupCode.equals(rhs.carrierIdentificationGroupCode)))))&&((this.lastDate == rhs.lastDate)||((this.lastDate!= null)&&this.lastDate.equals(rhs.lastDate))));
    }

}
