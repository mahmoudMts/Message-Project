package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfWarRiskCode
 */

@JsonTypeName("typeOfWarRiskCode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfWarRiskCode implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refWarRiskId;

  private String typeOfWarRiskCode;

  public TypeOfWarRiskCode refWarRiskId(UUID refWarRiskId) {
    this.refWarRiskId = refWarRiskId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an WarRiskCode will be retrieved from warRiskCode reference table
   * @return refWarRiskId
  */
  @Valid 

  @JsonProperty("refWarRiskId")
  public UUID getRefWarRiskId() {
    return refWarRiskId;
  }

  public void setRefWarRiskId(UUID refWarRiskId) {
    this.refWarRiskId = refWarRiskId;
  }

  public TypeOfWarRiskCode typeOfWarRiskCode(String typeOfWarRiskCode) {
    this.typeOfWarRiskCode = typeOfWarRiskCode;
    return this;
  }

  /**
   * Retrieved from reference table warRiskCode (code)
   * @return typeOfWarRiskCode
  */
  

  @JsonProperty("typeOfWarRiskCode")
  public String getTypeOfWarRiskCode() {
    return typeOfWarRiskCode;
  }

  public void setTypeOfWarRiskCode(String typeOfWarRiskCode) {
    this.typeOfWarRiskCode = typeOfWarRiskCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfWarRiskCode typeOfWarRiskCode = (TypeOfWarRiskCode) o;
    return Objects.equals(this.refWarRiskId, typeOfWarRiskCode.refWarRiskId) &&
        Objects.equals(this.typeOfWarRiskCode, typeOfWarRiskCode.typeOfWarRiskCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refWarRiskId, typeOfWarRiskCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfWarRiskCode {\n");
    sb.append("    refWarRiskId: ").append(toIndentedString(refWarRiskId)).append("\n");
    sb.append("    typeOfWarRiskCode: ").append(toIndentedString(typeOfWarRiskCode)).append("\n");
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

