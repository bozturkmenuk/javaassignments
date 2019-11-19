package com.fractal.service;

import java.util.List;


import com.fractal.api.v1.domain.CategoryDTO;
import com.fractal.api.v1.domain.CategoryPOSTDTO;
import com.fractal.model.Category;
public interface CategoryService {
	
  List<CategoryDTO> getAllCategories();
  
  public void addNewCategory(CategoryPOSTDTO categoryPOSTDTO);

 
}
