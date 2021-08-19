package com.geekbrains.ru.springlesson3.configuration;

import com.geekbrains.ru.springlesson3.domain.Product;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan({"com.geekbrains.ru.springlesson3.controller","com.geekbrains.ru.springlesson3.repository","com.geekbrains.ru.springlesson3.service",})
public class AppConf {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Product simpleProduct () {
        return new Product(1,"some product",10.1);
    }
}

