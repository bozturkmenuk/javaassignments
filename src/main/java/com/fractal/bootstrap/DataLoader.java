package com.fractal.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fractal.model.Category;
import com.fractal.model.Transaction;
import com.fractal.repositories.CategoriesRepository;
import com.fractal.repositories.TransactionRepository;
@Component
public class DataLoader implements CommandLineRunner {
private CategoriesRepository categoriesRepository;
private TransactionRepository transactionRepository;
private  Integer CATEGORY_ID_TRAVEL;
private  Integer CATEGORY_ID_COFFEE;
private  Integer CATEGORY_ID_GROCERIES;
private  Integer CATEGORY_ID_RESTAURANTS;
	
	public DataLoader(CategoriesRepository categoriesRepository, TransactionRepository transactionRepository) {
	this.categoriesRepository = categoriesRepository;
	this.transactionRepository = transactionRepository;
}

	@Override
	public void run(String... args) throws Exception {
		
		
		  CATEGORY_ID_TRAVEL= categoriesRepository.save(new
		  Category("Travel")).getId().intValue(); CATEGORY_ID_COFFEE=
		  categoriesRepository.save(new Category("Coffee")).getId().intValue();
		  CATEGORY_ID_GROCERIES = categoriesRepository.save(new
		  Category("Groceries")).getId().intValue(); CATEGORY_ID_RESTAURANTS =
		  categoriesRepository.save(new Category("Restaurants")).getId().intValue();
		  
		  
		  transactionRepository.save(new Transaction(null,CATEGORY_ID_TRAVEL,
		  "14.11.2019 22:30:00", new BigDecimal("14.00"), "GBP"));
		  transactionRepository.save(new Transaction(null,CATEGORY_ID_COFFEE,
		  "16.11.2019 22:30:00", new BigDecimal("2.99"), "GBP"));
		  transactionRepository.save(new
		  Transaction(null,CATEGORY_ID_GROCERIES,"14.11.2019 22:30:00", new
		  BigDecimal("14.00"), "GBP")); transactionRepository.save(new
		  Transaction(null,CATEGORY_ID_COFFEE, "18.11.2019 22:30:00", new
		  BigDecimal("3.29"), "GBP")); transactionRepository.save(new
		  Transaction(null,CATEGORY_ID_TRAVEL, "18.11.2019 22:30:00", new
		  BigDecimal("34.99"), "GBP"));
		 
	}

}
