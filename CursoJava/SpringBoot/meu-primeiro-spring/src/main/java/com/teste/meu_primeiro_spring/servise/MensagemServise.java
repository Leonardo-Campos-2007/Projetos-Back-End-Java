package com.teste.meu_primeiro_spring.servise;

import org.springframework.stereotype.Service;
import com.teste.meu_primeiro_spring.repository.MensagemRepository;

@Service
public class MensagemServise {
   
    private final MensagemRepository mensagemRepository;

    public MensagemServise(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem() {
        return mensagemRepository.obterMensagem();
    }
}
