package com.example.using;

import com.example.starter.dto.SomeDTO;
import com.example.starter.service.DummyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UsingApplicationTests {
    @Autowired
    private DummyService dummyService;

    @Test
    void contextLoads() {
        final String s = "test";
        final SomeDTO test = dummyService.doThis(s);
        assertEquals(test.getName(), s);
    }

}
