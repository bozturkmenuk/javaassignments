package com.fractal.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fractal.api.v1.domain.CategoryDTO;
import com.fractal.api.v1.domain.CategoryPOSTDTO;
import com.fractal.api.v1.mapper.CategoryMapper;
import com.fractal.model.Category;
import com.fractal.repositories.CategoriesRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	private final CategoryMapper categoryMapper;
	private final CategoriesRepository categoriesRepository;
	
	public CategoryServiceImpl(CategoryMapper categoryMapper, CategoriesRepository categoriesRepository) {
		this.categoryMapper = categoryMapper;
		this.categoriesRepository = categoriesRepository;
	}

	@Override
	public List<CategoryDTO> getAllCategories() {
		return categoriesRepository.findAll()
				.stream()
				.map(categoryMapper::categoryToCategoryDTO)
				.collect(Collectors.toList());
	}

	@Override
	public void addNewCategory(CategoryPOSTDTO categoryPOSTDTO) {
		Category category = this.categoryMapper.categoryPOSTDTOToCategory(categoryPOSTDTO);
		List<Category>  categories =  categoriesRepository.findAll();
		if (!categories.contains(category)) {
		categoriesRepository.save(category);
		} else System.out.println("its duplicate, consider returning an error if important !");
	}


	

}
