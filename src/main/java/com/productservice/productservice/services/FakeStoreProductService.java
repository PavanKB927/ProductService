package com.productservice.productservice.services;

import org.springframework.stereotype.Service;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{


    @Override
    public String getProductById(Long id) {
        // Integrate Fake Store API
        return "Requested id in service :"+id;
    }

    @Override
    public void getAllProducts() {

    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public void createProduct() {

    }

    @Override
    public void updateProduct() {

    }
}
