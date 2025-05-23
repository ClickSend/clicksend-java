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
 * Model for Email Templates
 */
@ApiModel(description = "Model for Email Templates")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-19T03:45:39.779Z")

public class EmailTemplateUpdate {
  @SerializedName("template_name")
  private String templateName = null;

  @SerializedName("body")
  private String body = null;

  public EmailTemplateUpdate() {
    //this.classType = this.getClass().getSimpleName();
  }
  public EmailTemplateUpdate templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * The intended name for the template.
   * @return templateName
  **/
  @ApiModelProperty(value = "The intended name for the template.")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public EmailTemplateUpdate body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Your template body.
   * @return body
  **/
  @ApiModelProperty(required = true, value = "Your template body.")
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
    EmailTemplateUpdate emailTemplateUpdate = (EmailTemplateUpdate) o;
    return Objects.equals(this.templateName, emailTemplateUpdate.templateName) &&
        Objects.equals(this.body, emailTemplateUpdate.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailTemplateUpdate {\n");
    
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

