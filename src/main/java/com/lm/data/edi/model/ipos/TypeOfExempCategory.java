package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfExempCategory
 */

@JsonTypeName("typeOfExempCategory")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfExempCategory implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refExempCategoryId;

  private String typeOfExempCategory;

  public TypeOfExempCategory refExempCategoryId(UUID refExempCategoryId) {
    this.refExempCategoryId = refExempCategoryId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an ExempCategory will be retrieved from Exempt Category reference table
   * @return refExempCategoryId
  */
  @Valid 

  @JsonProperty("refExempCategoryId")
  public UUID getRefExempCategoryId() {
    return refExempCategoryId;
  }

  public void setRefExempCategoryId(UUID refExempCategoryId) {
    this.refExempCategoryId = refExempCategoryId;
  }

  public TypeOfExempCategory typeOfExempCategory(String typeOfExempCategory) {
    this.typeOfExempCategory = typeOfExempCategory;
    return this;
  }

  /**
   * Retrieved from reference table ExempCategory (code)
   * @return typeOfExempCategory
  */
  

  @JsonProperty("typeOfExempCategory")
  public String getTypeOfExempCategory() {
    return typeOfExempCategory;
  }

  public void setTypeOfExempCategory(String typeOfExempCategory) {
    this.typeOfExempCategory = typeOfExempCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfExempCategory typeOfExempCategory = (TypeOfExempCategory) o;
    return Objects.equals(this.refExempCategoryId, typeOfExempCategory.refExempCategoryId) &&
        Objects.equals(this.typeOfExempCategory, typeOfExempCategory.typeOfExempCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refExempCategoryId, typeOfExempCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfExempCategory {\n");
    sb.append("    refExempCategoryId: ").append(toIndentedString(refExempCategoryId)).append("\n");
    sb.append("    typeOfExempCategory: ").append(toIndentedString(typeOfExempCategory)).append("\n");
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

