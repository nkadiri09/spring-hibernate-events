package com.spring.cdc.springhibernateevent.service;

import java.util.List;

import com.spring.cdc.springhibernateevent.model.Product;
import com.spring.cdc.springhibernateevent.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class ProductService {
 
    @Autowired
    private ProductRepository repo;
     
    public List<Product> listAll() {
        return repo.findAll();
    }
     
    public void save(Product product) {
        repo.save(product);
    }
     
    public Product get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public Product updateProduct(Product product) {
        return repo.save(product);
    }
}