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
 * SearchObjectTechnicianPremium
 */

@JsonTypeName("searchObjectTechnicianPremium")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SearchObjectTechnicianPremium implements Serializable {

  private static final long serialVersionUID = 1L;

  private String fieldName;

  /**
   * Type of filter operation to apply
   */
  public enum OperatorEnum {
    EQUALS("EQUALS"),
    
    CONTAINS("CONTAINS"),
    
    NOT_EQUALS("NOT_EQUALS");

    private String value;

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperatorEnum operator;

  private String fieldValue;

  /**
   * The Type of the field specified in fieldName
   */
  public enum FieldTypeEnum {
    STRING("STRING"),
    
    DATE("DATE"),
    
    NUMBER("NUMBER"),
    
    BOOLEAN("BOOLEAN"),
    
    ENUM("ENUM");

    private String value;

    FieldTypeEnum(String value) {
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
    public static FieldTypeEnum fromValue(String value) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FieldTypeEnum fieldType;

  private String fieldPath;

  /**
   * The entity level of the field specified in fieldName
   */
  public enum FieldLevelEnum {
    SUBMISSION("SUBMISSION"),
    
    SECTION("SECTION"),
    
    MARKET("MARKET"),
    
    PREMIUM("PREMIUM"),
    
    SIGNING("SIGNING");

    private String value;

    FieldLevelEnum(String value) {
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
    public static FieldLevelEnum fromValue(String value) {
      for (FieldLevelEnum b : FieldLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FieldLevelEnum fieldLevel;

  public SearchObjectTechnicianPremium() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchObjectTechnicianPremium(String fieldName, OperatorEnum operator, String fieldValue, FieldTypeEnum fieldType, String fieldPath) {
    this.fieldName = fieldName;
    this.operator = operator;
    this.fieldValue = fieldValue;
    this.fieldType = fieldType;
    this.fieldPath = fieldPath;
  }

  public SearchObjectTechnicianPremium fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Field to filter the response on. e.g. csnd
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

  public SearchObjectTechnicianPremium operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Type of filter operation to apply
   * @return operator
  */
  @NotNull 

  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public SearchObjectTechnicianPremium fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  /**
   * The actual value to filter on - e.g 1234520230928
   * @return fieldValue
  */
  @NotNull 

  @JsonProperty("fieldValue")
  public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }

  public SearchObjectTechnicianPremium fieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * The Type of the field specified in fieldName
   * @return fieldType
  */
  @NotNull 

  @JsonProperty("fieldType")
  public FieldTypeEnum getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }

  public SearchObjectTechnicianPremium fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * Path of the nested object
   * @return fieldPath
  */
  @NotNull 

  @JsonProperty("fieldPath")
  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public SearchObjectTechnicianPremium fieldLevel(FieldLevelEnum fieldLevel) {
    this.fieldLevel = fieldLevel;
    return this;
  }

  /**
   * The entity level of the field specified in fieldName
   * @return fieldLevel
  */
  

  @JsonProperty("fieldLevel")
  public FieldLevelEnum getFieldLevel() {
    return fieldLevel;
  }

  public void setFieldLevel(FieldLevelEnum fieldLevel) {
    this.fieldLevel = fieldLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchObjectTechnicianPremium searchObjectTechnicianPremium = (SearchObjectTechnicianPremium) o;
    return Objects.equals(this.fieldName, searchObjectTechnicianPremium.fieldName) &&
        Objects.equals(this.operator, searchObjectTechnicianPremium.operator) &&
        Objects.equals(this.fieldValue, searchObjectTechnicianPremium.fieldValue) &&
        Objects.equals(this.fieldType, searchObjectTechnicianPremium.fieldType) &&
        Objects.equals(this.fieldPath, searchObjectTechnicianPremium.fieldPath) &&
        Objects.equals(this.fieldLevel, searchObjectTechnicianPremium.fieldLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, operator, fieldValue, fieldType, fieldPath, fieldLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchObjectTechnicianPremium {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    fieldLevel: ").append(toIndentedString(fieldLevel)).append("\n");
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

