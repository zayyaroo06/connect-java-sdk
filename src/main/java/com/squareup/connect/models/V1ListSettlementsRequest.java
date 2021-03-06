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

/**
 * 
 */
@ApiModel(description = "")

public class V1ListSettlementsRequest {
  /**
   * TThe order in which payments are listed in the response. See [SortOrder](#type-sortorder) for possible values
   */
  public enum OrderEnum {
    DESC("DESC"),
    
    ASC("ASC");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderEnum fromValue(String text) {
      for (OrderEnum b : OrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("order")
  private OrderEnum order = null;

  @JsonProperty("begin_time")
  private String beginTime = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("limit")
  private Integer limit = null;

  /**
   * Provide this parameter to retrieve only settlements with a particular status (SENT or FAILED). See [V1ListSettlementsRequestStatus](#type-v1listsettlementsrequeststatus) for possible values
   */
  public enum StatusEnum {
    SENT("SENT"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("batch_token")
  private String batchToken = null;

  public V1ListSettlementsRequest order(OrderEnum order) {
    this.order = order;
    return this;
  }

   /**
   * TThe order in which payments are listed in the response. See [SortOrder](#type-sortorder) for possible values
   * @return order
  **/
  @ApiModelProperty(value = "TThe order in which payments are listed in the response. See [SortOrder](#type-sortorder) for possible values")
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  public V1ListSettlementsRequest beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * The beginning of the requested reporting period, in ISO 8601 format. If this value is before January 1, 2013 (2013-01-01T00:00:00Z), this endpoint returns an error. Default value: The current time minus one year.
   * @return beginTime
  **/
  @ApiModelProperty(value = "The beginning of the requested reporting period, in ISO 8601 format. If this value is before January 1, 2013 (2013-01-01T00:00:00Z), this endpoint returns an error. Default value: The current time minus one year.")
  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public V1ListSettlementsRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end of the requested reporting period, in ISO 8601 format. If this value is more than one year greater than begin_time, this endpoint returns an error. Default value: The current time.
   * @return endTime
  **/
  @ApiModelProperty(value = "The end of the requested reporting period, in ISO 8601 format. If this value is more than one year greater than begin_time, this endpoint returns an error. Default value: The current time.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public V1ListSettlementsRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The maximum number of payments to return in a single response. This value cannot exceed 200.
   * @return limit
  **/
  @ApiModelProperty(value = "The maximum number of payments to return in a single response. This value cannot exceed 200.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public V1ListSettlementsRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Provide this parameter to retrieve only settlements with a particular status (SENT or FAILED). See [V1ListSettlementsRequestStatus](#type-v1listsettlementsrequeststatus) for possible values
   * @return status
  **/
  @ApiModelProperty(value = "Provide this parameter to retrieve only settlements with a particular status (SENT or FAILED). See [V1ListSettlementsRequestStatus](#type-v1listsettlementsrequeststatus) for possible values")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public V1ListSettlementsRequest batchToken(String batchToken) {
    this.batchToken = batchToken;
    return this;
  }

   /**
   * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
   * @return batchToken
  **/
  @ApiModelProperty(value = "A pagination cursor to retrieve the next set of results for your original query to the endpoint.")
  public String getBatchToken() {
    return batchToken;
  }

  public void setBatchToken(String batchToken) {
    this.batchToken = batchToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ListSettlementsRequest v1ListSettlementsRequest = (V1ListSettlementsRequest) o;
    return Objects.equals(this.order, v1ListSettlementsRequest.order) &&
        Objects.equals(this.beginTime, v1ListSettlementsRequest.beginTime) &&
        Objects.equals(this.endTime, v1ListSettlementsRequest.endTime) &&
        Objects.equals(this.limit, v1ListSettlementsRequest.limit) &&
        Objects.equals(this.status, v1ListSettlementsRequest.status) &&
        Objects.equals(this.batchToken, v1ListSettlementsRequest.batchToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, beginTime, endTime, limit, status, batchToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ListSettlementsRequest {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    batchToken: ").append(toIndentedString(batchToken)).append("\n");
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

