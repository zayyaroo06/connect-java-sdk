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
 * The brand of a credit card.
 */
public enum V1TenderCardBrand {
  
  OTHER_BRAND("OTHER_BRAND"),
  
  VISA("VISA"),
  
  MASTER_CARD("MASTER_CARD"),
  
  AMERICAN_EXPRESS("AMERICAN_EXPRESS"),
  
  DISCOVER("DISCOVER"),
  
  DISCOVER_DINERS("DISCOVER_DINERS"),
  
  JCB("JCB"),
  
  CHINA_UNIONPAY("CHINA_UNIONPAY"),
  
  SQUARE_GIFT_CARD("SQUARE_GIFT_CARD");

  private String value;

  V1TenderCardBrand(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static V1TenderCardBrand fromValue(String text) {
    for (V1TenderCardBrand b : V1TenderCardBrand.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
