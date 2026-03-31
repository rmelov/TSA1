package com.avaliacao.tsoftware.dominio.servicos.casos.dois;

import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.servicos.casos.Base;

@Component
public class CT08 extends Base {
    @Override
    public Integer getNumeroExercicio() { return 2; }

    @Override
    public CasoDeTeste fornecerDados(Exercicio exercicio) {
        return montar(
            exercicio, 
            "garantia de estoque com valores positivos",
            "nenhuma pré-condição específica",
            "1. tentar registrar produto com quantidade -1",
            "o sistema deve retornar erro",
            "consistência de dados"
        );
    }
}