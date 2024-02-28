package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * MarketSyndicate
 */

@JsonTypeName("marketSyndicate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class MarketSyndicate implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID marketSyndicateId;

  private UUID marketId;

  private UUID partyId;

  private UUID partyMarketId;

  private String facilityNumberAndDate;

  private String syndicateNumber;

  private String syndicatePseudonym;

  private BigDecimal syndicatePercentage;

  private String syndicateReference;

  private String syndicateSecondaryReference;

  private Boolean removedFromPartial;

  public MarketSyndicate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MarketSyndicate(String syndicateNumber, BigDecimal syndicatePercentage, String syndicateReference) {
    this.syndicateNumber = syndicateNumber;
    this.syndicatePercentage = syndicatePercentage;
    this.syndicateReference = syndicateReference;
  }

  public MarketSyndicate marketSyndicateId(UUID marketSyndicateId) {
    this.marketSyndicateId = marketSyndicateId;
    return this;
  }

  /**
   * Get marketSyndicateId
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

  public MarketSyndicate marketId(UUID marketId) {
    this.marketId = marketId;
    return this;
  }

  /**
   * Get marketId
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

  public MarketSyndicate partyId(UUID partyId) {
    this.partyId = partyId;
    return this;
  }

  /**
   * Id of the party from the party domain
   * @return partyId
  */
  @Valid 

  @JsonProperty("partyId")
  public UUID getPartyId() {
    return partyId;
  }

  public void setPartyId(UUID partyId) {
    this.partyId = partyId;
  }

  public MarketSyndicate partyMarketId(UUID partyMarketId) {
    this.partyMarketId = partyMarketId;
    return this;
  }

  /**
   * Id of the party market from the party domain
   * @return partyMarketId
  */
  @Valid 

  @JsonProperty("partyMarketId")
  public UUID getPartyMarketId() {
    return partyMarketId;
  }

  public void setPartyMarketId(UUID partyMarketId) {
    this.partyMarketId = partyMarketId;
  }

  public MarketSyndicate facilityNumberAndDate(String facilityNumberAndDate) {
    this.facilityNumberAndDate = facilityNumberAndDate;
    return this;
  }

  /**
   * Get facilityNumberAndDate
   * @return facilityNumberAndDate
  */
  

  @JsonProperty("facilityNumberAndDate")
  public String getFacilityNumberAndDate() {
    return facilityNumberAndDate;
  }

  public void setFacilityNumberAndDate(String facilityNumberAndDate) {
    this.facilityNumberAndDate = facilityNumberAndDate;
  }

  public MarketSyndicate syndicateNumber(String syndicateNumber) {
    this.syndicateNumber = syndicateNumber;
    return this;
  }

  /**
   * Get syndicateNumber
   * @return syndicateNumber
  */
  @NotNull 

  @JsonProperty("syndicateNumber")
  public String getSyndicateNumber() {
    return syndicateNumber;
  }

  public void setSyndicateNumber(String syndicateNumber) {
    this.syndicateNumber = syndicateNumber;
  }

  public MarketSyndicate syndicatePseudonym(String syndicatePseudonym) {
    this.syndicatePseudonym = syndicatePseudonym;
    return this;
  }

  /**
   * Get syndicatePseudonym
   * @return syndicatePseudonym
  */
  

  @JsonProperty("syndicatePseudonym")
  public String getSyndicatePseudonym() {
    return syndicatePseudonym;
  }

  public void setSyndicatePseudonym(String syndicatePseudonym) {
    this.syndicatePseudonym = syndicatePseudonym;
  }

  public MarketSyndicate syndicatePercentage(BigDecimal syndicatePercentage) {
    this.syndicatePercentage = syndicatePercentage;
    return this;
  }

  /**
   * Get syndicatePercentage
   * @return syndicatePercentage
  */
  @NotNull @Valid 

  @JsonProperty("syndicatePercentage")
  public BigDecimal getSyndicatePercentage() {
    return syndicatePercentage;
  }

  public void setSyndicatePercentage(BigDecimal syndicatePercentage) {
    this.syndicatePercentage = syndicatePercentage;
  }

  public MarketSyndicate syndicateReference(String syndicateReference) {
    this.syndicateReference = syndicateReference;
    return this;
  }

  /**
   * Get syndicateReference
   * @return syndicateReference
  */
  @NotNull 

  @JsonProperty("syndicateReference")
  public String getSyndicateReference() {
    return syndicateReference;
  }

  public void setSyndicateReference(String syndicateReference) {
    this.syndicateReference = syndicateReference;
  }

  public MarketSyndicate syndicateSecondaryReference(String syndicateSecondaryReference) {
    this.syndicateSecondaryReference = syndicateSecondaryReference;
    return this;
  }

  /**
   * Get syndicateSecondaryReference
   * @return syndicateSecondaryReference
  */
  

  @JsonProperty("syndicateSecondaryReference")
  public String getSyndicateSecondaryReference() {
    return syndicateSecondaryReference;
  }

  public void setSyndicateSecondaryReference(String syndicateSecondaryReference) {
    this.syndicateSecondaryReference = syndicateSecondaryReference;
  }

  public MarketSyndicate removedFromPartial(Boolean removedFromPartial) {
    this.removedFromPartial = removedFromPartial;
    return this;
  }

  /**
   * Get removedFromPartial
   * @return removedFromPartial
  */
  

  @JsonProperty("removedFromPartial")
  public Boolean getRemovedFromPartial() {
    return removedFromPartial;
  }

  public void setRemovedFromPartial(Boolean removedFromPartial) {
    this.removedFromPartial = removedFromPartial;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketSyndicate marketSyndicate = (MarketSyndicate) o;
    return Objects.equals(this.marketSyndicateId, marketSyndicate.marketSyndicateId) &&
        Objects.equals(this.marketId, marketSyndicate.marketId) &&
        Objects.equals(this.partyId, marketSyndicate.partyId) &&
        Objects.equals(this.partyMarketId, marketSyndicate.partyMarketId) &&
        Objects.equals(this.facilityNumberAndDate, marketSyndicate.facilityNumberAndDate) &&
        Objects.equals(this.syndicateNumber, marketSyndicate.syndicateNumber) &&
        Objects.equals(this.syndicatePseudonym, marketSyndicate.syndicatePseudonym) &&
        Objects.equals(this.syndicatePercentage, marketSyndicate.syndicatePercentage) &&
        Objects.equals(this.syndicateReference, marketSyndicate.syndicateReference) &&
        Objects.equals(this.syndicateSecondaryReference, marketSyndicate.syndicateSecondaryReference) &&
        Objects.equals(this.removedFromPartial, marketSyndicate.removedFromPartial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketSyndicateId, marketId, partyId, partyMarketId, facilityNumberAndDate, syndicateNumber, syndicatePseudonym, syndicatePercentage, syndicateReference, syndicateSecondaryReference, removedFromPartial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketSyndicate {\n");
    sb.append("    marketSyndicateId: ").append(toIndentedString(marketSyndicateId)).append("\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyMarketId: ").append(toIndentedString(partyMarketId)).append("\n");
    sb.append("    facilityNumberAndDate: ").append(toIndentedString(facilityNumberAndDate)).append("\n");
    sb.append("    syndicateNumber: ").append(toIndentedString(syndicateNumber)).append("\n");
    sb.append("    syndicatePseudonym: ").append(toIndentedString(syndicatePseudonym)).append("\n");
    sb.append("    syndicatePercentage: ").append(toIndentedString(syndicatePercentage)).append("\n");
    sb.append("    syndicateReference: ").append(toIndentedString(syndicateReference)).append("\n");
    sb.append("    syndicateSecondaryReference: ").append(toIndentedString(syndicateSecondaryReference)).append("\n");
    sb.append("    removedFromPartial: ").append(toIndentedString(removedFromPartial)).append("\n");
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

