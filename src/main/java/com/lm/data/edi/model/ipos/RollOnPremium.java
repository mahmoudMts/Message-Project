package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * RollOnPremium
 */

@JsonTypeName("rollOnPremium")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class RollOnPremium implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID premiumId;

  private UUID orginalPremiumId;

  private UUID newOriginalPremiumId;

  private UUID originalSectionId;

  private UUID newOriginalSectionId;

  private TypeOfTransactionType transactionType;

  private String newOCSND;

  private String newOBSND;

  public RollOnPremium premiumId(UUID premiumId) {
    this.premiumId = premiumId;
    return this;
  }

  /**
   * The unique identifier of a premium record that needs roll on applied, it will be an Endorsement premium
   * @return premiumId
  */
  @Valid 

  @JsonProperty("premiumId")
  public UUID getPremiumId() {
    return premiumId;
  }

  public void setPremiumId(UUID premiumId) {
    this.premiumId = premiumId;
  }

  public RollOnPremium orginalPremiumId(UUID orginalPremiumId) {
    this.orginalPremiumId = orginalPremiumId;
    return this;
  }

  /**
   * The unique identifier of an original premium record, the correcion of this record triggerd the roll on
   * @return orginalPremiumId
  */
  @Valid 

  @JsonProperty("orginalPremiumId")
  public UUID getOrginalPremiumId() {
    return orginalPremiumId;
  }

  public void setOrginalPremiumId(UUID orginalPremiumId) {
    this.orginalPremiumId = orginalPremiumId;
  }

  public RollOnPremium newOriginalPremiumId(UUID newOriginalPremiumId) {
    this.newOriginalPremiumId = newOriginalPremiumId;
    return this;
  }

  /**
   * The unique identifier of the new original premium record that corrects the triggering orginalPremiumId
   * @return newOriginalPremiumId
  */
  @Valid 

  @JsonProperty("newOriginalPremiumId")
  public UUID getNewOriginalPremiumId() {
    return newOriginalPremiumId;
  }

  public void setNewOriginalPremiumId(UUID newOriginalPremiumId) {
    this.newOriginalPremiumId = newOriginalPremiumId;
  }

  public RollOnPremium originalSectionId(UUID originalSectionId) {
    this.originalSectionId = originalSectionId;
    return this;
  }

  /**
   * The unique identifier of the section attached to the orginalPremiumId record
   * @return originalSectionId
  */
  @Valid 

  @JsonProperty("originalSectionId")
  public UUID getOriginalSectionId() {
    return originalSectionId;
  }

  public void setOriginalSectionId(UUID originalSectionId) {
    this.originalSectionId = originalSectionId;
  }

  public RollOnPremium newOriginalSectionId(UUID newOriginalSectionId) {
    this.newOriginalSectionId = newOriginalSectionId;
    return this;
  }

  /**
   * The unique identifier of the new section record attached to the newOriginalPremiumId record
   * @return newOriginalSectionId
  */
  @Valid 

  @JsonProperty("newOriginalSectionId")
  public UUID getNewOriginalSectionId() {
    return newOriginalSectionId;
  }

  public void setNewOriginalSectionId(UUID newOriginalSectionId) {
    this.newOriginalSectionId = newOriginalSectionId;
  }

  public RollOnPremium transactionType(TypeOfTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  */
  @Valid 

  @JsonProperty("transactionType")
  public TypeOfTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TypeOfTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public RollOnPremium newOCSND(String newOCSND) {
    this.newOCSND = newOCSND;
    return this;
  }

  /**
   * The CSND of the newOriginalPremiumId record
   * @return newOCSND
  */
  

  @JsonProperty("newOCSND")
  public String getNewOCSND() {
    return newOCSND;
  }

  public void setNewOCSND(String newOCSND) {
    this.newOCSND = newOCSND;
  }

  public RollOnPremium newOBSND(String newOBSND) {
    this.newOBSND = newOBSND;
    return this;
  }

  /**
   * The BSND of the newOriginalPremiumId record
   * @return newOBSND
  */
  

  @JsonProperty("newOBSND")
  public String getNewOBSND() {
    return newOBSND;
  }

  public void setNewOBSND(String newOBSND) {
    this.newOBSND = newOBSND;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RollOnPremium rollOnPremium = (RollOnPremium) o;
    return Objects.equals(this.premiumId, rollOnPremium.premiumId) &&
        Objects.equals(this.orginalPremiumId, rollOnPremium.orginalPremiumId) &&
        Objects.equals(this.newOriginalPremiumId, rollOnPremium.newOriginalPremiumId) &&
        Objects.equals(this.originalSectionId, rollOnPremium.originalSectionId) &&
        Objects.equals(this.newOriginalSectionId, rollOnPremium.newOriginalSectionId) &&
        Objects.equals(this.transactionType, rollOnPremium.transactionType) &&
        Objects.equals(this.newOCSND, rollOnPremium.newOCSND) &&
        Objects.equals(this.newOBSND, rollOnPremium.newOBSND);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId, orginalPremiumId, newOriginalPremiumId, originalSectionId, newOriginalSectionId, transactionType, newOCSND, newOBSND);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RollOnPremium {\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    orginalPremiumId: ").append(toIndentedString(orginalPremiumId)).append("\n");
    sb.append("    newOriginalPremiumId: ").append(toIndentedString(newOriginalPremiumId)).append("\n");
    sb.append("    originalSectionId: ").append(toIndentedString(originalSectionId)).append("\n");
    sb.append("    newOriginalSectionId: ").append(toIndentedString(newOriginalSectionId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    newOCSND: ").append(toIndentedString(newOCSND)).append("\n");
    sb.append("    newOBSND: ").append(toIndentedString(newOBSND)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

