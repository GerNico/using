package com.example.using;

import com.example.starter.service.ServiceWithDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class TestServiceImpl that responsible for
 *
 * @author Mykola.Matsishin <br> created on 09 April 2022
 * @since 5.5
 */
@Component
public class TestServiceImpl implements TestService {
    @Autowired
    private ServiceWithDependency service;

    @Override
    public String doThis(String arg) {
        return service.doThisAndLog(arg).getName();
    }
}
