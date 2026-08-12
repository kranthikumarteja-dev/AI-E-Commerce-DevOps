package com.ecommerce.order;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "service", "order-service",
                "status", "UP"
        );
    }

    @PostMapping
    public Map<String, Object> createOrder() {
        return Map.of(
                "orderId", "ORD-1001",
                "status", "CREATED",
                "message", "Order created successfully"
        );
    }
}
