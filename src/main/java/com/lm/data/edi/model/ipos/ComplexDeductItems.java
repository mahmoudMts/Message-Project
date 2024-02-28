package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * ComplexDeductItems
 */

@JsonTypeName("complexDeductItems")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class ComplexDeductItems implements Serializable {

  private static final long serialVersionUID = 1L;

  private DiscountTypeEnum discountCode;

  private BigDecimal discountPercentage;

  private BigDecimal discountGrossNet;

  public ComplexDeductItems discountCode(DiscountTypeEnum discountCode) {
    this.discountCode = discountCode;
    return this;
  }

  /**
   * Get discountCode
   * @return discountCode
  */
  @Valid 

  @JsonProperty("discountCode")
  public DiscountTypeEnum getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(DiscountTypeEnum discountCode) {
    this.discountCode = discountCode;
  }

  public ComplexDeductItems discountPercentage(BigDecimal discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

  /**
   * Get discountPercentage
   * @return discountPercentage
  */
  @Valid 

  @JsonProperty("discountPercentage")
  public BigDecimal getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(BigDecimal discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public ComplexDeductItems discountGrossNet(BigDecimal discountGrossNet) {
    this.discountGrossNet = discountGrossNet;
    return this;
  }

  /**
   * Get discountGrossNet
   * @return discountGrossNet
  */
  @Valid 

  @JsonProperty("discountGrossNet")
  public BigDecimal getDiscountGrossNet() {
    return discountGrossNet;
  }

  public void setDiscountGrossNet(BigDecimal discountGrossNet) {
    this.discountGrossNet = discountGrossNet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplexDeductItems complexDeductItems = (ComplexDeductItems) o;
    return Objects.equals(this.discountCode, complexDeductItems.discountCode) &&
        Objects.equals(this.discountPercentage, complexDeductItems.discountPercentage) &&
        Objects.equals(this.discountGrossNet, complexDeductItems.discountGrossNet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountCode, discountPercentage, discountGrossNet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplexDeductItems {\n");
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
    sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
    sb.append("    discountGrossNet: ").append(toIndentedString(discountGrossNet)).append("\n");
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

