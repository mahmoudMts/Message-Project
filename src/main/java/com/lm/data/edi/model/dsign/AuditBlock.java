
package com.lm.data.edi.model.dsign;

import java.util.Date;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * The data in the audit block is populated directly by the API from the security context when the record is modified
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "user",
    "at"
})
@Data
@EqualsAndHashCode
@ToString
@Builder
public class AuditBlock {

    @JsonProperty("user")
    @NotNull
    private String user;

    @JsonProperty("at")
    @NotNull
    private Date at;

}
