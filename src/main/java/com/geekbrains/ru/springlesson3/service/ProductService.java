package com.geekbrains.ru.springlesson3.service;

import com.geekbrains.ru.springlesson3.domain.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById (long id);
    boolean addProduct(long id,String name,double price);
}

