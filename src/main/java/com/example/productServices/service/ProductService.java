package com.example.productServices.service;

import com.example.productServices.dto.ProductRequest;
import com.example.productServices.dto.ProductResponse;
import com.example.productServices.dto.UpdateProductRequest;
import com.example.productServices.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    ResponseEntity<List<ProductResponse>> getAllProducts();


    ResponseEntity<ProductResponse> getProductById(Long id);

    ResponseEntity<String> deleteProduct(Long id);

    ResponseEntity<Product> saveProduct(ProductRequest productRequest);

    ResponseEntity<ProductResponse> updateProduct(Long id, UpdateProductRequest updateProductRequest);
}
