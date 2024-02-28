package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * IcosTransactionData
 */

@JsonTypeName("icosTransactionData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class IcosTransactionData implements Serializable {

  private static final long serialVersionUID = 1L;

  private String umr;

  private TechnicianPortalBureauEnum bureau;

  private UUID brokerPartyDomainId;

  private UUID brokerMarketId;

  private String classOfBusiness;

  @Valid
  private List<@Valid IcosSection> sections;

  public IcosTransactionData umr(String umr) {
    this.umr = umr;
    return this;
  }

  /**
   * Get umr
   * @return umr
  */
  

  @JsonProperty("umr")
  public String getUmr() {
    return umr;
  }

  public void setUmr(String umr) {
    this.umr = umr;
  }

  public IcosTransactionData bureau(TechnicianPortalBureauEnum bureau) {
    this.bureau = bureau;
    return this;
  }

  /**
   * Get bureau
   * @return bureau
  */
  @Valid 

  @JsonProperty("bureau")
  public TechnicianPortalBureauEnum getBureau() {
    return bureau;
  }

  public void setBureau(TechnicianPortalBureauEnum bureau) {
    this.bureau = bureau;
  }

  public IcosTransactionData brokerPartyDomainId(UUID brokerPartyDomainId) {
    this.brokerPartyDomainId = brokerPartyDomainId;
    return this;
  }

  /**
   * Get brokerPartyDomainId
   * @return brokerPartyDomainId
  */
  @Valid 

  @JsonProperty("brokerPartyDomainId")
  public UUID getBrokerPartyDomainId() {
    return brokerPartyDomainId;
  }

  public void setBrokerPartyDomainId(UUID brokerPartyDomainId) {
    this.brokerPartyDomainId = brokerPartyDomainId;
  }

  public IcosTransactionData brokerMarketId(UUID brokerMarketId) {
    this.brokerMarketId = brokerMarketId;
    return this;
  }

  /**
   * Get brokerMarketId
   * @return brokerMarketId
  */
  @Valid 

  @JsonProperty("brokerMarketId")
  public UUID getBrokerMarketId() {
    return brokerMarketId;
  }

  public void setBrokerMarketId(UUID brokerMarketId) {
    this.brokerMarketId = brokerMarketId;
  }

  public IcosTransactionData classOfBusiness(String classOfBusiness) {
    this.classOfBusiness = classOfBusiness;
    return this;
  }

  /**
   * Get classOfBusiness
   * @return classOfBusiness
  */
  

  @JsonProperty("classOfBusiness")
  public String getClassOfBusiness() {
    return classOfBusiness;
  }

  public void setClassOfBusiness(String classOfBusiness) {
    this.classOfBusiness = classOfBusiness;
  }

  public IcosTransactionData sections(List<@Valid IcosSection> sections) {
    this.sections = sections;
    return this;
  }

  public IcosTransactionData addSectionsItem(IcosSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

  /**
   * Get sections
   * @return sections
  */
  @Valid 

  @JsonProperty("sections")
  public List<@Valid IcosSection> getSections() {
    return sections;
  }

  public void setSections(List<@Valid IcosSection> sections) {
    this.sections = sections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcosTransactionData icosTransactionData = (IcosTransactionData) o;
    return Objects.equals(this.umr, icosTransactionData.umr) &&
        Objects.equals(this.bureau, icosTransactionData.bureau) &&
        Objects.equals(this.brokerPartyDomainId, icosTransactionData.brokerPartyDomainId) &&
        Objects.equals(this.brokerMarketId, icosTransactionData.brokerMarketId) &&
        Objects.equals(this.classOfBusiness, icosTransactionData.classOfBusiness) &&
        Objects.equals(this.sections, icosTransactionData.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(umr, bureau, brokerPartyDomainId, brokerMarketId, classOfBusiness, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcosTransactionData {\n");
    sb.append("    umr: ").append(toIndentedString(umr)).append("\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    brokerPartyDomainId: ").append(toIndentedString(brokerPartyDomainId)).append("\n");
    sb.append("    brokerMarketId: ").append(toIndentedString(brokerMarketId)).append("\n");
    sb.append("    classOfBusiness: ").append(toIndentedString(classOfBusiness)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

