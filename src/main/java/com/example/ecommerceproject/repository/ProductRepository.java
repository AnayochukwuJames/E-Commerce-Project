package com.example.ecommerceproject.repository;

import com.example.ecommerceproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
