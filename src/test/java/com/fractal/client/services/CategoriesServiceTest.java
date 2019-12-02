package com.fractal.client.services;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fractal.client.model.Categories;
import com.fractal.client.model.CategoriesPut;
import com.fractal.client.model.Category;
import com.fractal.client.service.impl.CategoriesServiceImpl;

@SpringBootTest
public class CategoriesServiceTest {
	@Autowired
	CategoriesService categoriesService;
	
	@Autowired
	BankService bankService;
	
	@Test
	public void getCategories(){
		Categories categories =  categoriesService.getCategories();
		for (Category category : categories.getResults()) {
			System.out.println(category.getId() +" - " + category.getName());
			
		}
		assertTrue(categories.getResults().size()>0);
	}
	
	
	@Test
	@Disabled
	public void combineDescriptions(){
		String combinedOnes =  categoriesService.combineDescriptions(bankService.getBankTransactions("1", "fakeaccount1", "2", null, null, null));
		assertTrue(combinedOnes.chars().filter(ch -> ch == 'e').count() == 18);
	}
	
	@Test
	@Disabled
	public void getTransactionIdfromMiddle() {
		String combinedOnes =  categoriesService.combineDescriptions(bankService.getBankTransactions("1", "fakeaccount1", "2", null, null, null));
		String transactionId = categoriesService.extractTransactionId(combinedOnes, 102);
		assertEquals("4661c026-4605-4773-9b49-b781ed9909ca", transactionId);
		}
	
	
	@Test
	@Disabled
	public void getTransactionIdfromEnd() {
		String combinedOnes =  categoriesService.combineDescriptions(bankService.getBankTransactions("1", "fakeaccount1", "2", null, null, null));
		String transactionId = categoriesService.extractTransactionId(combinedOnes, 515);
		assertEquals("ea58e941-42b0-4e57-ad37-067be59bd0e5", transactionId);
		}
	
	@Test
	@Disabled
	public void getTransactionIdfromStart() {
		String combinedOnes =  categoriesService.combineDescriptions(bankService.getBankTransactions("1", "fakeaccount1", "2", null, null, null));
		String transactionId = categoriesService.extractTransactionId(combinedOnes, 50);
		assertEquals("0ef942ea-d3ad-4f25-857b-4d4bb7f912d8", transactionId);
		}
	
	@Test
	public void getCategorizedTransactions() {
		HashMap<String,String> categoryKeywords =  new  HashMap<String, String>(){
			{
				
				//gasd7 Travel IT Cost
				put("tfl","gasd7");
				put("bus","gasd7");
				put("train","gasd7");
				put("underground","gasd7");
				
				//b6as2 R&D Costs
				put("Starbucks","b6as2");
				put("Costa","b6as2");
				put("coffee","b6as2");
				put("Cafe Nero","b6as2");
				put("Sterling","b6as2");
				put("Victoria","b6as2");
			}
		};
		// there are overlapping matchings for the given account 
		// transaction description : Starbucks Victoria but it has to match only once 
		// so there may be 2 matching updates only.
		
		CategoriesPut put = categoriesService.categorizeTransactionsByDefinition(categoryKeywords, bankService.getBankTransactions("1", "fakeaccount1", "2", null, null, null));
	    assertEquals(2, put.size());
	}
	
	@Test 
	public void updateCategorizedTransactions() {
		HashMap<String,String> categoryKeywords =  new  HashMap<String, String>(){
			{
				//gasd7 Travel IT Cost
				put("tfl","gasd7");
				put("bus","gasd7");
				put("train","gasd7");
				put("underground","gasd7");
				
				//b6as2 R&D Costs
				put("Starbucks","b6as2");
				put("Costa","b6as2");
				put("coffee","b6as2");
				put("Cafe Nero","b6as2");
				put("Sterling","b6as2");
				put("Victoria","b6as2");
			}
		};
		
		CategoriesPut put = categoriesService.categorizeTransactionsByDefinition(categoryKeywords, bankService.getBankTransactions("1", "fakeaccount1", "2", null, null, null));

		categoriesService.updateCategoriesofTransactions(put);
		
	}
	
	
	
	
	
	
}
