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
 * CountryListIds
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-20T02:44:59.328Z")
public class CountryListIds {
  @SerializedName("country_list_ids")
  private List<Integer> countryListIds = new ArrayList<Integer>();

  public CountryListIds countryListIds(List<Integer> countryListIds) {
    this.countryListIds = countryListIds;
    return this;
  }

  public CountryListIds addCountryListIdsItem(Integer countryListIdsItem) {
    this.countryListIds.add(countryListIdsItem);
    return this;
  }

   /**
   * Array of country ids
   * @return countryListIds
  **/
  @ApiModelProperty(example = "[1]", required = true, value = "Array of country ids")
  public List<Integer> getCountryListIds() {
    return countryListIds;
  }

  public void setCountryListIds(List<Integer> countryListIds) {
    this.countryListIds = countryListIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryListIds countryListIds = (CountryListIds) o;
    return Objects.equals(this.countryListIds, countryListIds.countryListIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryListIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryListIds {\n");
    
    sb.append("    countryListIds: ").append(toIndentedString(countryListIds)).append("\n");
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

