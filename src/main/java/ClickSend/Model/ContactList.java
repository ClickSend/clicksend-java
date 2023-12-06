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
 * Your contact list.
 */
@ApiModel(description = "Your contact list.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-06T00:00:20.090Z")

public class ContactList {
  @SerializedName("list_name")
  private String listName = null;

  public ContactList() {
    //this.classType = this.getClass().getSimpleName();
  }
  public ContactList listName(String listName) {
    this.listName = listName;
    return this;
  }

   /**
   * Your list name.
   * @return listName
  **/
  @ApiModelProperty(required = true, value = "Your list name.")
  public String getListName() {
    return listName;
  }

  public void setListName(String listName) {
    this.listName = listName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactList contactList = (ContactList) o;
    return Objects.equals(this.listName, contactList.listName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactList {\n");
    
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
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

