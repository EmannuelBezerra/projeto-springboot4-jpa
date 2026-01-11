package com.EducandoWeb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducandoWeb.Course.entities.OrderItem;
import com.EducandoWeb.Course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
