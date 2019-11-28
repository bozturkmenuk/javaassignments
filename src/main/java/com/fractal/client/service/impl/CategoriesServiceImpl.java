package com.fractal.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fractal.client.ApiClient;
import com.fractal.client.FractalSandboxApi;
import com.fractal.client.model.Categories;
import com.fractal.client.model.CategoriesPUTBody;
import com.fractal.client.model.CategoriesPut;
import com.fractal.client.model.Transactions;
import com.fractal.client.model.TransactionsResponse;
import com.fractal.client.model.TransactionsResponseResults;
import com.fractal.client.services.AuthenticationService;
import com.fractal.client.services.CategoriesService;
@Component
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	private AuthenticationService authenticationService;
	@Autowired
	private FractalSandboxApi api;

	
	@Override
	public Categories getCategories() {
		return api.getCategories();
	}

	@Override
	public void updateCategoriesofTransactions(CategoriesPut categoriesPut) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transactions getTransactionsByCompany(String companyId, String from, String to, String pg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriesPut categorizeTransactionsByDefinition(TransactionsResponse transactions) {
		 CategoriesPut categorizedTransactions = new CategoriesPut();
		 
		for (int i = 0; i < transactions.getResults().size(); i++) {
			if(transactions.getResults().get(i).getDescription().contains("Starbucks")) {
				CategoriesPUTBody putItem = new CategoriesPUTBody();
				putItem.setCategoryId("xasdsad");
				putItem.setTransactionId(transactions.getResults().get(i).getTransactionId());
				categorizedTransactions.add(putItem);
			}
		}
		
		return categorizedTransactions;
		
		
	}

	
}
