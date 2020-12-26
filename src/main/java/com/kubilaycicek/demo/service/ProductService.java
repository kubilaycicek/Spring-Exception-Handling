package com.kubilaycicek.demo.service;

import com.kubilaycicek.demo.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto getProduct(String name);
    List<ProductDto> getList();
}
