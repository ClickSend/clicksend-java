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
import ClickSend.Model.PostRecipient;
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
 * PostLetter model
 */
@ApiModel(description = "PostLetter model")
@javax.annotation.Generated(value = "io.clicksend.codegen.languages.JavaClientCodegen", date = "2018-11-06T06:59:28.515Z")

public class PostLetter {
  @SerializedName("file_url")
  private String fileUrl = null;

  @SerializedName("recipients")
  private List<PostRecipient> recipients = new ArrayList<PostRecipient>();

  @SerializedName("template_used")
  private Integer templateUsed = 0;

  @SerializedName("duplex")
  private Integer duplex = 0;

  @SerializedName("colour")
  private Integer colour = 0;

  @SerializedName("source")
  private String source = "sdk";

  public PostLetter() {
    this.classType = this.getClass().getSimpleName();
  }
  public PostLetter fileUrl(String fileUrl) {
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

  public PostLetter recipients(List<PostRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public PostLetter addRecipientsItem(PostRecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Array of PostRecipient models
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Array of PostRecipient models")
  public List<PostRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<PostRecipient> recipients) {
    this.recipients = recipients;
  }

  public PostLetter templateUsed(Integer templateUsed) {
    this.templateUsed = templateUsed;
    return this;
  }

   /**
   * Whether using our template
   * @return templateUsed
  **/
  @ApiModelProperty(example = "0", value = "Whether using our template")
  public Integer getTemplateUsed() {
    return templateUsed;
  }

  public void setTemplateUsed(Integer templateUsed) {
    this.templateUsed = templateUsed;
  }

  public PostLetter duplex(Integer duplex) {
    this.duplex = duplex;
    return this;
  }

   /**
   * Whether letter is duplex
   * @return duplex
  **/
  @ApiModelProperty(example = "0", value = "Whether letter is duplex")
  public Integer getDuplex() {
    return duplex;
  }

  public void setDuplex(Integer duplex) {
    this.duplex = duplex;
  }

  public PostLetter colour(Integer colour) {
    this.colour = colour;
    return this;
  }

   /**
   * Whether letter is in colour
   * @return colour
  **/
  @ApiModelProperty(example = "0", value = "Whether letter is in colour")
  public Integer getColour() {
    return colour;
  }

  public void setColour(Integer colour) {
    this.colour = colour;
  }

  public PostLetter source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source being sent from
   * @return source
  **/
  @ApiModelProperty(example = "sdk", value = "Source being sent from")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostLetter postLetter = (PostLetter) o;
    return Objects.equals(this.fileUrl, postLetter.fileUrl) &&
        Objects.equals(this.recipients, postLetter.recipients) &&
        Objects.equals(this.templateUsed, postLetter.templateUsed) &&
        Objects.equals(this.duplex, postLetter.duplex) &&
        Objects.equals(this.colour, postLetter.colour) &&
        Objects.equals(this.source, postLetter.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileUrl, recipients, templateUsed, duplex, colour, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostLetter {\n");
    
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    templateUsed: ").append(toIndentedString(templateUsed)).append("\n");
    sb.append("    duplex: ").append(toIndentedString(duplex)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

