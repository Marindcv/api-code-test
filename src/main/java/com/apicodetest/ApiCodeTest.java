package com.apicodetest;

import com.apicodetest.controller.FizzBuzzController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCodeTest {

    public static void main(String[] args) {
        SpringApplication.run(FizzBuzzController.class, args);
    }

}

