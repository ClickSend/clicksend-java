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
import ClickSend.Model.PostRecipient;
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
 * PostPostcard model
 */
@ApiModel(description = "PostPostcard model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-30T02:35:43.252Z")

public class PostPostcard {
  @SerializedName("file_urls")
  private List<String> fileUrls = new ArrayList<String>();

  @SerializedName("recipients")
  private List<PostRecipient> recipients = new ArrayList<PostRecipient>();

  public PostPostcard() {
    //this.classType = this.getClass().getSimpleName();
  }
  public PostPostcard fileUrls(List<String> fileUrls) {
    this.fileUrls = fileUrls;
    return this;
  }

  public PostPostcard addFileUrlsItem(String fileUrlsItem) {
    this.fileUrls.add(fileUrlsItem);
    return this;
  }

   /**
   * Postcard file URLs
   * @return fileUrls
  **/
  @ApiModelProperty(required = true, value = "Postcard file URLs")
  public List<String> getFileUrls() {
    return fileUrls;
  }

  public void setFileUrls(List<String> fileUrls) {
    this.fileUrls = fileUrls;
  }

  public PostPostcard recipients(List<PostRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public PostPostcard addRecipientsItem(PostRecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Array of recipients
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Array of recipients")
  public List<PostRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<PostRecipient> recipients) {
    this.recipients = recipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPostcard postPostcard = (PostPostcard) o;
    return Objects.equals(this.fileUrls, postPostcard.fileUrls) &&
        Objects.equals(this.recipients, postPostcard.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileUrls, recipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPostcard {\n");
    
    sb.append("    fileUrls: ").append(toIndentedString(fileUrls)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

