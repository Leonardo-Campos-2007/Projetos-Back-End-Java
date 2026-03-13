package br.com.curso.spring.Curso.de.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MeuPrimeiroController {

    @GetMapping("/")
    public String primeiraMensagem(){
        return "OK";
    }
    
}
