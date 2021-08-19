package com.geekbrains.ru.springlesson3.service.impl;

import com.geekbrains.ru.springlesson3.domain.Product;
import com.geekbrains.ru.springlesson3.repository.ProductRepository;
import com.geekbrains.ru.springlesson3.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }
    @Override
    public boolean addProduct(long id, String name, double price){
     return true;
    }
}