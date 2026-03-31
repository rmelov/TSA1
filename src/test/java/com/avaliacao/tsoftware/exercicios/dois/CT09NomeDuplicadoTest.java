package com.avaliacao.tsoftware.exercicios.dois;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import com.avaliacao.tsoftware.api.dto.requisicoes.ProdutoRequisicao;

@DisplayName("CT09 - Nome duplicado")
public class CT09NomeDuplicadoTest extends ProdutoTesteBase {

    @Test
    @Transactional
    void test() throws Exception {
 
        ProdutoRequisicao prep = new ProdutoRequisicao(
            "045 Elixir",
            new BigDecimal("560.00"),
            10
        );

        executar(prep, status().isCreated());

        ProdutoRequisicao req = new ProdutoRequisicao(
            "045 Elixir",
            new BigDecimal("999.00"),
            2
        );

        executar(req, status().isBadRequest());
    }
}