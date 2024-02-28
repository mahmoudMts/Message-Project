package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * FrenchRiskCategory
 */

@JsonTypeName("frenchRiskCategory")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class FrenchRiskCategory implements Serializable {

  private static final long serialVersionUID = 1L;

  private TypeOfCategoryOfRisk categoryOfRisk;

  private BigDecimal premiumInOriginalCurr;

  public FrenchRiskCategory categoryOfRisk(TypeOfCategoryOfRisk categoryOfRisk) {
    this.categoryOfRisk = categoryOfRisk;
    return this;
  }

  /**
   * Get categoryOfRisk
   * @return categoryOfRisk
  */
  @Valid 

  @JsonProperty("categoryOfRisk")
  public TypeOfCategoryOfRisk getCategoryOfRisk() {
    return categoryOfRisk;
  }

  public void setCategoryOfRisk(TypeOfCategoryOfRisk categoryOfRisk) {
    this.categoryOfRisk = categoryOfRisk;
  }

  public FrenchRiskCategory premiumInOriginalCurr(BigDecimal premiumInOriginalCurr) {
    this.premiumInOriginalCurr = premiumInOriginalCurr;
    return this;
  }

  /**
   * Get premiumInOriginalCurr
   * @return premiumInOriginalCurr
  */
  @Valid 

  @JsonProperty("premiumInOriginalCurr")
  public BigDecimal getPremiumInOriginalCurr() {
    return premiumInOriginalCurr;
  }

  public void setPremiumInOriginalCurr(BigDecimal premiumInOriginalCurr) {
    this.premiumInOriginalCurr = premiumInOriginalCurr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrenchRiskCategory frenchRiskCategory = (FrenchRiskCategory) o;
    return Objects.equals(this.categoryOfRisk, frenchRiskCategory.categoryOfRisk) &&
        Objects.equals(this.premiumInOriginalCurr, frenchRiskCategory.premiumInOriginalCurr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryOfRisk, premiumInOriginalCurr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrenchRiskCategory {\n");
    sb.append("    categoryOfRisk: ").append(toIndentedString(categoryOfRisk)).append("\n");
    sb.append("    premiumInOriginalCurr: ").append(toIndentedString(premiumInOriginalCurr)).append("\n");
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

