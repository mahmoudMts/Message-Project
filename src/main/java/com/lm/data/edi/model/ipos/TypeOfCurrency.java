package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfCurrency
 */

@JsonTypeName("typeOfCurrency")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfCurrency implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refTypeCurrencyId;

  private String typeOfCurrency;

  public TypeOfCurrency refTypeCurrencyId(UUID refTypeCurrencyId) {
    this.refTypeCurrencyId = refTypeCurrencyId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an Currency will be retrieved from refisocurrency reference table
   * @return refTypeCurrencyId
  */
  @Valid 

  @JsonProperty("refTypeCurrencyId")
  public UUID getRefTypeCurrencyId() {
    return refTypeCurrencyId;
  }

  public void setRefTypeCurrencyId(UUID refTypeCurrencyId) {
    this.refTypeCurrencyId = refTypeCurrencyId;
  }

  public TypeOfCurrency typeOfCurrency(String typeOfCurrency) {
    this.typeOfCurrency = typeOfCurrency;
    return this;
  }

  /**
   * Retrieved from reference table refisocurrency (code)
   * @return typeOfCurrency
  */
  

  @JsonProperty("typeOfCurrency")
  public String getTypeOfCurrency() {
    return typeOfCurrency;
  }

  public void setTypeOfCurrency(String typeOfCurrency) {
    this.typeOfCurrency = typeOfCurrency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfCurrency typeOfCurrency = (TypeOfCurrency) o;
    return Objects.equals(this.refTypeCurrencyId, typeOfCurrency.refTypeCurrencyId) &&
        Objects.equals(this.typeOfCurrency, typeOfCurrency.typeOfCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refTypeCurrencyId, typeOfCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfCurrency {\n");
    sb.append("    refTypeCurrencyId: ").append(toIndentedString(refTypeCurrencyId)).append("\n");
    sb.append("    typeOfCurrency: ").append(toIndentedString(typeOfCurrency)).append("\n");
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

