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
import ClickSend.Model.MmsMessage;
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
 * Array of MmsMessage items
 */
@ApiModel(description = "Array of MmsMessage items")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-30T02:35:43.252Z")

public class MmsMessageCollection {
  @SerializedName("media_file")
  private String mediaFile = null;

  @SerializedName("messages")
  private List<MmsMessage> messages = new ArrayList<MmsMessage>();

  public MmsMessageCollection() {
    //this.classType = this.getClass().getSimpleName();
  }
  public MmsMessageCollection mediaFile(String mediaFile) {
    this.mediaFile = mediaFile;
    return this;
  }

   /**
   * Media file you want to send
   * @return mediaFile
  **/
  @ApiModelProperty(required = true, value = "Media file you want to send")
  public String getMediaFile() {
    return mediaFile;
  }

  public void setMediaFile(String mediaFile) {
    this.mediaFile = mediaFile;
  }

  public MmsMessageCollection messages(List<MmsMessage> messages) {
    this.messages = messages;
    return this;
  }

  public MmsMessageCollection addMessagesItem(MmsMessage messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Array of MmsMessage models
   * @return messages
  **/
  @ApiModelProperty(required = true, value = "Array of MmsMessage models")
  public List<MmsMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<MmsMessage> messages) {
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
    MmsMessageCollection mmsMessageCollection = (MmsMessageCollection) o;
    return Objects.equals(this.mediaFile, mmsMessageCollection.mediaFile) &&
        Objects.equals(this.messages, mmsMessageCollection.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaFile, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MmsMessageCollection {\n");
    
    sb.append("    mediaFile: ").append(toIndentedString(mediaFile)).append("\n");
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

