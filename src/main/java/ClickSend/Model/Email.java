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
import ClickSend.Model.Attachment;
import ClickSend.Model.EmailFrom;
import ClickSend.Model.EmailRecipient;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.clicksend.annotations.ApiModel;
import io.clicksend.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Send Email
 */
@ApiModel(description = "Send Email")
@javax.annotation.Generated(value = "io.clicksend.codegen.languages.JavaClientCodegen", date = "2018-11-06T06:59:28.515Z")

public class Email {
  @SerializedName("to")
  private List<EmailRecipient> to = new ArrayList<EmailRecipient>();

  @SerializedName("cc")
  private List<EmailRecipient> cc = null;

  @SerializedName("bcc")
  private List<EmailRecipient> bcc = null;

  @SerializedName("from")
  private List<EmailFrom> from = new ArrayList<EmailFrom>();

  @SerializedName("body")
  private String body = null;

  @SerializedName("attachments")
  private List<Attachment> attachments = null;

  @SerializedName("schedule")
  private BigDecimal schedule = null;

  public Email() {
    this.classType = this.getClass().getSimpleName();
  }
  public Email to(List<EmailRecipient> to) {
    this.to = to;
    return this;
  }

  public Email addToItem(EmailRecipient toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Array of To Recipient items.
   * @return to
  **/
  @ApiModelProperty(required = true, value = "Array of To Recipient items.")
  public List<EmailRecipient> getTo() {
    return to;
  }

  public void setTo(List<EmailRecipient> to) {
    this.to = to;
  }

  public Email cc(List<EmailRecipient> cc) {
    this.cc = cc;
    return this;
  }

  public Email addCcItem(EmailRecipient ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<EmailRecipient>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Array of Cc Recipient items.
   * @return cc
  **/
  @ApiModelProperty(value = "Array of Cc Recipient items.")
  public List<EmailRecipient> getCc() {
    return cc;
  }

  public void setCc(List<EmailRecipient> cc) {
    this.cc = cc;
  }

  public Email bcc(List<EmailRecipient> bcc) {
    this.bcc = bcc;
    return this;
  }

  public Email addBccItem(EmailRecipient bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<EmailRecipient>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Array of Bcc Recipient items.
   * @return bcc
  **/
  @ApiModelProperty(value = "Array of Bcc Recipient items.")
  public List<EmailRecipient> getBcc() {
    return bcc;
  }

  public void setBcc(List<EmailRecipient> bcc) {
    this.bcc = bcc;
  }

  public Email from(List<EmailFrom> from) {
    this.from = from;
    return this;
  }

  public Email addFromItem(EmailFrom fromItem) {
    this.from.add(fromItem);
    return this;
  }

   /**
   * From Email object.
   * @return from
  **/
  @ApiModelProperty(required = true, value = "From Email object.")
  public List<EmailFrom> getFrom() {
    return from;
  }

  public void setFrom(List<EmailFrom> from) {
    this.from = from;
  }

  public Email body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Body of the email.
   * @return body
  **/
  @ApiModelProperty(required = true, value = "Body of the email.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Email attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Email addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Array of Attachment items.
   * @return attachments
  **/
  @ApiModelProperty(value = "Array of Attachment items.")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public Email schedule(BigDecimal schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Schedule.
   * @return schedule
  **/
  @ApiModelProperty(value = "Schedule.")
  public BigDecimal getSchedule() {
    return schedule;
  }

  public void setSchedule(BigDecimal schedule) {
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
    Email email = (Email) o;
    return Objects.equals(this.to, email.to) &&
        Objects.equals(this.cc, email.cc) &&
        Objects.equals(this.bcc, email.bcc) &&
        Objects.equals(this.from, email.from) &&
        Objects.equals(this.body, email.body) &&
        Objects.equals(this.attachments, email.attachments) &&
        Objects.equals(this.schedule, email.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, cc, bcc, from, body, attachments, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

