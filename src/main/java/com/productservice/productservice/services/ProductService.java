package com.productservice.productservice.services;

import com.productservice.productservice.dtos.GenericProductDto;

import java.util.List;

public interface ProductService {
    GenericProductDto getProductById(Long id);

    List<GenericProductDto> getAllProducts();

    GenericProductDto deleteProductById(Long id);
    GenericProductDto createProduct(GenericProductDto genericProductDto);
    GenericProductDto updateProduct(Long id, GenericProductDto genericProductDto);
}
