package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Array containg information about premiums, claim,  and TTYSTMT.
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class ActualSigningAndClaimsDataAray   {
  @JsonProperty("premiumsD02")
 // private PremiumsD02 premiumsD02 ;
  @Valid
  private List<PremiumsD02Inner> premiumsD02 = new ArrayList<PremiumsD02Inner>();
  @JsonProperty("claimsD03")
  //private ClaimsD03 claimsD03 ;
  @Valid
    private List<ClaimsD03Inner> claimsD03 = new ArrayList<ClaimsD03Inner>();

  @JsonProperty("treatyStatementFDODO4")
  private D02D03D04D05InCommon treatyStatementFDODO4 ;

  @JsonProperty("treatyStatementSigningsD05")
  //private TreatyStatementSigningsD05 treatyStatementSigningsD05 ;
   @Valid
  private List<TreatyStatementSigningsD05Inner> treatyStatementSigningsD05 = new ArrayList<TreatyStatementSigningsD05Inner>();

}
