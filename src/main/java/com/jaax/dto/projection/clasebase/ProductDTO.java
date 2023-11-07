package com.jaax.dto.projection.clasebase;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {
    private String name;
    private String brand;
    private Double price;
}
