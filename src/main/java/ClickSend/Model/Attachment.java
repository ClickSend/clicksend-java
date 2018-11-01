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
 * Email attachment
 */
@ApiModel(description = "Email attachment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T04:49:32.610Z")

public class Attachment {
  @SerializedName("content")
  private String content = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("disposition")
  private String disposition = null;

  @SerializedName("content_id")
  private String contentId = null;

  public Attachment() {
    this.classType = this.getClass().getSimpleName();
  }
  public Attachment content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The base64-encoded contents of the file.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The base64-encoded contents of the file.")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Attachment type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of file being attached.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of file being attached.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Attachment filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The name of the file being attached.
   * @return filename
  **/
  @ApiModelProperty(required = true, value = "The name of the file being attached.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Attachment disposition(String disposition) {
    this.disposition = disposition;
    return this;
  }

   /**
   * Inline for content that can be displayed within the email, or attachment for any other files.
   * @return disposition
  **/
  @ApiModelProperty(required = true, value = "Inline for content that can be displayed within the email, or attachment for any other files.")
  public String getDisposition() {
    return disposition;
  }

  public void setDisposition(String disposition) {
    this.disposition = disposition;
  }

  public Attachment contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * An ID for the content.
   * @return contentId
  **/
  @ApiModelProperty(required = true, value = "An ID for the content.")
  public String getContentId() {
    return contentId;
  }

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.content, attachment.content) &&
        Objects.equals(this.type, attachment.type) &&
        Objects.equals(this.filename, attachment.filename) &&
        Objects.equals(this.disposition, attachment.disposition) &&
        Objects.equals(this.contentId, attachment.contentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, type, filename, disposition, contentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    disposition: ").append(toIndentedString(disposition)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
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

