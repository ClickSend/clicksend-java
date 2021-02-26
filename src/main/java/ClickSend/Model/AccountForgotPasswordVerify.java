/*
 * ClickSend v3 API
 *  This is an official SDK for [ClickSend](https://clicksend.com)  Below you will find a current list of the available methods for clicksend.  *NOTE: You will need to create a free account to use the API. You can register [here](https://dashboard.clicksend.com/#/signup/step1/)..* 
 *
 * OpenAPI spec version: 3.1
 * Contact: support@clicksend.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ClickSend.Model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountForgotPasswordVerify
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-26T02:31:20.144Z")

public class AccountForgotPasswordVerify {
  @SerializedName("subaccount_id")
  private Integer subaccountId = null;

  @SerializedName("activation_token")
  private String activationToken = null;

  @SerializedName("password")
  private String password = null;

  public AccountForgotPasswordVerify() {
    //this.classType = this.getClass().getSimpleName();
  }
  public AccountForgotPasswordVerify subaccountId(Integer subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

   /**
   * ID of subaccount
   * @return subaccountId
  **/
  @ApiModelProperty(required = true, value = "ID of subaccount")
  public Integer getSubaccountId() {
    return subaccountId;
  }

  public void setSubaccountId(Integer subaccountId) {
    this.subaccountId = subaccountId;
  }

  public AccountForgotPasswordVerify activationToken(String activationToken) {
    this.activationToken = activationToken;
    return this;
  }

   /**
   * Activation token
   * @return activationToken
  **/
  @ApiModelProperty(required = true, value = "Activation token")
  public String getActivationToken() {
    return activationToken;
  }

  public void setActivationToken(String activationToken) {
    this.activationToken = activationToken;
  }

  public AccountForgotPasswordVerify password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountForgotPasswordVerify accountForgotPasswordVerify = (AccountForgotPasswordVerify) o;
    return Objects.equals(this.subaccountId, accountForgotPasswordVerify.subaccountId) &&
        Objects.equals(this.activationToken, accountForgotPasswordVerify.activationToken) &&
        Objects.equals(this.password, accountForgotPasswordVerify.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subaccountId, activationToken, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountForgotPasswordVerify {\n");
    
    sb.append("    subaccountId: ").append(toIndentedString(subaccountId)).append("\n");
    sb.append("    activationToken: ").append(toIndentedString(activationToken)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

