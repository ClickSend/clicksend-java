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
 * Base model for Fax Messages
 */
@ApiModel(description = "Base model for Fax Messages")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T01:31:16.694Z")

public class FaxMessage {
  @SerializedName("source")
  private String source = "sdk";

  @SerializedName("to")
  private String to = null;

  @SerializedName("list_id")
  private Integer listId = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("schedule")
  private Integer schedule = null;

  @SerializedName("custom_string")
  private String customString = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("from_email")
  private String fromEmail = null;

  public FaxMessage() {
    //this.classType = this.getClass().getSimpleName();
  }
  public FaxMessage source(String source) {
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

  public FaxMessage to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Recipient fax number in E.164 format.
   * @return to
  **/
  @ApiModelProperty(required = true, value = "Recipient fax number in E.164 format.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public FaxMessage listId(Integer listId) {
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

  public FaxMessage from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Your sender id. Must be a valid fax number.
   * @return from
  **/
  @ApiModelProperty(value = "Your sender id. Must be a valid fax number.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public FaxMessage schedule(Integer schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp
   * @return schedule
  **/
  @ApiModelProperty(value = "Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp")
  public Integer getSchedule() {
    return schedule;
  }

  public void setSchedule(Integer schedule) {
    this.schedule = schedule;
  }

  public FaxMessage customString(String customString) {
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

  public FaxMessage country(String country) {
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

  public FaxMessage fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * An email address where the reply should be emailed to.
   * @return fromEmail
  **/
  @ApiModelProperty(value = "An email address where the reply should be emailed to.")
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
    FaxMessage faxMessage = (FaxMessage) o;
    return Objects.equals(this.source, faxMessage.source) &&
        Objects.equals(this.to, faxMessage.to) &&
        Objects.equals(this.listId, faxMessage.listId) &&
        Objects.equals(this.from, faxMessage.from) &&
        Objects.equals(this.schedule, faxMessage.schedule) &&
        Objects.equals(this.customString, faxMessage.customString) &&
        Objects.equals(this.country, faxMessage.country) &&
        Objects.equals(this.fromEmail, faxMessage.fromEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, to, listId, from, schedule, customString, country, fromEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxMessage {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    customString: ").append(toIndentedString(customString)).append("\n");
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

