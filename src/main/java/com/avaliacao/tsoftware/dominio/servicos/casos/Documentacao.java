package com.avaliacao.tsoftware.dominio.servicos.casos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;
import com.avaliacao.tsoftware.dominio.repositorios.casos.CasoDeTesteRepositorio;
import com.avaliacao.tsoftware.dominio.repositorios.casos.ExercicioRepositorio;

@Component
public class Documentacao implements CommandLineRunner {

    @Autowired
    private ExercicioRepositorio exRepo;

    @Autowired
    private CasoDeTesteRepositorio ctRepo;

    @Autowired
    private List<Base> definicoes;

    @SuppressWarnings("null")
    @Override
    public void run(String... args) throws Exception {

        Exercicio ex1 = exRepo.findByNumero(1)
        .orElseGet(() -> exRepo.save(
            new Exercicio(
                null,
                1,
                "cadastro de usuários",
                new java.util.ArrayList<>())
            )
        );

        Exercicio ex2 = exRepo.findByNumero(2)
        .orElseGet(() -> exRepo.save(
            new Exercicio(
                null,
                2,
                "gerenciamento de produtos",
                new java.util.ArrayList<>())
            )
        );

        if (ctRepo.count() == 0) {
            for (Base def : definicoes) {
                Exercicio alvo = (def.getNumeroExercicio() == 1) ? ex1 : ex2;
                ctRepo.save(def.fornecerDados(alvo));
            }
        }
    }
}