package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * MarketListRec
 */

@JsonTypeName("marketListRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class MarketListRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID marketId;

  private String marketTitle;

  private Boolean recordValid;

  public MarketListRec marketId(UUID marketId) {
    this.marketId = marketId;
    return this;
  }

  /**
   * Get marketId
   * @return marketId
  */
  @Valid 

  @JsonProperty("marketId")
  public UUID getMarketId() {
    return marketId;
  }

  public void setMarketId(UUID marketId) {
    this.marketId = marketId;
  }

  public MarketListRec marketTitle(String marketTitle) {
    this.marketTitle = marketTitle;
    return this;
  }

  /**
   * Get marketTitle
   * @return marketTitle
  */
  

  @JsonProperty("marketTitle")
  public String getMarketTitle() {
    return marketTitle;
  }

  public void setMarketTitle(String marketTitle) {
    this.marketTitle = marketTitle;
  }

  public MarketListRec recordValid(Boolean recordValid) {
    this.recordValid = recordValid;
    return this;
  }

  /**
   * Get recordValid
   * @return recordValid
  */
  

  @JsonProperty("recordValid")
  public Boolean getRecordValid() {
    return recordValid;
  }

  public void setRecordValid(Boolean recordValid) {
    this.recordValid = recordValid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketListRec marketListRec = (MarketListRec) o;
    return Objects.equals(this.marketId, marketListRec.marketId) &&
        Objects.equals(this.marketTitle, marketListRec.marketTitle) &&
        Objects.equals(this.recordValid, marketListRec.recordValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketId, marketTitle, recordValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketListRec {\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    marketTitle: ").append(toIndentedString(marketTitle)).append("\n");
    sb.append("    recordValid: ").append(toIndentedString(recordValid)).append("\n");
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

