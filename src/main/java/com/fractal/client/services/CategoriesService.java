package com.fractal.client.services;

import org.springframework.stereotype.Service;

import com.fractal.client.model.Categories;
import com.fractal.client.model.CategoriesPut;
import com.fractal.client.model.Transactions;
@Service
public interface CategoriesService {
	
	public Categories getCategories();
	
	public void updateCategoriesofTransactions(CategoriesPut categoriesPut);
	
	public Transactions getTransactionsByCompany(String companyId,String from,String to,String pg);
	

}
