package com.example.ecommerceproject.service;

import com.example.ecommerceproject.dto.ProductResponse;
import com.example.ecommerceproject.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    ResponseEntity<List<ProductResponse>> getAllProducts();


    ResponseEntity<ProductResponse> getProductById(Long id);

    Product save(Product product);

    ResponseEntity<String> deleteProduct(Long id);
}
