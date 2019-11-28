package com.fractal.client.services;

import org.springframework.stereotype.Service;

import com.fractal.client.FractalSandboxApi;
import com.fractal.client.model.TransactionsResponse;
@Service
public interface BankService {
	
	public TransactionsResponse getBankTransactions(String bankId,String accountId,String companyId,String pg,String from,String to);
	
}
