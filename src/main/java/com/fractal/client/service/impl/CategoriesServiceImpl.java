package com.fractal.client.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.ahocorasick.trie.Emit;
import org.ahocorasick.trie.Trie;
import org.ahocorasick.trie.Trie.TrieBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fractal.client.ApiClient;
import com.fractal.client.FractalSandboxApi;
import com.fractal.client.model.Categories;
import com.fractal.client.model.CategoriesPUTBody;
import com.fractal.client.model.CategoriesPut;
import com.fractal.client.model.Category;
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
		api.updateTransactionCategory(categoriesPut);
	}

	@Override
	public Transactions getTransactionsByCompany(String companyId, String from, String to, String pg) {
  		return null;
	}
	
	
	public String extractTransactionId(String text,int startOffset) {
          int start,end;
          end=text.lastIndexOf("|", startOffset);
          start= text.lastIndexOf("|",end-1);
          return text.substring(start+1, end);
		 
	}
	
	public String combineDescriptions(TransactionsResponse transactions) {
		  StringBuilder sb = new StringBuilder();
			 for (int i = 0; i < transactions.getResults().size(); i++) {
				sb.append("|");
				sb.append(transactions.getResults().get(i).getTransactionId());
				sb.append("|");
				sb.append(transactions.getResults().get(i).getDescription());
			}	
			 return sb.toString();
	}

	@Override
	public CategoriesPut categorizeTransactionsByDefinition(HashMap<String, String> categorykeywords, TransactionsResponse transactions) {
		//Convert map to  case insensitive keyed tree map
		Map<String, String> categoryMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		categoryMap.putAll(categorykeywords);
		CategoriesPut categorizedTransactions = new CategoriesPut();
		
		// append txids and descriptions in a single string to apply Aho-Corasick Algorithm
		String allTransactions = combineDescriptions(transactions);
		
	//Build a trie from the categorykeywords, case insensitive
	 Trie trie = Trie.builder().onlyWholeWords().ignoreCase().addKeywords(categoryMap.keySet()).build();
	 
	 Collection<Emit> emits  = trie.parseText(allTransactions);
	 
	 HashSet<CategoriesPUTBody> putSet = new HashSet<CategoriesPUTBody>();
	 
	 
	 for (Emit emit : emits) {
		 CategoriesPUTBody putItem = new CategoriesPUTBody();
		 putItem.setCategoryId(categoryMap.get(emit.getKeyword()));
		 putItem.setTransactionId(this.extractTransactionId(allTransactions, emit.getStart()));
		 putSet.add(putItem);
	}
	 
	    categorizedTransactions.addAll(putSet);
		return categorizedTransactions;
		
		
	}
	

	
}
