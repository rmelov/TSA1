package com.avaliacao.tsoftware.exercicios.um;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import com.avaliacao.tsoftware.api.dto.requisicoes.UsuarioRequisicao;

@DisplayName("CT05 - Nome obrigatório")
public class CT05NomeObrigatorioTest extends UsuarioTesteBase {
    
    @Test
    @Transactional
    void test() throws Exception {
        UsuarioRequisicao req = new UsuarioRequisicao(
            "",
            "nomevazio@existencial.com",
            "SenHa##123"

        );

        executar(req, status().isBadRequest());
    }
}