package com.fractal.repositories;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fractal.model.Category;
@Service
@Cacheable("categories")
public interface CategoriesRepository extends JpaRepository<Category, Long> {

}
