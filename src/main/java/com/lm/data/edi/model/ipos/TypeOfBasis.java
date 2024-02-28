package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfBasis
 */

@JsonTypeName("typeOfBasis")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfBasis implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refBasisId;

  private String typeOfBasis;

  public TypeOfBasis refBasisId(UUID refBasisId) {
    this.refBasisId = refBasisId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an Basis will be retrieved from reference table
   * @return refBasisId
  */
  @Valid 

  @JsonProperty("refBasisId")
  public UUID getRefBasisId() {
    return refBasisId;
  }

  public void setRefBasisId(UUID refBasisId) {
    this.refBasisId = refBasisId;
  }

  public TypeOfBasis typeOfBasis(String typeOfBasis) {
    this.typeOfBasis = typeOfBasis;
    return this;
  }

  /**
   * Retrieved from reference table Basis (code)
   * @return typeOfBasis
  */
  

  @JsonProperty("typeOfBasis")
  public String getTypeOfBasis() {
    return typeOfBasis;
  }

  public void setTypeOfBasis(String typeOfBasis) {
    this.typeOfBasis = typeOfBasis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfBasis typeOfBasis = (TypeOfBasis) o;
    return Objects.equals(this.refBasisId, typeOfBasis.refBasisId) &&
        Objects.equals(this.typeOfBasis, typeOfBasis.typeOfBasis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refBasisId, typeOfBasis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfBasis {\n");
    sb.append("    refBasisId: ").append(toIndentedString(refBasisId)).append("\n");
    sb.append("    typeOfBasis: ").append(toIndentedString(typeOfBasis)).append("\n");
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

