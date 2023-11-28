package com.fyc.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyc.api.entity.Category;
import com.fyc.api.entity.dto.CategoryDto;
import com.fyc.api.exception.ResourceNotFoundException;
import com.fyc.api.mapper.CategoryMapper;
import com.fyc.api.repository.CategoryRepository;
import com.fyc.api.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  @Override
  public CategoryDto createCategory(CategoryDto categoryDto) {
    Category category = CategoryMapper.mapToCategory(categoryDto);
    Category savedCategory = categoryRepository.save(category);
    CategoryDto savCategoryDto = CategoryMapper.mapToCategoryDto(savedCategory);
    return savCategoryDto;
  }

  @Override
  public List<CategoryDto> getAllCategory() {
    List<Category> categories = categoryRepository.findAll();
    return categories.stream().map(CategoryMapper::mapToCategoryDto)
        .collect(Collectors.toList());
  }

  @Override
  public CategoryDto getCategoryById(Integer id) {
    Optional<Category> optionalCategory = categoryRepository.findById(id);
    Category category = optionalCategory.get();
    return CategoryMapper.mapToCategoryDto(category);
  }

  @Override
  public CategoryDto updateCategory(Integer id, CategoryDto categoryDto) {
    Category existingCategory = categoryRepository.findById(id).get();
    existingCategory.setName(categoryDto.getName());
    Category updatedCategory = categoryRepository.save(existingCategory);
    return CategoryMapper.mapToCategoryDto(updatedCategory);
  }

  @Override
  public void deleteCategory(Integer id) {
    Category category = categoryRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Post id: " + id));
    categoryRepository.delete(category);
  }

}
