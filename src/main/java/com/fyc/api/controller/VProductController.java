package com.fyc.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fyc.api.entity.VProduct;
import com.fyc.api.exception.ResourceNotFoundException;
import com.fyc.api.repository.VProductRepository;

@RestController
@RequestMapping("/api/v1/")
public class VProductController {

  @Autowired
  private VProductRepository vProductRepository;

  @GetMapping("/vproducts/{id}")
  public ResponseEntity<VProduct> getProductById(@PathVariable Long id) {
    VProduct p = vProductRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Product not exist with id :" + id));
    return ResponseEntity.ok(p);
  }

  @GetMapping("/vproducts/{barcode}/{custid}")
  public ResponseEntity<VProduct> getProductByBarcode(@PathVariable String barcode, @PathVariable Long custid) {
    if (custid == 0) {
      VProduct p = vProductRepository.findByBarcode(barcode)
          .orElseThrow(() -> new ResourceNotFoundException("Product not exist with barcode :" + barcode));
      return ResponseEntity.ok(p);
    } else {
      VProduct p = vProductRepository.member(barcode, custid)
          .orElseThrow(() -> new ResourceNotFoundException(
              "Product not exist with barcode " + barcode + " in customer: " + custid));
      return ResponseEntity.ok(p);
    }
  }

  @GetMapping("/vproducts/{limit}/{offset}")
  public ResponseEntity<List<VProduct>> getList(@PathVariable int limit, @PathVariable int offset) {
    try {
      List<VProduct> products = vProductRepository.list(limit, (offset * limit));
      if (products.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(products, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/vproducts/{txt}/{limit}/{offset}")
  public ResponseEntity<List<VProduct>> getSearch(@PathVariable String txt, @PathVariable int limit,
      @PathVariable int offset) {
    try {
      List<VProduct> products = vProductRepository.search(txt, limit, (offset * limit));
      if (products.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(products, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
