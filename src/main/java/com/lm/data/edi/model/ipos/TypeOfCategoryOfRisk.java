package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfCategoryOfRisk
 */

@JsonTypeName("typeOfCategoryOfRisk")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfCategoryOfRisk implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refCategoryOfRiskId;

  private String typeOfCategoryOfRisk;

  public TypeOfCategoryOfRisk refCategoryOfRiskId(UUID refCategoryOfRiskId) {
    this.refCategoryOfRiskId = refCategoryOfRiskId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies a CategoryOfRisk will be retrieved from reference table
   * @return refCategoryOfRiskId
  */
  @Valid 

  @JsonProperty("refCategoryOfRiskId")
  public UUID getRefCategoryOfRiskId() {
    return refCategoryOfRiskId;
  }

  public void setRefCategoryOfRiskId(UUID refCategoryOfRiskId) {
    this.refCategoryOfRiskId = refCategoryOfRiskId;
  }

  public TypeOfCategoryOfRisk typeOfCategoryOfRisk(String typeOfCategoryOfRisk) {
    this.typeOfCategoryOfRisk = typeOfCategoryOfRisk;
    return this;
  }

  /**
   * Retrieved from reference table CategoryOfRisk
   * @return typeOfCategoryOfRisk
  */
  

  @JsonProperty("typeOfCategoryOfRisk")
  public String getTypeOfCategoryOfRisk() {
    return typeOfCategoryOfRisk;
  }

  public void setTypeOfCategoryOfRisk(String typeOfCategoryOfRisk) {
    this.typeOfCategoryOfRisk = typeOfCategoryOfRisk;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfCategoryOfRisk typeOfCategoryOfRisk = (TypeOfCategoryOfRisk) o;
    return Objects.equals(this.refCategoryOfRiskId, typeOfCategoryOfRisk.refCategoryOfRiskId) &&
        Objects.equals(this.typeOfCategoryOfRisk, typeOfCategoryOfRisk.typeOfCategoryOfRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refCategoryOfRiskId, typeOfCategoryOfRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfCategoryOfRisk {\n");
    sb.append("    refCategoryOfRiskId: ").append(toIndentedString(refCategoryOfRiskId)).append("\n");
    sb.append("    typeOfCategoryOfRisk: ").append(toIndentedString(typeOfCategoryOfRisk)).append("\n");
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

