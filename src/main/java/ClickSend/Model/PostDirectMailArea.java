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

/**
 * PostDirectMailArea model
 */
@ApiModel(description = "PostDirectMailArea model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T03:08:18.225Z")

public class PostDirectMailArea {
  @SerializedName("location_id")
  private Integer locationId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public PostDirectMailArea() {
    this.classType = this.getClass().getSimpleName();
  }
  public PostDirectMailArea locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Location ID to send to
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "Location ID to send to")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public PostDirectMailArea quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of items to send
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Number of items to send")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostDirectMailArea postDirectMailArea = (PostDirectMailArea) o;
    return Objects.equals(this.locationId, postDirectMailArea.locationId) &&
        Objects.equals(this.quantity, postDirectMailArea.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDirectMailArea {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

