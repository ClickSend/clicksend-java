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
 * Base model for all address-related objects.
 */
@ApiModel(description = "Base model for all address-related objects.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-11T02:11:39.647Z")

public class Address {
  @SerializedName("address_name")
  private String addressName = null;

  @SerializedName("address_line_1")
  private String addressLine1 = null;

  @SerializedName("address_city")
  private String addressCity = null;

  @SerializedName("address_postal_code")
  private String addressPostalCode = null;

  @SerializedName("address_country")
  private String addressCountry = null;

  @SerializedName("address_line_2")
  private String addressLine2 = null;

  @SerializedName("address_state")
  private String addressState = null;

  public Address() {
    //this.classType = this.getClass().getSimpleName();
  }
  public Address addressName(String addressName) {
    this.addressName = addressName;
    return this;
  }

   /**
   * Your address name.
   * @return addressName
  **/
  @ApiModelProperty(required = true, value = "Your address name.")
  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Your address line 1
   * @return addressLine1
  **/
  @ApiModelProperty(required = true, value = "Your address line 1")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressCity(String addressCity) {
    this.addressCity = addressCity;
    return this;
  }

   /**
   * Your city
   * @return addressCity
  **/
  @ApiModelProperty(required = true, value = "Your city")
  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public Address addressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
    return this;
  }

   /**
   * Your postal code
   * @return addressPostalCode
  **/
  @ApiModelProperty(required = true, value = "Your postal code")
  public String getAddressPostalCode() {
    return addressPostalCode;
  }

  public void setAddressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
  }

  public Address addressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * Your country
   * @return addressCountry
  **/
  @ApiModelProperty(required = true, value = "Your country")
  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Your address line 2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Your address line 2")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address addressState(String addressState) {
    this.addressState = addressState;
    return this;
  }

   /**
   * Your state
   * @return addressState
  **/
  @ApiModelProperty(value = "Your state")
  public String getAddressState() {
    return addressState;
  }

  public void setAddressState(String addressState) {
    this.addressState = addressState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressName, address.addressName) &&
        Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressCity, address.addressCity) &&
        Objects.equals(this.addressPostalCode, address.addressPostalCode) &&
        Objects.equals(this.addressCountry, address.addressCountry) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.addressState, address.addressState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressName, addressLine1, addressCity, addressPostalCode, addressCountry, addressLine2, addressState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressName: ").append(toIndentedString(addressName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
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

