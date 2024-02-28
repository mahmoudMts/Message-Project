package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.Valid;
import java.util.Objects;

/**
 * ClaimsD03Inner
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class ClaimsD03Inner   {
  @JsonProperty("D02D03D04D05CommonContainers")
  private D02D03D04D05InCommon d02D03D04D05CommonContainers ;
}
