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
import ClickSend.Model.PostDirectMailArea;
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
 * Post direct mail model
 */
@ApiModel(description = "Post direct mail model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T04:49:32.610Z")

public class PostDirectMail {
  @SerializedName("name")
  private String name = null;

  @SerializedName("file_urls")
  private List<String> fileUrls = new ArrayList<String>();

  @SerializedName("size")
  private String size = null;

  @SerializedName("areas")
  private List<PostDirectMailArea> areas = new ArrayList<PostDirectMailArea>();

  @SerializedName("schedule")
  private Integer schedule = 0;

  @SerializedName("source")
  private String source = "sdk";

  @SerializedName("custom_string")
  private String customString = null;

  public PostDirectMail() {
    this.classType = this.getClass().getSimpleName();
  }
  public PostDirectMail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Campaign name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Campaign name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostDirectMail fileUrls(List<String> fileUrls) {
    this.fileUrls = fileUrls;
    return this;
  }

  public PostDirectMail addFileUrlsItem(String fileUrlsItem) {
    this.fileUrls.add(fileUrlsItem);
    return this;
  }

   /**
   * Campaign file URLs (maximum 2)
   * @return fileUrls
  **/
  @ApiModelProperty(required = true, value = "Campaign file URLs (maximum 2)")
  public List<String> getFileUrls() {
    return fileUrls;
  }

  public void setFileUrls(List<String> fileUrls) {
    this.fileUrls = fileUrls;
  }

  public PostDirectMail size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Document size - A5 or DL
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Document size - A5 or DL")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public PostDirectMail areas(List<PostDirectMailArea> areas) {
    this.areas = areas;
    return this;
  }

  public PostDirectMail addAreasItem(PostDirectMailArea areasItem) {
    this.areas.add(areasItem);
    return this;
  }

   /**
   * PostDirectMailArea model
   * @return areas
  **/
  @ApiModelProperty(required = true, value = "PostDirectMailArea model")
  public List<PostDirectMailArea> getAreas() {
    return areas;
  }

  public void setAreas(List<PostDirectMailArea> areas) {
    this.areas = areas;
  }

  public PostDirectMail schedule(Integer schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Leave blank for immediate delivery. Your schedule time in unix format.
   * @return schedule
  **/
  @ApiModelProperty(example = "0", value = "Leave blank for immediate delivery. Your schedule time in unix format.")
  public Integer getSchedule() {
    return schedule;
  }

  public void setSchedule(Integer schedule) {
    this.schedule = schedule;
  }

  public PostDirectMail source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Your method of sending e.g. &#39;wordpress&#39;, &#39;php&#39;, &#39;c#&#39;.
   * @return source
  **/
  @ApiModelProperty(example = "sdk", value = "Your method of sending e.g. 'wordpress', 'php', 'c#'.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public PostDirectMail customString(String customString) {
    this.customString = customString;
    return this;
  }

   /**
   * A custom string for your own reference
   * @return customString
  **/
  @ApiModelProperty(value = "A custom string for your own reference")
  public String getCustomString() {
    return customString;
  }

  public void setCustomString(String customString) {
    this.customString = customString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostDirectMail postDirectMail = (PostDirectMail) o;
    return Objects.equals(this.name, postDirectMail.name) &&
        Objects.equals(this.fileUrls, postDirectMail.fileUrls) &&
        Objects.equals(this.size, postDirectMail.size) &&
        Objects.equals(this.areas, postDirectMail.areas) &&
        Objects.equals(this.schedule, postDirectMail.schedule) &&
        Objects.equals(this.source, postDirectMail.source) &&
        Objects.equals(this.customString, postDirectMail.customString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fileUrls, size, areas, schedule, source, customString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDirectMail {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileUrls: ").append(toIndentedString(fileUrls)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    customString: ").append(toIndentedString(customString)).append("\n");
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

