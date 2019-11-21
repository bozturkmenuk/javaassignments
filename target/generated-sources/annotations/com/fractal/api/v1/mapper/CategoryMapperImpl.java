package com.fractal.api.v1.mapper;

import com.fractal.api.v1.domain.CategoryDTO;
import com.fractal.api.v1.domain.CategoryPOSTDTO;
import com.fractal.model.Category;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-11-20T20:32:17+0000",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId( category.getId() );
        categoryDTO.setName( category.getName() );

        return categoryDTO;
    }

    @Override
    public Category categoryPOSTDTOToCategory(CategoryPOSTDTO categoryPOSTDTO) {
        if ( categoryPOSTDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( categoryPOSTDTO.getName() );

        return category;
    }
}
