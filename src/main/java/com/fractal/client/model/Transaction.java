/*
 * FractalSandboxCategories
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2019-10-23T12:59:12Z
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fractal.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-25T13:59:56.354Z")
public class Transaction {
  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("valueDate")
  private String valueDate = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  /**
   * Gets or Sets transactionType
   */
  public enum TransactionTypeEnum {
    ACTUAL("ACTUAL"),
    
    FORECAST("FORECAST");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransactionTypeEnum fromValue(String text) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("transactionType")
  private TransactionTypeEnum transactionType = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("companyId")
  private Integer companyId = null;

  @JsonProperty("bankId")
  private Integer bankId = null;

  @JsonProperty("bookingDate")
  private String bookingDate = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  /**
   * Gets or Sets flow
   */
  public enum FlowEnum {
    DEBIT("DEBIT"),
    
    CREDIT("CREDIT");

    private String value;

    FlowEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FlowEnum fromValue(String text) {
      for (FlowEnum b : FlowEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("flow")
  private FlowEnum flow = null;

  @JsonProperty("status")
  private String status = null;

  public Transaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transaction valueDate(String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Get valueDate
   * @return valueDate
  **/
  @ApiModelProperty(value = "")
  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }

  public Transaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public Transaction accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Transaction companyId(Integer companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }

  public Transaction bankId(Integer bankId) {
    this.bankId = bankId;
    return this;
  }

   /**
   * Get bankId
   * @return bankId
  **/
  @ApiModelProperty(value = "")
  public Integer getBankId() {
    return bankId;
  }

  public void setBankId(Integer bankId) {
    this.bankId = bankId;
  }

  public Transaction bookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

   /**
   * Get bookingDate
   * @return bookingDate
  **/
  @ApiModelProperty(value = "")
  public String getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }

  public Transaction category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Transaction currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Transaction flow(FlowEnum flow) {
    this.flow = flow;
    return this;
  }

   /**
   * Get flow
   * @return flow
  **/
  @ApiModelProperty(value = "")
  public FlowEnum getFlow() {
    return flow;
  }

  public void setFlow(FlowEnum flow) {
    this.flow = flow;
  }

  public Transaction status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.valueDate, transaction.valueDate) &&
        Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.transactionType, transaction.transactionType) &&
        Objects.equals(this.accountId, transaction.accountId) &&
        Objects.equals(this.companyId, transaction.companyId) &&
        Objects.equals(this.bankId, transaction.bankId) &&
        Objects.equals(this.bookingDate, transaction.bookingDate) &&
        Objects.equals(this.category, transaction.category) &&
        Objects.equals(this.currencyCode, transaction.currencyCode) &&
        Objects.equals(this.flow, transaction.flow) &&
        Objects.equals(this.status, transaction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, valueDate, transactionId, transactionType, accountId, companyId, bankId, bookingDate, category, currencyCode, flow, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

