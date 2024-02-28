package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SumInsured
 */

@JsonTypeName("sumInsured")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SumInsured implements Serializable {

  private static final long serialVersionUID = 1L;

  private TypeOfCurrency sumInsuredCurrency;

  private BigDecimal sumInsuredAmount;

  private TypeOfCurrency excessCurrency;

  private BigDecimal excessAmount;

  public SumInsured() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SumInsured(TypeOfCurrency sumInsuredCurrency, BigDecimal sumInsuredAmount) {
    this.sumInsuredCurrency = sumInsuredCurrency;
    this.sumInsuredAmount = sumInsuredAmount;
  }

  public SumInsured sumInsuredCurrency(TypeOfCurrency sumInsuredCurrency) {
    this.sumInsuredCurrency = sumInsuredCurrency;
    return this;
  }

  /**
   * Get sumInsuredCurrency
   * @return sumInsuredCurrency
  */
  @NotNull @Valid 

  @JsonProperty("sumInsuredCurrency")
  public TypeOfCurrency getSumInsuredCurrency() {
    return sumInsuredCurrency;
  }

  public void setSumInsuredCurrency(TypeOfCurrency sumInsuredCurrency) {
    this.sumInsuredCurrency = sumInsuredCurrency;
  }

  public SumInsured sumInsuredAmount(BigDecimal sumInsuredAmount) {
    this.sumInsuredAmount = sumInsuredAmount;
    return this;
  }

  /**
   * Get sumInsuredAmount
   * @return sumInsuredAmount
  */
  @NotNull @Valid 

  @JsonProperty("sumInsuredAmount")
  public BigDecimal getSumInsuredAmount() {
    return sumInsuredAmount;
  }

  public void setSumInsuredAmount(BigDecimal sumInsuredAmount) {
    this.sumInsuredAmount = sumInsuredAmount;
  }

  public SumInsured excessCurrency(TypeOfCurrency excessCurrency) {
    this.excessCurrency = excessCurrency;
    return this;
  }

  /**
   * Get excessCurrency
   * @return excessCurrency
  */
  @Valid 

  @JsonProperty("excessCurrency")
  public TypeOfCurrency getExcessCurrency() {
    return excessCurrency;
  }

  public void setExcessCurrency(TypeOfCurrency excessCurrency) {
    this.excessCurrency = excessCurrency;
  }

  public SumInsured excessAmount(BigDecimal excessAmount) {
    this.excessAmount = excessAmount;
    return this;
  }

  /**
   * Get excessAmount
   * @return excessAmount
  */
  @Valid 

  @JsonProperty("excessAmount")
  public BigDecimal getExcessAmount() {
    return excessAmount;
  }

  public void setExcessAmount(BigDecimal excessAmount) {
    this.excessAmount = excessAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SumInsured sumInsured = (SumInsured) o;
    return Objects.equals(this.sumInsuredCurrency, sumInsured.sumInsuredCurrency) &&
        Objects.equals(this.sumInsuredAmount, sumInsured.sumInsuredAmount) &&
        Objects.equals(this.excessCurrency, sumInsured.excessCurrency) &&
        Objects.equals(this.excessAmount, sumInsured.excessAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sumInsuredCurrency, sumInsuredAmount, excessCurrency, excessAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SumInsured {\n");
    sb.append("    sumInsuredCurrency: ").append(toIndentedString(sumInsuredCurrency)).append("\n");
    sb.append("    sumInsuredAmount: ").append(toIndentedString(sumInsuredAmount)).append("\n");
    sb.append("    excessCurrency: ").append(toIndentedString(excessCurrency)).append("\n");
    sb.append("    excessAmount: ").append(toIndentedString(excessAmount)).append("\n");
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

