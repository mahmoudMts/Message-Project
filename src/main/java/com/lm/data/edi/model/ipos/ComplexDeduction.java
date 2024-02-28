package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * ComplexDeduction
 */

@JsonTypeName("complexDeduction")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class ComplexDeduction implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigDecimal preDiscountGrossPrem;

  @Valid
  private List<@Valid ComplexDeductItems> deductions;

  public ComplexDeduction preDiscountGrossPrem(BigDecimal preDiscountGrossPrem) {
    this.preDiscountGrossPrem = preDiscountGrossPrem;
    return this;
  }

  /**
   * Get preDiscountGrossPrem
   * @return preDiscountGrossPrem
  */
  @Valid 

  @JsonProperty("preDiscountGrossPrem")
  public BigDecimal getPreDiscountGrossPrem() {
    return preDiscountGrossPrem;
  }

  public void setPreDiscountGrossPrem(BigDecimal preDiscountGrossPrem) {
    this.preDiscountGrossPrem = preDiscountGrossPrem;
  }

  public ComplexDeduction deductions(List<@Valid ComplexDeductItems> deductions) {
    this.deductions = deductions;
    return this;
  }

  public ComplexDeduction addDeductionsItem(ComplexDeductItems deductionsItem) {
    if (this.deductions == null) {
      this.deductions = new ArrayList<>();
    }
    this.deductions.add(deductionsItem);
    return this;
  }

  /**
   * Get deductions
   * @return deductions
  */
  @Valid 

  @JsonProperty("deductions")
  public List<@Valid ComplexDeductItems> getDeductions() {
    return deductions;
  }

  public void setDeductions(List<@Valid ComplexDeductItems> deductions) {
    this.deductions = deductions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplexDeduction complexDeduction = (ComplexDeduction) o;
    return Objects.equals(this.preDiscountGrossPrem, complexDeduction.preDiscountGrossPrem) &&
        Objects.equals(this.deductions, complexDeduction.deductions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preDiscountGrossPrem, deductions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplexDeduction {\n");
    sb.append("    preDiscountGrossPrem: ").append(toIndentedString(preDiscountGrossPrem)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
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

