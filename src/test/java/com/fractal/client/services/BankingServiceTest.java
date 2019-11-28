package com.fractal.client.services;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fractal.client.model.TransactionsResponse;

@SpringBootTest
public class BankingServiceTest {
	@Autowired
	BankService bankingService;
	
	@Test
	public void getBankTransactions() {
	
		TransactionsResponse transactions = bankingService.getBankTransactions("1", "fakeaccount1", "2", null, null, null);
		//System.out.println(transactions.toString());
		assertTrue(transactions.getResults().size() > 0);
	}

}
