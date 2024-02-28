package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * populated for a AP/RP
 */

@JsonTypeName("opDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class OpDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID premiumId;

  private TypeOfTransactionType transactionType;

  private NaicSlReportingStatus usSurplusInfoStatus;

  private NaicSlReportingStatus naicInfoStatus;

  public OpDetails premiumId(UUID premiumId) {
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

  public OpDetails transactionType(TypeOfTransactionType transactionType) {
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

  public OpDetails usSurplusInfoStatus(NaicSlReportingStatus usSurplusInfoStatus) {
    this.usSurplusInfoStatus = usSurplusInfoStatus;
    return this;
  }

  /**
   * Get usSurplusInfoStatus
   * @return usSurplusInfoStatus
  */
  @Valid 

  @JsonProperty("usSurplusInfoStatus")
  public NaicSlReportingStatus getUsSurplusInfoStatus() {
    return usSurplusInfoStatus;
  }

  public void setUsSurplusInfoStatus(NaicSlReportingStatus usSurplusInfoStatus) {
    this.usSurplusInfoStatus = usSurplusInfoStatus;
  }

  public OpDetails naicInfoStatus(NaicSlReportingStatus naicInfoStatus) {
    this.naicInfoStatus = naicInfoStatus;
    return this;
  }

  /**
   * Get naicInfoStatus
   * @return naicInfoStatus
  */
  @Valid 

  @JsonProperty("naicInfoStatus")
  public NaicSlReportingStatus getNaicInfoStatus() {
    return naicInfoStatus;
  }

  public void setNaicInfoStatus(NaicSlReportingStatus naicInfoStatus) {
    this.naicInfoStatus = naicInfoStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpDetails opDetails = (OpDetails) o;
    return Objects.equals(this.premiumId, opDetails.premiumId) &&
        Objects.equals(this.transactionType, opDetails.transactionType) &&
        Objects.equals(this.usSurplusInfoStatus, opDetails.usSurplusInfoStatus) &&
        Objects.equals(this.naicInfoStatus, opDetails.naicInfoStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId, transactionType, usSurplusInfoStatus, naicInfoStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpDetails {\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    usSurplusInfoStatus: ").append(toIndentedString(usSurplusInfoStatus)).append("\n");
    sb.append("    naicInfoStatus: ").append(toIndentedString(naicInfoStatus)).append("\n");
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

