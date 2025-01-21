package com.example.proj.domain.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Table(name="product")
@Entity(name="product")
@EqualsAndHashCode(of = "id")
@Data
public class Product {
   
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Number price_in_cents;

    public Product(RequestProduct requestProduct){
        this.name=requestProduct.name();
        this.price_in_cents=requestProduct.price_in_cents();

    }
    // public Product (String)
}
