package com.fyc.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fyc.api.entity.Product;
import com.fyc.api.entity.dto.BarcodeDto;
import com.fyc.api.exception.ResourceNotFoundException;
import com.fyc.api.repository.ProductRepository;
import com.fyc.api.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

  // @Autowired
  private final ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
   super();
   this.productRepository = productRepository;
  }

  @Override
  public List<BarcodeDto> getAllBarcodes() {
    return productRepository.findAllBarcodes();
  }

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @Override
  public Product createProduct(Product product) {
    Product saveProduct = productRepository.save(product);
    return saveProduct;
  }

  @Override
  public Product updateProduct(Long id, Product product) {
    Product p = productRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Post id: " + id));

    p.setBarcode(product.getBarcode());
    p.setCategoryId(product.getCategoryId());
    p.setContent(product.getContent());
    p.setDescriptions(product.getDescriptions());
    p.setHpp(product.getHpp());
    p.setIsActive(product.getIsActive());
    p.setIsForSale(product.getIsForSale());
    p.setIsInventory(product.getIsInventory());
    p.setMargin(product.getMargin());
    p.setName(product.getName());
    p.setParentId(product.getParentId());
    p.setPpn(product.getPpn());
    p.setPrice(product.getPrice());
    p.setUnit(product.getUnit());
    p.setUnitInStock(product.getUnitInStock());
    p.setVariantName(product.getVariantName());

    return p;
  }

  @Override
  public void deleteProduct(Long id) {
    Product p = productRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Post id: " + id));
    productRepository.delete(p);
  }

  @Override
  public Product getProductById(Long id) {
    Optional<Product> p = productRepository.findById(id);

    if (p.isPresent()) {
      return p.get();
    } else {
      throw new ResourceNotFoundException("Post id: " + id);
    }
  }

}
