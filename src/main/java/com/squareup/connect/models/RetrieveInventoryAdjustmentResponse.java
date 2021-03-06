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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.Error;
import com.squareup.connect.models.InventoryAdjustment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class RetrieveInventoryAdjustmentResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("adjustment")
  private InventoryAdjustment adjustment = null;

  public RetrieveInventoryAdjustmentResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public RetrieveInventoryAdjustmentResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Any errors that occurred during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public RetrieveInventoryAdjustmentResponse adjustment(InventoryAdjustment adjustment) {
    this.adjustment = adjustment;
    return this;
  }

   /**
   * The requested [InventoryAdjustment](#type-inventoryadjustment).
   * @return adjustment
  **/
  @ApiModelProperty(value = "The requested [InventoryAdjustment](#type-inventoryadjustment).")
  public InventoryAdjustment getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(InventoryAdjustment adjustment) {
    this.adjustment = adjustment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveInventoryAdjustmentResponse retrieveInventoryAdjustmentResponse = (RetrieveInventoryAdjustmentResponse) o;
    return Objects.equals(this.errors, retrieveInventoryAdjustmentResponse.errors) &&
        Objects.equals(this.adjustment, retrieveInventoryAdjustmentResponse.adjustment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, adjustment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInventoryAdjustmentResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    adjustment: ").append(toIndentedString(adjustment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

