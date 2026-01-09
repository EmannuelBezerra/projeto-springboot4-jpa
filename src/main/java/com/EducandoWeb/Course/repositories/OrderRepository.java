package com.EducandoWeb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducandoWeb.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
