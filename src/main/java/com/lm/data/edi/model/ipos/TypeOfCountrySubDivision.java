package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfCountrySubDivision
 */

@JsonTypeName("typeOfCountrySubDivision")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfCountrySubDivision implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refTypeCountrySubDivisionId;

  private String typeOfCountrySubDivision;

  public TypeOfCountrySubDivision refTypeCountrySubDivisionId(UUID refTypeCountrySubDivisionId) {
    this.refTypeCountrySubDivisionId = refTypeCountrySubDivisionId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies a Country Sub Division will be retrieved from refisocountrysubdivision reference table
   * @return refTypeCountrySubDivisionId
  */
  @Valid 

  @JsonProperty("refTypeCountrySubDivisionId")
  public UUID getRefTypeCountrySubDivisionId() {
    return refTypeCountrySubDivisionId;
  }

  public void setRefTypeCountrySubDivisionId(UUID refTypeCountrySubDivisionId) {
    this.refTypeCountrySubDivisionId = refTypeCountrySubDivisionId;
  }

  public TypeOfCountrySubDivision typeOfCountrySubDivision(String typeOfCountrySubDivision) {
    this.typeOfCountrySubDivision = typeOfCountrySubDivision;
    return this;
  }

  /**
   * Retrieved from reference table refisocountrysubdivision (code)
   * @return typeOfCountrySubDivision
  */
  

  @JsonProperty("typeOfCountrySubDivision")
  public String getTypeOfCountrySubDivision() {
    return typeOfCountrySubDivision;
  }

  public void setTypeOfCountrySubDivision(String typeOfCountrySubDivision) {
    this.typeOfCountrySubDivision = typeOfCountrySubDivision;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfCountrySubDivision typeOfCountrySubDivision = (TypeOfCountrySubDivision) o;
    return Objects.equals(this.refTypeCountrySubDivisionId, typeOfCountrySubDivision.refTypeCountrySubDivisionId) &&
        Objects.equals(this.typeOfCountrySubDivision, typeOfCountrySubDivision.typeOfCountrySubDivision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refTypeCountrySubDivisionId, typeOfCountrySubDivision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfCountrySubDivision {\n");
    sb.append("    refTypeCountrySubDivisionId: ").append(toIndentedString(refTypeCountrySubDivisionId)).append("\n");
    sb.append("    typeOfCountrySubDivision: ").append(toIndentedString(typeOfCountrySubDivision)).append("\n");
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

