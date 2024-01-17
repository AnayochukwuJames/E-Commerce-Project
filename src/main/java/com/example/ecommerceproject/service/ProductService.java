package com.example.ecommerceproject.service;

import com.example.ecommerceproject.dto.ProductRequest;
import com.example.ecommerceproject.dto.ProductResponse;
import com.example.ecommerceproject.dto.UpdateProductRequest;
import com.example.ecommerceproject.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    ResponseEntity<List<ProductResponse>> getAllProducts();


    ResponseEntity<ProductResponse> getProductById(Long id);

    ResponseEntity<String> deleteProduct(Long id);

    ResponseEntity<Product> saveProduct(ProductRequest productRequest);

    ResponseEntity<ProductResponse> updateProduct(Long id, UpdateProductRequest updateProductRequest);
}
