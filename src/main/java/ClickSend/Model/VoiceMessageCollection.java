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
import ClickSend.Model.VoiceMessage;
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
 * Array of VoiceMessage items
 */
@ApiModel(description = "Array of VoiceMessage items")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-06T04:34:11.497Z")

public class VoiceMessageCollection {
  @SerializedName("messages")
  private List<VoiceMessage> messages = new ArrayList<VoiceMessage>();

  public VoiceMessageCollection() {
    //this.classType = this.getClass().getSimpleName();
  }
  public VoiceMessageCollection messages(List<VoiceMessage> messages) {
    this.messages = messages;
    return this;
  }

  public VoiceMessageCollection addMessagesItem(VoiceMessage messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Array of VoiceMessage items
   * @return messages
  **/
  @ApiModelProperty(required = true, value = "Array of VoiceMessage items")
  public List<VoiceMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<VoiceMessage> messages) {
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
    VoiceMessageCollection voiceMessageCollection = (VoiceMessageCollection) o;
    return Objects.equals(this.messages, voiceMessageCollection.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceMessageCollection {\n");
    
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

