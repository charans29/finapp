package com.springboot.finapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.finapp")
public class FinappApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinappApplication.class, args);
    }
}
