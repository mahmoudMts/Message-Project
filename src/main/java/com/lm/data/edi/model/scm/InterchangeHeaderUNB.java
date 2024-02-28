
package com.lm.data.edi.model.scm;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lm.data.edi.util.LocalDateTimeDeserializer;
import com.lm.data.edi.util.LocalDateTimeSerializerWithZone;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


/**
 * A mandatory segment which starts a communication interchange. It contains sender and recipient addresses and provides a sender’s reference to identify the interchange.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "syntax",
    "interchangeSender",
    "interchangeReceiver",
    "dateTimeOfPreparation",
    "interchangeControlReference",
    "recipientReferencePassword",
    "applicationReference",
    "processingPriorityCode",
    "acknowledgmentRequest",
    "comunicationAgreementID",
    "testIndicator"
})
public class InterchangeHeaderUNB {

    /**
     * Identifies version 1, level A of the syntax rules and Controlling Agency UNO.  (For level B, the field would contain UNOB:1).The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1.
     * (Required)
     * 
     */
    @JsonProperty("syntax")
    @JsonPropertyDescription("Identifies version 1, level A of the syntax rules and Controlling Agency UNO.  (For level B, the field would contain UNOB:1).The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1.")
    @Valid
    @NotNull
    private InterchangeHeaderUNBSyntax syntax;
    /**
     * Composite element. Identifies the sender of the transmission in code with a qualifier of AB to identify the code set being used, followed by a code representing a reverse routing address to which the recipient should address any reply.
     * (Required)
     * 
     */
    @JsonProperty("interchangeSender")
    @JsonPropertyDescription("Composite element. Identifies the sender of the transmission in code with a qualifier of AB to identify the code set being used, followed by a code representing a reverse routing address to which the recipient should address any reply.")
    @Valid
    @NotNull
    private InterchangeHeaderUNBInterchangeSender interchangeSender;
    /**
     * Composite element. Identifies the recipient of the transmission in code (qualified by DN), plus a sub-address code. The sub-address code for onward routing may be used if the functional grouping facility, (which also provides for sub-addressing), is not used.
     * (Required)
     * 
     */
    @JsonProperty("interchangeReceiver")
    @JsonPropertyDescription("Composite element. Identifies the recipient of the transmission in code (qualified by DN), plus a sub-address code. The sub-address code for onward routing may be used if the functional grouping facility, (which also provides for sub-addressing), is not used.")
    @Valid
    @NotNull
    private InterchangeHeaderUNBInterchangeReceiver interchangeReceiver;
    /**
     * Composite element. The current date and time. This is the date/time that the interchange is assembled for transmission. DPS standard applied.
     * (Required)
     * 
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializerWithZone.class)
    @JsonProperty("dateTimeOfPreparation")
    @JsonPropertyDescription("Composite element. The current date and time. This is the date/time that the interchange is assembled for transmission. DPS standard applied.")
    @NotNull
    private LocalDateTime dateTimeOfPreparation;
    /**
     * The unique interchange control reference for this transmission, allocated by the sender of the interchange. In the final EDI message ASG will adding leading zeros.
     * (Required)
     * 
     */
    @JsonProperty("interchangeControlReference")
    @JsonPropertyDescription("The unique interchange control reference for this transmission, allocated by the sender of the interchange. In the final EDI message ASG will adding leading zeros.")
    @Size(max = 14)
    @NotNull
    private String interchangeControlReference;
    /**
     * This is recipient's reference, or a password. (This can be accompanied by a qualifier component element, if so specified in the Interchange Agreement) the field is left blank if not used
     * 
     */
    @JsonProperty("recipientReferencePassword")
    @JsonPropertyDescription("This is recipient's reference, or a password. (This can be accompanied by a qualifier component element, if so specified in the Interchange Agreement) the field is left blank if not used")
    @Size(max = 14)
    private String recipientReferencePassword;
    /**
     * This is EDI message type. This element is to keep all messages of the same type within one unique transmission, and to carry the appropriate message identifier in this field. This allows a transmission of a particular message type to be retrieved by the recipient from a mailbox service in advance of transmissions containing a different message type.
     * 
     */
    @JsonProperty("applicationReference")
    @JsonPropertyDescription("This is EDI message type. This element is to keep all messages of the same type within one unique transmission, and to carry the appropriate message identifier in this field. This allows a transmission of a particular message type to be retrieved by the recipient from a mailbox service in advance of transmissions containing a different message type.")
    @Size(max = 14)
    private String applicationReference;
    /**
     * Processing priority code, defined in the Interchange Agreement (or left blank if not used)
     * 
     */
    @JsonProperty("processingPriorityCode")
    @JsonPropertyDescription("Processing priority code, defined in the Interchange Agreement (or left blank if not used)")
    @Size(max = 1)
    private String processingPriorityCode;
    /**
     * Indicates that the sender is requesting an acknowledgement for the interchange, but only that the recipient has successfully received and identified the header and trailer segments (UNB & UNZ) for the interchange. The field is set to zero if an acknowledgement is not required.
     * 
     */
    @JsonProperty("acknowledgmentRequest")
    @JsonPropertyDescription("Indicates that the sender is requesting an acknowledgement for the interchange, but only that the recipient has successfully received and identified the header and trailer segments (UNB & UNZ) for the interchange. The field is set to zero if an acknowledgement is not required.")
    @Pattern(regexp = "[0-9]{0,1}")
    private String acknowledgmentRequest;
    /**
     * Code which identifies the type of communications agreement under which the interchange is controlled, (or left blank if not used).
     * 
     */
    @JsonProperty("comunicationAgreementID")
    @JsonPropertyDescription("Code which identifies the type of communications agreement under which the interchange is controlled, (or left blank if not used).")
    @Size(max = 35)
    private String comunicationAgreementID;
    /**
     * Indicates that this is a test transmission.  The field is set to zero for transmission of live (Production) data
     * 
     */
    @JsonProperty("testIndicator")
    @JsonPropertyDescription("Indicates that this is a test transmission.  The field is set to zero for transmission of live (Production) data")
    private TestIndicator testIndicator;

    /**
     * Identifies version 1, level A of the syntax rules and Controlling Agency UNO.  (For level B, the field would contain UNOB:1).The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1.
     * (Required)
     * 
     */
    @JsonProperty("syntax")
    public InterchangeHeaderUNBSyntax getSyntax() {
        return syntax;
    }

    /**
     * Identifies version 1, level A of the syntax rules and Controlling Agency UNO.  (For level B, the field would contain UNOB:1).The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1.
     * (Required)
     * 
     */
    @JsonProperty("syntax")
    public void setSyntax(InterchangeHeaderUNBSyntax syntax) {
        this.syntax = syntax;
    }

    /**
     * Composite element. Identifies the sender of the transmission in code with a qualifier of AB to identify the code set being used, followed by a code representing a reverse routing address to which the recipient should address any reply.
     * (Required)
     * 
     */
    @JsonProperty("interchangeSender")
    public InterchangeHeaderUNBInterchangeSender getInterchangeSender() {
        return interchangeSender;
    }

    /**
     * Composite element. Identifies the sender of the transmission in code with a qualifier of AB to identify the code set being used, followed by a code representing a reverse routing address to which the recipient should address any reply.
     * (Required)
     * 
     */
    @JsonProperty("interchangeSender")
    public void setInterchangeSender(InterchangeHeaderUNBInterchangeSender interchangeSender) {
        this.interchangeSender = interchangeSender;
    }

    /**
     * Composite element. Identifies the recipient of the transmission in code (qualified by DN), plus a sub-address code. The sub-address code for onward routing may be used if the functional grouping facility, (which also provides for sub-addressing), is not used.
     * (Required)
     * 
     */
    @JsonProperty("interchangeReceiver")
    public InterchangeHeaderUNBInterchangeReceiver getInterchangeReceiver() {
        return interchangeReceiver;
    }

    /**
     * Composite element. Identifies the recipient of the transmission in code (qualified by DN), plus a sub-address code. The sub-address code for onward routing may be used if the functional grouping facility, (which also provides for sub-addressing), is not used.
     * (Required)
     * 
     */
    @JsonProperty("interchangeReceiver")
    public void setInterchangeReceiver(InterchangeHeaderUNBInterchangeReceiver interchangeReceiver) {
        this.interchangeReceiver = interchangeReceiver;
    }

    /**
     * Composite element. The current date and time. This is the date/time that the interchange is assembled for transmission. DPS standard applied.
     * (Required)
     * 
     */
    @JsonProperty("dateTimeOfPreparation")
    public LocalDateTime getDateTimeOfPreparation() {
        return dateTimeOfPreparation;
    }

    /**
     * Composite element. The current date and time. This is the date/time that the interchange is assembled for transmission. DPS standard applied.
     * (Required)
     * 
     */
    @JsonProperty("dateTimeOfPreparation")
    public void setDateTimeOfPreparation(LocalDateTime dateTimeOfPreparation) {
        this.dateTimeOfPreparation = dateTimeOfPreparation;
    }

    /**
     * The unique interchange control reference for this transmission, allocated by the sender of the interchange. In the final EDI message ASG will adding leading zeros.
     * (Required)
     * 
     */
    @JsonProperty("interchangeControlReference")
    public String getInterchangeControlReference() {
        return interchangeControlReference;
    }

    /**
     * The unique interchange control reference for this transmission, allocated by the sender of the interchange. In the final EDI message ASG will adding leading zeros.
     * (Required)
     * 
     */
    @JsonProperty("interchangeControlReference")
    public void setInterchangeControlReference(String interchangeControlReference) {
        this.interchangeControlReference = interchangeControlReference;
    }

    /**
     * This is recipient's reference, or a password. (This can be accompanied by a qualifier component element, if so specified in the Interchange Agreement) the field is left blank if not used
     * 
     */
    @JsonProperty("recipientReferencePassword")
    public String getRecipientReferencePassword() {
        return recipientReferencePassword;
    }

    /**
     * This is recipient's reference, or a password. (This can be accompanied by a qualifier component element, if so specified in the Interchange Agreement) the field is left blank if not used
     * 
     */
    @JsonProperty("recipientReferencePassword")
    public void setRecipientReferencePassword(String recipientReferencePassword) {
        this.recipientReferencePassword = recipientReferencePassword;
    }

    /**
     * This is EDI message type. This element is to keep all messages of the same type within one unique transmission, and to carry the appropriate message identifier in this field. This allows a transmission of a particular message type to be retrieved by the recipient from a mailbox service in advance of transmissions containing a different message type.
     * 
     */
    @JsonProperty("applicationReference")
    public String getApplicationReference() {
        return applicationReference;
    }

    /**
     * This is EDI message type. This element is to keep all messages of the same type within one unique transmission, and to carry the appropriate message identifier in this field. This allows a transmission of a particular message type to be retrieved by the recipient from a mailbox service in advance of transmissions containing a different message type.
     * 
     */
    @JsonProperty("applicationReference")
    public void setApplicationReference(String applicationReference) {
        this.applicationReference = applicationReference;
    }

    /**
     * Processing priority code, defined in the Interchange Agreement (or left blank if not used)
     * 
     */
    @JsonProperty("processingPriorityCode")
    public String getProcessingPriorityCode() {
        return processingPriorityCode;
    }

    /**
     * Processing priority code, defined in the Interchange Agreement (or left blank if not used)
     * 
     */
    @JsonProperty("processingPriorityCode")
    public void setProcessingPriorityCode(String processingPriorityCode) {
        this.processingPriorityCode = processingPriorityCode;
    }

    /**
     * Indicates that the sender is requesting an acknowledgement for the interchange, but only that the recipient has successfully received and identified the header and trailer segments (UNB & UNZ) for the interchange. The field is set to zero if an acknowledgement is not required.
     * 
     */
    @JsonProperty("acknowledgmentRequest")
    public String getAcknowledgmentRequest() {
        return acknowledgmentRequest;
    }

    /**
     * Indicates that the sender is requesting an acknowledgement for the interchange, but only that the recipient has successfully received and identified the header and trailer segments (UNB & UNZ) for the interchange. The field is set to zero if an acknowledgement is not required.
     * 
     */
    @JsonProperty("acknowledgmentRequest")
    public void setAcknowledgmentRequest(String acknowledgmentRequest) {
        this.acknowledgmentRequest = acknowledgmentRequest;
    }

    /**
     * Code which identifies the type of communications agreement under which the interchange is controlled, (or left blank if not used).
     * 
     */
    @JsonProperty("comunicationAgreementID")
    public String getComunicationAgreementID() {
        return comunicationAgreementID;
    }

    /**
     * Code which identifies the type of communications agreement under which the interchange is controlled, (or left blank if not used).
     * 
     */
    @JsonProperty("comunicationAgreementID")
    public void setComunicationAgreementID(String comunicationAgreementID) {
        this.comunicationAgreementID = comunicationAgreementID;
    }

    /**
     * Indicates that this is a test transmission.  The field is set to zero for transmission of live (Production) data
     * 
     */
    @JsonProperty("testIndicator")
    public TestIndicator getTestIndicator() {
        return testIndicator;
    }

    /**
     * Indicates that this is a test transmission.  The field is set to zero for transmission of live (Production) data
     * 
     */
    @JsonProperty("testIndicator")
    public void setTestIndicator(TestIndicator testIndicator) {
        this.testIndicator = testIndicator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InterchangeHeaderUNB.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("syntax");
        sb.append('=');
        sb.append(((this.syntax == null)?"<null>":this.syntax));
        sb.append(',');
        sb.append("interchangeSender");
        sb.append('=');
        sb.append(((this.interchangeSender == null)?"<null>":this.interchangeSender));
        sb.append(',');
        sb.append("interchangeReceiver");
        sb.append('=');
        sb.append(((this.interchangeReceiver == null)?"<null>":this.interchangeReceiver));
        sb.append(',');
        sb.append("dateTimeOfPreparation");
        sb.append('=');
        sb.append(((this.dateTimeOfPreparation == null)?"<null>":this.dateTimeOfPreparation));
        sb.append(',');
        sb.append("interchangeControlReference");
        sb.append('=');
        sb.append(((this.interchangeControlReference == null)?"<null>":this.interchangeControlReference));
        sb.append(',');
        sb.append("recipientReferencePassword");
        sb.append('=');
        sb.append(((this.recipientReferencePassword == null)?"<null>":this.recipientReferencePassword));
        sb.append(',');
        sb.append("applicationReference");
        sb.append('=');
        sb.append(((this.applicationReference == null)?"<null>":this.applicationReference));
        sb.append(',');
        sb.append("processingPriorityCode");
        sb.append('=');
        sb.append(((this.processingPriorityCode == null)?"<null>":this.processingPriorityCode));
        sb.append(',');
        sb.append("acknowledgmentRequest");
        sb.append('=');
        sb.append(((this.acknowledgmentRequest == null)?"<null>":this.acknowledgmentRequest));
        sb.append(',');
        sb.append("comunicationAgreementID");
        sb.append('=');
        sb.append(((this.comunicationAgreementID == null)?"<null>":this.comunicationAgreementID));
        sb.append(',');
        sb.append("testIndicator");
        sb.append('=');
        sb.append(((this.testIndicator == null)?"<null>":this.testIndicator));
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
        result = ((result* 31)+((this.interchangeControlReference == null)? 0 :this.interchangeControlReference.hashCode()));
        result = ((result* 31)+((this.comunicationAgreementID == null)? 0 :this.comunicationAgreementID.hashCode()));
        result = ((result* 31)+((this.testIndicator == null)? 0 :this.testIndicator.hashCode()));
        result = ((result* 31)+((this.interchangeSender == null)? 0 :this.interchangeSender.hashCode()));
        result = ((result* 31)+((this.syntax == null)? 0 :this.syntax.hashCode()));
        result = ((result* 31)+((this.interchangeReceiver == null)? 0 :this.interchangeReceiver.hashCode()));
        result = ((result* 31)+((this.applicationReference == null)? 0 :this.applicationReference.hashCode()));
        result = ((result* 31)+((this.acknowledgmentRequest == null)? 0 :this.acknowledgmentRequest.hashCode()));
        result = ((result* 31)+((this.recipientReferencePassword == null)? 0 :this.recipientReferencePassword.hashCode()));
        result = ((result* 31)+((this.dateTimeOfPreparation == null)? 0 :this.dateTimeOfPreparation.hashCode()));
        result = ((result* 31)+((this.processingPriorityCode == null)? 0 :this.processingPriorityCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InterchangeHeaderUNB) == false) {
            return false;
        }
        InterchangeHeaderUNB rhs = ((InterchangeHeaderUNB) other);
        return ((((((((((((this.interchangeControlReference == rhs.interchangeControlReference)||((this.interchangeControlReference!= null)&&this.interchangeControlReference.equals(rhs.interchangeControlReference)))&&((this.comunicationAgreementID == rhs.comunicationAgreementID)||((this.comunicationAgreementID!= null)&&this.comunicationAgreementID.equals(rhs.comunicationAgreementID))))&&((this.testIndicator == rhs.testIndicator)||((this.testIndicator!= null)&&this.testIndicator.equals(rhs.testIndicator))))&&((this.interchangeSender == rhs.interchangeSender)||((this.interchangeSender!= null)&&this.interchangeSender.equals(rhs.interchangeSender))))&&((this.syntax == rhs.syntax)||((this.syntax!= null)&&this.syntax.equals(rhs.syntax))))&&((this.interchangeReceiver == rhs.interchangeReceiver)||((this.interchangeReceiver!= null)&&this.interchangeReceiver.equals(rhs.interchangeReceiver))))&&((this.applicationReference == rhs.applicationReference)||((this.applicationReference!= null)&&this.applicationReference.equals(rhs.applicationReference))))&&((this.acknowledgmentRequest == rhs.acknowledgmentRequest)||((this.acknowledgmentRequest!= null)&&this.acknowledgmentRequest.equals(rhs.acknowledgmentRequest))))&&((this.recipientReferencePassword == rhs.recipientReferencePassword)||((this.recipientReferencePassword!= null)&&this.recipientReferencePassword.equals(rhs.recipientReferencePassword))))&&((this.dateTimeOfPreparation == rhs.dateTimeOfPreparation)||((this.dateTimeOfPreparation!= null)&&this.dateTimeOfPreparation.equals(rhs.dateTimeOfPreparation))))&&((this.processingPriorityCode == rhs.processingPriorityCode)||((this.processingPriorityCode!= null)&&this.processingPriorityCode.equals(rhs.processingPriorityCode))));
    }

    public enum TestIndicator {

        _0("0"),
        _1("1");
        private final String value;
        private final static Map<String, TestIndicator> CONSTANTS = new HashMap<String, TestIndicator>();

        static {
            for (TestIndicator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TestIndicator(String value) {
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
        public static TestIndicator fromValue(String value) {
            TestIndicator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
