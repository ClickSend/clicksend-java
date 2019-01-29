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
 * From Email object.
 */
@ApiModel(description = "From Email object.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-29T05:46:47.781Z")
public class FieldsFields {
  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("custom_1")
  private String custom1 = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("fax_number")
  private String faxNumber = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("address_line_1")
  private String addressLine1 = null;

  @SerializedName("address_line_2")
  private String addressLine2 = null;

  @SerializedName("address_city")
  private String addressCity = null;

  @SerializedName("address_state")
  private String addressState = null;

  @SerializedName("address_postal_code")
  private String addressPostalCode = null;

  @SerializedName("address_country")
  private String addressCountry = null;

  @SerializedName("organization_name")
  private String organizationName = null;

  @SerializedName("custom_2")
  private String custom2 = null;

  @SerializedName("custom_3")
  private String custom3 = null;

  @SerializedName("custom_4")
  private String custom4 = null;

  @SerializedName("last_name")
  private String lastName = null;

  public FieldsFields phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Your phone number in E.164 format. Must be provided if no fax number or email.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Your phone number in E.164 format. Must be provided if no fax number or email.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public FieldsFields custom1(String custom1) {
    this.custom1 = custom1;
    return this;
  }

   /**
   * 
   * @return custom1
  **/
  @ApiModelProperty(value = "")
  public String getCustom1() {
    return custom1;
  }

  public void setCustom1(String custom1) {
    this.custom1 = custom1;
  }

  public FieldsFields email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Your email. Must be provided if no phone number or fax number.
   * @return email
  **/
  @ApiModelProperty(value = "Your email. Must be provided if no phone number or fax number.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public FieldsFields faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Your fax number. Must be provided if no phone number or email.
   * @return faxNumber
  **/
  @ApiModelProperty(value = "Your fax number. Must be provided if no phone number or email.")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public FieldsFields firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Your first name.
   * @return firstName
  **/
  @ApiModelProperty(value = "Your first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public FieldsFields addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Your street address
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Your street address")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public FieldsFields addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * 
   * @return addressLine2
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public FieldsFields addressCity(String addressCity) {
    this.addressCity = addressCity;
    return this;
  }

   /**
   * Your nearest city
   * @return addressCity
  **/
  @ApiModelProperty(value = "Your nearest city")
  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public FieldsFields addressState(String addressState) {
    this.addressState = addressState;
    return this;
  }

   /**
   * Your current state
   * @return addressState
  **/
  @ApiModelProperty(value = "Your current state")
  public String getAddressState() {
    return addressState;
  }

  public void setAddressState(String addressState) {
    this.addressState = addressState;
  }

  public FieldsFields addressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
    return this;
  }

   /**
   * Your current postcode
   * @return addressPostalCode
  **/
  @ApiModelProperty(value = "Your current postcode")
  public String getAddressPostalCode() {
    return addressPostalCode;
  }

  public void setAddressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
  }

  public FieldsFields addressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * Your current country
   * @return addressCountry
  **/
  @ApiModelProperty(value = "Your current country")
  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public FieldsFields organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Your organisation name
   * @return organizationName
  **/
  @ApiModelProperty(value = "Your organisation name")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public FieldsFields custom2(String custom2) {
    this.custom2 = custom2;
    return this;
  }

   /**
   * 
   * @return custom2
  **/
  @ApiModelProperty(value = "")
  public String getCustom2() {
    return custom2;
  }

  public void setCustom2(String custom2) {
    this.custom2 = custom2;
  }

  public FieldsFields custom3(String custom3) {
    this.custom3 = custom3;
    return this;
  }

   /**
   * 
   * @return custom3
  **/
  @ApiModelProperty(value = "")
  public String getCustom3() {
    return custom3;
  }

  public void setCustom3(String custom3) {
    this.custom3 = custom3;
  }

  public FieldsFields custom4(String custom4) {
    this.custom4 = custom4;
    return this;
  }

   /**
   * 
   * @return custom4
  **/
  @ApiModelProperty(value = "")
  public String getCustom4() {
    return custom4;
  }

  public void setCustom4(String custom4) {
    this.custom4 = custom4;
  }

  public FieldsFields lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Your last name
   * @return lastName
  **/
  @ApiModelProperty(value = "Your last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldsFields fieldsFields = (FieldsFields) o;
    return Objects.equals(this.phoneNumber, fieldsFields.phoneNumber) &&
        Objects.equals(this.custom1, fieldsFields.custom1) &&
        Objects.equals(this.email, fieldsFields.email) &&
        Objects.equals(this.faxNumber, fieldsFields.faxNumber) &&
        Objects.equals(this.firstName, fieldsFields.firstName) &&
        Objects.equals(this.addressLine1, fieldsFields.addressLine1) &&
        Objects.equals(this.addressLine2, fieldsFields.addressLine2) &&
        Objects.equals(this.addressCity, fieldsFields.addressCity) &&
        Objects.equals(this.addressState, fieldsFields.addressState) &&
        Objects.equals(this.addressPostalCode, fieldsFields.addressPostalCode) &&
        Objects.equals(this.addressCountry, fieldsFields.addressCountry) &&
        Objects.equals(this.organizationName, fieldsFields.organizationName) &&
        Objects.equals(this.custom2, fieldsFields.custom2) &&
        Objects.equals(this.custom3, fieldsFields.custom3) &&
        Objects.equals(this.custom4, fieldsFields.custom4) &&
        Objects.equals(this.lastName, fieldsFields.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, custom1, email, faxNumber, firstName, addressLine1, addressLine2, addressCity, addressState, addressPostalCode, addressCountry, organizationName, custom2, custom3, custom4, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsFields {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    custom1: ").append(toIndentedString(custom1)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
    sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    custom2: ").append(toIndentedString(custom2)).append("\n");
    sb.append("    custom3: ").append(toIndentedString(custom3)).append("\n");
    sb.append("    custom4: ").append(toIndentedString(custom4)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

