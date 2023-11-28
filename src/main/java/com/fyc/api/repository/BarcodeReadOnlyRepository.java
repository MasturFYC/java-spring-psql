package com.fyc.api.repository;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BarcodeReadOnlyRepository<T, ID> extends Repository<T, ID> {
  List<T> findAll();
}