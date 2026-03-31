package com.avaliacao.tsoftware.dominio.servicos.casos.um;

import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.servicos.casos.Base;

@Component
public class CT02 extends Base {

    @Override
    public Integer getNumeroExercicio() { return 1; }

    @Override
    public CasoDeTeste fornecerDados(Exercicio exercicio) {

        return montar(
            exercicio,
            "email duplicado",
            "primeiro registro efetuado com o mesmo email",
            "1. tentar novo cadastro com mesmo email; 2. cadastrar",
            "erro de validação",
            "integridade de dados"
        );
    }
}