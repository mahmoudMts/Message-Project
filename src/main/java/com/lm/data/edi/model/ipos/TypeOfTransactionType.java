package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfTransactionType
 */

@JsonTypeName("typeOfTransactionType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfTransactionType implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refTypeOfTransactionTypeId;

  private String typeOfTransactionType;

  public TypeOfTransactionType refTypeOfTransactionTypeId(UUID refTypeOfTransactionTypeId) {
    this.refTypeOfTransactionTypeId = refTypeOfTransactionTypeId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies a  typeOfTransactionType will be retrieved from reference table
   * @return refTypeOfTransactionTypeId
  */
  @Valid 

  @JsonProperty("refTypeOfTransactionTypeId")
  public UUID getRefTypeOfTransactionTypeId() {
    return refTypeOfTransactionTypeId;
  }

  public void setRefTypeOfTransactionTypeId(UUID refTypeOfTransactionTypeId) {
    this.refTypeOfTransactionTypeId = refTypeOfTransactionTypeId;
  }

  public TypeOfTransactionType typeOfTransactionType(String typeOfTransactionType) {
    this.typeOfTransactionType = typeOfTransactionType;
    return this;
  }

  /**
   * Retrieved from reference table  typeOfTransactionType
   * @return typeOfTransactionType
  */
  

  @JsonProperty("typeOfTransactionType")
  public String getTypeOfTransactionType() {
    return typeOfTransactionType;
  }

  public void setTypeOfTransactionType(String typeOfTransactionType) {
    this.typeOfTransactionType = typeOfTransactionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfTransactionType typeOfTransactionType = (TypeOfTransactionType) o;
    return Objects.equals(this.refTypeOfTransactionTypeId, typeOfTransactionType.refTypeOfTransactionTypeId) &&
        Objects.equals(this.typeOfTransactionType, typeOfTransactionType.typeOfTransactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refTypeOfTransactionTypeId, typeOfTransactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfTransactionType {\n");
    sb.append("    refTypeOfTransactionTypeId: ").append(toIndentedString(refTypeOfTransactionTypeId)).append("\n");
    sb.append("    typeOfTransactionType: ").append(toIndentedString(typeOfTransactionType)).append("\n");
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

