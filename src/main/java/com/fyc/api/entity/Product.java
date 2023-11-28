package com.fyc.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "product_generator", sequenceName = "product_seq")
  Long id;

  @Column(name = "parent_id", nullable = false)
  Long parentId = 0L;

  @Column(name = "category_id", nullable = false)
  Integer categoryId;

  @Column(nullable = false, length = 50)
  String name;

  @Column(nullable = false, length = 256)
  String descriptions;

  @Column(nullable = false, length = 6)
  String unit;

  @Column(nullable = false, length = 25)
  String barcode;

  @Column(length = 50)
  String variantName;

  @Column(nullable = false)
  Double hpp = 0.0;

  @Column(nullable = false)
  Double content = 1.0;

  @Column(nullable = false)
  Double price = 0.0;

  @Column(nullable = false)
  Double ppn = 0.0;

  @Column(nullable = false)
  Double margin = 0.0;

  @Column(nullable = false)
  Double unitInStock = 0.0;
  @Column(name = "is_for_sale")
  Boolean isForSale = true;
  @Column(name = "is_inventory")
  Boolean isInventory = false;
  @Column(name = "is_active")
  Boolean isActive = true;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(String descriptions) {
    this.descriptions = descriptions;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public String getVariantName() {
    return variantName;
  }

  public void setVariantName(String variantName) {
    this.variantName = variantName;
  }

  public Double getHpp() {
    return hpp;
  }

  public void setHpp(Double hpp) {
    this.hpp = hpp;
  }

  public Double getContent() {
    return content;
  }

  public void setContent(Double content) {
    this.content = content;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Double getPpn() {
    return ppn;
  }

  public void setPpn(Double ppn) {
    this.ppn = ppn;
  }

  public Double getMargin() {
    return margin;
  }

  public void setMargin(Double margin) {
    this.margin = margin;
  }

  public Double getUnitInStock() {
    return unitInStock;
  }

  public void setUnitInStock(Double unitInStock) {
    this.unitInStock = unitInStock;
  }

  public Boolean getIsForSale() {
    return isForSale;
  }

  public void setIsForSale(Boolean isForSale) {
    this.isForSale = isForSale;
  }

  public Boolean getIsInventory() {
    return isInventory;
  }

  public void setIsInventory(Boolean isInventory) {
    this.isInventory = isInventory;
  }

  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public String toString() {
    return "product: { id: " + id +
        ", name: " + name +
        ", unit: " + unit +
        ", barcode: " + barcode +
        ", price: " + price +
        ", hpp: " + hpp +
        ", content: " + content +
        ", unitInStock: " + unitInStock +
        ", ppn: " + ppn +
        ", margin: " + margin +
        " }";
  }

}
