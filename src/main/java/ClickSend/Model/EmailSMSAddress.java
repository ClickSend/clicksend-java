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
 * Email-to-SMS Allowed Address
 */
@ApiModel(description = "Email-to-SMS Allowed Address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-07T01:32:21.097Z")

public class EmailSMSAddress {
  @SerializedName("email_address")
  private String emailAddress = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("subaccount_id")
  private String subaccountId = null;

  public EmailSMSAddress() {
    //this.classType = this.getClass().getSimpleName();
  }
  public EmailSMSAddress emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Your email address
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "Your email address")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public EmailSMSAddress from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Your sender id
   * @return from
  **/
  @ApiModelProperty(required = true, value = "Your sender id")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public EmailSMSAddress subaccountId(String subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

   /**
   * Your subaccount id
   * @return subaccountId
  **/
  @ApiModelProperty(value = "Your subaccount id")
  public String getSubaccountId() {
    return subaccountId;
  }

  public void setSubaccountId(String subaccountId) {
    this.subaccountId = subaccountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSMSAddress emailSMSAddress = (EmailSMSAddress) o;
    return Objects.equals(this.emailAddress, emailSMSAddress.emailAddress) &&
        Objects.equals(this.from, emailSMSAddress.from) &&
        Objects.equals(this.subaccountId, emailSMSAddress.subaccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, from, subaccountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSMSAddress {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    subaccountId: ").append(toIndentedString(subaccountId)).append("\n");
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

