package com.example.ecommerceproject.builder;

import com.example.ecommerceproject.dto.ProductRequest;
import com.example.ecommerceproject.dto.ProductResponse;
import com.example.ecommerceproject.dto.UpdateProductRequest;
import com.example.ecommerceproject.model.Product;

public class ProductMapper {
    public static ProductResponse mapProductResponse(Product productResponse) {
        return ProductResponse.builder()
                .id(productResponse.getId())
                .name(productResponse.getName())
                .price(productResponse.getPrice())
                .pictureUrl(productResponse.getPictureUrl())
                .build();
    }
    public static Product mapProductRequestToProduct(ProductRequest productRequest) {
        return Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .pictureUrl(productRequest.getPictureUrl())
                .build();
    }
    public static Product mapUpdateProductRequestToProduct(Product product, UpdateProductRequest updateProductRequest){
        product.setName(updateProductRequest.getName());
        product.setPrice(updateProductRequest.getPrice());
        product.setPictureUrl(updateProductRequest.getPictureUrl());
        return product;
    }
}
