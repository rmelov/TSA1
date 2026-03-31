package com.avaliacao.tsoftware.dominio.servicos.casos.dois;

import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.servicos.casos.Base;

@Component
public class CT09 extends Base {
    @Override
    public Integer getNumeroExercicio() { return 2; }

    @Override
    public CasoDeTeste fornecerDados(Exercicio exercicio) {
        return montar(
            exercicio, 
            "impedir nomes de produtos duplicados",
            "já deve existir um produto cadastrado com o nome a ser inserido",
            "1. tentar cadastrar um novo produto com o mesmo nome já inserido anteriormente",
            "o sistema deve informar que o produto já existe",
            "integridade de unicidade"
        );
    }
}