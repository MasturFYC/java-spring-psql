package com.fyc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fyc.api.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
  
}
