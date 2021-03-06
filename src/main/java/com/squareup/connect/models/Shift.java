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
import com.squareup.connect.models.ModelBreak;
import com.squareup.connect.models.ShiftWage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A record of the hourly rate, start, and end times for a single work shift  for an employee. May include a record of the start and end times for breaks  taken during the shift.
 */
@ApiModel(description = "A record of the hourly rate, start, and end times for a single work shift  for an employee. May include a record of the start and end times for breaks  taken during the shift.")

public class Shift {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("employee_id")
  private String employeeId = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("start_at")
  private String startAt = null;

  @JsonProperty("end_at")
  private String endAt = null;

  @JsonProperty("wage")
  private ShiftWage wage = null;

  @JsonProperty("breaks")
  private List<ModelBreak> breaks = new ArrayList<ModelBreak>();

  /**
   * Describes working state of the current `Shift`. See [ShiftStatus](#type-shiftstatus) for possible values
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    CLOSED("CLOSED");

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

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  public Shift id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID for this object
   * @return id
  **/
  @ApiModelProperty(value = "UUID for this object")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Shift employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The ID of the employee this shift belongs to.
   * @return employeeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the employee this shift belongs to.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public Shift locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The ID of the location this shift occurred at. Should be based on where the employee clocked in.
   * @return locationId
  **/
  @ApiModelProperty(value = "The ID of the location this shift occurred at. Should be based on where the employee clocked in.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Shift timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Read-only convenience value that is calculated from the location based on `location_id`. Format: the IANA Timezone Database identifier for the location timezone.
   * @return timezone
  **/
  @ApiModelProperty(value = "Read-only convenience value that is calculated from the location based on `location_id`. Format: the IANA Timezone Database identifier for the location timezone.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Shift startAt(String startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * RFC 3339; shifted to location timezone + offset. Precision up to the minute is respected; seconds are truncated.
   * @return startAt
  **/
  @ApiModelProperty(required = true, value = "RFC 3339; shifted to location timezone + offset. Precision up to the minute is respected; seconds are truncated.")
  public String getStartAt() {
    return startAt;
  }

  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }

  public Shift endAt(String endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * RFC 3339; shifted to timezone + offset. Precision up to the minute is respected; seconds are truncated. The `end_at` minute is not counted when the shift length is calculated. For example, a shift from `00:00` to `08:01` is considered an 8 hour shift (midnight to 8am).
   * @return endAt
  **/
  @ApiModelProperty(value = "RFC 3339; shifted to timezone + offset. Precision up to the minute is respected; seconds are truncated. The `end_at` minute is not counted when the shift length is calculated. For example, a shift from `00:00` to `08:01` is considered an 8 hour shift (midnight to 8am).")
  public String getEndAt() {
    return endAt;
  }

  public void setEndAt(String endAt) {
    this.endAt = endAt;
  }

  public Shift wage(ShiftWage wage) {
    this.wage = wage;
    return this;
  }

   /**
   * Job and pay related information.
   * @return wage
  **/
  @ApiModelProperty(value = "Job and pay related information.")
  public ShiftWage getWage() {
    return wage;
  }

  public void setWage(ShiftWage wage) {
    this.wage = wage;
  }

  public Shift breaks(List<ModelBreak> breaks) {
    this.breaks = breaks;
    return this;
  }

  public Shift addBreaksItem(ModelBreak breaksItem) {
    this.breaks.add(breaksItem);
    return this;
  }

   /**
   * A list of any paid or unpaid breaks that were taken during this shift.
   * @return breaks
  **/
  @ApiModelProperty(value = "A list of any paid or unpaid breaks that were taken during this shift.")
  public List<ModelBreak> getBreaks() {
    return breaks;
  }

  public void setBreaks(List<ModelBreak> breaks) {
    this.breaks = breaks;
  }

  public Shift status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Describes working state of the current `Shift`. See [ShiftStatus](#type-shiftstatus) for possible values
   * @return status
  **/
  @ApiModelProperty(value = "Describes working state of the current `Shift`. See [ShiftStatus](#type-shiftstatus) for possible values")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Shift version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Used for resolving concurrency issues; request will fail if version provided does not match server version at time of request. If not provided, Square executes a blind write; potentially overwriting data from another write.
   * @return version
  **/
  @ApiModelProperty(value = "Used for resolving concurrency issues; request will fail if version provided does not match server version at time of request. If not provided, Square executes a blind write; potentially overwriting data from another write.")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Shift createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A read-only timestamp in RFC 3339 format; presented in UTC.
   * @return createdAt
  **/
  @ApiModelProperty(value = "A read-only timestamp in RFC 3339 format; presented in UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Shift updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * A read-only timestamp in RFC 3339 format; presented in UTC.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "A read-only timestamp in RFC 3339 format; presented in UTC.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shift shift = (Shift) o;
    return Objects.equals(this.id, shift.id) &&
        Objects.equals(this.employeeId, shift.employeeId) &&
        Objects.equals(this.locationId, shift.locationId) &&
        Objects.equals(this.timezone, shift.timezone) &&
        Objects.equals(this.startAt, shift.startAt) &&
        Objects.equals(this.endAt, shift.endAt) &&
        Objects.equals(this.wage, shift.wage) &&
        Objects.equals(this.breaks, shift.breaks) &&
        Objects.equals(this.status, shift.status) &&
        Objects.equals(this.version, shift.version) &&
        Objects.equals(this.createdAt, shift.createdAt) &&
        Objects.equals(this.updatedAt, shift.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeeId, locationId, timezone, startAt, endAt, wage, breaks, status, version, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shift {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    wage: ").append(toIndentedString(wage)).append("\n");
    sb.append("    breaks: ").append(toIndentedString(breaks)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

