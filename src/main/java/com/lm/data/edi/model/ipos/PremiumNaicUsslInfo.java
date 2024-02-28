package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PremiumNaicUsslInfo
 */

@JsonTypeName("premiumNaicUsslInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumNaicUsslInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID premiumId;

  private TypeOfTransactionType transactionType;

  private OpDetails opDetails;

  private UsSurplusLineDetails usSurplusLineDetails;

  private NaicDetails naicDetails;

  public PremiumNaicUsslInfo premiumId(UUID premiumId) {
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

  public PremiumNaicUsslInfo transactionType(TypeOfTransactionType transactionType) {
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

  public PremiumNaicUsslInfo opDetails(OpDetails opDetails) {
    this.opDetails = opDetails;
    return this;
  }

  /**
   * Get opDetails
   * @return opDetails
  */
  @Valid 

  @JsonProperty("opDetails")
  public OpDetails getOpDetails() {
    return opDetails;
  }

  public void setOpDetails(OpDetails opDetails) {
    this.opDetails = opDetails;
  }

  public PremiumNaicUsslInfo usSurplusLineDetails(UsSurplusLineDetails usSurplusLineDetails) {
    this.usSurplusLineDetails = usSurplusLineDetails;
    return this;
  }

  /**
   * Get usSurplusLineDetails
   * @return usSurplusLineDetails
  */
  @Valid 

  @JsonProperty("usSurplusLineDetails")
  public UsSurplusLineDetails getUsSurplusLineDetails() {
    return usSurplusLineDetails;
  }

  public void setUsSurplusLineDetails(UsSurplusLineDetails usSurplusLineDetails) {
    this.usSurplusLineDetails = usSurplusLineDetails;
  }

  public PremiumNaicUsslInfo naicDetails(NaicDetails naicDetails) {
    this.naicDetails = naicDetails;
    return this;
  }

  /**
   * Get naicDetails
   * @return naicDetails
  */
  @Valid 

  @JsonProperty("naicDetails")
  public NaicDetails getNaicDetails() {
    return naicDetails;
  }

  public void setNaicDetails(NaicDetails naicDetails) {
    this.naicDetails = naicDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumNaicUsslInfo premiumNaicUsslInfo = (PremiumNaicUsslInfo) o;
    return Objects.equals(this.premiumId, premiumNaicUsslInfo.premiumId) &&
        Objects.equals(this.transactionType, premiumNaicUsslInfo.transactionType) &&
        Objects.equals(this.opDetails, premiumNaicUsslInfo.opDetails) &&
        Objects.equals(this.usSurplusLineDetails, premiumNaicUsslInfo.usSurplusLineDetails) &&
        Objects.equals(this.naicDetails, premiumNaicUsslInfo.naicDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId, transactionType, opDetails, usSurplusLineDetails, naicDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumNaicUsslInfo {\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    opDetails: ").append(toIndentedString(opDetails)).append("\n");
    sb.append("    usSurplusLineDetails: ").append(toIndentedString(usSurplusLineDetails)).append("\n");
    sb.append("    naicDetails: ").append(toIndentedString(naicDetails)).append("\n");
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

