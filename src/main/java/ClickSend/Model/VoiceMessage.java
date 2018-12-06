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
 * VoiceMessage fields: source, to, list_id, body, lang, voice, schedule, custom_string, country
 */
@ApiModel(description = "VoiceMessage fields: source, to, list_id, body, lang, voice, schedule, custom_string, country")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-06T01:35:36.432Z")

public class VoiceMessage {
  @SerializedName("to")
  private String to = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("voice")
  private String voice = null;

  @SerializedName("custom_string")
  private String customString = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("source")
  private String source = "sdk";

  @SerializedName("list_id")
  private Integer listId = null;

  @SerializedName("lang")
  private String lang = null;

  @SerializedName("schedule")
  private Integer schedule = null;

  @SerializedName("require_input")
  private Integer requireInput = 0;

  @SerializedName("machine_detection")
  private Integer machineDetection = 0;

  public VoiceMessage() {
    //this.classType = this.getClass().getSimpleName();
  }
  public VoiceMessage to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Your phone number in E.164 format.
   * @return to
  **/
  @ApiModelProperty(required = true, value = "Your phone number in E.164 format.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public VoiceMessage body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Biscuit uv3nlCOjRk croissant chocolate lollipop chocolate muffin.
   * @return body
  **/
  @ApiModelProperty(required = true, value = "Biscuit uv3nlCOjRk croissant chocolate lollipop chocolate muffin.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public VoiceMessage voice(String voice) {
    this.voice = voice;
    return this;
  }

   /**
   * Either &#39;female&#39; or &#39;male&#39;.
   * @return voice
  **/
  @ApiModelProperty(required = true, value = "Either 'female' or 'male'.")
  public String getVoice() {
    return voice;
  }

  public void setVoice(String voice) {
    this.voice = voice;
  }

  public VoiceMessage customString(String customString) {
    this.customString = customString;
    return this;
  }

   /**
   * Your reference. Will be passed back with all replies and delivery reports.
   * @return customString
  **/
  @ApiModelProperty(required = true, value = "Your reference. Will be passed back with all replies and delivery reports.")
  public String getCustomString() {
    return customString;
  }

  public void setCustomString(String customString) {
    this.customString = customString;
  }

  public VoiceMessage country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country of the recipient.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The country of the recipient.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public VoiceMessage source(String source) {
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

  public VoiceMessage listId(Integer listId) {
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

  public VoiceMessage lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * au (string, required) - See section on available languages.
   * @return lang
  **/
  @ApiModelProperty(value = "au (string, required) - See section on available languages.")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public VoiceMessage schedule(Integer schedule) {
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

  public VoiceMessage requireInput(Integer requireInput) {
    this.requireInput = requireInput;
    return this;
  }

   /**
   * Whether you want to receive a keypress from the call recipient
   * @return requireInput
  **/
  @ApiModelProperty(example = "0", value = "Whether you want to receive a keypress from the call recipient")
  public Integer getRequireInput() {
    return requireInput;
  }

  public void setRequireInput(Integer requireInput) {
    this.requireInput = requireInput;
  }

  public VoiceMessage machineDetection(Integer machineDetection) {
    this.machineDetection = machineDetection;
    return this;
  }

   /**
   * Whether to attempt to detect an answering machine or voicemail service and leave a message
   * @return machineDetection
  **/
  @ApiModelProperty(example = "0", value = "Whether to attempt to detect an answering machine or voicemail service and leave a message")
  public Integer getMachineDetection() {
    return machineDetection;
  }

  public void setMachineDetection(Integer machineDetection) {
    this.machineDetection = machineDetection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoiceMessage voiceMessage = (VoiceMessage) o;
    return Objects.equals(this.to, voiceMessage.to) &&
        Objects.equals(this.body, voiceMessage.body) &&
        Objects.equals(this.voice, voiceMessage.voice) &&
        Objects.equals(this.customString, voiceMessage.customString) &&
        Objects.equals(this.country, voiceMessage.country) &&
        Objects.equals(this.source, voiceMessage.source) &&
        Objects.equals(this.listId, voiceMessage.listId) &&
        Objects.equals(this.lang, voiceMessage.lang) &&
        Objects.equals(this.schedule, voiceMessage.schedule) &&
        Objects.equals(this.requireInput, voiceMessage.requireInput) &&
        Objects.equals(this.machineDetection, voiceMessage.machineDetection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, body, voice, customString, country, source, listId, lang, schedule, requireInput, machineDetection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceMessage {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    customString: ").append(toIndentedString(customString)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    requireInput: ").append(toIndentedString(requireInput)).append("\n");
    sb.append("    machineDetection: ").append(toIndentedString(machineDetection)).append("\n");
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

