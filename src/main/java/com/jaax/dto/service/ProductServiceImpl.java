package com.jaax.dto.service;

import com.jaax.dto.entity.Product;
import com.jaax.dto.projection.clasebase.ProductDTO;
import com.jaax.dto.projection.interfacebase.close.ProductClosedView;
import com.jaax.dto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<ProductClosedView> getAllByProjection() {
        return productRepository.findBy();
    }

    @Override
    public List<ProductDTO> getAllByProjectionClass() {
        return productRepository.findProductBy();
    }

    @Override
    public ProductDTO getByBrandProjectionDynamic(String brand) {
        return productRepository.findProductByBrand(brand, ProductDTO.class);
    }
}
