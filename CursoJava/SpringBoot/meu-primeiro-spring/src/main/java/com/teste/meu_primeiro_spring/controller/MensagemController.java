package com.teste.meu_primeiro_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teste.meu_primeiro_spring.servise.MensagemServise;
import org.springframework.web.bind.annotation.RequestMapping;
 


@RestController
@RequestMapping("/api")
public class MensagemController {

    private final MensagemServise mensagemServise;

    public MensagemController(MensagemServise mensagemServise){
        this.mensagemServise = mensagemServise;
    }

    @GetMapping("/mensagem")
    public String mensagem() {
        return mensagemServise.obterMensagem();
    }

    
}
