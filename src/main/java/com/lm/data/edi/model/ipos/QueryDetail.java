package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * QueryDetail
 */

@JsonTypeName("queryDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class QueryDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID queryuuid;

  private String umr;

  private String workPackageReference;

  private String queryId;

  /**
   * id used while creating the query
   */
  public enum QueryStatusEnum {
    ACTIVE("ACTIVE"),
    
    CLOSED("CLOSED");

    private String value;

    QueryStatusEnum(String value) {
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
    public static QueryStatusEnum fromValue(String value) {
      for (QueryStatusEnum b : QueryStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private QueryStatusEnum queryStatus;

  /**
   * entity to which the query is assigned
   */
  public enum AssigneeEnum {
    BROKER("BROKER"),
    
    CARRIER("CARRIER");

    private String value;

    AssigneeEnum(String value) {
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
    public static AssigneeEnum fromValue(String value) {
      for (AssigneeEnum b : AssigneeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AssigneeEnum assignee;

  
  private OffsetDateTime queryCreatedAt;

  public QueryDetail queryuuid(UUID queryuuid) {
    this.queryuuid = queryuuid;
    return this;
  }

  /**
   * uuid of the query from query domain
   * @return queryuuid
  */
  @Valid 

  @JsonProperty("queryuuid")
  public UUID getQueryuuid() {
    return queryuuid;
  }

  public void setQueryuuid(UUID queryuuid) {
    this.queryuuid = queryuuid;
  }

  public QueryDetail umr(String umr) {
    this.umr = umr;
    return this;
  }

  /**
   * UMR to which the query is associated
   * @return umr
  */
  

  @JsonProperty("umr")
  public String getUmr() {
    return umr;
  }

  public void setUmr(String umr) {
    this.umr = umr;
  }

  public QueryDetail workPackageReference(String workPackageReference) {
    this.workPackageReference = workPackageReference;
    return this;
  }

  /**
   * Work Package Reference to which the query is associated
   * @return workPackageReference
  */
  

  @JsonProperty("workPackageReference")
  public String getWorkPackageReference() {
    return workPackageReference;
  }

  public void setWorkPackageReference(String workPackageReference) {
    this.workPackageReference = workPackageReference;
  }

  public QueryDetail queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * id used while creating the query
   * @return queryId
  */
  

  @JsonProperty("queryId")
  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public QueryDetail queryStatus(QueryStatusEnum queryStatus) {
    this.queryStatus = queryStatus;
    return this;
  }

  /**
   * id used while creating the query
   * @return queryStatus
  */
  

  @JsonProperty("queryStatus")
  public QueryStatusEnum getQueryStatus() {
    return queryStatus;
  }

  public void setQueryStatus(QueryStatusEnum queryStatus) {
    this.queryStatus = queryStatus;
  }

  public QueryDetail assignee(AssigneeEnum assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * entity to which the query is assigned
   * @return assignee
  */
  

  @JsonProperty("assignee")
  public AssigneeEnum getAssignee() {
    return assignee;
  }

  public void setAssignee(AssigneeEnum assignee) {
    this.assignee = assignee;
  }

  public QueryDetail queryCreatedAt(OffsetDateTime queryCreatedAt) {
    this.queryCreatedAt = queryCreatedAt;
    return this;
  }

  /**
   * date/time when the query was created
   * @return queryCreatedAt
  */
  @Valid 

  @JsonProperty("queryCreatedAt")
  public OffsetDateTime getQueryCreatedAt() {
    return queryCreatedAt;
  }

  public void setQueryCreatedAt(OffsetDateTime queryCreatedAt) {
    this.queryCreatedAt = queryCreatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryDetail queryDetail = (QueryDetail) o;
    return Objects.equals(this.queryuuid, queryDetail.queryuuid) &&
        Objects.equals(this.umr, queryDetail.umr) &&
        Objects.equals(this.workPackageReference, queryDetail.workPackageReference) &&
        Objects.equals(this.queryId, queryDetail.queryId) &&
        Objects.equals(this.queryStatus, queryDetail.queryStatus) &&
        Objects.equals(this.assignee, queryDetail.assignee) &&
        Objects.equals(this.queryCreatedAt, queryDetail.queryCreatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryuuid, umr, workPackageReference, queryId, queryStatus, assignee, queryCreatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryDetail {\n");
    sb.append("    queryuuid: ").append(toIndentedString(queryuuid)).append("\n");
    sb.append("    umr: ").append(toIndentedString(umr)).append("\n");
    sb.append("    workPackageReference: ").append(toIndentedString(workPackageReference)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    queryStatus: ").append(toIndentedString(queryStatus)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    queryCreatedAt: ").append(toIndentedString(queryCreatedAt)).append("\n");
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

