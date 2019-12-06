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
 * Credit card model
 */
@ApiModel(description = "Credit card model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-06T01:13:58.303Z")

public class CreditCard {
  @SerializedName("number")
  private String number = null;

  @SerializedName("expiry_month")
  private Integer expiryMonth = null;

  @SerializedName("expiry_year")
  private Integer expiryYear = null;

  @SerializedName("cvc")
  private Integer cvc = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("bank_name")
  private String bankName = null;

  public CreditCard() {
    //this.classType = this.getClass().getSimpleName();
  }
  public CreditCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Credit card number
   * @return number
  **/
  @ApiModelProperty(required = true, value = "Credit card number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CreditCard expiryMonth(Integer expiryMonth) {
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * Expiry month of credit card
   * @return expiryMonth
  **/
  @ApiModelProperty(required = true, value = "Expiry month of credit card")
  public Integer getExpiryMonth() {
    return expiryMonth;
  }

  public void setExpiryMonth(Integer expiryMonth) {
    this.expiryMonth = expiryMonth;
  }

  public CreditCard expiryYear(Integer expiryYear) {
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * Expiry year of credit card
   * @return expiryYear
  **/
  @ApiModelProperty(required = true, value = "Expiry year of credit card")
  public Integer getExpiryYear() {
    return expiryYear;
  }

  public void setExpiryYear(Integer expiryYear) {
    this.expiryYear = expiryYear;
  }

  public CreditCard cvc(Integer cvc) {
    this.cvc = cvc;
    return this;
  }

   /**
   * CVC number of credit card
   * @return cvc
  **/
  @ApiModelProperty(required = true, value = "CVC number of credit card")
  public Integer getCvc() {
    return cvc;
  }

  public void setCvc(Integer cvc) {
    this.cvc = cvc;
  }

  public CreditCard name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name printed on credit card
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name printed on credit card")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreditCard bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Name of bank that credit card belongs to
   * @return bankName
  **/
  @ApiModelProperty(required = true, value = "Name of bank that credit card belongs to")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCard creditCard = (CreditCard) o;
    return Objects.equals(this.number, creditCard.number) &&
        Objects.equals(this.expiryMonth, creditCard.expiryMonth) &&
        Objects.equals(this.expiryYear, creditCard.expiryYear) &&
        Objects.equals(this.cvc, creditCard.cvc) &&
        Objects.equals(this.name, creditCard.name) &&
        Objects.equals(this.bankName, creditCard.bankName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expiryMonth, expiryYear, cvc, name, bankName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
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

