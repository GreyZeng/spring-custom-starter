package org.example;

import lombok.Data;

@Data
public class ProductVO {

    private Long productId;

    private String productName;

    private String category;

    private Integer showPrice;

    private Integer actualPrice;

}