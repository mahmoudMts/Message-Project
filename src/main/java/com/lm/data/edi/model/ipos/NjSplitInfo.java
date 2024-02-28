package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * NjSplitInfo
 */

@JsonTypeName("njSplitInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class NjSplitInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID usslId;

  @Valid
  private List<@Valid NjSplitDetail> njSplitDetails = new ArrayList<>();

  public NjSplitInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NjSplitInfo(UUID usslId, List<@Valid NjSplitDetail> njSplitDetails) {
    this.usslId = usslId;
    this.njSplitDetails = njSplitDetails;
  }

  public NjSplitInfo usslId(UUID usslId) {
    this.usslId = usslId;
    return this;
  }

  /**
   * uuid of the USSL broker to which the NJ Split applies
   * @return usslId
  */
  @NotNull @Valid 

  @JsonProperty("usslId")
  public UUID getUsslId() {
    return usslId;
  }

  public void setUsslId(UUID usslId) {
    this.usslId = usslId;
  }

  public NjSplitInfo njSplitDetails(List<@Valid NjSplitDetail> njSplitDetails) {
    this.njSplitDetails = njSplitDetails;
    return this;
  }

  public NjSplitInfo addNjSplitDetailsItem(NjSplitDetail njSplitDetailsItem) {
    if (this.njSplitDetails == null) {
      this.njSplitDetails = new ArrayList<>();
    }
    this.njSplitDetails.add(njSplitDetailsItem);
    return this;
  }

  /**
   * Get njSplitDetails
   * @return njSplitDetails
  */
  @NotNull @Valid 

  @JsonProperty("njSplitDetails")
  public List<@Valid NjSplitDetail> getNjSplitDetails() {
    return njSplitDetails;
  }

  public void setNjSplitDetails(List<@Valid NjSplitDetail> njSplitDetails) {
    this.njSplitDetails = njSplitDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NjSplitInfo njSplitInfo = (NjSplitInfo) o;
    return Objects.equals(this.usslId, njSplitInfo.usslId) &&
        Objects.equals(this.njSplitDetails, njSplitInfo.njSplitDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usslId, njSplitDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NjSplitInfo {\n");
    sb.append("    usslId: ").append(toIndentedString(usslId)).append("\n");
    sb.append("    njSplitDetails: ").append(toIndentedString(njSplitDetails)).append("\n");
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

