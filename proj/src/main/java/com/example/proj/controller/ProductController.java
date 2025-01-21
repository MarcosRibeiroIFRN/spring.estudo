package com.example.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @SuppressWarnings("rawtypes")
    @GetMapping
    public ResponseEntity getAllProducts(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }
    
    @SuppressWarnings("rawtypes")
    @PostMapping
    public ResponseEntity RegisterProduct(@RequestBody @Valid RequestProduct data){
        Product product =new Product(data);
        repository.save((product));
        return ResponseEntity.ok().body(null);
    }
    // @PutMapping
    // public ResponseEntity UpdateProduct(@RequestBody){

    // }
}
