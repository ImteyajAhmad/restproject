package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
