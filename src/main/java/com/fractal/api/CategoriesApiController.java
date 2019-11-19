package com.fractal.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fractal.api.v1.domain.CategoryDTO;
import com.fractal.api.v1.domain.CategoryListDTO;
import com.fractal.api.v1.domain.CategoryPOSTDTO;
import com.fractal.model.Category;
import com.fractal.service.CategoryService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-17T22:51:11.563Z")

@Controller
public class CategoriesApiController implements CategoriesApi {

	private final CategoryService categoryService;

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public CategoriesApiController(ObjectMapper objectMapper, HttpServletRequest request,
			CategoryService categoryService) {
		this.objectMapper = objectMapper;
		this.request = request;
		this.categoryService = categoryService;
	}

	@Override
	public Optional<ObjectMapper> getObjectMapper() {
		return Optional.ofNullable(objectMapper);
	}

	@Override
	public Optional<HttpServletRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	@Override
	public ResponseEntity<CategoryListDTO> getCategories() {
		if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
			if (getAcceptHeader().get().contains("application/json")) {
				try {
					return new ResponseEntity<CategoryListDTO>(new CategoryListDTO(categoryService.getAllCategories()),
							HttpStatus.OK);
				} catch (Exception e) {
					log.error("An error occured", e);
					return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
		} else {
			log.warn(
					"ObjectMapper or HttpServletRequest not configured in default CategoriesApi interface so no example is generated");
		}
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<Void> addCategory(@Valid CategoryPOSTDTO categoryPosTDTO) {
		if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
			categoryService.addNewCategory(categoryPosTDTO);
		} else {
			log.warn(
					"ObjectMapper or HttpServletRequest not configured in default CategoriesApi interface so no example is generated");
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
