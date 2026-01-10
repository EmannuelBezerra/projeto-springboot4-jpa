package com.EducandoWeb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducandoWeb.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
