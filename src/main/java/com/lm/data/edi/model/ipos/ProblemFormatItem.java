package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.net.URI;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ProblemFormatItem
 */

@JsonTypeName("problemFormatItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class ProblemFormatItem implements Serializable {

  private static final long serialVersionUID = 1L;

  private URI type;

  private String title;

  private String detail;

  /**
   * Gets or Sets domain
   */
  public enum DomainEnum {
    RISK("RISK"),
    
    PREMIUM("PREMIUM"),
    
    CLAIM("CLAIM"),
    
    DOCUMENT("DOCUMENT"),
    
    EXPERTFEES("EXPERTFEES"),
    
    PARTY("PARTY"),
    
    NOTIFICATION("NOTIFICATION"),
    
    SETTLEMENTS("SETTLEMENTS"),
    
    SANCTIONS("SANCTIONS"),
    
    TREATY("TREATY"),
    
    REFERENCEDATA("REFERENCEDATA");

    private String value;

    DomainEnum(String value) {
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
    public static DomainEnum fromValue(String value) {
      for (DomainEnum b : DomainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DomainEnum domain;

  private Integer errorCode;

  public ProblemFormatItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProblemFormatItem(URI type, String title, DomainEnum domain, Integer errorCode) {
    this.type = type;
    this.title = title;
    this.domain = domain;
    this.errorCode = errorCode;
  }

  public ProblemFormatItem type(URI type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 

  @JsonProperty("type")
  public URI getType() {
    return type;
  }

  public void setType(URI type) {
    this.type = type;
  }

  public ProblemFormatItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProblemFormatItem detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  

  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ProblemFormatItem domain(DomainEnum domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  */
  @NotNull 

  @JsonProperty("domain")
  public DomainEnum getDomain() {
    return domain;
  }

  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }

  public ProblemFormatItem errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  */
  @NotNull 

  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemFormatItem problemFormatItem = (ProblemFormatItem) o;
    return Objects.equals(this.type, problemFormatItem.type) &&
        Objects.equals(this.title, problemFormatItem.title) &&
        Objects.equals(this.detail, problemFormatItem.detail) &&
        Objects.equals(this.domain, problemFormatItem.domain) &&
        Objects.equals(this.errorCode, problemFormatItem.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, detail, domain, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemFormatItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

