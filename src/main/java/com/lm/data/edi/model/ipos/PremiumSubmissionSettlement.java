package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PremiumSubmissionSettlement
 */

@JsonTypeName("premiumSubmissionSettlement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumSubmissionSettlement implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID premiumId;

  private UUID autoRiPremiumId;

  private TypeOfTransactionType transactionType;

  public PremiumSubmissionSettlement premiumId(UUID premiumId) {
    this.premiumId = premiumId;
    return this;
  }

  /**
   * Get premiumId
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

  public PremiumSubmissionSettlement autoRiPremiumId(UUID autoRiPremiumId) {
    this.autoRiPremiumId = autoRiPremiumId;
    return this;
  }

  /**
   * Get autoRiPremiumId
   * @return autoRiPremiumId
  */
  @Valid 

  @JsonProperty("autoRiPremiumId")
  public UUID getAutoRiPremiumId() {
    return autoRiPremiumId;
  }

  public void setAutoRiPremiumId(UUID autoRiPremiumId) {
    this.autoRiPremiumId = autoRiPremiumId;
  }

  public PremiumSubmissionSettlement transactionType(TypeOfTransactionType transactionType) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumSubmissionSettlement premiumSubmissionSettlement = (PremiumSubmissionSettlement) o;
    return Objects.equals(this.premiumId, premiumSubmissionSettlement.premiumId) &&
        Objects.equals(this.autoRiPremiumId, premiumSubmissionSettlement.autoRiPremiumId) &&
        Objects.equals(this.transactionType, premiumSubmissionSettlement.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId, autoRiPremiumId, transactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumSubmissionSettlement {\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    autoRiPremiumId: ").append(toIndentedString(autoRiPremiumId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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

