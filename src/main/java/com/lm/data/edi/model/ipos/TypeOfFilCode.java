package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfFilCode
 */

@JsonTypeName("typeOfFilCode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfFilCode implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refFilId;

  private String typeOfFilCode;

  public TypeOfFilCode refFilId(UUID refFilId) {
    this.refFilId = refFilId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an FilCode will be retrieved from filCode reference table
   * @return refFilId
  */
  @Valid 

  @JsonProperty("refFilId")
  public UUID getRefFilId() {
    return refFilId;
  }

  public void setRefFilId(UUID refFilId) {
    this.refFilId = refFilId;
  }

  public TypeOfFilCode typeOfFilCode(String typeOfFilCode) {
    this.typeOfFilCode = typeOfFilCode;
    return this;
  }

  /**
   * Retrieved from reference table filCode (code)
   * @return typeOfFilCode
  */
  

  @JsonProperty("typeOfFilCode")
  public String getTypeOfFilCode() {
    return typeOfFilCode;
  }

  public void setTypeOfFilCode(String typeOfFilCode) {
    this.typeOfFilCode = typeOfFilCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfFilCode typeOfFilCode = (TypeOfFilCode) o;
    return Objects.equals(this.refFilId, typeOfFilCode.refFilId) &&
        Objects.equals(this.typeOfFilCode, typeOfFilCode.typeOfFilCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refFilId, typeOfFilCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfFilCode {\n");
    sb.append("    refFilId: ").append(toIndentedString(refFilId)).append("\n");
    sb.append("    typeOfFilCode: ").append(toIndentedString(typeOfFilCode)).append("\n");
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

