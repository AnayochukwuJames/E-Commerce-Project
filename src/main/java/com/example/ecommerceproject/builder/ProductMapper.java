package com.example.ecommerceproject.builder;

import com.example.ecommerceproject.dto.ProductResponse;
import com.example.ecommerceproject.model.Product;

public class ProductMapper {
    public static ProductResponse mapProductResponse(Product response) {
        return ProductResponse.builder()
                .id(response.getId())
                .name(response.getName())
                .price(response.getPrice())
                .pictureUrl(response.getPictureUrl())
                .build();

    }
}
