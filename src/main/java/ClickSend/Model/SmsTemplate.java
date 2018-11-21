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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.clicksend.annotations.ApiModel;
import io.clicksend.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SmsTemplate model
 */
@ApiModel(description = "SmsTemplate model")
@javax.annotation.Generated(value = "io.clicksend.codegen.languages.JavaClientCodegen", date = "2018-11-21T07:23:33.062Z")

public class SmsTemplate {
  @SerializedName("template_name")
  private String templateName = null;

  @SerializedName("body")
  private String body = null;

  public SmsTemplate() {
    this.classType = this.getClass().getSimpleName();
  }
  public SmsTemplate templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Name of template
   * @return templateName
  **/
  @ApiModelProperty(required = true, value = "Name of template")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public SmsTemplate body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Body of template
   * @return body
  **/
  @ApiModelProperty(required = true, value = "Body of template")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsTemplate smsTemplate = (SmsTemplate) o;
    return Objects.equals(this.templateName, smsTemplate.templateName) &&
        Objects.equals(this.body, smsTemplate.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsTemplate {\n");
    
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

