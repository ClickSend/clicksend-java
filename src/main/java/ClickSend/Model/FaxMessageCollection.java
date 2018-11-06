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
import ClickSend.Model.FaxMessage;
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
 * Array of FaxMessage items
 */
@ApiModel(description = "Array of FaxMessage items")
@javax.annotation.Generated(value = "io.clicksend.codegen.languages.JavaClientCodegen", date = "2018-11-06T05:45:35.576Z")

public class FaxMessageCollection {
  @SerializedName("messages")
  private List<FaxMessage> messages = new ArrayList<FaxMessage>();

  @SerializedName("file_url")
  private String fileUrl = null;

  public FaxMessageCollection() {
    this.classType = this.getClass().getSimpleName();
  }
  public FaxMessageCollection messages(List<FaxMessage> messages) {
    this.messages = messages;
    return this;
  }

  public FaxMessageCollection addMessagesItem(FaxMessage messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Array of FaxMessage items
   * @return messages
  **/
  @ApiModelProperty(required = true, value = "Array of FaxMessage items")
  public List<FaxMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<FaxMessage> messages) {
    this.messages = messages;
  }

  public FaxMessageCollection fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * URL of file to send
   * @return fileUrl
  **/
  @ApiModelProperty(required = true, value = "URL of file to send")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaxMessageCollection faxMessageCollection = (FaxMessageCollection) o;
    return Objects.equals(this.messages, faxMessageCollection.messages) &&
        Objects.equals(this.fileUrl, faxMessageCollection.fileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, fileUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxMessageCollection {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
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

