package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfCountryOfTax
 */

@JsonTypeName("typeOfCountryOfTax")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfCountryOfTax implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refCountryOfTaxId;

  private String typeOfCountryOfTax;

  public TypeOfCountryOfTax refCountryOfTaxId(UUID refCountryOfTaxId) {
    this.refCountryOfTaxId = refCountryOfTaxId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an CountryOfTax will be retrieved from reference table
   * @return refCountryOfTaxId
  */
  @Valid 

  @JsonProperty("refCountryOfTaxId")
  public UUID getRefCountryOfTaxId() {
    return refCountryOfTaxId;
  }

  public void setRefCountryOfTaxId(UUID refCountryOfTaxId) {
    this.refCountryOfTaxId = refCountryOfTaxId;
  }

  public TypeOfCountryOfTax typeOfCountryOfTax(String typeOfCountryOfTax) {
    this.typeOfCountryOfTax = typeOfCountryOfTax;
    return this;
  }

  /**
   * Retrieved from reference table CountryOfTax
   * @return typeOfCountryOfTax
  */
  

  @JsonProperty("typeOfCountryOfTax")
  public String getTypeOfCountryOfTax() {
    return typeOfCountryOfTax;
  }

  public void setTypeOfCountryOfTax(String typeOfCountryOfTax) {
    this.typeOfCountryOfTax = typeOfCountryOfTax;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfCountryOfTax typeOfCountryOfTax = (TypeOfCountryOfTax) o;
    return Objects.equals(this.refCountryOfTaxId, typeOfCountryOfTax.refCountryOfTaxId) &&
        Objects.equals(this.typeOfCountryOfTax, typeOfCountryOfTax.typeOfCountryOfTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refCountryOfTaxId, typeOfCountryOfTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfCountryOfTax {\n");
    sb.append("    refCountryOfTaxId: ").append(toIndentedString(refCountryOfTaxId)).append("\n");
    sb.append("    typeOfCountryOfTax: ").append(toIndentedString(typeOfCountryOfTax)).append("\n");
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

