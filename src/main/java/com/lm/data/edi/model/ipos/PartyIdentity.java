package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This object will contain information regarding identification associated to a specific party
 */

@JsonTypeName("partyIdentity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PartyIdentity implements Serializable {

  private static final long serialVersionUID = 1L;

  private String typeId;

  /**
   * A code identifying individual type of unique identification.
   */
  public enum TypeCodeEnum {
    RINET_REINSURANCE_AND_INSURANCE_NETWORK("RINET_reinsurance_and_insurance_network"),
    
    DUNS_DUN_AND_BRADSTREET("DUNS_dun_and_bradstreet"),
    
    NATIONAL_ASSOCIATION_OF_INSURANCE_COMMISSIONERS("national_association_of_insurance_commissioners"),
    
    LONDON_INSURANCE_AND_REINSURANCE_MARKET_ASSOCIATION("london_insurance_and_reinsurance_market_association"),
    
    INSTITUTE_OF_LONDON_UNDERWRITERS("institute_of_london_underwriters"),
    
    LLOYDS("lloyds"),
    
    ASSECURANZ_COMPASS("assecuranz_compass"),
    
    BEST("best"),
    
    FEDERAL_IDENTIFICATION_NUMBER("federal_identification_number"),
    
    EAN_INTERNATIONAL_ARTICLE_NUMBERING_ASSOCIATION("EAN_international_article_numbering_association"),
    
    ASSOCIATION_OF_BRITISH_INSURERS("association_of_british_insurers"),
    
    LLOYDS_OUTWARD_REINSURANCE("Lloyds_outward_reinsurance"),
    
    MUTUALLY_DEFINED("mutually_defined"),
    
    LLOYDS_BRUSSELS("lloyds_brussels");

    private String value;

    TypeCodeEnum(String value) {
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
    public static TypeCodeEnum fromValue(String value) {
      for (TypeCodeEnum b : TypeCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeCodeEnum typeCode;

  public PartyIdentity typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * This is the unique Identifier for the party with whom partyIdentity is associated.
   * @return typeId
  */
  

  @JsonProperty("typeId")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public PartyIdentity typeCode(TypeCodeEnum typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * A code identifying individual type of unique identification.
   * @return typeCode
  */
  

  @JsonProperty("typeCode")
  public TypeCodeEnum getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(TypeCodeEnum typeCode) {
    this.typeCode = typeCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyIdentity partyIdentity = (PartyIdentity) o;
    return Objects.equals(this.typeId, partyIdentity.typeId) &&
        Objects.equals(this.typeCode, partyIdentity.typeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, typeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyIdentity {\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

