package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SortObject
 */

@JsonTypeName("sortObject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SortObject implements Serializable {

  private static final long serialVersionUID = 1L;

  private String fieldName;

  /**
   * The required ordering if the response
   */
  public enum OrderingEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    OrderingEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderingEnum fromValue(String value) {
      for (OrderingEnum b : OrderingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OrderingEnum ordering;

  public SortObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SortObject(String fieldName, OrderingEnum ordering) {
    this.fieldName = fieldName;
    this.ordering = ordering;
  }

  public SortObject fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * The field to order the response by e.g. technicalAccount.lastUpdated or claim.lastUpdated
   * @return fieldName
  */
  @NotNull 

  @JsonProperty("fieldName")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public SortObject ordering(OrderingEnum ordering) {
    this.ordering = ordering;
    return this;
  }

  /**
   * The required ordering if the response
   * @return ordering
  */
  @NotNull 

  @JsonProperty("ordering")
  public OrderingEnum getOrdering() {
    return ordering;
  }

  public void setOrdering(OrderingEnum ordering) {
    this.ordering = ordering;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortObject sortObject = (SortObject) o;
    return Objects.equals(this.fieldName, sortObject.fieldName) &&
        Objects.equals(this.ordering, sortObject.ordering);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, ordering);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortObject {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
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

