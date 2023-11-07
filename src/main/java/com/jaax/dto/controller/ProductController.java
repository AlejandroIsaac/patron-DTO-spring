package com.jaax.dto.controller;

import com.jaax.dto.entity.Product;
import com.jaax.dto.projection.clasebase.ProductDTO;
import com.jaax.dto.projection.interfacebase.close.ProductClosedView;
import com.jaax.dto.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @PostMapping
    Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping
    List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    Product getById(@PathVariable Long id){
        return productService.getById(id).get();
    }

    //get by projection with Interface
    @GetMapping("/projectionInterface")
    List<ProductClosedView> getByProjection(){
        return productService.getAllByProjection();
    }

    //get by projection with class DTO
    @GetMapping("/projectionClass")
    List<ProductDTO> getByProjectionDto(){
        return productService.getAllByProjectionClass();
    }

    //get projection dynamic
    @GetMapping("/projectionDynamic/{brand}")
    ProductDTO getByBrandProductDTODynamic(@PathVariable String brand){
        return  productService.getByBrandProjectionDynamic(brand);
    }
}
