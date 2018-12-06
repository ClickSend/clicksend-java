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
 * Model for Email Templates
 */
@ApiModel(description = "Model for Email Templates")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-06T01:35:36.432Z")

public class EmailTemplateNew {
  @SerializedName("template_name")
  private String templateName = null;

  @SerializedName("template_id_master")
  private BigDecimal templateIdMaster = null;

  public EmailTemplateNew() {
    //this.classType = this.getClass().getSimpleName();
  }
  public EmailTemplateNew templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * The intended name for the new template.
   * @return templateName
  **/
  @ApiModelProperty(required = true, value = "The intended name for the new template.")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public EmailTemplateNew templateIdMaster(BigDecimal templateIdMaster) {
    this.templateIdMaster = templateIdMaster;
    return this;
  }

   /**
   * The ID of the master template you want to base on.
   * @return templateIdMaster
  **/
  @ApiModelProperty(required = true, value = "The ID of the master template you want to base on.")
  public BigDecimal getTemplateIdMaster() {
    return templateIdMaster;
  }

  public void setTemplateIdMaster(BigDecimal templateIdMaster) {
    this.templateIdMaster = templateIdMaster;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailTemplateNew emailTemplateNew = (EmailTemplateNew) o;
    return Objects.equals(this.templateName, emailTemplateNew.templateName) &&
        Objects.equals(this.templateIdMaster, emailTemplateNew.templateIdMaster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, templateIdMaster);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailTemplateNew {\n");
    
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    templateIdMaster: ").append(toIndentedString(templateIdMaster)).append("\n");
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

