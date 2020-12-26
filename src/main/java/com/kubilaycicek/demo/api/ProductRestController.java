package com.kubilaycicek.demo.api;

import com.kubilaycicek.demo.dto.ProductDto;
import com.kubilaycicek.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    ProductService productService;


    @GetMapping("/list")
    public ResponseEntity<List<ProductDto>> getProducts() {
        return ResponseEntity.ok(productService.getList());
    }

    @GetMapping("/{name}")
    public ResponseEntity<ProductDto> getProductByName(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok(productService.getProduct(name));
    }
}
