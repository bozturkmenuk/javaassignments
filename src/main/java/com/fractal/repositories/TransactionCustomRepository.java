package com.fractal.repositories;

import java.util.List;

import com.fractal.model.Transaction;

public interface TransactionCustomRepository  {

	public List<Transaction> getTransactionsByCategoryId(Long categoryId);
}
