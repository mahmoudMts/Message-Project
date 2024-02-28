package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * PartyMarketDetail
 */

@JsonTypeName("partyMarketDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PartyMarketDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private String partyReference;

  private UUID partyId;

  private UUID partyMarketId;

  /**
   * Indicates whether the syndicate is London Syndicate ( LS) or Llyod'sBrussels syndicate ( LBS)
   */
  public enum RegulatoryJurisdictionEnum {
    LBS("LBS"),
    
    LS("LS");

    private String value;

    RegulatoryJurisdictionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RegulatoryJurisdictionEnum fromValue(String value) {
      for (RegulatoryJurisdictionEnum b : RegulatoryJurisdictionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RegulatoryJurisdictionEnum regulatoryJurisdiction;

  public PartyMarketDetail partyReference(String partyReference) {
    this.partyReference = partyReference;
    return this;
  }

  /**
   * Stamp code ( syndicate number) of the syndicate participating in the risk
   * @return partyReference
  */
  

  @JsonProperty("partyReference")
  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }

  public PartyMarketDetail partyId(UUID partyId) {
    this.partyId = partyId;
    return this;
  }

  /**
   * partyID of the market
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

  public PartyMarketDetail partyMarketId(UUID partyMarketId) {
    this.partyMarketId = partyMarketId;
    return this;
  }

  /**
   * marketID of the market
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

  public PartyMarketDetail regulatoryJurisdiction(RegulatoryJurisdictionEnum regulatoryJurisdiction) {
    this.regulatoryJurisdiction = regulatoryJurisdiction;
    return this;
  }

  /**
   * Indicates whether the syndicate is London Syndicate ( LS) or Llyod'sBrussels syndicate ( LBS)
   * @return regulatoryJurisdiction
  */
  

  @JsonProperty("regulatoryJurisdiction")
  public RegulatoryJurisdictionEnum getRegulatoryJurisdiction() {
    return regulatoryJurisdiction;
  }

  public void setRegulatoryJurisdiction(RegulatoryJurisdictionEnum regulatoryJurisdiction) {
    this.regulatoryJurisdiction = regulatoryJurisdiction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyMarketDetail partyMarketDetail = (PartyMarketDetail) o;
    return Objects.equals(this.partyReference, partyMarketDetail.partyReference) &&
        Objects.equals(this.partyId, partyMarketDetail.partyId) &&
        Objects.equals(this.partyMarketId, partyMarketDetail.partyMarketId) &&
        Objects.equals(this.regulatoryJurisdiction, partyMarketDetail.regulatoryJurisdiction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReference, partyId, partyMarketId, regulatoryJurisdiction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyMarketDetail {\n");
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyMarketId: ").append(toIndentedString(partyMarketId)).append("\n");
    sb.append("    regulatoryJurisdiction: ").append(toIndentedString(regulatoryJurisdiction)).append("\n");
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

