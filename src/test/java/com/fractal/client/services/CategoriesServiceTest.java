package com.fractal.client.services;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fractal.client.model.Categories;
import com.fractal.client.model.Category;

@SpringBootTest
public class CategoriesServiceTest {
	@Autowired
	CategoriesService categoriesService;
	
	@Test
	public void getCategories(){
		Categories categories =  categoriesService.getCategories();
		for (Category category : categories.getResults()) {
			System.out.println(category.getId() +" - " + category.getName());
			
		}
		assertTrue(categories.getResults().size()>0);
	}
	
}
