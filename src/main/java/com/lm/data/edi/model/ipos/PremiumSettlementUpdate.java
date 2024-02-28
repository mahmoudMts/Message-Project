package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PremiumSettlementUpdate
 */

@JsonTypeName("premiumSettlementUpdate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumSettlementUpdate implements Serializable {

  private static final long serialVersionUID = 1L;

  private SettlementStatusEnum settlementStatus;

  private UUID settlementId;

  
  private OffsetDateTime actualPaymentDate;

  public PremiumSettlementUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PremiumSettlementUpdate(SettlementStatusEnum settlementStatus) {
    this.settlementStatus = settlementStatus;
  }

  public PremiumSettlementUpdate settlementStatus(SettlementStatusEnum settlementStatus) {
    this.settlementStatus = settlementStatus;
    return this;
  }

  /**
   * Get settlementStatus
   * @return settlementStatus
  */
  @NotNull @Valid 

  @JsonProperty("settlementStatus")
  public SettlementStatusEnum getSettlementStatus() {
    return settlementStatus;
  }

  public void setSettlementStatus(SettlementStatusEnum settlementStatus) {
    this.settlementStatus = settlementStatus;
  }

  public PremiumSettlementUpdate settlementId(UUID settlementId) {
    this.settlementId = settlementId;
    return this;
  }

  /**
   * Get settlementId
   * @return settlementId
  */
  @Valid 

  @JsonProperty("settlementId")
  public UUID getSettlementId() {
    return settlementId;
  }

  public void setSettlementId(UUID settlementId) {
    this.settlementId = settlementId;
  }

  public PremiumSettlementUpdate actualPaymentDate(OffsetDateTime actualPaymentDate) {
    this.actualPaymentDate = actualPaymentDate;
    return this;
  }

  /**
   * Get actualPaymentDate
   * @return actualPaymentDate
  */
  @Valid 

  @JsonProperty("actualPaymentDate")
  public OffsetDateTime getActualPaymentDate() {
    return actualPaymentDate;
  }

  public void setActualPaymentDate(OffsetDateTime actualPaymentDate) {
    this.actualPaymentDate = actualPaymentDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumSettlementUpdate premiumSettlementUpdate = (PremiumSettlementUpdate) o;
    return Objects.equals(this.settlementStatus, premiumSettlementUpdate.settlementStatus) &&
        Objects.equals(this.settlementId, premiumSettlementUpdate.settlementId) &&
        Objects.equals(this.actualPaymentDate, premiumSettlementUpdate.actualPaymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementStatus, settlementId, actualPaymentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumSettlementUpdate {\n");
    sb.append("    settlementStatus: ").append(toIndentedString(settlementStatus)).append("\n");
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
    sb.append("    actualPaymentDate: ").append(toIndentedString(actualPaymentDate)).append("\n");
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

