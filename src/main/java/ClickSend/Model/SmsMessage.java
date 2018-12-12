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
 * SmsMessage model
 */
@ApiModel(description = "SmsMessage model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-12T01:14:14.552Z")

public class SmsMessage {
  @SerializedName("from")
  private String from = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("source")
  private String source = "sdk";

  @SerializedName("schedule")
  private Integer schedule = 0;

  @SerializedName("custom_string")
  private String customString = null;

  @SerializedName("list_id")
  private Integer listId = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("from_email")
  private String fromEmail = null;

  public SmsMessage() {
    //this.classType = this.getClass().getSimpleName();
  }
  public SmsMessage from(String from) {
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

  public SmsMessage body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Your message.
   * @return body
  **/
  @ApiModelProperty(required = true, value = "Your message.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public SmsMessage to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Recipient phone number in E.164 format.
   * @return to
  **/
  @ApiModelProperty(example = "69505609", required = true, value = "Recipient phone number in E.164 format.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public SmsMessage source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Your method of sending e.g. &#39;wordpress&#39;, &#39;php&#39;, &#39;c#&#39;.
   * @return source
  **/
  @ApiModelProperty(example = "sdk", value = "Your method of sending e.g. 'wordpress', 'php', 'c#'.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public SmsMessage schedule(Integer schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp
   * @return schedule
  **/
  @ApiModelProperty(example = "0", value = "Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp")
  public Integer getSchedule() {
    return schedule;
  }

  public void setSchedule(Integer schedule) {
    this.schedule = schedule;
  }

  public SmsMessage customString(String customString) {
    this.customString = customString;
    return this;
  }

   /**
   * Your reference. Will be passed back with all replies and delivery reports.
   * @return customString
  **/
  @ApiModelProperty(value = "Your reference. Will be passed back with all replies and delivery reports.")
  public String getCustomString() {
    return customString;
  }

  public void setCustomString(String customString) {
    this.customString = customString;
  }

  public SmsMessage listId(Integer listId) {
    this.listId = listId;
    return this;
  }

   /**
   * Your list ID if sending to a whole list. Can be used instead of &#39;to&#39;.
   * @return listId
  **/
  @ApiModelProperty(value = "Your list ID if sending to a whole list. Can be used instead of 'to'.")
  public Integer getListId() {
    return listId;
  }

  public void setListId(Integer listId) {
    this.listId = listId;
  }

  public SmsMessage country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Recipient country.
   * @return country
  **/
  @ApiModelProperty(value = "Recipient country.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SmsMessage fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * An email address where the reply should be emailed to. If omitted, the reply will be emailed back to the user who sent the outgoing SMS.
   * @return fromEmail
  **/
  @ApiModelProperty(value = "An email address where the reply should be emailed to. If omitted, the reply will be emailed back to the user who sent the outgoing SMS.")
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
    SmsMessage smsMessage = (SmsMessage) o;
    return Objects.equals(this.from, smsMessage.from) &&
        Objects.equals(this.body, smsMessage.body) &&
        Objects.equals(this.to, smsMessage.to) &&
        Objects.equals(this.source, smsMessage.source) &&
        Objects.equals(this.schedule, smsMessage.schedule) &&
        Objects.equals(this.customString, smsMessage.customString) &&
        Objects.equals(this.listId, smsMessage.listId) &&
        Objects.equals(this.country, smsMessage.country) &&
        Objects.equals(this.fromEmail, smsMessage.fromEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, body, to, source, schedule, customString, listId, country, fromEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsMessage {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    customString: ").append(toIndentedString(customString)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

