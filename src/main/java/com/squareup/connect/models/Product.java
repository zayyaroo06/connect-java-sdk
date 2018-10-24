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
 * Indicates the Square product used to generate an inventory change.
 */
public enum Product {
  
  SQUARE_POS("SQUARE_POS"),
  
  EXTERNAL_API("EXTERNAL_API"),
  
  BILLING("BILLING"),
  
  APPOINTMENTS("APPOINTMENTS"),
  
  INVOICES("INVOICES"),
  
  ONLINE_STORE("ONLINE_STORE"),
  
  PAYROLL("PAYROLL"),
  
  OTHER("OTHER");

  private String value;

  Product(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Product fromValue(String text) {
    for (Product b : Product.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
