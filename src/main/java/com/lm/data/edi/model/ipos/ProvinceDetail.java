package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * ProvinceDetail
 */

@JsonTypeName("provinceDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class ProvinceDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private TypeOfCountrySubDivision stateProvince;

  private BigDecimal premiumAmount;

  public ProvinceDetail stateProvince(TypeOfCountrySubDivision stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

  /**
   * Get stateProvince
   * @return stateProvince
  */
  @Valid 

  @JsonProperty("stateProvince")
  public TypeOfCountrySubDivision getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(TypeOfCountrySubDivision stateProvince) {
    this.stateProvince = stateProvince;
  }

  public ProvinceDetail premiumAmount(BigDecimal premiumAmount) {
    this.premiumAmount = premiumAmount;
    return this;
  }

  /**
   * Get premiumAmount
   * @return premiumAmount
  */
  @Valid 

  @JsonProperty("premiumAmount")
  public BigDecimal getPremiumAmount() {
    return premiumAmount;
  }

  public void setPremiumAmount(BigDecimal premiumAmount) {
    this.premiumAmount = premiumAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvinceDetail provinceDetail = (ProvinceDetail) o;
    return Objects.equals(this.stateProvince, provinceDetail.stateProvince) &&
        Objects.equals(this.premiumAmount, provinceDetail.premiumAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateProvince, premiumAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvinceDetail {\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    premiumAmount: ").append(toIndentedString(premiumAmount)).append("\n");
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

