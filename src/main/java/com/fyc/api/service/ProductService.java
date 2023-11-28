package com.fyc.api.service;

import java.util.List;

import com.fyc.api.entity.Product;
import com.fyc.api.entity.dto.BarcodeDto;
import com.fyc.api.entity.dto.StockLessDto;

public interface ProductService {

  List<BarcodeDto> getAllBarcodes();

  List<StockLessDto> getStockLess();

  List<Product> getAllProducts();

  Product createProduct(Product product);

  Product updateProduct(Long id, Product product);

  Product getProductById(Long id);

  void deleteProduct(Long id);
}
