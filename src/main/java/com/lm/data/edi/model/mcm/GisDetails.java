
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
 * General Indicator. GIS GENERAL INDICATOR  Refer EDI Message MCM Analysis Document TAB  Detail Record
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "segmentTag",
    "processingIndicatorAuditOrRiskCode",
    "processingIndicatorBusinessCategoryCode",
    "gisQualifier"
})
@AllArgsConstructor
@NoArgsConstructor
public class GisDetails {

    /**
     * Mandatory. SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    @JsonPropertyDescription("Mandatory. SEGMENT TAG")
    @Size(max = 3)
    @NotNull
    private String segmentTag = "GIS";
    /**
     * OPTIONAL.for E3 only. PROCESSING INDICATOR Audit / Risk Code. If qualifier NAC, Values = 000; risk type code <> 2 and audit risk code = blank, value = 00;
     * 
     */
    @JsonProperty("processingIndicatorAuditOrRiskCode")
    @JsonPropertyDescription("OPTIONAL.for E3 only. PROCESSING INDICATOR Audit / Risk Code. If qualifier NAC, Values = 000; risk type code <> 2 and audit risk code = blank, value = 00;")
    @Size(max = 3)
    private String processingIndicatorAuditOrRiskCode;
    /**
     * OPTIONAL. PROCESSING INDICATOR Business Category Code.Identifies the type of business for each transaction. For E4 Only
     * 
     */
    @JsonProperty("processingIndicatorBusinessCategoryCode")
    @JsonPropertyDescription("OPTIONAL. PROCESSING INDICATOR Business Category Code.Identifies the type of business for each transaction. For E4 Only")
    private ProcessingIndicatorBusinessCategoryCode processingIndicatorBusinessCategoryCode;
    /**
     * Mandatory. QUALIFIER. Processing year < 1995 then CAT else BCT
     * (Required)
     * 
     */
    @JsonProperty("gisQualifier")
    @JsonPropertyDescription("Mandatory. QUALIFIER. Processing year < 1995 then CAT else BCT")
    @NotNull
    private GisDetails.GisQualifier gisQualifier;

    /**
     * Mandatory. SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public String getSegmentTag() {
        return segmentTag;
    }

    /**
     * Mandatory. SEGMENT TAG
     * (Required)
     * 
     */
    @JsonProperty("segmentTag")
    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    /**
     * OPTIONAL.for E3 only. PROCESSING INDICATOR Audit / Risk Code. If qualifier NAC, Values = 000; risk type code <> 2 and audit risk code = blank, value = 00;
     * 
     */
    @JsonProperty("processingIndicatorAuditOrRiskCode")
    public String getProcessingIndicatorAuditOrRiskCode() {
        return processingIndicatorAuditOrRiskCode;
    }

    /**
     * OPTIONAL.for E3 only. PROCESSING INDICATOR Audit / Risk Code. If qualifier NAC, Values = 000; risk type code <> 2 and audit risk code = blank, value = 00;
     * 
     */
    @JsonProperty("processingIndicatorAuditOrRiskCode")
    public void setProcessingIndicatorAuditOrRiskCode(String processingIndicatorAuditOrRiskCode) {
        this.processingIndicatorAuditOrRiskCode = processingIndicatorAuditOrRiskCode;
    }

    /**
     * OPTIONAL. PROCESSING INDICATOR Business Category Code.Identifies the type of business for each transaction. For E4 Only
     * 
     */
    @JsonProperty("processingIndicatorBusinessCategoryCode")
    public ProcessingIndicatorBusinessCategoryCode getProcessingIndicatorBusinessCategoryCode() {
        return processingIndicatorBusinessCategoryCode;
    }

    /**
     * OPTIONAL. PROCESSING INDICATOR Business Category Code.Identifies the type of business for each transaction. For E4 Only
     * 
     */
    @JsonProperty("processingIndicatorBusinessCategoryCode")
    public void setProcessingIndicatorBusinessCategoryCode(ProcessingIndicatorBusinessCategoryCode processingIndicatorBusinessCategoryCode) {
        this.processingIndicatorBusinessCategoryCode = processingIndicatorBusinessCategoryCode;
    }

