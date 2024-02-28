package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * FilDetails
 */

@JsonTypeName("filDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class FilDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  private String filCode;

  private BigDecimal filPremium;

  private String filCurrencyCode;

  public FilDetails filCode(String filCode) {
    this.filCode = filCode;
    return this;
  }

  /**
   * Get filCode
   * @return filCode
  */
  

  @JsonProperty("filCode")
  public String getFilCode() {
    return filCode;
  }

  public void setFilCode(String filCode) {
    this.filCode = filCode;
  }

  public FilDetails filPremium(BigDecimal filPremium) {
    this.filPremium = filPremium;
    return this;
  }

  /**
   * Get filPremium
   * @return filPremium
  */
  @Valid 

  @JsonProperty("filPremium")
  public BigDecimal getFilPremium() {
    return filPremium;
  }

  public void setFilPremium(BigDecimal filPremium) {
    this.filPremium = filPremium;
  }

  public FilDetails filCurrencyCode(String filCurrencyCode) {
    this.filCurrencyCode = filCurrencyCode;
    return this;
  }

  /**
   * Get filCurrencyCode
   * @return filCurrencyCode
  */
  

  @JsonProperty("filCurrencyCode")
  public String getFilCurrencyCode() {
    return filCurrencyCode;
  }

  public void setFilCurrencyCode(String filCurrencyCode) {
    this.filCurrencyCode = filCurrencyCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilDetails filDetails = (FilDetails) o;
    return Objects.equals(this.filCode, filDetails.filCode) &&
        Objects.equals(this.filPremium, filDetails.filPremium) &&
        Objects.equals(this.filCurrencyCode, filDetails.filCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filCode, filPremium, filCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilDetails {\n");
    sb.append("    filCode: ").append(toIndentedString(filCode)).append("\n");
    sb.append("    filPremium: ").append(toIndentedString(filPremium)).append("\n");
    sb.append("    filCurrencyCode: ").append(toIndentedString(filCurrencyCode)).append("\n");
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

