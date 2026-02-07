package com.teste.meu_primeiro_spring.repository;

import org.springframework.stereotype.Repository;



@Repository
public class MensagemRepository {

    public String obterMensagem() {
        return "Esta é uma mensagem do repositório!";
    }
    
}
