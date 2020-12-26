package com.kubilaycicek.demo.service;

import com.kubilaycicek.demo.dto.ProductDto;
import com.kubilaycicek.demo.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    List<ProductDto> productDtoList = new ArrayList<>();

    @PostConstruct
    void initializeProductList() {
        productDtoList.add(new ProductDto(1l, "PS5", "GAME", "Playstation 5"));
        productDtoList.add(new ProductDto(2l, "PS4", "GAME", "Playstation 4"));
        productDtoList.add(new ProductDto(3l, "PS3", "GAME", "Playstation 3"));
        productDtoList.add(new ProductDto(4l, "PS2", "GAME", "Playstation 2"));
        productDtoList.add(new ProductDto(5l, "PS1", "GAME", "Playstation 1"));

    }

    @Override
    public ProductDto getProduct(String name) {
        return productDtoList.stream().filter(item -> item.getName().equals(name))
                .findFirst().orElseThrow(() -> new EntityNotFoundException(name));
    }

    @Override
    public List<ProductDto> getList() {
        return productDtoList;
    }
}
