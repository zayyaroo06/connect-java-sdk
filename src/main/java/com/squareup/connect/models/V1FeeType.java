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
 * 
 */
public enum V1FeeType {
  
  CA_GST("CA_GST"),
  
  CA_HST("CA_HST"),
  
  CA_PST("CA_PST"),
  
  CA_QST("CA_QST"),
  
  JP_CONSUMPTION_TAX("JP_CONSUMPTION_TAX"),
  
  CA_PEI_PST("CA_PEI_PST"),
  
  US_SALES_TAX("US_SALES_TAX"),
  
  OTHER("OTHER");

  private String value;

  V1FeeType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static V1FeeType fromValue(String text) {
    for (V1FeeType b : V1FeeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

