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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Single MMS message model
 */
@ApiModel(description = "Single MMS message model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-10T02:36:40.162Z")

public class MmsMessage {
  @SerializedName("to")
  private String to = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("source")
  private String source = "sdk";

  @SerializedName("list_id")
  private Integer listId = null;

  @SerializedName("schedule")
  private Integer schedule = 0;

  @SerializedName("custom_string")
  private String customString = null;

  @SerializedName("from_email")
  private String fromEmail = null;

  public MmsMessage() {
    //this.classType = this.getClass().getSimpleName();
  }
  public MmsMessage to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Recipient phone number in E.164 format
   * @return to
  **/
  @ApiModelProperty(example = "69505609", value = "Recipient phone number in E.164 format")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public MmsMessage body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Your message
   * @return body
  **/
  @ApiModelProperty(required = true, value = "Your message")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public MmsMessage subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject line (max 20 characters)
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "Subject line (max 20 characters)")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MmsMessage from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Your sender ID
   * @return from
  **/
  @ApiModelProperty(value = "Your sender ID")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public MmsMessage country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Recipient country
   * @return country
  **/
  @ApiModelProperty(value = "Recipient country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public MmsMessage source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Your method of sending
   * @return source
  **/
  @ApiModelProperty(example = "sdk", value = "Your method of sending")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public MmsMessage listId(Integer listId) {
    this.listId = listId;
    return this;
  }

   /**
   * Your list ID if sending to a whole list (can be used instead of &#39;to&#39;)
   * @return listId
  **/
  @ApiModelProperty(value = "Your list ID if sending to a whole list (can be used instead of 'to')")
  public Integer getListId() {
    return listId;
  }

  public void setListId(Integer listId) {
    this.listId = listId;
  }

  public MmsMessage schedule(Integer schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Schedule time in unix format (leave blank for immediate delivery)
   * @return schedule
  **/
  @ApiModelProperty(example = "0", value = "Schedule time in unix format (leave blank for immediate delivery)")
  public Integer getSchedule() {
    return schedule;
  }

  public void setSchedule(Integer schedule) {
    this.schedule = schedule;
  }

  public MmsMessage customString(String customString) {
    this.customString = customString;
    return this;
  }

   /**
   * Custom string for your reference
   * @return customString
  **/
  @ApiModelProperty(value = "Custom string for your reference")
  public String getCustomString() {
    return customString;
  }

  public void setCustomString(String customString) {
    this.customString = customString;
  }

  public MmsMessage fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * Email to send replies to
   * @return fromEmail
  **/
  @ApiModelProperty(value = "Email to send replies to")
  public String getFromEmail() {
    return fromEmail;
  }

  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MmsMessage mmsMessage = (MmsMessage) o;
    return Objects.equals(this.to, mmsMessage.to) &&
        Objects.equals(this.body, mmsMessage.body) &&
        Objects.equals(this.subject, mmsMessage.subject) &&
        Objects.equals(this.from, mmsMessage.from) &&
        Objects.equals(this.country, mmsMessage.country) &&
        Objects.equals(this.source, mmsMessage.source) &&
        Objects.equals(this.listId, mmsMessage.listId) &&
        Objects.equals(this.schedule, mmsMessage.schedule) &&
        Objects.equals(this.customString, mmsMessage.customString) &&
        Objects.equals(this.fromEmail, mmsMessage.fromEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, body, subject, from, country, source, listId, schedule, customString, fromEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MmsMessage {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    customString: ").append(toIndentedString(customString)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
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

