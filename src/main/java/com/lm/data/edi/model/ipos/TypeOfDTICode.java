package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfDTICode
 */

@JsonTypeName("typeOfDTICode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfDTICode implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refDTICodeId;

  private String typeOfDTICode;

  public TypeOfDTICode refDTICodeId(UUID refDTICodeId) {
    this.refDTICodeId = refDTICodeId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an DTICode will be retrieved from reference table
   * @return refDTICodeId
  */
  @Valid 

  @JsonProperty("refDTICodeId")
  public UUID getRefDTICodeId() {
    return refDTICodeId;
  }

  public void setRefDTICodeId(UUID refDTICodeId) {
    this.refDTICodeId = refDTICodeId;
  }

  public TypeOfDTICode typeOfDTICode(String typeOfDTICode) {
    this.typeOfDTICode = typeOfDTICode;
    return this;
  }

  /**
   * Retrieved from reference table DTICode
   * @return typeOfDTICode
  */
  

  @JsonProperty("typeOfDTICode")
  public String getTypeOfDTICode() {
    return typeOfDTICode;
  }

  public void setTypeOfDTICode(String typeOfDTICode) {
    this.typeOfDTICode = typeOfDTICode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfDTICode typeOfDTICode = (TypeOfDTICode) o;
    return Objects.equals(this.refDTICodeId, typeOfDTICode.refDTICodeId) &&
        Objects.equals(this.typeOfDTICode, typeOfDTICode.typeOfDTICode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refDTICodeId, typeOfDTICode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfDTICode {\n");
    sb.append("    refDTICodeId: ").append(toIndentedString(refDTICodeId)).append("\n");
    sb.append("    typeOfDTICode: ").append(toIndentedString(typeOfDTICode)).append("\n");
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

