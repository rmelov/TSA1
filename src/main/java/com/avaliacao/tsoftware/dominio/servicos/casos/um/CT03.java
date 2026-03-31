package com.avaliacao.tsoftware.dominio.servicos.casos.um;

import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.servicos.casos.Base;

@Component
public class CT03 extends Base {

    @Override
    public Integer getNumeroExercicio() { return 1; }

    @Override
    public CasoDeTeste fornecerDados(Exercicio exercicio) {

        return montar(
            exercicio, 
            "senha curta",
            "formulário de cadastro aberto",
            "1. preencher nome e email; 2. informar senha com menos caracteres necessários",
            "bloqueio da quebra da regra de negócio",
            "segurança"
        );
    }
}