package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * Fil
 */

@JsonTypeName("fil")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Fil implements Serializable {

  private static final long serialVersionUID = 1L;

  private TypeOfFilCode code1;

  private TypeOfCurrency currency1;

  private BigDecimal premium1;

  private TypeOfFilCode code2;

  private TypeOfCurrency currency2;

  private BigDecimal premium2;

  private String opCode1;

  private TypeOfFilCode code3;

  private TypeOfCurrency currency3;

  private BigDecimal premium3;

  public Fil code1(TypeOfFilCode code1) {
    this.code1 = code1;
    return this;
  }

  /**
   * Get code1
   * @return code1
  */
  @Valid 

  @JsonProperty("code1")
  public TypeOfFilCode getCode1() {
    return code1;
  }

  public void setCode1(TypeOfFilCode code1) {
    this.code1 = code1;
  }

  public Fil currency1(TypeOfCurrency currency1) {
    this.currency1 = currency1;
    return this;
  }

  /**
   * Get currency1
   * @return currency1
  */
  @Valid 

  @JsonProperty("currency1")
  public TypeOfCurrency getCurrency1() {
    return currency1;
  }

  public void setCurrency1(TypeOfCurrency currency1) {
    this.currency1 = currency1;
  }

  public Fil premium1(BigDecimal premium1) {
    this.premium1 = premium1;
    return this;
  }

  /**
   * Get premium1
   * @return premium1
  */
  @Valid 

  @JsonProperty("premium1")
  public BigDecimal getPremium1() {
    return premium1;
  }

  public void setPremium1(BigDecimal premium1) {
    this.premium1 = premium1;
  }

  public Fil code2(TypeOfFilCode code2) {
    this.code2 = code2;
    return this;
  }

  /**
   * Get code2
   * @return code2
  */
  @Valid 

  @JsonProperty("code2")
  public TypeOfFilCode getCode2() {
    return code2;
  }

  public void setCode2(TypeOfFilCode code2) {
    this.code2 = code2;
  }

  public Fil currency2(TypeOfCurrency currency2) {
    this.currency2 = currency2;
    return this;
  }

  /**
   * Get currency2
   * @return currency2
  */
  @Valid 

  @JsonProperty("currency2")
  public TypeOfCurrency getCurrency2() {
    return currency2;
  }

  public void setCurrency2(TypeOfCurrency currency2) {
    this.currency2 = currency2;
  }

  public Fil premium2(BigDecimal premium2) {
    this.premium2 = premium2;
    return this;
  }

  /**
   * Get premium2
   * @return premium2
  */
  @Valid 

  @JsonProperty("premium2")
  public BigDecimal getPremium2() {
    return premium2;
  }

  public void setPremium2(BigDecimal premium2) {
    this.premium2 = premium2;
  }

  public Fil opCode1(String opCode1) {
    this.opCode1 = opCode1;
    return this;
  }

  /**
   * Get opCode1
   * @return opCode1
  */
  

  @JsonProperty("opCode1")
  public String getOpCode1() {
    return opCode1;
  }

  public void setOpCode1(String opCode1) {
    this.opCode1 = opCode1;
  }

  public Fil code3(TypeOfFilCode code3) {
    this.code3 = code3;
    return this;
  }

  /**
   * Get code3
   * @return code3
  */
  @Valid 

  @JsonProperty("code3")
  public TypeOfFilCode getCode3() {
    return code3;
  }

  public void setCode3(TypeOfFilCode code3) {
    this.code3 = code3;
  }

  public Fil currency3(TypeOfCurrency currency3) {
    this.currency3 = currency3;
    return this;
  }

  /**
   * Get currency3
   * @return currency3
  */
  @Valid 

  @JsonProperty("currency3")
  public TypeOfCurrency getCurrency3() {
    return currency3;
  }

  public void setCurrency3(TypeOfCurrency currency3) {
    this.currency3 = currency3;
  }

  public Fil premium3(BigDecimal premium3) {
    this.premium3 = premium3;
    return this;
  }

  /**
   * Get premium3
   * @return premium3
  */
  @Valid 

  @JsonProperty("premium3")
  public BigDecimal getPremium3() {
    return premium3;
  }

  public void setPremium3(BigDecimal premium3) {
    this.premium3 = premium3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fil fil = (Fil) o;
    return Objects.equals(this.code1, fil.code1) &&
        Objects.equals(this.currency1, fil.currency1) &&
        Objects.equals(this.premium1, fil.premium1) &&
        Objects.equals(this.code2, fil.code2) &&
        Objects.equals(this.currency2, fil.currency2) &&
        Objects.equals(this.premium2, fil.premium2) &&
        Objects.equals(this.opCode1, fil.opCode1) &&
        Objects.equals(this.code3, fil.code3) &&
        Objects.equals(this.currency3, fil.currency3) &&
        Objects.equals(this.premium3, fil.premium3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code1, currency1, premium1, code2, currency2, premium2, opCode1, code3, currency3, premium3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fil {\n");
    sb.append("    code1: ").append(toIndentedString(code1)).append("\n");
    sb.append("    currency1: ").append(toIndentedString(currency1)).append("\n");
    sb.append("    premium1: ").append(toIndentedString(premium1)).append("\n");
    sb.append("    code2: ").append(toIndentedString(code2)).append("\n");
    sb.append("    currency2: ").append(toIndentedString(currency2)).append("\n");
    sb.append("    premium2: ").append(toIndentedString(premium2)).append("\n");
    sb.append("    opCode1: ").append(toIndentedString(opCode1)).append("\n");
    sb.append("    code3: ").append(toIndentedString(code3)).append("\n");
    sb.append("    currency3: ").append(toIndentedString(currency3)).append("\n");
    sb.append("    premium3: ").append(toIndentedString(premium3)).append("\n");
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

