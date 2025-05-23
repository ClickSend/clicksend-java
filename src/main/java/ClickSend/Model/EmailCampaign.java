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
import java.math.BigDecimal;

/**
 * Campaign Model for Email
 */
@ApiModel(description = "Campaign Model for Email")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-19T03:45:39.779Z")

public class EmailCampaign {
  @SerializedName("name")
  private String name = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("from_email_address_id")
  private BigDecimal fromEmailAddressId = null;

  @SerializedName("from_name")
  private String fromName = null;

  @SerializedName("template_id")
  private BigDecimal templateId = null;

  @SerializedName("list_id")
  private BigDecimal listId = null;

  @SerializedName("schedule")
  private Integer schedule = 0;

  public EmailCampaign() {
    //this.classType = this.getClass().getSimpleName();
  }
  public EmailCampaign name(String name) {
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

  public EmailCampaign subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Your campaign subject.
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "Your campaign subject.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public EmailCampaign body(String body) {
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

  public EmailCampaign fromEmailAddressId(BigDecimal fromEmailAddressId) {
    this.fromEmailAddressId = fromEmailAddressId;
    return this;
  }

   /**
   * The allowed email address id.
   * @return fromEmailAddressId
  **/
  @ApiModelProperty(required = true, value = "The allowed email address id.")
  public BigDecimal getFromEmailAddressId() {
    return fromEmailAddressId;
  }

  public void setFromEmailAddressId(BigDecimal fromEmailAddressId) {
    this.fromEmailAddressId = fromEmailAddressId;
  }

  public EmailCampaign fromName(String fromName) {
    this.fromName = fromName;
    return this;
  }

   /**
   * Your name or business name.
   * @return fromName
  **/
  @ApiModelProperty(required = true, value = "Your name or business name.")
  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  public EmailCampaign templateId(BigDecimal templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Your template id.
   * @return templateId
  **/
  @ApiModelProperty(value = "Your template id.")
  public BigDecimal getTemplateId() {
    return templateId;
  }

  public void setTemplateId(BigDecimal templateId) {
    this.templateId = templateId;
  }

  public EmailCampaign listId(BigDecimal listId) {
    this.listId = listId;
    return this;
  }

   /**
   * Your contact list id.
   * @return listId
  **/
  @ApiModelProperty(required = true, value = "Your contact list id.")
  public BigDecimal getListId() {
    return listId;
  }

  public void setListId(BigDecimal listId) {
    this.listId = listId;
  }

  public EmailCampaign schedule(Integer schedule) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailCampaign emailCampaign = (EmailCampaign) o;
    return Objects.equals(this.name, emailCampaign.name) &&
        Objects.equals(this.subject, emailCampaign.subject) &&
        Objects.equals(this.body, emailCampaign.body) &&
        Objects.equals(this.fromEmailAddressId, emailCampaign.fromEmailAddressId) &&
        Objects.equals(this.fromName, emailCampaign.fromName) &&
        Objects.equals(this.templateId, emailCampaign.templateId) &&
        Objects.equals(this.listId, emailCampaign.listId) &&
        Objects.equals(this.schedule, emailCampaign.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subject, body, fromEmailAddressId, fromName, templateId, listId, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCampaign {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    fromEmailAddressId: ").append(toIndentedString(fromEmailAddressId)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

