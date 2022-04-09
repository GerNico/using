package com.example.using;

import com.example.starter.service.HelperClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsingApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsingApplication.class, args);
    }

    @Bean
    public HelperClass makeHelper() {
        return new HelperClass();
    }
}
