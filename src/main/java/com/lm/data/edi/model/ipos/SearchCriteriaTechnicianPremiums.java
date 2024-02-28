package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Max;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SearchCriteriaTechnicianPremiums
 */

@JsonTypeName("searchCriteriaTechnicianPremiums")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SearchCriteriaTechnicianPremiums implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer size;

  @Valid
  private List<@Valid SortObject> sort;

  private SearchCriteriaTechnicianPremiumsDateRange dateRange;

  @Valid
  private List<@Valid SearchObjectTechnicianPremium> and;

  /**
   * Used to combine the And and OR search conditions
   */
  public enum ConnectorOperationEnum {
    AND("AND");

    private String value;

    ConnectorOperationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConnectorOperationEnum fromValue(String value) {
      for (ConnectorOperationEnum b : ConnectorOperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ConnectorOperationEnum connectorOperation;

  @Valid
  private List<@Valid SearchObjectTechnicianPremium> or;

  public SearchCriteriaTechnicianPremiums size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The number of resources to return per page
   * maximum: 2000
   * @return size
  */
  
 @Max(2000) 
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public SearchCriteriaTechnicianPremiums sort(List<@Valid SortObject> sort) {
    this.sort = sort;
    return this;
  }

  public SearchCriteriaTechnicianPremiums addSortItem(SortObject sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  @Valid 

  @JsonProperty("sort")
  public List<@Valid SortObject> getSort() {
    return sort;
  }

  public void setSort(List<@Valid SortObject> sort) {
    this.sort = sort;
  }

  public SearchCriteriaTechnicianPremiums dateRange(SearchCriteriaTechnicianPremiumsDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Get dateRange
   * @return dateRange
  */
  @Valid 

  @JsonProperty("dateRange")
  public SearchCriteriaTechnicianPremiumsDateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(SearchCriteriaTechnicianPremiumsDateRange dateRange) {
    this.dateRange = dateRange;
  }

  public SearchCriteriaTechnicianPremiums and(List<@Valid SearchObjectTechnicianPremium> and) {
    this.and = and;
    return this;
  }

  public SearchCriteriaTechnicianPremiums addAndItem(SearchObjectTechnicianPremium andItem) {
    if (this.and == null) {
      this.and = new ArrayList<>();
    }
    this.and.add(andItem);
    return this;
  }

  /**
   * To apply the AND operator on multiple Search Objects. Only one of \"and\" / \"or\" / \"anyOf\" properties should be provided.
   * @return and
  */
  @Valid 

  @JsonProperty("and")
  public List<@Valid SearchObjectTechnicianPremium> getAnd() {
    return and;
  }

  public void setAnd(List<@Valid SearchObjectTechnicianPremium> and) {
    this.and = and;
  }

  public SearchCriteriaTechnicianPremiums connectorOperation(ConnectorOperationEnum connectorOperation) {
    this.connectorOperation = connectorOperation;
    return this;
  }

  /**
   * Used to combine the And and OR search conditions
   * @return connectorOperation
  */
  

  @JsonProperty("connectorOperation")
  public ConnectorOperationEnum getConnectorOperation() {
    return connectorOperation;
  }

  public void setConnectorOperation(ConnectorOperationEnum connectorOperation) {
    this.connectorOperation = connectorOperation;
  }

  public SearchCriteriaTechnicianPremiums or(List<@Valid SearchObjectTechnicianPremium> or) {
    this.or = or;
    return this;
  }

  public SearchCriteriaTechnicianPremiums addOrItem(SearchObjectTechnicianPremium orItem) {
    if (this.or == null) {
      this.or = new ArrayList<>();
    }
    this.or.add(orItem);
    return this;
  }

  /**
   * To apply the OR operator on multiple Search Objects. Only one of \"and\" / \"or\" , without connectorOperation
   * @return or
  */
  @Valid 

  @JsonProperty("or")
  public List<@Valid SearchObjectTechnicianPremium> getOr() {
    return or;
  }

  public void setOr(List<@Valid SearchObjectTechnicianPremium> or) {
    this.or = or;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriteriaTechnicianPremiums searchCriteriaTechnicianPremiums = (SearchCriteriaTechnicianPremiums) o;
    return Objects.equals(this.size, searchCriteriaTechnicianPremiums.size) &&
        Objects.equals(this.sort, searchCriteriaTechnicianPremiums.sort) &&
        Objects.equals(this.dateRange, searchCriteriaTechnicianPremiums.dateRange) &&
        Objects.equals(this.and, searchCriteriaTechnicianPremiums.and) &&
        Objects.equals(this.connectorOperation, searchCriteriaTechnicianPremiums.connectorOperation) &&
        Objects.equals(this.or, searchCriteriaTechnicianPremiums.or);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, sort, dateRange, and, connectorOperation, or);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteriaTechnicianPremiums {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
    sb.append("    connectorOperation: ").append(toIndentedString(connectorOperation)).append("\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
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

