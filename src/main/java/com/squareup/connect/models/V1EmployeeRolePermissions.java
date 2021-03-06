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
public enum V1EmployeeRolePermissions {
  
  ACCESS_SALES_HISTORY("REGISTER_ACCESS_SALES_HISTORY"),
  
  APPLY_RESTRICTED_DISCOUNTS("REGISTER_APPLY_RESTRICTED_DISCOUNTS"),
  
  CHANGE_SETTINGS("REGISTER_CHANGE_SETTINGS"),
  
  EDIT_ITEM("REGISTER_EDIT_ITEM"),
  
  ISSUE_REFUNDS("REGISTER_ISSUE_REFUNDS"),
  
  OPEN_CASH_DRAWER_OUTSIDE_SALE("REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE"),
  
  VIEW_SUMMARY_REPORTS("REGISTER_VIEW_SUMMARY_REPORTS");

  private String value;

  V1EmployeeRolePermissions(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static V1EmployeeRolePermissions fromValue(String text) {
    for (V1EmployeeRolePermissions b : V1EmployeeRolePermissions.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

