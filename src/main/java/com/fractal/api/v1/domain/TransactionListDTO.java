package com.fractal.api.v1.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionListDTO {

	List<TransactionDTO> transactions;

}
