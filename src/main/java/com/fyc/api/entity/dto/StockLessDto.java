package com.fyc.api.entity.dto;

public class StockLessDto {
  private final Long id;
  private final String name;
  private final String variantName;
  private final String unit;
  private final Double unitInStock;
  private final String categoryName;

  public StockLessDto(
    Long id,
    String name,
    String variantName,
    String unit,
    String categoryName,
    Double unitInStock) {
    this.id = id;
    this.name = name;
    this.categoryName = categoryName;
    this.unit = unit;
    this.variantName = variantName;
    this.unitInStock = unitInStock;
  }

  public Long getId() {
    return id;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public String getName() {
    return name;
  }

  public String getVariantName() {
    return variantName;
  }

  public String getUnit() {
    return unit;
  }

  public Double getUnitInStock() {
    return unitInStock;
  }  
}
