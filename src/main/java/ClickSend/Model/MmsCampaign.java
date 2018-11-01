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
 * Campaign Model for MMS
 */
@ApiModel(description = "Campaign Model for MMS")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T04:49:32.610Z")

public class MmsCampaign {
  @SerializedName("list_id")
  private Integer listId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("schedule")
  private Integer schedule = 0;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("media_file")
  private String mediaFile = null;

  public MmsCampaign() {
    this.classType = this.getClass().getSimpleName();
  }
  public MmsCampaign listId(Integer listId) {
    this.listId = listId;
    return this;
  }

   /**
   * Your list id.
   * @return listId
  **/
  @ApiModelProperty(required = true, value = "Your list id.")
  public Integer getListId() {
    return listId;
  }

  public void setListId(Integer listId) {
    this.listId = listId;
  }

  public MmsCampaign name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Your campaign name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Your campaign name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MmsCampaign body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Your campaign message.
   * @return body
  **/
  @ApiModelProperty(required = true, value = "Your campaign message.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public MmsCampaign from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Your sender id - more info: http://help.clicksend.com/SMS/what-is-a-sender-id-or-sender-number.
   * @return from
  **/
  @ApiModelProperty(value = "Your sender id - more info: http://help.clicksend.com/SMS/what-is-a-sender-id-or-sender-number.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public MmsCampaign schedule(Integer schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Your schedule timestamp.
   * @return schedule
  **/
  @ApiModelProperty(example = "0", value = "Your schedule timestamp.")
  public Integer getSchedule() {
    return schedule;
  }

  public void setSchedule(Integer schedule) {
    this.schedule = schedule;
  }

  public MmsCampaign subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of MMS campaign.
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "Subject of MMS campaign.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MmsCampaign mediaFile(String mediaFile) {
    this.mediaFile = mediaFile;
    return this;
  }

   /**
   * URL pointing to media file.
   * @return mediaFile
  **/
  @ApiModelProperty(required = true, value = "URL pointing to media file.")
  public String getMediaFile() {
    return mediaFile;
  }

  public void setMediaFile(String mediaFile) {
    this.mediaFile = mediaFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MmsCampaign mmsCampaign = (MmsCampaign) o;
    return Objects.equals(this.listId, mmsCampaign.listId) &&
        Objects.equals(this.name, mmsCampaign.name) &&
        Objects.equals(this.body, mmsCampaign.body) &&
        Objects.equals(this.from, mmsCampaign.from) &&
        Objects.equals(this.schedule, mmsCampaign.schedule) &&
        Objects.equals(this.subject, mmsCampaign.subject) &&
        Objects.equals(this.mediaFile, mmsCampaign.mediaFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, name, body, from, schedule, subject, mediaFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MmsCampaign {\n");
    
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    mediaFile: ").append(toIndentedString(mediaFile)).append("\n");
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

