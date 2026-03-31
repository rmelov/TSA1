package com.avaliacao.tsoftware.exercicios.um;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import com.avaliacao.tsoftware.api.dto.requisicoes.UsuarioRequisicao;

@DisplayName("CT03 - Senha curta")
public class CT03SenhaCurtaTest extends UsuarioTesteBase {
    
    @Test
    @Transactional
    void test() throws Exception {
    
        UsuarioRequisicao req = new UsuarioRequisicao(
            "Sisifo",
            "sisifo_dapena@bol.com",
            "npassa"
        );

        executar(req, status().isBadRequest());
    }
}