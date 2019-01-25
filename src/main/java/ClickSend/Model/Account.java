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
 * Complete account details needed for the user.
 */
@ApiModel(description = "Complete account details needed for the user.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-25T01:12:11.324Z")

public class Account {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("user_phone")
  private String userPhone = null;

  @SerializedName("user_email")
  private String userEmail = null;

  @SerializedName("user_first_name")
  private String userFirstName = null;

  @SerializedName("user_last_name")
  private String userLastName = null;

  @SerializedName("account_name")
  private String accountName = null;

  @SerializedName("country")
  private String country = null;

  public Account() {
    //this.classType = this.getClass().getSimpleName();
  }
  public Account username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Your username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Your username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Account password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Your password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Your password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Account userPhone(String userPhone) {
    this.userPhone = userPhone;
    return this;
  }

   /**
   * Your phone number in E.164 format.
   * @return userPhone
  **/
  @ApiModelProperty(required = true, value = "Your phone number in E.164 format.")
  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public Account userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Your email
   * @return userEmail
  **/
  @ApiModelProperty(required = true, value = "Your email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public Account userFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
    return this;
  }

   /**
   * Your first name
   * @return userFirstName
  **/
  @ApiModelProperty(required = true, value = "Your first name")
  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public Account userLastName(String userLastName) {
    this.userLastName = userLastName;
    return this;
  }

   /**
   * Your last name
   * @return userLastName
  **/
  @ApiModelProperty(required = true, value = "Your last name")
  public String getUserLastName() {
    return userLastName;
  }

  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }

  public Account accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Your delivery to value.
   * @return accountName
  **/
  @ApiModelProperty(required = true, value = "Your delivery to value.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Account country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Your country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Your country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.username, account.username) &&
        Objects.equals(this.password, account.password) &&
        Objects.equals(this.userPhone, account.userPhone) &&
        Objects.equals(this.userEmail, account.userEmail) &&
        Objects.equals(this.userFirstName, account.userFirstName) &&
        Objects.equals(this.userLastName, account.userLastName) &&
        Objects.equals(this.accountName, account.accountName) &&
        Objects.equals(this.country, account.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, userPhone, userEmail, userFirstName, userLastName, accountName, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userFirstName: ").append(toIndentedString(userFirstName)).append("\n");
    sb.append("    userLastName: ").append(toIndentedString(userLastName)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

