package com.glrtech.dto;

import lombok.Data;
import java.util.List;

@Data
public class CartDTO {
    private Long id;
    private Long userId;
    private String date;
    private List<ProductQuantity> products;

    @Data
    public static class ProductQuantity {
        private Long productId;
        private int quantity;
    }
}