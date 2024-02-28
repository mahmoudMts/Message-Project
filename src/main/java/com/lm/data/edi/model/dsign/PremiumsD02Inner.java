package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * PremiumsD02Inner
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class PremiumsD02Inner   {
  @JsonProperty("defferedD02")
  @Size(max = 38)
  @Valid
  private List<DeferedD02Inner> defferedD02 = new ArrayList<DeferedD02Inner>();

  @JsonProperty("adjustmentD02")
  @Size(max = 38)
  @Valid
  private List<AdjustmentD02Inner> adjustmentD02 = new ArrayList<AdjustmentD02Inner>();

  @JsonProperty("otherPremiumsTypesD02")
  @Valid
  private D02D03D04D05InCommon otherPremiumsTypesD02;

}
