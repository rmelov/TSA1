package com.avaliacao.tsoftware.exercicios.um;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import com.avaliacao.tsoftware.api.dto.requisicoes.UsuarioRequisicao;

@DisplayName("CT02 - Email duplicado")
public class CT02EmailDuplicadoTest extends UsuarioTesteBase {

    @Test
    @Transactional
    void test() throws Exception {
    
        UsuarioRequisicao prep = new UsuarioRequisicao(
            "Sísifo Félix Rocha Caíno da Pena",
            "sisifodapena@icq.com",
            "SenHa##123"
        );

        executar(prep, status().isCreated());

        UsuarioRequisicao req = new UsuarioRequisicao(
            "Sísifo Félix",
            "sisifodapena@icq.com",
            "outraSenHa##123"
        );
        
        executar(req, status().isBadRequest());
    }
}