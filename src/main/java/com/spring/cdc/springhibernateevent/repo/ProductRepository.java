package com.spring.cdc.springhibernateevent.repo;

import com.spring.cdc.springhibernateevent.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}