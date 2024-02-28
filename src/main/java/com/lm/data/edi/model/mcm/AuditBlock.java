
package com.lm.data.edi.model.mcm;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lm.data.edi.util.LocalDateTimeDeserializer;
import com.lm.data.edi.util.LocalDateTimeSerializerWithZone;


/**
 * The data in the audit block is populated directly by the API from the security context when the record is modified
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "user",
    "at"
})
public class AuditBlock {

    /**
     * The identifier of the user or system user that modified the record
     * (Required)
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("The identifier of the user or system user that modified the record")
    @NotNull
    private String user;
    /**
     * UTC timestamp of the record modification
     * (Required)
     * 
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializerWithZone.class)
    @JsonProperty("at")
    @JsonPropertyDescription("UTC timestamp of the record modification")
    @NotNull
    private LocalDateTime at;

    /**
     * The identifier of the user or system user that modified the record
     * (Required)
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * The identifier of the user or system user that modified the record
     * (Required)
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * UTC timestamp of the record modification
     * (Required)
     * 
     */
    @JsonProperty("at")
    public LocalDateTime getAt() {
        return at;
    }

    /**
     * UTC timestamp of the record modification
     * (Required)
     * 
     */
    @JsonProperty("at")
    public void setAt(LocalDateTime at) {
        this.at = at;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuditBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("at");
        sb.append('=');
        sb.append(((this.at == null)?"<null>":this.at));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.at == null)? 0 :this.at.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuditBlock) == false) {
            return false;
        }
        AuditBlock rhs = ((AuditBlock) other);
        return (((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user)))&&((this.at == rhs.at)||((this.at!= null)&&this.at.equals(rhs.at))));
    }

}
