package com.example.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj.domain.product.Product;
import com.example.proj.domain.product.ProductRepository;
import com.example.proj.domain.product.RequestProduct;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity GetAllProducts(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }
    
    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
        Product product =new Product(data);
        System.out.println(data);
        return ResponseEntity.ok().body(null);
    }
}
