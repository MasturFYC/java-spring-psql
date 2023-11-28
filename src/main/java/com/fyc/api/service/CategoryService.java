package com.fyc.api.service;

import java.util.List;

import com.fyc.api.entity.dto.CategoryDto;

public interface CategoryService {
  CategoryDto createCategory(CategoryDto categoryDto);
  List<CategoryDto> getAllCategory();
  CategoryDto getCategoryById(Integer id);
  CategoryDto updateCategory(Integer id, CategoryDto categoryDto);
  void deleteCategory(Integer id);
}
