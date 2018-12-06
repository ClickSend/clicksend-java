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
 * All dates before specified timestam.
 */
@ApiModel(description = "All dates before specified timestam.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-06T04:34:11.497Z")

public class DateBefore {
  @SerializedName("date_before")
  private BigDecimal dateBefore = null;

  public DateBefore() {
    //this.classType = this.getClass().getSimpleName();
  }
  public DateBefore dateBefore(BigDecimal dateBefore) {
    this.dateBefore = dateBefore;
    return this;
  }

   /**
   * An optional timestamp - mark all as read before this timestamp. If not given, all messages will be marked as read.
   * @return dateBefore
  **/
  @ApiModelProperty(value = "An optional timestamp - mark all as read before this timestamp. If not given, all messages will be marked as read.")
  public BigDecimal getDateBefore() {
    return dateBefore;
  }

  public void setDateBefore(BigDecimal dateBefore) {
    this.dateBefore = dateBefore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateBefore dateBefore = (DateBefore) o;
    return Objects.equals(this.dateBefore, dateBefore.dateBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateBefore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateBefore {\n");
    
    sb.append("    dateBefore: ").append(toIndentedString(dateBefore)).append("\n");
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
