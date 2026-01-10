package com.EducandoWeb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducandoWeb.Course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
