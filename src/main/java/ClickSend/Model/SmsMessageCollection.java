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
import ClickSend.Model.SmsMessage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Array of SmsMessage items
 */
@ApiModel(description = "Array of SmsMessage items")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-26T02:31:20.144Z")

public class SmsMessageCollection {
  @SerializedName("messages")
  private List<SmsMessage> messages = new ArrayList<SmsMessage>();

  public SmsMessageCollection() {
    //this.classType = this.getClass().getSimpleName();
  }
  public SmsMessageCollection messages(List<SmsMessage> messages) {
    this.messages = messages;
    return this;
  }

  public SmsMessageCollection addMessagesItem(SmsMessage messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Array of SmsMessage items
   * @return messages
  **/
  @ApiModelProperty(required = true, value = "Array of SmsMessage items")
  public List<SmsMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<SmsMessage> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsMessageCollection smsMessageCollection = (SmsMessageCollection) o;
    return Objects.equals(this.messages, smsMessageCollection.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsMessageCollection {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

