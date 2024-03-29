package com.fractal.service;

import java.util.List;

import com.fractal.api.v1.domain.TransactionDTO;;

public interface TransactionService {

	 List<TransactionDTO> getTransactionsByCategoryId(Integer categoryId);
	 TransactionDTO getTransactionById(Long transactionId);
	 void UpdateTransactionCategory(Long transactionId, Integer newCategoryId);
}
