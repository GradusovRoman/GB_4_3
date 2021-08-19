package com.geekbrains.ru.springlesson3.controller;

import com.geekbrains.ru.springlesson3.domain.Product;
import com.geekbrains.ru.springlesson3.repository.ProductRepository;
import com.geekbrains.ru.springlesson3.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping
@AllArgsConstructor

public class ProductController {
    private final ProductService productService;
    private final ProductRepository productRepository;

    @GetMapping("/store")
    public String getProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);

        return "repository_products";
    }

    @GetMapping("/add")
    public String addProductForm (Model model){
        model.addAttribute("product",new Product());
        return "add_form";
    }


    @PostMapping("/add")
    public String addProductToRepository(@ModelAttribute Product product) {
        productRepository.addProduct(product.getId(),product.getName(),product.getPrice());
        return "redirect:/store/";
    }

}
