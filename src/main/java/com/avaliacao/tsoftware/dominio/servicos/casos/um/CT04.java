package com.avaliacao.tsoftware.dominio.servicos.casos.um;

import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.servicos.casos.Base;

@Component
public class CT04 extends Base {

    @Override
    public Integer getNumeroExercicio() { return 1; }

    @Override
    public CasoDeTeste fornecerDados(Exercicio exercicio) {

        return montar(
            exercicio, 
            "email inválido",
            "formulário de cadastro aberto",
            "1. informar email com formato equivocado; 2. cadastrar",
            "erro de validação",
            "confiabilidade"
        );
    }
}