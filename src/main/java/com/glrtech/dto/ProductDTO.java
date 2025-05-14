package com.glrtech.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String image;
}
