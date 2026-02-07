package com.teste.meu_primeiro_spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class HelloControler {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    
}
