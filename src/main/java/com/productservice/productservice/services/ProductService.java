package com.productservice.productservice.services;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {
    String getProductById(Long id);

    void getAllProducts();

    void deleteProductById(Long id);
    void createProduct();
    void updateProduct();
}
