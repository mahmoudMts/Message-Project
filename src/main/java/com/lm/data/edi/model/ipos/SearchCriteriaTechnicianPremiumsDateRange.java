package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SearchCriteriaTechnicianPremiumsDateRange
 */

@JsonTypeName("searchCriteriaTechnicianPremiums_dateRange")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SearchCriteriaTechnicianPremiumsDateRange implements Serializable {

  private static final long serialVersionUID = 1L;

  private SearchObjectTechnicianPremium startDate;

  private SearchObjectTechnicianPremium endDate;

  public SearchCriteriaTechnicianPremiumsDateRange startDate(SearchObjectTechnicianPremium startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @Valid 

  @JsonProperty("startDate")
  public SearchObjectTechnicianPremium getStartDate() {
    return startDate;
  }

  public void setStartDate(SearchObjectTechnicianPremium startDate) {
    this.startDate = startDate;
  }

  public SearchCriteriaTechnicianPremiumsDateRange endDate(SearchObjectTechnicianPremium endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 

  @JsonProperty("endDate")
  public SearchObjectTechnicianPremium getEndDate() {
    return endDate;
  }

  public void setEndDate(SearchObjectTechnicianPremium endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriteriaTechnicianPremiumsDateRange searchCriteriaTechnicianPremiumsDateRange = (SearchCriteriaTechnicianPremiumsDateRange) o;
    return Objects.equals(this.startDate, searchCriteriaTechnicianPremiumsDateRange.startDate) &&
        Objects.equals(this.endDate, searchCriteriaTechnicianPremiumsDateRange.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteriaTechnicianPremiumsDateRange {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

