package com.avaliacao.tsoftware.exercicios.dois;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import com.avaliacao.tsoftware.api.dto.requisicoes.ProdutoRequisicao;

@DisplayName("CT07 - Preço inválido")
public class CT07PrecoInvalidoTest extends ProdutoTesteBase {

    @Test
    @Transactional
    void test() throws Exception {
        
        ProdutoRequisicao reqZero = new ProdutoRequisicao(
            "Alice Gota",
            BigDecimal.ZERO,
            5
        );

        executar(reqZero, status().isBadRequest());

        
        ProdutoRequisicao reqNegativo = new ProdutoRequisicao(
            "Big Stubby",
            new BigDecimal("-10.50"),
            5
        );

        executar(reqNegativo, status().isBadRequest());
    }
}