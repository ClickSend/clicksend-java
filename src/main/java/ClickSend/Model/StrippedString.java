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
 * String to be stripped.
 */
@ApiModel(description = "String to be stripped.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-06T01:13:58.303Z")

public class StrippedString {
  @SerializedName("strip_string")
  private String stripString = null;

  public StrippedString() {
    //this.classType = this.getClass().getSimpleName();
  }
  public StrippedString stripString(String stripString) {
    this.stripString = stripString;
    return this;
  }

   /**
   * String to be.
   * @return stripString
  **/
  @ApiModelProperty(required = true, value = "String to be.")
  public String getStripString() {
    return stripString;
  }

  public void setStripString(String stripString) {
    this.stripString = stripString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrippedString strippedString = (StrippedString) o;
    return Objects.equals(this.stripString, strippedString.stripString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedString {\n");
    
    sb.append("    stripString: ").append(toIndentedString(stripString)).append("\n");
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

