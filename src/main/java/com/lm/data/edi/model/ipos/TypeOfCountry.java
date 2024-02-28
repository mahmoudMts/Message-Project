package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfCountry
 */

@JsonTypeName("typeOfCountry")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfCountry implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refTypeCountryId;

  private String typeOfCountry;

  public TypeOfCountry refTypeCountryId(UUID refTypeCountryId) {
    this.refTypeCountryId = refTypeCountryId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an Country will be retrieved from refisocountry reference table
   * @return refTypeCountryId
  */
  @Valid 

  @JsonProperty("refTypeCountryId")
  public UUID getRefTypeCountryId() {
    return refTypeCountryId;
  }

  public void setRefTypeCountryId(UUID refTypeCountryId) {
    this.refTypeCountryId = refTypeCountryId;
  }

  public TypeOfCountry typeOfCountry(String typeOfCountry) {
    this.typeOfCountry = typeOfCountry;
    return this;
  }

  /**
   * Retrieved from reference table refisocountry (code)
   * @return typeOfCountry
  */
  

  @JsonProperty("typeOfCountry")
  public String getTypeOfCountry() {
    return typeOfCountry;
  }

  public void setTypeOfCountry(String typeOfCountry) {
    this.typeOfCountry = typeOfCountry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfCountry typeOfCountry = (TypeOfCountry) o;
    return Objects.equals(this.refTypeCountryId, typeOfCountry.refTypeCountryId) &&
        Objects.equals(this.typeOfCountry, typeOfCountry.typeOfCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refTypeCountryId, typeOfCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfCountry {\n");
    sb.append("    refTypeCountryId: ").append(toIndentedString(refTypeCountryId)).append("\n");
    sb.append("    typeOfCountry: ").append(toIndentedString(typeOfCountry)).append("\n");
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

