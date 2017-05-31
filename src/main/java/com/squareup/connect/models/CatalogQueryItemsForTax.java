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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class CatalogQueryItemsForTax {
  @JsonProperty("tax_ids")
  private List<String> taxIds = new ArrayList<String>();

  public CatalogQueryItemsForTax taxIds(List<String> taxIds) {
    this.taxIds = taxIds;
    return this;
  }

  public CatalogQueryItemsForTax addTaxIdsItem(String taxIdsItem) {
    this.taxIds.add(taxIdsItem);
    return this;
  }

   /**
   * A set of [CatalogTax](#type-catalogtax) IDs to be used to find associated [CatalogItem](#type-catalogitem)s.
   * @return taxIds
  **/
  @ApiModelProperty(required = true, value = "A set of [CatalogTax](#type-catalogtax) IDs to be used to find associated [CatalogItem](#type-catalogitem)s.")
  public List<String> getTaxIds() {
    return taxIds;
  }

  public void setTaxIds(List<String> taxIds) {
    this.taxIds = taxIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogQueryItemsForTax catalogQueryItemsForTax = (CatalogQueryItemsForTax) o;
    return Objects.equals(this.taxIds, catalogQueryItemsForTax.taxIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogQueryItemsForTax {\n");
    
    sb.append("    taxIds: ").append(toIndentedString(taxIds)).append("\n");
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
