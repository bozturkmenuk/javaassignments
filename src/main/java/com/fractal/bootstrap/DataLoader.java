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
	
	public DataLoader(CategoriesRepository categoriesRepository, TransactionRepository transactionRepository) {
	this.categoriesRepository = categoriesRepository;
	this.transactionRepository = transactionRepository;
}

	@Override
	public void run(String... args) throws Exception {
		
		  categoriesRepository.save(new Category("Travel"));
		  categoriesRepository.save(new Category("Coffee"));
		  categoriesRepository.save(new Category("Groceries"));
		  categoriesRepository.save(new Category("Restaurants"));
		  
		  
		  transactionRepository.save(new Transaction("Travel", "14.11.2019 22:30:00", new BigDecimal("14.00"), "GBP"));
		  transactionRepository.save(new Transaction("Coffee", "16.11.2019 22:30:00", new BigDecimal("2.99"), "GBP"));
		  transactionRepository.save(new Transaction("Groceries","14.11.2019 22:30:00", new BigDecimal("14.00"), "GBP"));
		  transactionRepository.save(new Transaction("Coffee", "18.11.2019 22:30:00", new BigDecimal("3.29"), "GBP"));
		  transactionRepository.save(new Transaction("Travel", "18.11.2019 22:30:00", new BigDecimal("34.99"), "GBP"));

	}

}
