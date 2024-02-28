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
 * PremiumEnquiryRecords
 */

@JsonTypeName("premiumEnquiryRecords")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumEnquiryRecords implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer recordCount;

  private Integer totalCount;

  @Valid
  private List<@Valid PremiumEnquiryRecord> signings;

  public PremiumEnquiryRecords recordCount(Integer recordCount) {
    this.recordCount = recordCount;
    return this;
  }

  /**
   * Number of records that are returned in the request. This could be less, equal to totalCount of the matching records
   * @return recordCount
  */
  

  @JsonProperty("recordCount")
  public Integer getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Integer recordCount) {
    this.recordCount = recordCount;
  }

  public PremiumEnquiryRecords totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Number of records that matched the search criteria. This could be less, equal to or more than the size specified in the request
   * @return totalCount
  */
  

  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public PremiumEnquiryRecords signings(List<@Valid PremiumEnquiryRecord> signings) {
    this.signings = signings;
    return this;
  }

  public PremiumEnquiryRecords addSigningsItem(PremiumEnquiryRecord signingsItem) {
    if (this.signings == null) {
      this.signings = new ArrayList<>();
    }
    this.signings.add(signingsItem);
    return this;
  }

  /**
   * Get signings
   * @return signings
  */
  @Valid 

  @JsonProperty("signings")
  public List<@Valid PremiumEnquiryRecord> getSignings() {
    return signings;
  }

  public void setSignings(List<@Valid PremiumEnquiryRecord> signings) {
    this.signings = signings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumEnquiryRecords premiumEnquiryRecords = (PremiumEnquiryRecords) o;
    return Objects.equals(this.recordCount, premiumEnquiryRecords.recordCount) &&
        Objects.equals(this.totalCount, premiumEnquiryRecords.totalCount) &&
        Objects.equals(this.signings, premiumEnquiryRecords.signings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordCount, totalCount, signings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumEnquiryRecords {\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    signings: ").append(toIndentedString(signings)).append("\n");
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

