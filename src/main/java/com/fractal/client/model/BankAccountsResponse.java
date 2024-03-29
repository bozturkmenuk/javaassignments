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
import com.fractal.client.model.BankAccountsResponseResults;
import com.fractal.client.model.BanksResponseLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Bank Accounts response
 */
@ApiModel(description = "Bank Accounts response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-25T13:59:29.760Z")
public class BankAccountsResponse {
  @JsonProperty("links")
  private BanksResponseLinks links = null;

  @JsonProperty("results")
  private List<BankAccountsResponseResults> results = null;

  public BankAccountsResponse links(BanksResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public BanksResponseLinks getLinks() {
    return links;
  }

  public void setLinks(BanksResponseLinks links) {
    this.links = links;
  }

  public BankAccountsResponse results(List<BankAccountsResponseResults> results) {
    this.results = results;
    return this;
  }

  public BankAccountsResponse addResultsItem(BankAccountsResponseResults resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<BankAccountsResponseResults>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<BankAccountsResponseResults> getResults() {
    return results;
  }

  public void setResults(List<BankAccountsResponseResults> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountsResponse bankAccountsResponse = (BankAccountsResponse) o;
    return Objects.equals(this.links, bankAccountsResponse.links) &&
        Objects.equals(this.results, bankAccountsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountsResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

