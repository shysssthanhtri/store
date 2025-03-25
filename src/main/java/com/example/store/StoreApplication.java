package com.example.store;

import com.example.store.entities.Address;
import com.example.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);
        User user = User.builder()
                .name("John")
                .password("password")
                .email("john@gmail.com")
                .build();

        Address address = Address.builder()
                .street("Street 1")
                .state("State")
                .city("City")
                .zip("zip")
                .build();

        user.addAddress(address);

        System.out.println(user);
    }

}
