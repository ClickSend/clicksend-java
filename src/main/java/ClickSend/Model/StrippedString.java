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
 * String to be stripped.
 */
@ApiModel(description = "String to be stripped.")
@javax.annotation.Generated(value = "io.clicksend.codegen.languages.JavaClientCodegen", date = "2018-11-26T02:01:45.635Z")

public class StrippedString {
  @SerializedName("strip_string")
  private String stripString = null;

  public StrippedString() {
    this.classType = this.getClass().getSimpleName();
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

