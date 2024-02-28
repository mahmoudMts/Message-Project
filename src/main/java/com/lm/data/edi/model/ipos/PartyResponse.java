package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PartyResponse
 */

@JsonTypeName("partyResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PartyResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid PartyMarketnAssociatedMarketDetails> marketDetails;

  public PartyResponse marketDetails(List<@Valid PartyMarketnAssociatedMarketDetails> marketDetails) {
    this.marketDetails = marketDetails;
    return this;
  }

  public PartyResponse addMarketDetailsItem(PartyMarketnAssociatedMarketDetails marketDetailsItem) {
    if (this.marketDetails == null) {
      this.marketDetails = new ArrayList<>();
    }
    this.marketDetails.add(marketDetailsItem);
    return this;
  }

  /**
   * Get marketDetails
   * @return marketDetails
  */
  @Valid 

  @JsonProperty("marketDetails")
  public List<@Valid PartyMarketnAssociatedMarketDetails> getMarketDetails() {
    return marketDetails;
  }

  public void setMarketDetails(List<@Valid PartyMarketnAssociatedMarketDetails> marketDetails) {
    this.marketDetails = marketDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyResponse partyResponse = (PartyResponse) o;
    return Objects.equals(this.marketDetails, partyResponse.marketDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyResponse {\n");
    sb.append("    marketDetails: ").append(toIndentedString(marketDetails)).append("\n");
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

