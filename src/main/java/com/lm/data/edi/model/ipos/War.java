package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * War
 */

@JsonTypeName("war")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class War implements Serializable {

  private static final long serialVersionUID = 1L;

  private TypeOfWarRiskCode code;

  private BigDecimal premiumGross;

  private BigDecimal premiumNet;

  public War code(TypeOfWarRiskCode code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @Valid 

  @JsonProperty("code")
  public TypeOfWarRiskCode getCode() {
    return code;
  }

  public void setCode(TypeOfWarRiskCode code) {
    this.code = code;
  }

  public War premiumGross(BigDecimal premiumGross) {
    this.premiumGross = premiumGross;
    return this;
  }

  /**
   * Get premiumGross
   * @return premiumGross
  */
  @Valid 

  @JsonProperty("premiumGross")
  public BigDecimal getPremiumGross() {
    return premiumGross;
  }

  public void setPremiumGross(BigDecimal premiumGross) {
    this.premiumGross = premiumGross;
  }

  public War premiumNet(BigDecimal premiumNet) {
    this.premiumNet = premiumNet;
    return this;
  }

  /**
   * Get premiumNet
   * @return premiumNet
  */
  @Valid 

  @JsonProperty("premiumNet")
  public BigDecimal getPremiumNet() {
    return premiumNet;
  }

  public void setPremiumNet(BigDecimal premiumNet) {
    this.premiumNet = premiumNet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    War war = (War) o;
    return Objects.equals(this.code, war.code) &&
        Objects.equals(this.premiumGross, war.premiumGross) &&
        Objects.equals(this.premiumNet, war.premiumNet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, premiumGross, premiumNet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class War {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    premiumGross: ").append(toIndentedString(premiumGross)).append("\n");
    sb.append("    premiumNet: ").append(toIndentedString(premiumNet)).append("\n");
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

