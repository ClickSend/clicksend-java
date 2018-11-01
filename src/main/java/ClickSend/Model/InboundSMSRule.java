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
import java.math.BigDecimal;

/**
 * Model for Inbound SMS Rules
 */
@ApiModel(description = "Model for Inbound SMS Rules")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T03:53:13.462Z")

public class InboundSMSRule {
  @SerializedName("dedicated_number")
  private String dedicatedNumber = null;

  @SerializedName("rule_name")
  private String ruleName = null;

  @SerializedName("message_search_type")
  private BigDecimal messageSearchType = null;

  @SerializedName("message_search_term")
  private String messageSearchTerm = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("action_address")
  private String actionAddress = null;

  @SerializedName("enabled")
  private BigDecimal enabled = null;

  public InboundSMSRule() {
    this.classType = this.getClass().getSimpleName();
  }
  public InboundSMSRule dedicatedNumber(String dedicatedNumber) {
    this.dedicatedNumber = dedicatedNumber;
    return this;
  }

   /**
   * Dedicated Number. Can be &#39;*&#39; to apply to all numbers.
   * @return dedicatedNumber
  **/
  @ApiModelProperty(required = true, value = "Dedicated Number. Can be '*' to apply to all numbers.")
  public String getDedicatedNumber() {
    return dedicatedNumber;
  }

  public void setDedicatedNumber(String dedicatedNumber) {
    this.dedicatedNumber = dedicatedNumber;
  }

  public InboundSMSRule ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Rule Name.
   * @return ruleName
  **/
  @ApiModelProperty(required = true, value = "Rule Name.")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public InboundSMSRule messageSearchType(BigDecimal messageSearchType) {
    this.messageSearchType = messageSearchType;
    return this;
  }

   /**
   * Message Search Type: 0&#x3D;Any message, 1&#x3D;starts with, 2&#x3D;contains, 3&#x3D;does not contain.
   * @return messageSearchType
  **/
  @ApiModelProperty(required = true, value = "Message Search Type: 0=Any message, 1=starts with, 2=contains, 3=does not contain.")
  public BigDecimal getMessageSearchType() {
    return messageSearchType;
  }

  public void setMessageSearchType(BigDecimal messageSearchType) {
    this.messageSearchType = messageSearchType;
  }

  public InboundSMSRule messageSearchTerm(String messageSearchTerm) {
    this.messageSearchTerm = messageSearchTerm;
    return this;
  }

   /**
   * Message search term.
   * @return messageSearchTerm
  **/
  @ApiModelProperty(required = true, value = "Message search term.")
  public String getMessageSearchTerm() {
    return messageSearchTerm;
  }

  public void setMessageSearchTerm(String messageSearchTerm) {
    this.messageSearchTerm = messageSearchTerm;
  }

  public InboundSMSRule action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action to be taken (AUTO_REPLY, EMAIL_USER, EMAIL_FIXED, URL, SMS, POLL, GROUP_SMS, MOVE_CONTACT, CREATE_CONTACT, CREATE_CONTACT_PLUS_EMAIL, CREATE_CONTACT_PLUS_NAME_EMAIL CREATE_CONTACT_PLUS_NAME, SMPP, NONE).
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action to be taken (AUTO_REPLY, EMAIL_USER, EMAIL_FIXED, URL, SMS, POLL, GROUP_SMS, MOVE_CONTACT, CREATE_CONTACT, CREATE_CONTACT_PLUS_EMAIL, CREATE_CONTACT_PLUS_NAME_EMAIL CREATE_CONTACT_PLUS_NAME, SMPP, NONE).")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public InboundSMSRule actionAddress(String actionAddress) {
    this.actionAddress = actionAddress;
    return this;
  }

   /**
   * Action address.
   * @return actionAddress
  **/
  @ApiModelProperty(required = true, value = "Action address.")
  public String getActionAddress() {
    return actionAddress;
  }

  public void setActionAddress(String actionAddress) {
    this.actionAddress = actionAddress;
  }

  public InboundSMSRule enabled(BigDecimal enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled: Disabled&#x3D;0 or Enabled&#x3D;1.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Enabled: Disabled=0 or Enabled=1.")
  public BigDecimal getEnabled() {
    return enabled;
  }

  public void setEnabled(BigDecimal enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundSMSRule inboundSMSRule = (InboundSMSRule) o;
    return Objects.equals(this.dedicatedNumber, inboundSMSRule.dedicatedNumber) &&
        Objects.equals(this.ruleName, inboundSMSRule.ruleName) &&
        Objects.equals(this.messageSearchType, inboundSMSRule.messageSearchType) &&
        Objects.equals(this.messageSearchTerm, inboundSMSRule.messageSearchTerm) &&
        Objects.equals(this.action, inboundSMSRule.action) &&
        Objects.equals(this.actionAddress, inboundSMSRule.actionAddress) &&
        Objects.equals(this.enabled, inboundSMSRule.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedicatedNumber, ruleName, messageSearchType, messageSearchTerm, action, actionAddress, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundSMSRule {\n");
    
    sb.append("    dedicatedNumber: ").append(toIndentedString(dedicatedNumber)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    messageSearchType: ").append(toIndentedString(messageSearchType)).append("\n");
    sb.append("    messageSearchTerm: ").append(toIndentedString(messageSearchTerm)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionAddress: ").append(toIndentedString(actionAddress)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

