package com.avaliacao.tsoftware.exercicios.um;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import com.avaliacao.tsoftware.api.dto.requisicoes.UsuarioRequisicao;

@DisplayName("CT01 - Sucesso no cadastro")
public class CT01CadastroSucessoTest extends UsuarioTesteBase {

    @Test
    @Transactional
    void test() throws Exception {

        UsuarioRequisicao req = new UsuarioRequisicao(
            "Sísifo Félix Rocha Caíno da Pena",
            "sisifodapena@icq.com",
            "SenHa##123"
        );

        executar(req, status().isCreated());
    }
}