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
 * PostRecipient model
 */
@ApiModel(description = "PostRecipient model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-25T02:19:49.752Z")

public class PostRecipient {
  @SerializedName("address_name")
  private String addressName = null;

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

  @SerializedName("return_address_id")
  private Integer returnAddressId = null;

  @SerializedName("schedule")
  private Integer schedule = 0;

  public PostRecipient() {
    //this.classType = this.getClass().getSimpleName();
  }
  public PostRecipient addressName(String addressName) {
    this.addressName = addressName;
    return this;
  }

   /**
   * Name of address
   * @return addressName
  **/
  @ApiModelProperty(required = true, value = "Name of address")
  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public PostRecipient addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * First line of address
   * @return addressLine1
  **/
  @ApiModelProperty(required = true, value = "First line of address")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public PostRecipient addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Second line of address
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Second line of address")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public PostRecipient addressCity(String addressCity) {
    this.addressCity = addressCity;
    return this;
  }

   /**
   * City
   * @return addressCity
  **/
  @ApiModelProperty(required = true, value = "City")
  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public PostRecipient addressState(String addressState) {
    this.addressState = addressState;
    return this;
  }

   /**
   * State
   * @return addressState
  **/
  @ApiModelProperty(required = true, value = "State")
  public String getAddressState() {
    return addressState;
  }

  public void setAddressState(String addressState) {
    this.addressState = addressState;
  }

  public PostRecipient addressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
    return this;
  }

   /**
   * Postal code
   * @return addressPostalCode
  **/
  @ApiModelProperty(required = true, value = "Postal code")
  public String getAddressPostalCode() {
    return addressPostalCode;
  }

  public void setAddressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
  }

  public PostRecipient addressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * Country
   * @return addressCountry
  **/
  @ApiModelProperty(required = true, value = "Country")
  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public PostRecipient returnAddressId(Integer returnAddressId) {
    this.returnAddressId = returnAddressId;
    return this;
  }

   /**
   * ID of return address to use
   * @return returnAddressId
  **/
  @ApiModelProperty(required = true, value = "ID of return address to use")
  public Integer getReturnAddressId() {
    return returnAddressId;
  }

  public void setReturnAddressId(Integer returnAddressId) {
    this.returnAddressId = returnAddressId;
  }

  public PostRecipient schedule(Integer schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * When to send letter (0/null&#x3D;now)
   * @return schedule
  **/
  @ApiModelProperty(example = "0", value = "When to send letter (0/null=now)")
  public Integer getSchedule() {
    return schedule;
  }

  public void setSchedule(Integer schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRecipient postRecipient = (PostRecipient) o;
    return Objects.equals(this.addressName, postRecipient.addressName) &&
        Objects.equals(this.addressLine1, postRecipient.addressLine1) &&
        Objects.equals(this.addressLine2, postRecipient.addressLine2) &&
        Objects.equals(this.addressCity, postRecipient.addressCity) &&
        Objects.equals(this.addressState, postRecipient.addressState) &&
        Objects.equals(this.addressPostalCode, postRecipient.addressPostalCode) &&
        Objects.equals(this.addressCountry, postRecipient.addressCountry) &&
        Objects.equals(this.returnAddressId, postRecipient.returnAddressId) &&
        Objects.equals(this.schedule, postRecipient.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressName, addressLine1, addressLine2, addressCity, addressState, addressPostalCode, addressCountry, returnAddressId, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRecipient {\n");
    
    sb.append("    addressName: ").append(toIndentedString(addressName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
    sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    returnAddressId: ").append(toIndentedString(returnAddressId)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

