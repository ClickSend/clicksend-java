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
 * Accounts that are maintained under a main account
 */
@ApiModel(description = "Accounts that are maintained under a main account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-28T02:25:08.844Z")

public class Subaccount {
  @SerializedName("api_username")
  private String apiUsername = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("access_users")
  private Integer accessUsers = 1;

  @SerializedName("access_billing")
  private Integer accessBilling = 1;

  @SerializedName("access_reporting")
  private Integer accessReporting = 1;

  @SerializedName("access_contacts")
  private Integer accessContacts = 0;

  @SerializedName("access_settings")
  private Integer accessSettings = 1;

  public Subaccount() {
    //this.classType = this.getClass().getSimpleName();
  }
  public Subaccount apiUsername(String apiUsername) {
    this.apiUsername = apiUsername;
    return this;
  }

   /**
   * Your new api username.
   * @return apiUsername
  **/
  @ApiModelProperty(required = true, value = "Your new api username.")
  public String getApiUsername() {
    return apiUsername;
  }

  public void setApiUsername(String apiUsername) {
    this.apiUsername = apiUsername;
  }

  public Subaccount password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Your new password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Your new password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Subaccount email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Your new email.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Your new email.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Subaccount phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Your phone number in E.164 format.
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "Your phone number in E.164 format.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Subaccount firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Your firstname
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "Your firstname")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Subaccount lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Your lastname
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Your lastname")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Subaccount accessUsers(Integer accessUsers) {
    this.accessUsers = accessUsers;
    return this;
  }

   /**
   * Your access users flag value, must be 1 or 0.
   * @return accessUsers
  **/
  @ApiModelProperty(example = "1", value = "Your access users flag value, must be 1 or 0.")
  public Integer getAccessUsers() {
    return accessUsers;
  }

  public void setAccessUsers(Integer accessUsers) {
    this.accessUsers = accessUsers;
  }

  public Subaccount accessBilling(Integer accessBilling) {
    this.accessBilling = accessBilling;
    return this;
  }

   /**
   * Your access billing flag value, must be 1 or 0.
   * @return accessBilling
  **/
  @ApiModelProperty(example = "1", value = "Your access billing flag value, must be 1 or 0.")
  public Integer getAccessBilling() {
    return accessBilling;
  }

  public void setAccessBilling(Integer accessBilling) {
    this.accessBilling = accessBilling;
  }

  public Subaccount accessReporting(Integer accessReporting) {
    this.accessReporting = accessReporting;
    return this;
  }

   /**
   * Your access reporting flag value, must be 1 or 0.
   * @return accessReporting
  **/
  @ApiModelProperty(example = "1", value = "Your access reporting flag value, must be 1 or 0.")
  public Integer getAccessReporting() {
    return accessReporting;
  }

  public void setAccessReporting(Integer accessReporting) {
    this.accessReporting = accessReporting;
  }

  public Subaccount accessContacts(Integer accessContacts) {
    this.accessContacts = accessContacts;
    return this;
  }

   /**
   * Your access contacts flag value, must be 1 or 0.
   * @return accessContacts
  **/
  @ApiModelProperty(example = "0", value = "Your access contacts flag value, must be 1 or 0.")
  public Integer getAccessContacts() {
    return accessContacts;
  }

  public void setAccessContacts(Integer accessContacts) {
    this.accessContacts = accessContacts;
  }

  public Subaccount accessSettings(Integer accessSettings) {
    this.accessSettings = accessSettings;
    return this;
  }

   /**
   * Your access settings flag value, must be 1 or 0.
   * @return accessSettings
  **/
  @ApiModelProperty(example = "1", value = "Your access settings flag value, must be 1 or 0.")
  public Integer getAccessSettings() {
    return accessSettings;
  }

  public void setAccessSettings(Integer accessSettings) {
    this.accessSettings = accessSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subaccount subaccount = (Subaccount) o;
    return Objects.equals(this.apiUsername, subaccount.apiUsername) &&
        Objects.equals(this.password, subaccount.password) &&
        Objects.equals(this.email, subaccount.email) &&
        Objects.equals(this.phoneNumber, subaccount.phoneNumber) &&
        Objects.equals(this.firstName, subaccount.firstName) &&
        Objects.equals(this.lastName, subaccount.lastName) &&
        Objects.equals(this.accessUsers, subaccount.accessUsers) &&
        Objects.equals(this.accessBilling, subaccount.accessBilling) &&
        Objects.equals(this.accessReporting, subaccount.accessReporting) &&
        Objects.equals(this.accessContacts, subaccount.accessContacts) &&
        Objects.equals(this.accessSettings, subaccount.accessSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiUsername, password, email, phoneNumber, firstName, lastName, accessUsers, accessBilling, accessReporting, accessContacts, accessSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subaccount {\n");
    
    sb.append("    apiUsername: ").append(toIndentedString(apiUsername)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    accessUsers: ").append(toIndentedString(accessUsers)).append("\n");
    sb.append("    accessBilling: ").append(toIndentedString(accessBilling)).append("\n");
    sb.append("    accessReporting: ").append(toIndentedString(accessReporting)).append("\n");
    sb.append("    accessContacts: ").append(toIndentedString(accessContacts)).append("\n");
    sb.append("    accessSettings: ").append(toIndentedString(accessSettings)).append("\n");
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

