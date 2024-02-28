package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfQualCatCode
 */

@JsonTypeName("typeOfQualCatCode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfQualCatCode implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refQualCatCodeId;

  private String typeOfQualCatCode;

  public TypeOfQualCatCode refQualCatCodeId(UUID refQualCatCodeId) {
    this.refQualCatCodeId = refQualCatCodeId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an qualCatCode will be retrieved from refqualCatCode reference table
   * @return refQualCatCodeId
  */
  @Valid 

  @JsonProperty("refQualCatCodeId")
  public UUID getRefQualCatCodeId() {
    return refQualCatCodeId;
  }

  public void setRefQualCatCodeId(UUID refQualCatCodeId) {
    this.refQualCatCodeId = refQualCatCodeId;
  }

  public TypeOfQualCatCode typeOfQualCatCode(String typeOfQualCatCode) {
    this.typeOfQualCatCode = typeOfQualCatCode;
    return this;
  }

  /**
   * Retrieved from reference table refqualCatCode (code)
   * @return typeOfQualCatCode
  */
  

  @JsonProperty("typeOfQualCatCode")
  public String getTypeOfQualCatCode() {
    return typeOfQualCatCode;
  }

  public void setTypeOfQualCatCode(String typeOfQualCatCode) {
    this.typeOfQualCatCode = typeOfQualCatCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfQualCatCode typeOfQualCatCode = (TypeOfQualCatCode) o;
    return Objects.equals(this.refQualCatCodeId, typeOfQualCatCode.refQualCatCodeId) &&
        Objects.equals(this.typeOfQualCatCode, typeOfQualCatCode.typeOfQualCatCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refQualCatCodeId, typeOfQualCatCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfQualCatCode {\n");
    sb.append("    refQualCatCodeId: ").append(toIndentedString(refQualCatCodeId)).append("\n");
    sb.append("    typeOfQualCatCode: ").append(toIndentedString(typeOfQualCatCode)).append("\n");
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

