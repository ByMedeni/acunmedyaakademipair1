package com.example.controller;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
    private ProductRepository productRepository;
@GetMapping
public List<Product> getAllProducts() {
    return productRepository.findAll();
}
}
