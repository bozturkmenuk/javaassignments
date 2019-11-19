package com.fractal.api.v1.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TransactionDTO {
	private Long id;
	private String category;
	private String date;
	private BigDecimal quantity;
	private String currency;

}
