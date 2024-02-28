
package com.lm.data.edi.model.dsign;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "header",
    "signingDataDetails",
    "audit"
})
@Data
@EqualsAndHashCode
@ToString
@Builder
public class DSIGNnotificationPayloadMessagePayload {

    @JsonProperty("header")
    @Valid
    @NotNull
    private HeaderDSIGN header;

    @JsonProperty("signingDataDetails")
    @Valid
    @NotNull
    private SigningDataDetails signingDataDetails;

    @JsonProperty("audit")
    @Valid
    private AuditBlock audit;



}
