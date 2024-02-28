package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * UwRefSearchRecord
 */

@JsonTypeName("uwRefSearchRecord")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class UwRefSearchRecord implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID marketId;

  private UUID marketSyndicateId;

  private UUID premiumId;

  private String csnd;

  private BigDecimal syndicatePercentage;

  public UwRefSearchRecord marketId(UUID marketId) {
    this.marketId = marketId;
    return this;
  }

  /**
   * The unique identifier of a market record
   * @return marketId
  */
  @Valid 

  @JsonProperty("marketId")
  public UUID getMarketId() {
    return marketId;
  }

  public void setMarketId(UUID marketId) {
    this.marketId = marketId;
  }

  public UwRefSearchRecord marketSyndicateId(UUID marketSyndicateId) {
    this.marketSyndicateId = marketSyndicateId;
    return this;
  }

  /**
   * The unique identifier of a market syndicate element
   * @return marketSyndicateId
  */
  @Valid 

  @JsonProperty("marketSyndicateId")
  public UUID getMarketSyndicateId() {
    return marketSyndicateId;
  }

  public void setMarketSyndicateId(UUID marketSyndicateId) {
    this.marketSyndicateId = marketSyndicateId;
  }

  public UwRefSearchRecord premiumId(UUID premiumId) {
    this.premiumId = premiumId;
    return this;
  }

  /**
   * The unique identifier of a premium record
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

  public UwRefSearchRecord csnd(String csnd) {
    this.csnd = csnd;
    return this;
  }

  /**
   * Get csnd
   * @return csnd
  */
  

  @JsonProperty("csnd")
  public String getCsnd() {
    return csnd;
  }

  public void setCsnd(String csnd) {
    this.csnd = csnd;
  }

  public UwRefSearchRecord syndicatePercentage(BigDecimal syndicatePercentage) {
    this.syndicatePercentage = syndicatePercentage;
    return this;
  }

  /**
   * Get syndicatePercentage
   * @return syndicatePercentage
  */
  @Valid 

  @JsonProperty("syndicatePercentage")
  public BigDecimal getSyndicatePercentage() {
    return syndicatePercentage;
  }

  public void setSyndicatePercentage(BigDecimal syndicatePercentage) {
    this.syndicatePercentage = syndicatePercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UwRefSearchRecord uwRefSearchRecord = (UwRefSearchRecord) o;
    return Objects.equals(this.marketId, uwRefSearchRecord.marketId) &&
        Objects.equals(this.marketSyndicateId, uwRefSearchRecord.marketSyndicateId) &&
        Objects.equals(this.premiumId, uwRefSearchRecord.premiumId) &&
        Objects.equals(this.csnd, uwRefSearchRecord.csnd) &&
        Objects.equals(this.syndicatePercentage, uwRefSearchRecord.syndicatePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketId, marketSyndicateId, premiumId, csnd, syndicatePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UwRefSearchRecord {\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    marketSyndicateId: ").append(toIndentedString(marketSyndicateId)).append("\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    csnd: ").append(toIndentedString(csnd)).append("\n");
    sb.append("    syndicatePercentage: ").append(toIndentedString(syndicatePercentage)).append("\n");
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

