package com.example.using;

import com.example.starter.configuration.StarterProperties;
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
    @Autowired
    private TestService testService;
    @Autowired
    private StarterProperties properties;

    @Test
    void weHaveDummyService() {
        final String s = "test";
        final SomeDTO test = dummyService.doThis(s);
        assertEquals(s, test.getName());
    }

    @Test
    void weHaveServiceWithDependency() {
        final String s = "test";
        final String result = testService.doThis(s);
        assertEquals("Panda ++ test", result);
    }

    @Test
    void checkProperties() {
        assertEquals(23, properties.getNumber());
        assertEquals("Joe", properties.getPanda());
        assertEquals("password", properties.getSecret());
    }
}
