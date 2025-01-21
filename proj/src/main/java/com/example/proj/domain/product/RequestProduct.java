package com.example.proj.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct( String name, Integer price_in_cents) {
    
}
