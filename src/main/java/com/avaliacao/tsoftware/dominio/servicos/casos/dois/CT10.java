package com.avaliacao.tsoftware.dominio.servicos.casos.dois;

import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.servicos.casos.Base;

@Component
public class CT10 extends Base {
    @Override
    public Integer getNumeroExercicio() { return 2; }

    @Override
    public CasoDeTeste fornecerDados(Exercicio exercicio) {
        return montar(
            exercicio, 
            "limite mínimo para o nome de produto",
            "nenhuma pré-condição específica",
            "1. tentar inserir produto com nome < 3 caracteres",
            "o sistema deve informar a violação de tamanho",
            "usabilidade e padronização de dados"
        );
    }
}