package com.fyc.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fyc.api.entity.Product;
import com.fyc.api.entity.dto.BarcodeDto;
import com.fyc.api.entity.dto.StockLessDto;

public interface ProductRepository extends JpaRepository<Product, Long> {

  @Query("SELECT new com.fyc.api.entity.dto.BarcodeDto(e.barcode) FROM Product e")
  List<BarcodeDto> findAllBarcodes();

  @Query("SELECT new com.fyc.api.entity.dto.StockLessDto(e.id, e.name, e.variantName, e.unit, c.name categoryName, e.unitInStock) FROM Product e JOIN Category c ON c.id = e.categoryId WHERE e.unitInStock <= 10.0 ORDER BY e.name")
  List<StockLessDto> findStockLess();
}
