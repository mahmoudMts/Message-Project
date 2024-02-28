package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This is the business channel. e.g A&S Direct Load, A&S DRI, EBOT.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum LmChannelEnum {
  
  AS_DIRECT_LOAD("AS_DIRECT_LOAD"),
  
  AS_DRI("AS_DRI"),
  
  EBOT("EBOT");

  private String value;

  LmChannelEnum(String value) {
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
  public static LmChannelEnum fromValue(String value) {
    for (LmChannelEnum b : LmChannelEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

