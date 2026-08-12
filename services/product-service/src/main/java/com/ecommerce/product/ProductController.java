package com.ecommerce.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "service", "product-service",
                "status", "UP"
        );
    }

    @GetMapping
    public List<Map<String, Object>> products() {
        return List.of(
                Map.of(
                        "id", 101,
                        "name", "Laptop",
                        "price", 65000
                ),
                Map.of(
                        "id", 102,
                        "name", "Smartphone",
                        "price", 30000
                )
        );
    }
}
