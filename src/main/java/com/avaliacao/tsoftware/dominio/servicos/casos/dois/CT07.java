package com.avaliacao.tsoftware.dominio.servicos.casos.dois;

import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.servicos.casos.Base;

@Component
public class CT07 extends Base {
    @Override
    public Integer getNumeroExercicio() { return 2; }

    @Override
    public CasoDeTeste fornecerDados(Exercicio exercicio) {
        return montar(
            exercicio, 
            "validação de preço válido do produto",
            "produto não deve existir no banco",
            "1. tentar inserir produto com preço 0.00. 2. tentar inserir produto com preço -10.00",
            "o sistema deve retornar mensagem de erro de validação",
            "confiabilidade e validação de entrada"
        );
    }
}