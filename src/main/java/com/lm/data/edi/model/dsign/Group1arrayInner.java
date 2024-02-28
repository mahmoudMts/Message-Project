package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Group1arrayInner
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class Group1arrayInner   {
  @JsonProperty("controlRecordD08")
  private ControlRecordD08 controlRecordD08 ;



}
