package com.jaax.dto.repository;

import com.jaax.dto.entity.Product;
import com.jaax.dto.projection.clasebase.ProductDTO;
import com.jaax.dto.projection.interfacebase.close.ProductClosedView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //DTO by interface
    List<ProductClosedView> findBy();
    //DTO by class
    List<ProductDTO> findProductBy();
    //Dto by interface/class dynamic
    <T> T findProductByBrand(String brand, Class<T> type);
}
