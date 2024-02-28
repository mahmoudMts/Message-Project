package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Objects;

/**
 * AmendmentRecordDA1Inner
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class AmendmentRecordDA1Inner   {
  @JsonProperty("changeDate")

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate changeDate;

  @JsonProperty("carrierIdentificationCode")
  @Pattern(regexp="[A-Z][0-9]{5}")
  private String carrierIdentificationCode;

  @JsonProperty("dsignCompanyCode")
  @Pattern(regexp="[A-Z][0-9]{2}")
  private String dsignCompanyCode;

  @JsonProperty("memberShortName")
  @Size(max=12)
  private String memberShortName;

  @JsonProperty("brokerCodeShort")
  @Pattern(regexp="[A-Za-z0-9]{3}")
  private String brokerCodeShort;

  @JsonProperty("brokerPseudonym")
  @Size(max=3)
  private String brokerPseudonym;

  @JsonProperty("brokerShortName")
  @Size(max=20)
  private String brokerShortName;

  @JsonProperty("brokerReference")
  @Size(max=12)
  private String brokerReference;

  @JsonProperty("secondaryBrokerReference")
  @Size(max=12)
  private String secondaryBrokerReference;

  @JsonProperty("lirmaSigningReferenceAmended")
  @Size(max=13)
  private String lirmaSigningReferenceAmended;

  @JsonProperty("originalMemberReference")
  @Pattern(regexp="[A-Za-z0-9]{12}")
  private String originalMemberReference;

  @JsonProperty("newMemberReference")
  @Pattern(regexp="[A-Za-z0-9]{12}")
  private String newMemberReference;


}
