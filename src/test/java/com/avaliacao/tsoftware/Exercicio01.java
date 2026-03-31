package com.avaliacao.tsoftware;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import com.avaliacao.tsoftware.exercicios.um.CT01CadastroSucessoTest;
import com.avaliacao.tsoftware.exercicios.um.CT02EmailDuplicadoTest;
import com.avaliacao.tsoftware.exercicios.um.CT03SenhaCurtaTest;
import com.avaliacao.tsoftware.exercicios.um.CT04EmailInvalidoTest;
import com.avaliacao.tsoftware.exercicios.um.CT05NomeObrigatorioTest;

@Suite
@SuiteDisplayName("Testes - Exercício 01")
@SelectClasses(
    {

        CT01CadastroSucessoTest.class,
        CT02EmailDuplicadoTest.class,
        CT03SenhaCurtaTest.class,
        CT04EmailInvalidoTest.class,
        CT05NomeObrigatorioTest.class
    }
)
public class Exercicio01 {}