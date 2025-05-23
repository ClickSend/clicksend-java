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
import java.util.ArrayList;
import java.util.List;

/**
 * Contact list import model
 */
@ApiModel(description = "Contact list import model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-19T03:45:39.779Z")

public class ContactListImport {
  @SerializedName("file_url")
  private String fileUrl = null;

  @SerializedName("field_order")
  private List<String> fieldOrder = new ArrayList<String>();

  public ContactListImport() {
    //this.classType = this.getClass().getSimpleName();
  }
  public ContactListImport fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * URL of file to process
   * @return fileUrl
  **/
  @ApiModelProperty(required = true, value = "URL of file to process")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  public ContactListImport fieldOrder(List<String> fieldOrder) {
    this.fieldOrder = fieldOrder;
    return this;
  }

  public ContactListImport addFieldOrderItem(String fieldOrderItem) {
    this.fieldOrder.add(fieldOrderItem);
    return this;
  }

   /**
   * Order of fields in file
   * @return fieldOrder
  **/
  @ApiModelProperty(required = true, value = "Order of fields in file")
  public List<String> getFieldOrder() {
    return fieldOrder;
  }

  public void setFieldOrder(List<String> fieldOrder) {
    this.fieldOrder = fieldOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListImport contactListImport = (ContactListImport) o;
    return Objects.equals(this.fileUrl, contactListImport.fileUrl) &&
        Objects.equals(this.fieldOrder, contactListImport.fieldOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileUrl, fieldOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListImport {\n");
    
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    fieldOrder: ").append(toIndentedString(fieldOrder)).append("\n");
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

