package com.fractal.api.v1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fractal.api.v1.domain.CategoryDTO;
import com.fractal.api.v1.domain.CategoryPOSTDTO;
import com.fractal.model.Category;

@Mapper
public interface CategoryMapper {

	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
	
	CategoryDTO categoryToCategoryDTO(Category category);
	
	Category categoryPOSTDTOToCategory(CategoryPOSTDTO categoryPOSTDTO);
}
