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
 * Recipient of an email, either To, Cc, or Bcc.
 */
@ApiModel(description = "Recipient of an email, either To, Cc, or Bcc.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T03:08:18.225Z")

public class EmailRecipient {
  @SerializedName("email")
  private String email = null;

  @SerializedName("name")
  private String name = null;

  public EmailRecipient() {
    this.classType = this.getClass().getSimpleName();
  }
  public EmailRecipient email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the recipient.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email of the recipient.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EmailRecipient name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the recipient.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the recipient.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailRecipient emailRecipient = (EmailRecipient) o;
    return Objects.equals(this.email, emailRecipient.email) &&
        Objects.equals(this.name, emailRecipient.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRecipient {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

