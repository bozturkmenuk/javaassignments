package com.fractal.client.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fractal.client.model.Categories;
import com.fractal.client.model.CategoriesPut;
import com.fractal.client.model.Transactions;
import com.fractal.client.model.TransactionsResponse;
import com.fractal.client.model.TransactionsResponseResults;
@Service
public interface CategoriesService {
	
	public Categories getCategories();
	
	public void updateCategoriesofTransactions(CategoriesPut categoriesPut);
	
	public Transactions getTransactionsByCompany(String companyId,String from,String to,String pg);
	
	public CategoriesPut categorizeTransactionsByDefinition(TransactionsResponse transactions);

}