    /**
     * Mandatory. QUALIFIER. Processing year < 1995 then CAT else BCT
     * (Required)
     * 
     */
    @JsonProperty("gisQualifier")
    public GisQualifier getGisQualifier() {
        return gisQualifier;
    }

    /**
     * Mandatory. QUALIFIER. Processing year < 1995 then CAT else BCT
     * (Required)
     * 
     */
    @JsonProperty("gisQualifier")
    public void setGisQualifier(GisQualifier gisQualifier) {
        this.gisQualifier = gisQualifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GisDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("segmentTag");
        sb.append('=');
        sb.append(((this.segmentTag == null)?"<null>":this.segmentTag));
        sb.append(',');
        sb.append("processingIndicatorAuditOrRiskCode");
        sb.append('=');
        sb.append(((this.processingIndicatorAuditOrRiskCode == null)?"<null>":this.processingIndicatorAuditOrRiskCode));
        sb.append(',');
        sb.append("processingIndicatorBusinessCategoryCode");
        sb.append('=');
        sb.append(((this.processingIndicatorBusinessCategoryCode == null)?"<null>":this.processingIndicatorBusinessCategoryCode));
        sb.append(',');
        sb.append("gisQualifier");
        sb.append('=');
        sb.append(((this.gisQualifier == null)?"<null>":this.gisQualifier));
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
        result = ((result* 31)+((this.processingIndicatorAuditOrRiskCode == null)? 0 :this.processingIndicatorAuditOrRiskCode.hashCode()));
        result = ((result* 31)+((this.segmentTag == null)? 0 :this.segmentTag.hashCode()));
        result = ((result* 31)+((this.processingIndicatorBusinessCategoryCode == null)? 0 :this.processingIndicatorBusinessCategoryCode.hashCode()));
        result = ((result* 31)+((this.gisQualifier == null)? 0 :this.gisQualifier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GisDetails) == false) {
            return false;
        }
        GisDetails rhs = ((GisDetails) other);
        return (((((this.processingIndicatorAuditOrRiskCode == rhs.processingIndicatorAuditOrRiskCode)||((this.processingIndicatorAuditOrRiskCode!= null)&&this.processingIndicatorAuditOrRiskCode.equals(rhs.processingIndicatorAuditOrRiskCode)))&&((this.segmentTag == rhs.segmentTag)||((this.segmentTag!= null)&&this.segmentTag.equals(rhs.segmentTag))))&&((this.processingIndicatorBusinessCategoryCode == rhs.processingIndicatorBusinessCategoryCode)||((this.processingIndicatorBusinessCategoryCode!= null)&&this.processingIndicatorBusinessCategoryCode.equals(rhs.processingIndicatorBusinessCategoryCode))))&&((this.gisQualifier == rhs.gisQualifier)||((this.gisQualifier!= null)&&this.gisQualifier.equals(rhs.gisQualifier))));
    }

    public enum GisQualifier {

        NAC("NAC"),
        RSK("RSK"),
        AUA("AUA"),
        AUN("AUN"),
        AUM("AUM"),
        CAT("CAT"),
        BCT("BCT");
        private final String value;
        private final static Map<String, GisQualifier> CONSTANTS = new HashMap<String, GisQualifier>();

        static {
            for (GisQualifier c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private GisQualifier(String value) {
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
        public static GisQualifier fromValue(String value) {
            GisQualifier constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ProcessingIndicatorBusinessCategoryCode {

        PRM("PRM"),
        PRD("PRD"),
        RPM("RPM"),
        CLM("CLM"),
        PRI("PRI"),
        CRI("CRI"),
        TTY("TTY"),
        DPM("DPM"),
        DPD("DPD"),
        DRI("DRI"),
        RRI("RRI");
        private final String value;
        private final static Map<String, ProcessingIndicatorBusinessCategoryCode> CONSTANTS = new HashMap<String, ProcessingIndicatorBusinessCategoryCode>();

        static {
            for (ProcessingIndicatorBusinessCategoryCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ProcessingIndicatorBusinessCategoryCode(String value) {
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
        public static ProcessingIndicatorBusinessCategoryCode fromValue(String value) {
            ProcessingIndicatorBusinessCategoryCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
