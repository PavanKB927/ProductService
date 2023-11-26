package com.productservice.productservice.services;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.thirdPartyClients.fakeStoreClient.FakeStoreClientAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    private FakeStoreClientAdapter fakeStoreClientAdapter;
    public FakeStoreProductService(FakeStoreClientAdapter fakeStoreClientAdapter) {
        this.fakeStoreClientAdapter = fakeStoreClientAdapter;
    }

    private static GenericProductDto convertToGenericProductDto(FakeStoreProductDto fakeStoreProductDto){
        GenericProductDto genericProductDto = new GenericProductDto();
        genericProductDto.setId(fakeStoreProductDto.getId());
        genericProductDto.setTitle(fakeStoreProductDto.getTitle());
        genericProductDto.setDescription(fakeStoreProductDto.getDescription());
        genericProductDto.setPrice(fakeStoreProductDto.getPrice());
        genericProductDto.setImage(fakeStoreProductDto.getImage());
        genericProductDto.setCategory(fakeStoreProductDto.getCategory());

        return genericProductDto;
    }

    @Override
    public GenericProductDto getProductById(Long id) {
        return convertToGenericProductDto(fakeStoreClientAdapter.getProductById(id));
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        FakeStoreProductDto[] fakeStoreProductDtos = fakeStoreClientAdapter.getAllProducts();
        List<GenericProductDto> result = new ArrayList<>();
        for (FakeStoreProductDto fakeStoreProductDto :fakeStoreProductDtos) {
            result.add(convertToGenericProductDto(fakeStoreProductDto));
        }
        return result;
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
        return convertToGenericProductDto(fakeStoreClientAdapter.deleteProductById(id));
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {
        return convertToGenericProductDto(fakeStoreClientAdapter.createProduct(genericProductDto));
    }

    @Override
    public GenericProductDto updateProduct(Long id, GenericProductDto genericProductDto) {
        return convertToGenericProductDto(fakeStoreClientAdapter.updateProduct(id,genericProductDto));
    }
}
