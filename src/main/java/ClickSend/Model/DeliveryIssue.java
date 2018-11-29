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
 * Issues with message delivery
 */
@ApiModel(description = "Issues with message delivery")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-29T02:35:20.946Z")

public class DeliveryIssue {
  @SerializedName("message_id")
  private String messageId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("client_comments")
  private String clientComments = null;

  @SerializedName("email_address")
  private String emailAddress = null;

  public DeliveryIssue() {
    //this.classType = this.getClass().getSimpleName();
  }
  public DeliveryIssue messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * The message id of the message.
   * @return messageId
  **/
  @ApiModelProperty(value = "The message id of the message.")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public DeliveryIssue type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of message, must be one of the following values SMS, MMS, VOICE, EMAIL_MARKETING, EMAIL_TRANSACTIONAL, FAX, POST.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of message, must be one of the following values SMS, MMS, VOICE, EMAIL_MARKETING, EMAIL_TRANSACTIONAL, FAX, POST.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DeliveryIssue description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the message.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the message.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeliveryIssue clientComments(String clientComments) {
    this.clientComments = clientComments;
    return this;
  }

   /**
   * The user&#39;s comments.
   * @return clientComments
  **/
  @ApiModelProperty(value = "The user's comments.")
  public String getClientComments() {
    return clientComments;
  }

  public void setClientComments(String clientComments) {
    this.clientComments = clientComments;
  }

  public DeliveryIssue emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The user&#39;s email address.
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "The user's email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryIssue deliveryIssue = (DeliveryIssue) o;
    return Objects.equals(this.messageId, deliveryIssue.messageId) &&
        Objects.equals(this.type, deliveryIssue.type) &&
        Objects.equals(this.description, deliveryIssue.description) &&
        Objects.equals(this.clientComments, deliveryIssue.clientComments) &&
        Objects.equals(this.emailAddress, deliveryIssue.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, type, description, clientComments, emailAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryIssue {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    clientComments: ").append(toIndentedString(clientComments)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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

