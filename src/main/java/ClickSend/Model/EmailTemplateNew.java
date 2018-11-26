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
import java.math.BigDecimal;

/**
 * Model for Email Templates
 */
@ApiModel(description = "Model for Email Templates")
@javax.annotation.Generated(value = "io.clicksend.codegen.languages.JavaClientCodegen", date = "2018-11-26T02:01:45.635Z")

public class EmailTemplateNew {
  @SerializedName("template_name")
  private String templateName = null;

  @SerializedName("template_id_master")
  private BigDecimal templateIdMaster = null;

  public EmailTemplateNew() {
    this.classType = this.getClass().getSimpleName();
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

