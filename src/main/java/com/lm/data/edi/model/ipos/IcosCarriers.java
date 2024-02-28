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
 * IcosCarriers
 */

@JsonTypeName("icosCarriers")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class IcosCarriers implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID partyId;

  private UUID partyMarketId;

  private String carrierNumber;

  private BigDecimal carrierPercentage;

  public IcosCarriers partyId(UUID partyId) {
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

  public IcosCarriers partyMarketId(UUID partyMarketId) {
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

  public IcosCarriers carrierNumber(String carrierNumber) {
    this.carrierNumber = carrierNumber;
    return this;
  }

  /**
   * Get carrierNumber
   * @return carrierNumber
  */
  

  @JsonProperty("carrierNumber")
  public String getCarrierNumber() {
    return carrierNumber;
  }

  public void setCarrierNumber(String carrierNumber) {
    this.carrierNumber = carrierNumber;
  }

  public IcosCarriers carrierPercentage(BigDecimal carrierPercentage) {
    this.carrierPercentage = carrierPercentage;
    return this;
  }

  /**
   * Get carrierPercentage
   * @return carrierPercentage
  */
  @Valid 

  @JsonProperty("carrierPercentage")
  public BigDecimal getCarrierPercentage() {
    return carrierPercentage;
  }

  public void setCarrierPercentage(BigDecimal carrierPercentage) {
    this.carrierPercentage = carrierPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcosCarriers icosCarriers = (IcosCarriers) o;
    return Objects.equals(this.partyId, icosCarriers.partyId) &&
        Objects.equals(this.partyMarketId, icosCarriers.partyMarketId) &&
        Objects.equals(this.carrierNumber, icosCarriers.carrierNumber) &&
        Objects.equals(this.carrierPercentage, icosCarriers.carrierPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, partyMarketId, carrierNumber, carrierPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcosCarriers {\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyMarketId: ").append(toIndentedString(partyMarketId)).append("\n");
    sb.append("    carrierNumber: ").append(toIndentedString(carrierNumber)).append("\n");
    sb.append("    carrierPercentage: ").append(toIndentedString(carrierPercentage)).append("\n");
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

