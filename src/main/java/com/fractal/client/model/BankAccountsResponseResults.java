/*
 * FractalSandboxBankApi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2019-10-17T10:22:19Z
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
import com.fractal.client.model.BankAccountResponseAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BankAccountsResponseResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-25T13:59:29.760Z")
public class BankAccountsResponseResults {
  @JsonProperty("Account")
  private BankAccountResponseAccount account = null;

  @JsonProperty("companyId")
  private Integer companyId = null;

  @JsonProperty("bankId")
  private Integer bankId = null;

  @JsonProperty("dateAuthorised")
  private String dateAuthorised = null;

  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("Currency")
  private String currency = null;

  @JsonProperty("revoked")
  private Boolean revoked = null;

  @JsonProperty("invalidated")
  private Boolean invalidated = null;

  public BankAccountsResponseResults account(BankAccountResponseAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public BankAccountResponseAccount getAccount() {
    return account;
  }

  public void setAccount(BankAccountResponseAccount account) {
    this.account = account;
  }

  public BankAccountsResponseResults companyId(Integer companyId) {
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

  public BankAccountsResponseResults bankId(Integer bankId) {
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

  public BankAccountsResponseResults dateAuthorised(String dateAuthorised) {
    this.dateAuthorised = dateAuthorised;
    return this;
  }

   /**
   * Get dateAuthorised
   * @return dateAuthorised
  **/
  @ApiModelProperty(value = "")
  public String getDateAuthorised() {
    return dateAuthorised;
  }

  public void setDateAuthorised(String dateAuthorised) {
    this.dateAuthorised = dateAuthorised;
  }

  public BankAccountsResponseResults accountId(String accountId) {
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

  public BankAccountsResponseResults currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BankAccountsResponseResults revoked(Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

   /**
   * Get revoked
   * @return revoked
  **/
  @ApiModelProperty(value = "")
  public Boolean isRevoked() {
    return revoked;
  }

  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }

  public BankAccountsResponseResults invalidated(Boolean invalidated) {
    this.invalidated = invalidated;
    return this;
  }

   /**
   * Get invalidated
   * @return invalidated
  **/
  @ApiModelProperty(value = "")
  public Boolean isInvalidated() {
    return invalidated;
  }

  public void setInvalidated(Boolean invalidated) {
    this.invalidated = invalidated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountsResponseResults bankAccountsResponseResults = (BankAccountsResponseResults) o;
    return Objects.equals(this.account, bankAccountsResponseResults.account) &&
        Objects.equals(this.companyId, bankAccountsResponseResults.companyId) &&
        Objects.equals(this.bankId, bankAccountsResponseResults.bankId) &&
        Objects.equals(this.dateAuthorised, bankAccountsResponseResults.dateAuthorised) &&
        Objects.equals(this.accountId, bankAccountsResponseResults.accountId) &&
        Objects.equals(this.currency, bankAccountsResponseResults.currency) &&
        Objects.equals(this.revoked, bankAccountsResponseResults.revoked) &&
        Objects.equals(this.invalidated, bankAccountsResponseResults.invalidated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, companyId, bankId, dateAuthorised, accountId, currency, revoked, invalidated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountsResponseResults {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    dateAuthorised: ").append(toIndentedString(dateAuthorised)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
    sb.append("    invalidated: ").append(toIndentedString(invalidated)).append("\n");
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

