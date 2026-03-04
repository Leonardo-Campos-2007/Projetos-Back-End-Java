package com.curso.spring.SpringBoot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;
import com.curso.spring.SpringBoot.model.Greeting;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong controler = new AtomicLong();


    // http://localhost:8080/greeting?name=Leonardo
    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name ", defaultValue = "Word") String name) {
        return new Greeting(controler.incrementAndGet(), String.format(template, name));
    }

}
