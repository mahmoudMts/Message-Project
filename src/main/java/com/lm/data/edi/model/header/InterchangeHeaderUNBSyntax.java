
package com.lm.data.edi.model.header;

import java.util.HashMap;
import java.util.Map;
//import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Identifies version 1, level A of the syntax rules and Controlling Agency UNO.  (For level B, the field would contain UNOB:1).The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "syntaxVersionNumber"
})
//@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterchangeHeaderUNBSyntax {

    /**
     * The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1. Default value is 1
     * (Required)
     * 
     */
    @JsonProperty("syntaxVersionNumber")
    @JsonPropertyDescription("The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1. Default value is 1")
    @NotNull
    private String syntaxVersionNumber;

    /**
     * The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1. Default value is 1
     * (Required)
     * 
     */
    @JsonProperty("syntaxVersionNumber")
    public String getSyntaxVersionNumber() {
        return syntaxVersionNumber;
    }

    /**
     * The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1. Default value is 1
     * (Required)
     * 
     */
    @JsonProperty("syntaxVersionNumber")
    public void setSyntaxVersionNumber(String syntaxVersionNumber) {
        this.syntaxVersionNumber = syntaxVersionNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InterchangeHeaderUNBSyntax.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("syntaxVersionNumber");
        sb.append('=');
        sb.append(((this.syntaxVersionNumber == null)?"<null>":this.syntaxVersionNumber));
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
        result = ((result* 31)+((this.syntaxVersionNumber == null)? 0 :this.syntaxVersionNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InterchangeHeaderUNBSyntax) == false) {
            return false;
        }
        InterchangeHeaderUNBSyntax rhs = ((InterchangeHeaderUNBSyntax) other);
        return ((this.syntaxVersionNumber == rhs.syntaxVersionNumber)||((this.syntaxVersionNumber!= null)&&this.syntaxVersionNumber.equals(rhs.syntaxVersionNumber)));
    }


    /**
     * The purpose of the version number is to allow for maintenance of the standard.  Each future amendment, or groups of amendments to the syntax, will cause the version number to be incremented by 1. Default value is 1
     * 
     */
    //@Generated("jsonschema2pojo")
    public enum SyntaxVersionNumber {

        _1("1"),
        _2("2");
        private final String value;
        private final static Map<String, InterchangeHeaderUNBSyntax.SyntaxVersionNumber> CONSTANTS = new HashMap<String, InterchangeHeaderUNBSyntax.SyntaxVersionNumber>();

        static {
            for (InterchangeHeaderUNBSyntax.SyntaxVersionNumber c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SyntaxVersionNumber(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static InterchangeHeaderUNBSyntax.SyntaxVersionNumber fromValue(String value) {
        	InterchangeHeaderUNBSyntax.SyntaxVersionNumber constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
