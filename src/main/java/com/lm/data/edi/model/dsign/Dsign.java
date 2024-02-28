
package com.lm.data.edi.model.dsign;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * A description of a DSIGN notification to be delivered to a party (or group of parties).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "messagePayload"
})
@Data
@EqualsAndHashCode
@ToString
@Builder
public class Dsign {

    @JsonProperty("messagePayload")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<DSIGNnotificationPayloadMessagePayload> messagePayload = new ArrayList<DSIGNnotificationPayloadMessagePayload>();

}
