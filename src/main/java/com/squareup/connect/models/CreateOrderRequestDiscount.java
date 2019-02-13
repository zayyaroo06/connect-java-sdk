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
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * __Deprecated__: Please use the [OrderLineItemDiscount](#type-orderlineitemdiscount) type in the order field of [CreateOrderRequest](#type-createorderrequest) instead.  Represents a discount that can apply to either a single line item or an entire order.
 */
@ApiModel(description = "__Deprecated__: Please use the [OrderLineItemDiscount](#type-orderlineitemdiscount) type in the order field of [CreateOrderRequest](#type-createorderrequest) instead.  Represents a discount that can apply to either a single line item or an entire order.")

public class CreateOrderRequestDiscount {
  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  public CreateOrderRequestDiscount catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * Only used for catalog discounts. The catalog object ID for an existing [CatalogDiscount](#type-catalogdiscount).  Do not provide a value for this field if you provide values in other fields for an ad hoc discount.
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "Only used for catalog discounts. The catalog object ID for an existing [CatalogDiscount](#type-catalogdiscount).  Do not provide a value for this field if you provide values in other fields for an ad hoc discount.")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public CreateOrderRequestDiscount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Only used for ad hoc discounts. The discount's name.
   * @return name
  **/
  @ApiModelProperty(value = "Only used for ad hoc discounts. The discount's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateOrderRequestDiscount percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Only used for ad hoc discounts. The percentage of the discount, as a string representation of a decimal number.  A value of `7.25` corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0
   * @return percentage
  **/
  @ApiModelProperty(value = "Only used for ad hoc discounts. The percentage of the discount, as a string representation of a decimal number.  A value of `7.25` corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public CreateOrderRequestDiscount amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * Only used for ad hoc discounts. The monetary amount of the discount.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "Only used for ad hoc discounts. The monetary amount of the discount.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequestDiscount createOrderRequestDiscount = (CreateOrderRequestDiscount) o;
    return Objects.equals(this.catalogObjectId, createOrderRequestDiscount.catalogObjectId) &&
        Objects.equals(this.name, createOrderRequestDiscount.name) &&
        Objects.equals(this.percentage, createOrderRequestDiscount.percentage) &&
        Objects.equals(this.amountMoney, createOrderRequestDiscount.amountMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogObjectId, name, percentage, amountMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequestDiscount {\n");
    
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
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

