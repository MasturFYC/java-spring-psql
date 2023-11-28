package com.fyc.api.mapper;

import com.fyc.api.entity.Category;
import com.fyc.api.entity.dto.CategoryDto;

public class CategoryMapper {
  public static CategoryDto mapToCategoryDto(Category category) {
    CategoryDto categoryDto = new CategoryDto(
      category.getId(),
      category.getName()
    );
    return categoryDto;
  }

  public static Category mapToCategory(CategoryDto categoryDto) {
    Category category = new Category(
      categoryDto.getId(),
      categoryDto.getName()
    );

    return category;
  }
}
