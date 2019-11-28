package com.fractal.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fractal.client.FractalSandboxApi;
import com.fractal.client.model.TransactionsResponse;
import com.fractal.client.services.AuthenticationService;
import com.fractal.client.services.BankService;
@Component
public class BankServiceImpl implements BankService {
	@Autowired
	private FractalSandboxApi api;
	@Autowired
	private AuthenticationService authenticationService;
	
	@Override
	public TransactionsResponse getBankTransactions(String bankId,String accountId,String companyId,String pg,String from,String to){
		return api.getBankTransactions(bankId,accountId, companyId, pg, from, to);
	}

}
