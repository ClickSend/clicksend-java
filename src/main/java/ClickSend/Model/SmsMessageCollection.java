/*
 * ClickSend v3 REST API
 *  This is the official [ClickSend](https://clicksend.com) SDK.  *You'll need to create a free account to use the API. You can register [here](https://www.clicksend.com/signup).*  You can use our API documentation along with the SDK. Our API docs can be found [here](https://developers.clicksend.com). 
 *
 * OpenAPI spec version: 3.1.0
 * Contact: support@clicksend.com
 *
 * NOTE: This class is auto generated by the clicksend code generator program.
 * https://github.com/clicksend-api/clicksend-codegen.git
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
import io.clicksend.annotations.ApiModel;
import io.clicksend.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Array of SmsMessage items
 */
@ApiModel(description = "Array of SmsMessage items")
@javax.annotation.Generated(value = "io.clicksend.codegen.languages.JavaClientCodegen", date = "2018-11-22T06:20:26.951Z")

public class SmsMessageCollection {
  @SerializedName("messages")
  private List<SmsMessage> messages = new ArrayList<SmsMessage>();

  public SmsMessageCollection() {
    this.classType = this.getClass().getSimpleName();
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

