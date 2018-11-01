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
 * Verifies an account by token that should have been sent to the user&#39;s phone
 */
@ApiModel(description = "Verifies an account by token that should have been sent to the user's phone")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T03:08:18.225Z")

public class AccountVerify {
  @SerializedName("country")
  private String country = null;

  @SerializedName("user_phone")
  private String userPhone = null;

  @SerializedName("type")
  private String type = null;

  public AccountVerify() {
    this.classType = this.getClass().getSimpleName();
  }
  public AccountVerify country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country code
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country code")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountVerify userPhone(String userPhone) {
    this.userPhone = userPhone;
    return this;
  }

   /**
   * User&#39;s phone number
   * @return userPhone
  **/
  @ApiModelProperty(required = true, value = "User's phone number")
  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public AccountVerify type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of verification
   * @return type
  **/
  @ApiModelProperty(example = "sms", required = true, value = "Type of verification")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVerify accountVerify = (AccountVerify) o;
    return Objects.equals(this.country, accountVerify.country) &&
        Objects.equals(this.userPhone, accountVerify.userPhone) &&
        Objects.equals(this.type, accountVerify.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, userPhone, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVerify {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

