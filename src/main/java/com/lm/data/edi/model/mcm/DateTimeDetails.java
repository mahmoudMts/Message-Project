
package com.lm.data.edi.model.mcm;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


/**
 * DTM - DateTimeDetails, Mandatory. DATE / TIME REFERENCE Refer EDI Message MCM Analysis Document TAB  DTM LD0 (DateTimeRef)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "segmentTag",
    "dateTimeQualifier",
    "controlMessagePeriod",
    "yearOfAccount"
})
@AllArgsConstructor
@NoArgsConstructor
public class DateTimeDetails {

    /**
     * Segment for DateTime details . SEGMENT TAG.
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    @JsonPropertyDescription("Segment for DateTime details . SEGMENT TAG.")
    @Size(max = 3)
    @NotNull
    private String segmentTag = "DTM";
    /**
     * QUALIFIER. A qualifier that identifies the date to which the segment relates. CMP - LD0, YAC - E2,  E2 Segment YAC - Year Of Account, CMP - Control Message Period
     * (Required)
     * 
     */
    @JsonProperty("dateTimeQualifier")
    @JsonPropertyDescription("QUALIFIER. A qualifier that identifies the date to which the segment relates. CMP - LD0, YAC - E2,  E2 Segment YAC - Year Of Account, CMP - Control Message Period")
    @NotNull
    private DateTimeDetails.DateTimeQualifier dateTimeQualifier;
    /**
     * OPTIONAL. CONTROL MESSAGE PERIOD . The control period is the month and year the Monthly Control Message represents. The format is YYYYMM00 for DTM Header - ONLY for DTM LD0
     * 
     */
    @JsonProperty("controlMessagePeriod")
    @JsonPropertyDescription("OPTIONAL. CONTROL MESSAGE PERIOD . The control period is the month and year the Monthly Control Message represents. The format is YYYYMM00 for DTM Header - ONLY for DTM LD0")
    private String controlMessagePeriod;
    /**
     * OPTIONAL. YEAR OF ACCOUNT .The format is YYYY0000. The value is populated from the view VSMCTL02.YEAR_OF_ACCOUNT for E2 ONLY
     * 
     */
    @JsonProperty("yearOfAccount")
    @JsonPropertyDescription("OPTIONAL. YEAR OF ACCOUNT .The format is YYYY0000. The value is populated from the view VSMCTL02.YEAR_OF_ACCOUNT for E2 ONLY")
    private String yearOfAccount;

    /**
     * Segment for DateTime details . SEGMENT TAG.
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public String getSegmentTag() {
        return segmentTag;
    }

    /**
     * Segment for DateTime details . SEGMENT TAG.
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    /**
     * QUALIFIER. A qualifier that identifies the date to which the segment relates. CMP - LD0, YAC - E2,  E2 Segment YAC - Year Of Account, CMP - Control Message Period
     * (Required)
     * 
     */
    @JsonProperty("dateTimeQualifier")
    public DateTimeQualifier getDateTimeQualifier() {
        return dateTimeQualifier;
    }

    /**
     * QUALIFIER. A qualifier that identifies the date to which the segment relates. CMP - LD0, YAC - E2,  E2 Segment YAC - Year Of Account, CMP - Control Message Period
     * (Required)
     * 
     */
    @JsonProperty("dateTimeQualifier")
    public void setDateTimeQualifier(DateTimeQualifier dateTimeQualifier) {
        this.dateTimeQualifier = dateTimeQualifier;
    }

    /**
     * OPTIONAL. CONTROL MESSAGE PERIOD . The control period is the month and year the Monthly Control Message represents. The format is YYYYMM00 for DTM Header - ONLY for DTM LD0
     * 
     */
    @JsonProperty("controlMessagePeriod")
    public String getControlMessagePeriod() {
        return controlMessagePeriod;
    }

    /**
     * OPTIONAL. CONTROL MESSAGE PERIOD . The control period is the month and year the Monthly Control Message represents. The format is YYYYMM00 for DTM Header - ONLY for DTM LD0
     * 
     */
    @JsonProperty("controlMessagePeriod")
    public void setControlMessagePeriod(String controlMessagePeriod) {
        this.controlMessagePeriod = controlMessagePeriod;
    }

    /**
     * OPTIONAL. YEAR OF ACCOUNT .The format is YYYY0000. The value is populated from the view VSMCTL02.YEAR_OF_ACCOUNT for E2 ONLY
     * 
     */
    @JsonProperty("yearOfAccount")
    public String getYearOfAccount() {
        return yearOfAccount;
    }

    /**
     * OPTIONAL. YEAR OF ACCOUNT .The format is YYYY0000. The value is populated from the view VSMCTL02.YEAR_OF_ACCOUNT for E2 ONLY
     * 
     */
    @JsonProperty("yearOfAccount")
    public void setYearOfAccount(String yearOfAccount) {
        this.yearOfAccount = yearOfAccount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DateTimeDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("segmentTag");
        sb.append('=');
        sb.append(((this.segmentTag == null)?"<null>":this.segmentTag));
        sb.append(',');
        sb.append("dateTimeQualifier");
        sb.append('=');
        sb.append(((this.dateTimeQualifier == null)?"<null>":this.dateTimeQualifier));
        sb.append(',');
        sb.append("controlMessagePeriod");
        sb.append('=');
        sb.append(((this.controlMessagePeriod == null)?"<null>":this.controlMessagePeriod));
        sb.append(',');
        sb.append("yearOfAccount");
        sb.append('=');
        sb.append(((this.yearOfAccount == null)?"<null>":this.yearOfAccount));
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
        result = ((result* 31)+((this.yearOfAccount == null)? 0 :this.yearOfAccount.hashCode()));
        result = ((result* 31)+((this.segmentTag == null)? 0 :this.segmentTag.hashCode()));
        result = ((result* 31)+((this.dateTimeQualifier == null)? 0 :this.dateTimeQualifier.hashCode()));
        result = ((result* 31)+((this.controlMessagePeriod == null)? 0 :this.controlMessagePeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DateTimeDetails) == false) {
            return false;
        }
        DateTimeDetails rhs = ((DateTimeDetails) other);
        return (((((this.yearOfAccount == rhs.yearOfAccount)||((this.yearOfAccount!= null)&&this.yearOfAccount.equals(rhs.yearOfAccount)))&&((this.segmentTag == rhs.segmentTag)||((this.segmentTag!= null)&&this.segmentTag.equals(rhs.segmentTag))))&&((this.dateTimeQualifier == rhs.dateTimeQualifier)||((this.dateTimeQualifier!= null)&&this.dateTimeQualifier.equals(rhs.dateTimeQualifier))))&&((this.controlMessagePeriod == rhs.controlMessagePeriod)||((this.controlMessagePeriod!= null)&&this.controlMessagePeriod.equals(rhs.controlMessagePeriod))));
    }

    public enum DateTimeQualifier {

        CMP("CMP"),
        YAC("YAC");
        private final String value;
        private final static Map<String, DateTimeQualifier> CONSTANTS = new HashMap<String, DateTimeQualifier>();

        static {
            for (DateTimeQualifier c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DateTimeQualifier(String value) {
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
        public static DateTimeQualifier fromValue(String value) {
            DateTimeQualifier constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
