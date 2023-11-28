package com.fyc.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.fyc.api.entity.VProduct;

public interface VProductRepository extends JpaRepository<VProduct, Long> {
    List<VProduct> list(@Param("limit") int limit, @Param("offset") int offset);

    List<VProduct> search(@Param("txt") String txt, @Param("limit") int limit, @Param("offset") int offset);

    Optional<VProduct> findByBarcode(String barcode);

    Optional<VProduct> member(String barcode, Long custId);
}
