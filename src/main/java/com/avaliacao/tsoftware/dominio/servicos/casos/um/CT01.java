package com.avaliacao.tsoftware.dominio.servicos.casos.um;

import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.servicos.casos.Base;

@Component
public class CT01 extends Base {

    @Override
    public Integer getNumeroExercicio() { return 1; }

    @Override
    public CasoDeTeste fornecerDados(Exercicio exercicio) {

        return montar(
            exercicio, 
            "sucesso no cadastro",
            "nome, email e senha corretamente preenchidos",
            "1. informar nome, email e senha; 2. cadastrar",
            "novo usuário registrado na base de dados",
            "usabilidade e performance"
        );
    }
}