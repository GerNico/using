package com.example.using;

import com.example.starter.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsingApplication {
    @Autowired
    private DummyService myBean;

    public static void main(String[] args) {
        SpringApplication.run(UsingApplication.class, args);
    }
}
