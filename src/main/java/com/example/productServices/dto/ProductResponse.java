package com.example.productServices.dto;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductResponse {
    private Long id;
    private String name;
    private Double price;
    private String pictureUrl;
}
