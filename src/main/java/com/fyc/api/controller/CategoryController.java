package com.fyc.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fyc.api.entity.dto.CategoryDto;
import com.fyc.api.service.CategoryService;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
  
  @Autowired
  private CategoryService categoryService;
  
  @PostMapping
  public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {
    CategoryDto savedCategoryDto = categoryService.createCategory(categoryDto);
    return new ResponseEntity<>(savedCategoryDto, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<CategoryDto>> getAllCategory() {
    List<CategoryDto> categories = categoryService.getAllCategory();
    return new ResponseEntity<>(categories, HttpStatus.OK);
  }

  @GetMapping("{id}")
  public ResponseEntity<CategoryDto> getCategoryById(@PathVariable("id") Integer id) {
    CategoryDto categoryDto = categoryService.getCategoryById(id);
    return new ResponseEntity<>(categoryDto, HttpStatus.OK);
 }

  @PutMapping("/{id}")
  public ResponseEntity<CategoryDto> updateCategory(@PathVariable("id") Integer id, @RequestBody CategoryDto categoryDto) {
    CategoryDto updateCategoryDto = categoryService.updateCategory(id, categoryDto);
    return new ResponseEntity<>(updateCategoryDto, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Map<String, Boolean>> deleteCategory(@PathVariable("id") Integer id, @RequestBody CategoryDto categoryDto) {
    categoryService.deleteCategory(id);
    Map<String, Boolean> response = new HashMap<>();
    response.put("Category was deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
  }
}
