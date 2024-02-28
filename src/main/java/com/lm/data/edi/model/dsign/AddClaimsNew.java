
package com.lm.data.edi.model.dsign;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dateOfLoss",
    "majorCasualtyNumber",
    "propertyClaimsServiceCode",
    "lossName",
    "claimNature",
    "lossDetails",
    "claimReserveRetained",
    "claimReserveReleased",
    "outstandingClaimsRetained",
    "outstandingClaimsReleased",
    "claimPortfolioIncoming",
    "claimPortfolioOutgoing",
    "reinsuranceRecoveries",
    "claimReserveOCAInterest",
    "outstandingLosses",
    "paidClaims",
    "paidRefunds",
    "cashLosses",
    "cashLossContraEntry"
})
@Data
@EqualsAndHashCode
@ToString
@Builder
public class AddClaimsNew {

    /**
     * The occurrence date of an individual Loss affecting a treaty which cannot be expressed in fixed format. timestamp, DDMMYY :hhmm
     * (Required)
     * 
     */
    @JsonProperty("dateOfLoss")
    @NotNull
    //@JsonDeserialize(using = LocalDateTimeDeserializer.class)
   // @JsonSerialize(using = LocalDateTimeSerializer.class)
    private Date dateOfLoss;
    /**
     * Contains a Major Casualty/Related event code. Allocated by the claims offices, to identify the various interests involved in a particular casualty or event
     * 
     */
    @JsonProperty("majorCasualtyNumber")
    @Size(max = 4)
    private String majorCasualtyNumber;
    /**
     * Contains a Property Claims Service Code. Allocated by the Property Claims Services to indicate a major loss in the USA.
     * 
     */
    @JsonProperty("propertyClaimsServiceCode")
    @Size(max = 4)
    private String propertyClaimsServiceCode;
    /**
     * Name of vessel, aircraft id, name of assured etc.
     * 
     */
    @JsonProperty("lossName")
    @Size(max = 15)
    private String lossName;
    /**
     * The nature of the claim in respect of an individual loss affecting a Treaty.
     * 
     */
    @JsonProperty("claimNature")
    @Size(max = 30)
    private String claimNature;
    /**
     * Narrative details of an individual loss affecting a Treaty
     * 
     */
    @JsonProperty("lossDetails")
    @Size(max = 30)
    private String lossDetails;
    /**
     * The amount of claim reserve retained by the cedant in respect of outstanding claims on an individual  loss affecting a Treaty. This amount which is expressed as a 100% figure in original currency.SIGN IS SEPARATE TRAILING CHARACTER.  Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("claimReserveRetained")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String claimReserveRetained;
    /**
     * The amount of claim reserve retained by the cedant in respect of outstanding claims on an individual  loss affecting a Treaty. This amount which is expressed as a 100% figure in original currency.SIGN IS SEPARATE TRAILING CHARACTER.  Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("claimReserveReleased")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String claimReserveReleased;
    /**
     * The amount of claim reserve released by the cedant in respect of outstanding claims on an individual loss affecting a Treaty. This amount is expressed as a 100% figure in original currency. SIGN IS SEPARATE TRAILING CHARACTER.Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("outstandingClaimsRetained")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String outstandingClaimsRetained;
    /**
     * The amount of OCA released by the cedant in respect of outstanding claims on an individual loss affecting a Treaty. This amount is expressed as a 100% figure in original currency. SIGN IS SEPARATE TRAILING CHARACTER. Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("outstandingClaimsReleased")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String outstandingClaimsReleased;
    /**
     * The amount paid to re-insurers in respect of the assumption of liability for outstanding claims on an individual loss affecting a Treaty. Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("claimPortfolioIncoming")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String claimPortfolioIncoming;
    /**
     * The amount paid by re-insurers in respect of the discharge of liability for outstanding claims on an individual loss affecting a Treaty. SIGN IS SEPARATE TRAILING CHARACTER.  Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("claimPortfolioOutgoing")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String claimPortfolioOutgoing;
    /**
     * The amount recovered from reinsurances in respect of an individual loss affecting a Treaty expressed as a 100% figure in original currency. SIGN IS SEPARATE TRAILING CHARACTER. Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("reinsuranceRecoveries")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String reinsuranceRecoveries;
    /**
     * The amount of interest paid to re-insurers in respect of Claim Reserve or OCA on an individual loss affecting a Treaty. The amount is expressed as a 100% figure, in original currency.SIGN IS SEPARATE TRAILING CHARACTER. Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("claimReserveOCAInterest")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String claimReserveOCAInterest;
    /**
     * The outstanding loss amount for an individual loss affecting the Treaty, expressed as a 100% figure in original currency. SIGN IS SEPARATE TRAILING CHARACTER. Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("outstandingLosses")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String outstandingLosses;
    /**
     * Paid Claim Amount of an individual loss affecting a Treaty. Expressed as a 100% figure in original currency. SIGN IS SEPARATE TRAILING CHARACTER. Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("paidClaims")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String paidClaims;
    /**
     * Refund Amount in respect of an individual loss affecting a Treaty. Expressed as a 100% figure in original currency. SIGN IS SEPARATE TRAILING CHARACTER. Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("paidRefunds")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String paidRefunds;
    /**
     * The amount of an individual cash loss affecting a Treaty expressed as a 100% figure, in original currency. SIGN IS SEPARATE TRAILING CHARACTER.  Note- as per TS the length is 9(13)V9(2) although no example
     * 
     */
    @JsonProperty("cashLosses")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String cashLosses;
    /**
     * The amount of an individual contra entry to previously paid cash loss, expressed as a 100% figure, in original currency. SIGN IS SEPARATE TRAILING CHARACTER
     * 
     */
    @JsonProperty("cashLossContraEntry")
    @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
    private String cashLossContraEntry;


}
