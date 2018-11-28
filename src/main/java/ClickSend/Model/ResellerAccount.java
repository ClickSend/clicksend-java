/*
 * ClickSend v3 REST API
 *  This is the official [ClickSend](https://clicksend.com) SDK.  *You'll need to create a free account to use the API. You can register [here](https://www.clicksend.com/signup).*  You can use our API documentation along with the SDK. Our API docs can be found [here](https://developers.clicksend.com). 
 *
 * OpenAPI spec version: 3.1.0
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
 * ResellerAccount model
 */
@ApiModel(description = "ResellerAccount model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-28T01:52:44.515Z")

public class ResellerAccount {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("user_email")
  private String userEmail = null;

  @SerializedName("user_phone")
  private String userPhone = null;

  @SerializedName("user_first_name")
  private String userFirstName = null;

  @SerializedName("user_last_name")
  private String userLastName = null;

  @SerializedName("account_name")
  private String accountName = null;

  @SerializedName("country")
  private String country = null;

  public ResellerAccount() {
    //this.classType = this.getClass().getSimpleName();
  }
  public ResellerAccount username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Account username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "Account username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ResellerAccount password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Account password (unhashed)
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Account password (unhashed)")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ResellerAccount userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Account email
   * @return userEmail
  **/
  @ApiModelProperty(required = true, value = "Account email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public ResellerAccount userPhone(String userPhone) {
    this.userPhone = userPhone;
    return this;
  }

   /**
   * Account phone number
   * @return userPhone
  **/
  @ApiModelProperty(required = true, value = "Account phone number")
  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public ResellerAccount userFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
    return this;
  }

   /**
   * Account owner first name
   * @return userFirstName
  **/
  @ApiModelProperty(required = true, value = "Account owner first name")
  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public ResellerAccount userLastName(String userLastName) {
    this.userLastName = userLastName;
    return this;
  }

   /**
   * Account owner last name
   * @return userLastName
  **/
  @ApiModelProperty(required = true, value = "Account owner last name")
  public String getUserLastName() {
    return userLastName;
  }

  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }

  public ResellerAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Account name (usually company name)
   * @return accountName
  **/
  @ApiModelProperty(required = true, value = "Account name (usually company name)")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public ResellerAccount country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of account holder
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country of account holder")
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
    ResellerAccount resellerAccount = (ResellerAccount) o;
    return Objects.equals(this.username, resellerAccount.username) &&
        Objects.equals(this.password, resellerAccount.password) &&
        Objects.equals(this.userEmail, resellerAccount.userEmail) &&
        Objects.equals(this.userPhone, resellerAccount.userPhone) &&
        Objects.equals(this.userFirstName, resellerAccount.userFirstName) &&
        Objects.equals(this.userLastName, resellerAccount.userLastName) &&
        Objects.equals(this.accountName, resellerAccount.accountName) &&
        Objects.equals(this.country, resellerAccount.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, userEmail, userPhone, userFirstName, userLastName, accountName, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResellerAccount {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
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

