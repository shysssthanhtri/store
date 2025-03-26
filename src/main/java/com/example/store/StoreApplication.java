package com.example.store;

import com.example.store.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);
        Category category = Category.builder()
                .name("category")
                .build();

        Product product = Product.builder()
                .name("product")
                .price(BigDecimal.valueOf(100.05))
                .build();

        category.addProduct(product);

        System.out.println(category);
    }

}
