package com.fractal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-17T22:51:11.563Z")

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction   {
@JsonProperty("id")
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id = null;


@JsonProperty("category")
  private Integer category = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("quantity")
  private BigDecimal quantity = null;

  @JsonProperty("currency")
  private String currency = null;

}