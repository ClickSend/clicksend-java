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
 * ResellerAccountTransferCredit model
 */
@ApiModel(description = "ResellerAccountTransferCredit model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-06T00:00:20.090Z")

public class ResellerAccountTransferCredit {
  @SerializedName("client_user_id")
  private Integer clientUserId = null;

  @SerializedName("balance")
  private Integer balance = null;

  @SerializedName("currency")
  private String currency = null;

  public ResellerAccountTransferCredit() {
    //this.classType = this.getClass().getSimpleName();
  }
  public ResellerAccountTransferCredit clientUserId(Integer clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * User ID of client
   * @return clientUserId
  **/
  @ApiModelProperty(required = true, value = "User ID of client")
  public Integer getClientUserId() {
    return clientUserId;
  }

  public void setClientUserId(Integer clientUserId) {
    this.clientUserId = clientUserId;
  }

  public ResellerAccountTransferCredit balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Balance to transfer
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "Balance to transfer")
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public ResellerAccountTransferCredit currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of balance to transfer
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Currency of balance to transfer")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResellerAccountTransferCredit resellerAccountTransferCredit = (ResellerAccountTransferCredit) o;
    return Objects.equals(this.clientUserId, resellerAccountTransferCredit.clientUserId) &&
        Objects.equals(this.balance, resellerAccountTransferCredit.balance) &&
        Objects.equals(this.currency, resellerAccountTransferCredit.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, balance, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResellerAccountTransferCredit {\n");
    
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

