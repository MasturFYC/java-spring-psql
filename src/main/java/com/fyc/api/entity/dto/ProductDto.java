package com.fyc.api.entity.dto;

public class ProductDto {
  private  Long id;
  private  Long parentId;
  private  Integer categoryId;
  private  String name;
  private  String descriptions;
  private  String unit;
  private  String barcode;
  private  String variantName;
  private  Double hpp;
  private  Double content;
  private  Double price;
  private  Double ppn;
  private  Double margin;
  private  Double unitInStock;
  private  Boolean isForSale;
  private  Boolean isInventory;
  private  Boolean isActive;
  public Long getId() {
    return id;
  }
  public Long getParentId() {
    return parentId;
  }
  public Integer getCategoryId() {
    return categoryId;
  }
  public String getName() {
    return name;
  }
  public String getDescriptions() {
    return descriptions;
  }
  public String getUnit() {
    return unit;
  }
  public String getBarcode() {
    return barcode;
  }
  public String getVariantName() {
    return variantName;
  }
  public Double getHpp() {
    return hpp;
  }
  public Double getContent() {
    return content;
  }
  public Double getPrice() {
    return price;
  }
  public Double getPpn() {
    return ppn;
  }
  public Double getMargin() {
    return margin;
  }
  public Double getUnitInStock() {
    return unitInStock;
  }
  public Boolean getIsForSale() {
    return isForSale;
  }
  public Boolean getIsInventory() {
    return isInventory;
  }
  public Boolean getIsActive() {
    return isActive;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }
  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setDescriptions(String descriptions) {
    this.descriptions = descriptions;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }
  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }
  public void setVariantName(String variantName) {
    this.variantName = variantName;
  }
  public void setHpp(Double hpp) {
    this.hpp = hpp;
  }
  public void setContent(Double content) {
    this.content = content;
  }
  public void setPrice(Double price) {
    this.price = price;
  }
  public void setPpn(Double ppn) {
    this.ppn = ppn;
  }
  public void setMargin(Double margin) {
    this.margin = margin;
  }
  public void setUnitInStock(Double unitInStock) {
    this.unitInStock = unitInStock;
  }
  public void setIsForSale(Boolean isForSale) {
    this.isForSale = isForSale;
  }
  public void setIsInventory(Boolean isInventory) {
    this.isInventory = isInventory;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  // public ProductDto(Long id,
  //     Long parentId,
  //     Integer categoryId,
  //     String name,
  //     String descriptions,
  //     String unit,
  //     String barcode,
  //     String variantName,
  //     Double hpp,
  //     Double content,
  //     Double price,
  //     Double ppn,
  //     Double margin,
  //     Double unitInStock,
  //     Boolean isForSale,
  //     Boolean isInventory,
  //     Boolean isActive) {
  //   this.parentId = parentId;
  //   this.id = id;
  //   this.categoryId = categoryId;
  //   this.name = name;
  //   this.descriptions = descriptions;
  //   this.unit = unit;
  //   this.barcode = barcode;
  //   this.variantName = variantName;
  //   this.hpp = hpp;
  //   this.content = content;
  //   this.price = price;
  //   this.ppn = ppn;
  //   this.margin = margin;
  //   this.unitInStock = unitInStock;
  //   this.isForSale = isForSale;
  //   this.isInventory = isInventory;
  //   this.isActive = isActive;
  // }
}
