package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfTaxType
 */

@JsonTypeName("typeOfTaxType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfTaxType implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refTaxTypeId;

  private String typeOfTaxType;

  public TypeOfTaxType refTaxTypeId(UUID refTaxTypeId) {
    this.refTaxTypeId = refTaxTypeId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an TaxType will be retrieved from reference table
   * @return refTaxTypeId
  */
  @Valid 

  @JsonProperty("refTaxTypeId")
  public UUID getRefTaxTypeId() {
    return refTaxTypeId;
  }

  public void setRefTaxTypeId(UUID refTaxTypeId) {
    this.refTaxTypeId = refTaxTypeId;
  }

  public TypeOfTaxType typeOfTaxType(String typeOfTaxType) {
    this.typeOfTaxType = typeOfTaxType;
    return this;
  }

  /**
   * Retrieved from reference table TaxType
   * @return typeOfTaxType
  */
  

  @JsonProperty("typeOfTaxType")
  public String getTypeOfTaxType() {
    return typeOfTaxType;
  }

  public void setTypeOfTaxType(String typeOfTaxType) {
    this.typeOfTaxType = typeOfTaxType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfTaxType typeOfTaxType = (TypeOfTaxType) o;
    return Objects.equals(this.refTaxTypeId, typeOfTaxType.refTaxTypeId) &&
        Objects.equals(this.typeOfTaxType, typeOfTaxType.typeOfTaxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refTaxTypeId, typeOfTaxType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfTaxType {\n");
    sb.append("    refTaxTypeId: ").append(toIndentedString(refTaxTypeId)).append("\n");
    sb.append("    typeOfTaxType: ").append(toIndentedString(typeOfTaxType)).append("\n");
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

