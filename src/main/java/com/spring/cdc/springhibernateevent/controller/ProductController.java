package com.spring.cdc.springhibernateevent.controller;

import com.spring.cdc.springhibernateevent.model.Product;
import com.spring.cdc.springhibernateevent.repo.ProductRepository;
import com.spring.cdc.springhibernateevent.service.ProductService;
import org.springframework.beans.factory.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
 
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable(value = "id") Integer productId, @RequestBody Product product){
        Product product1 = new Product();
        product1.setName("Item1");
        product1.setPrice(100.10f);
        product1.setId(productId);

        return service.updateProduct(product);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product1) {
        Product product = new Product();
        product.setId(1);
        product.setName(product1.getName());
        product.setPrice(product1.getPrice());
        service.save(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}