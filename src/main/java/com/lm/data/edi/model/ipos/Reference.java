package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This object will define specific reference types associated to different objects
 */

@JsonTypeName("reference")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Reference implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * This will determine the source of the reference
   */
  public enum NameEnum {
    BROKER("broker"),
    
    CEDENT("cedent"),
    
    INSURER("insurer"),
    
    REINSURER("reinsurer"),
    
    COINSURER("coinsurer"),
    
    BROKERGROUP("brokerGroup"),
    
    SERVICEPROVIDER("serviceProvider"),
    
    ENDORSEMENT("endorsement");

    private String value;

    NameEnum(String value) {
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
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NameEnum name;

  private String id;

  /**
   * This is to identify any additional context for the reference type.
   */
  public enum AppliesToEnum {
    ACCOUNTTRANSACTION("accountTransaction"),
    
    REFERREDACCOUNTTRANSACTION("referredAccountTransaction"),
    
    CLAIMTRANSACTION("claimTransaction"),
    
    ACCOUNTENTRY("accountEntry"),
    
    CONTRACT("contract"),
    
    CONTRACTSECTION("contractSection"),
    
    CONTRACTMARKET("contractMarket"),
    
    CLAIM("claim"),
    
    CLAIMENTRY("claimEntry"),
    
    REFERREDBORDEREAU("referredBordereau"),
    
    REFERREDCLAIMTRANSACTION("referredClaimTransaction"),
    
    ORIGINALPOLICY("originalPolicy");

    private String value;

    AppliesToEnum(String value) {
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
    public static AppliesToEnum fromValue(String value) {
      for (AppliesToEnum b : AppliesToEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AppliesToEnum appliesTo;

  public Reference name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * This will determine the source of the reference
   * @return name
  */
  

  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public Reference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * This contains the unique reference identifier for this reference type
   * @return id
  */
  

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Reference appliesTo(AppliesToEnum appliesTo) {
    this.appliesTo = appliesTo;
    return this;
  }

  /**
   * This is to identify any additional context for the reference type.
   * @return appliesTo
  */
  

  @JsonProperty("appliesTo")
  public AppliesToEnum getAppliesTo() {
    return appliesTo;
  }

  public void setAppliesTo(AppliesToEnum appliesTo) {
    this.appliesTo = appliesTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.name, reference.name) &&
        Objects.equals(this.id, reference.id) &&
        Objects.equals(this.appliesTo, reference.appliesTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, appliesTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
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

