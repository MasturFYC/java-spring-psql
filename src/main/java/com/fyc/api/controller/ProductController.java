package com.fyc.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
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

import com.fyc.api.entity.Product;
import com.fyc.api.entity.dto.BarcodeDto;
import com.fyc.api.entity.dto.ProductDto;
import com.fyc.api.entity.dto.StockLessDto;
import com.fyc.api.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

  @Autowired
  private ModelMapper modelMapper;

  private ProductService productService;

  public ProductController(ProductService productService) {
    super();
    this.productService = productService;
  }

  @GetMapping("/barcodes")
  public List<BarcodeDto> getAllBarcodes() {
    List<BarcodeDto> barcodes = productService.getAllBarcodes();
    return barcodes;
  }

  @GetMapping("/stockless")
  public List<StockLessDto> getStokLess() {
    List<StockLessDto> stocks = productService.getStockLess();
    return stocks;
  }

  @GetMapping()
  public List<ProductDto> getAllProducts() {
    List<ProductDto> list = productService.getAllProducts()
        .stream().map(product -> modelMapper.map(product, ProductDto.class))
        .collect(Collectors.toList());

    return list;
  }

  @PostMapping()
  public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
    Product p = modelMapper.map(productDto, Product.class);
    Product product = productService.createProduct(p);
    ProductDto res = modelMapper.map(product, ProductDto.class);
    return new ResponseEntity<ProductDto>(res, HttpStatus.CREATED);
  }

  @PutMapping()
  public ResponseEntity<ProductDto> updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto) {
    Product p = modelMapper.map(productDto, Product.class);
    Product product = productService.updateProduct(id, p);
    ProductDto res = modelMapper.map(product, ProductDto.class);
    return ResponseEntity.ok(res);
  }  

  @GetMapping("/{id}")
  public ResponseEntity<ProductDto> getProductById(@PathVariable(name = "id") Long id) {
    Product product = productService.getProductById(id);
    ProductDto res = modelMapper.map(product, ProductDto.class);
    return ResponseEntity.ok().body(res);
  }
  
  @DeleteMapping("/{id}")
  public ResponseEntity<Map<String, Boolean>> deleteProduct(@PathVariable(name = "id") Long id) {
    productService.deleteProduct(id);

    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return ResponseEntity.ok(response);
  }

}
