package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

/**
 * Start of a communication interchange between members. It contains interchange control details and is mandatory. There will only be one Header per interchange.
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class HeaderDSIGN   {
  @JsonProperty("carrierName")
  private String carrierName ;

  @JsonProperty("messageNo")
  @Pattern(regexp = "[0-9]{0,4}")
  @NotNull
  private String messageNo ;

  @JsonProperty("signingDate")
  @NotNull
  private String signingDate ;

  @JsonProperty("currentDate")
  @NotNull
  private String currentDate ;

  @JsonProperty("carrierIdentificationGroupCode")
  @Pattern(regexp = "[A-Z][0-9]{2}")
  @NotNull
  private String carrierIdentificationGroupCode ;



}
