package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * ErrorModel
 */
@Data
@EqualsAndHashCode
@ToString
public class ErrorModel   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("message")
  private String message = null;

}
