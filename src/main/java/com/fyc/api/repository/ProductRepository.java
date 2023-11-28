package com.fyc.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fyc.api.entity.Product;
import com.fyc.api.entity.dto.BarcodeDto;

public interface ProductRepository extends JpaRepository<Product, Long> {

  @Query("SELECT new com.fyc.api.entity.dto.BarcodeDto(e.barcode) FROM Product e")
  List<BarcodeDto> findAllBarcodes();
}
