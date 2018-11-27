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
 * Model for a Delivery Receipt
 */
@ApiModel(description = "Model for a Delivery Receipt")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-27T06:45:24.430Z")

public class DeliveryReceiptRule {
  @SerializedName("rule_name")
  private String ruleName = null;

  @SerializedName("match_type")
  private BigDecimal matchType = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("action_address")
  private String actionAddress = null;

  @SerializedName("enabled")
  private BigDecimal enabled = null;

  public DeliveryReceiptRule() {
    this.classType = this.getClass().getSimpleName();
  }
  public DeliveryReceiptRule ruleName(String ruleName) {
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

  public DeliveryReceiptRule matchType(BigDecimal matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Match Type. 0&#x3D;All reports.
   * @return matchType
  **/
  @ApiModelProperty(required = true, value = "Match Type. 0=All reports.")
  public BigDecimal getMatchType() {
    return matchType;
  }

  public void setMatchType(BigDecimal matchType) {
    this.matchType = matchType;
  }

  public DeliveryReceiptRule action(String action) {
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

  public DeliveryReceiptRule actionAddress(String actionAddress) {
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

  public DeliveryReceiptRule enabled(BigDecimal enabled) {
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
    DeliveryReceiptRule deliveryReceiptRule = (DeliveryReceiptRule) o;
    return Objects.equals(this.ruleName, deliveryReceiptRule.ruleName) &&
        Objects.equals(this.matchType, deliveryReceiptRule.matchType) &&
        Objects.equals(this.action, deliveryReceiptRule.action) &&
        Objects.equals(this.actionAddress, deliveryReceiptRule.actionAddress) &&
        Objects.equals(this.enabled, deliveryReceiptRule.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleName, matchType, action, actionAddress, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryReceiptRule {\n");
    
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

