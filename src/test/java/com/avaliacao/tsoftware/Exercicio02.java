package com.avaliacao.tsoftware;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import com.avaliacao.tsoftware.exercicios.dois.CT06CadastroSucessoTest;
import com.avaliacao.tsoftware.exercicios.dois.CT07PrecoInvalidoTest;
import com.avaliacao.tsoftware.exercicios.dois.CT08QuantidadeInvalidaTest;
import com.avaliacao.tsoftware.exercicios.dois.CT09NomeDuplicadoTest;
import com.avaliacao.tsoftware.exercicios.dois.CT10NomeCurtoTest;

@Suite
@SuiteDisplayName("Testes - Exercício 02")
@SelectClasses(
    {

        CT06CadastroSucessoTest.class,
        CT07PrecoInvalidoTest.class,
        CT08QuantidadeInvalidaTest.class,
        CT09NomeDuplicadoTest.class,
        CT10NomeCurtoTest.class
    }
)
public class Exercicio02 {}