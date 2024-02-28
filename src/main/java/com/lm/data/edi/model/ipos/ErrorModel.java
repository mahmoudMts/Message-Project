package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * ErrorModel
 */

@JsonTypeName("errorModel")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class ErrorModel implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer code;

  private String message;

  public ErrorModel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorModel(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  public ErrorModel code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The error status code.
   * @return code
  */
  @NotNull 

  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ErrorModel message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull 

  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.code, errorModel.code) &&
        Objects.equals(this.message, errorModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

