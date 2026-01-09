package com.EducandoWeb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducandoWeb.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
