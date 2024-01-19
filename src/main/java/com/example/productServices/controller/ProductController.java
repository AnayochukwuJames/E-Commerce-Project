package com.example.productServices.controller;

import com.example.productServices.dto.ProductRequest;
import com.example.productServices.dto.ProductResponse;
import com.example.productServices.model.Product;
import com.example.productServices.service.ProductService;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")

public class ProductController {
    private final ProductService productService;
    @GetMapping("get-all-product")
    public ResponseEntity<List<ProductResponse>> getAllProduct (){
        return productService.getAllProducts();
    }
    @GetMapping ("get-product/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @PostMapping("save-product")
    public ResponseEntity<Product> saveProduct(@RequestBody ProductRequest productRequest){
        return productService.saveProduct(productRequest);
    }
    @DeleteMapping("delete-product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        return productService.deleteProduct(id);
    }
}
