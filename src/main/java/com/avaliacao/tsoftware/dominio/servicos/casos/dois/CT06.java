package com.avaliacao.tsoftware.dominio.servicos.casos.dois;

import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.servicos.casos.Base;

@Component
public class CT06 extends Base {
    @Override
    public Integer getNumeroExercicio() { return 2; }

    @Override
    public CasoDeTeste fornecerDados(Exercicio exercicio) {
        return montar(
            exercicio, 
            "cadastro de produto com dados válidos",
            "o sistema deve estar operacional e o banco de dados limpo",
            "1. enviar requisição POST para /produtos com nome, preço e quantidade",
            "deve haver a inserção com sucesso",
            "disponibilidade e integridade dos dados."
        );
    }
}