/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Indicates the method used to create the customer profile.
 */
public enum CustomerCreationSource {
  
  OTHER("OTHER"),
  
  APPOINTMENTS("APPOINTMENTS"),
  
  COUPON("COUPON"),
  
  DELETION_RECOVERY("DELETION_RECOVERY"),
  
  DIRECTORY("DIRECTORY"),
  
  EGIFTING("EGIFTING"),
  
  EMAIL_COLLECTION("EMAIL_COLLECTION"),
  
  FEEDBACK("FEEDBACK"),
  
  IMPORT("IMPORT"),
  
  INVOICES("INVOICES"),
  
  LOYALTY("LOYALTY"),
  
  MARKETING("MARKETING"),
  
  MERGE("MERGE"),
  
  ONLINE_STORE("ONLINE_STORE"),
  
  INSTANT_PROFILE("INSTANT_PROFILE"),
  
  TERMINAL("TERMINAL"),
  
  THIRD_PARTY("THIRD_PARTY"),
  
  THIRD_PARTY_IMPORT("THIRD_PARTY_IMPORT"),
  
  UNMERGE_RECOVERY("UNMERGE_RECOVERY");

  private String value;

  CustomerCreationSource(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CustomerCreationSource fromValue(String text) {
    for (CustomerCreationSource b : CustomerCreationSource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

