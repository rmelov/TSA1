package com.avaliacao.tsoftware.exercicios.um;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.ResultMatcher;

import com.avaliacao.tsoftware.exercicios.base.TesteBase;

@SpringBootTest
@AutoConfigureMockMvc
public abstract class UsuarioTesteBase extends TesteBase {

    protected void executar(Object req, ResultMatcher statusEsperado) throws Exception {
        super.executar("/api/usuarios", req, statusEsperado);
    }
}