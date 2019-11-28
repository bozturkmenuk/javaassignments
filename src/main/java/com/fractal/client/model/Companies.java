/*
 * FractalSandboxCompany
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2019-10-17T10:28:54Z
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fractal.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Company array")
public class Companies extends ArrayList<Company> {
	 @JsonProperty("links")
	  private TransactionsLinks links = null;

	  @JsonProperty("results")
	  private List<Company> results = null;

	  public Companies links(TransactionsLinks links) {
	    this.links = links;
	    return this;
	  }

	   /**
	   * Get links
	   * @return links
	  **/
	  @ApiModelProperty(value = "")
	  public TransactionsLinks getLinks() {
	    return links;
	  }

	  public void setLinks(TransactionsLinks links) {
	    this.links = links;
	  }

	  public Companies results(List<Company> results) {
	    this.results = results;
	    return this;
	  }

	  public Companies addResultsItem(Company resultsItem) {
	    if (this.results == null) {
	      this.results = new ArrayList<Company>();
	    }
	    this.results.add(resultsItem);
	    return this;
	  }

	   /**
	   * Get results
	   * @return results
	  **/
	  @ApiModelProperty(value = "")
	  public List<Company> getResults() {
	    return results;
	  }

	  public void setResults(List<Company> results) {
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
	    Companies companies = (Companies) o;
	    return Objects.equals(this.links, companies.links) &&
	        Objects.equals(this.results, companies.results);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(links, results);
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Companies {\n");
	    
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

