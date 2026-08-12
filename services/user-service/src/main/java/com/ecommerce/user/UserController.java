package com.ecommerce.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "service", "user-service",
                "status", "UP"
        );
    }

    @GetMapping("/1")
    public Map<String, Object> getUser() {
        return Map.of(
                "id", 1,
                "name", "Teja",
                "role", "customer"
        );
    }
}
