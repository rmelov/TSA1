package com.avaliacao.tsoftware.exercicios.dois;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import com.avaliacao.tsoftware.api.dto.requisicoes.ProdutoRequisicao;

@DisplayName("CT08 - Quantidade inválida")
public class CT08QuantidadeInvalidaTest extends ProdutoTesteBase {

    @Test
    @Transactional
    void test() throws Exception {
        
        ProdutoRequisicao req = new ProdutoRequisicao(
            "Alice Gota",
            new BigDecimal("350.00"),
            -1
        );
        
        executar(req, status().isBadRequest());
    }
}