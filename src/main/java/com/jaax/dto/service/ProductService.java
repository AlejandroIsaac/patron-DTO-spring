package com.jaax.dto.service;

import com.jaax.dto.entity.Product;
import com.jaax.dto.projection.clasebase.ProductDTO;
import com.jaax.dto.projection.interfacebase.close.ProductClosedView;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    Product create(Product product);
    List<Product> getAll();

    Optional<Product> getById(Long id);

    List<ProductClosedView> getAllByProjection();

    List<ProductDTO> getAllByProjectionClass();

    ProductDTO getByBrandProjectionDynamic(String brand);
}
