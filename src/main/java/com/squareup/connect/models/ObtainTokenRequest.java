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

public class ObtainTokenRequest {
  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("client_secret")
  private String clientSecret = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("redirect_uri")
  private String redirectUri = null;

  @JsonProperty("grant_type")
  private String grantType = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("migration_token")
  private String migrationToken = null;

  public ObtainTokenRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The Square-issued ID of your application, available from the [application dashboard](https://connect.squareup.com/apps).
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "The Square-issued ID of your application, available from the [application dashboard](https://connect.squareup.com/apps).")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ObtainTokenRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The Square-issued application secret for your application, available from the [application dashboard](https://connect.squareup.com/apps).
   * @return clientSecret
  **/
  @ApiModelProperty(required = true, value = "The Square-issued application secret for your application, available from the [application dashboard](https://connect.squareup.com/apps).")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public ObtainTokenRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The authorization code to exchange. This is required if `grant_type` is set to `authorization_code`, to indicate that the application wants to exchange an authorization code for an OAuth access token.
   * @return code
  **/
  @ApiModelProperty(value = "The authorization code to exchange. This is required if `grant_type` is set to `authorization_code`, to indicate that the application wants to exchange an authorization code for an OAuth access token.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ObtainTokenRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * The redirect URL assigned in the [application dashboard](https://connect.squareup.com/apps).
   * @return redirectUri
  **/
  @ApiModelProperty(value = "The redirect URL assigned in the [application dashboard](https://connect.squareup.com/apps).")
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public ObtainTokenRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * Specifies the method to request an OAuth access token. Valid values are: `authorization_code`, `refresh_token`, and `migration_token`
   * @return grantType
  **/
  @ApiModelProperty(required = true, value = "Specifies the method to request an OAuth access token. Valid values are: `authorization_code`, `refresh_token`, and `migration_token`")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public ObtainTokenRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * A valid refresh token for generating a new OAuth access token. A valid refresh token is required if `grant_type` is set to `refresh_token` , to indicate the application wants a replacement for an expired OAuth access token.
   * @return refreshToken
  **/
  @ApiModelProperty(value = "A valid refresh token for generating a new OAuth access token. A valid refresh token is required if `grant_type` is set to `refresh_token` , to indicate the application wants a replacement for an expired OAuth access token.")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public ObtainTokenRequest migrationToken(String migrationToken) {
    this.migrationToken = migrationToken;
    return this;
  }

   /**
   * Legacy OAuth access token obtained using a Connect API version prior to 2019-03-13. This parameter is required if `grant_type` is set to `migration_token` to indicate that the application wants to get a replacement OAuth access token. The response also returns a refresh token. For more information, see [Migrate to Using Refresh Tokens](/authz/oauth/migration).
   * @return migrationToken
  **/
  @ApiModelProperty(value = "Legacy OAuth access token obtained using a Connect API version prior to 2019-03-13. This parameter is required if `grant_type` is set to `migration_token` to indicate that the application wants to get a replacement OAuth access token. The response also returns a refresh token. For more information, see [Migrate to Using Refresh Tokens](/authz/oauth/migration).")
  public String getMigrationToken() {
    return migrationToken;
  }

  public void setMigrationToken(String migrationToken) {
    this.migrationToken = migrationToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObtainTokenRequest obtainTokenRequest = (ObtainTokenRequest) o;
    return Objects.equals(this.clientId, obtainTokenRequest.clientId) &&
        Objects.equals(this.clientSecret, obtainTokenRequest.clientSecret) &&
        Objects.equals(this.code, obtainTokenRequest.code) &&
        Objects.equals(this.redirectUri, obtainTokenRequest.redirectUri) &&
        Objects.equals(this.grantType, obtainTokenRequest.grantType) &&
        Objects.equals(this.refreshToken, obtainTokenRequest.refreshToken) &&
        Objects.equals(this.migrationToken, obtainTokenRequest.migrationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, code, redirectUri, grantType, refreshToken, migrationToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObtainTokenRequest {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    migrationToken: ").append(toIndentedString(migrationToken)).append("\n");
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

