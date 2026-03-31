package com.avaliacao.tsoftware.api.controladores.casos;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.tsoftware.api.dto.respostas.casos.CasoDeTesteResposta;
import com.avaliacao.tsoftware.api.dto.respostas.casos.ExercicioResposta;
import com.avaliacao.tsoftware.dominio.repositorios.casos.ExercicioRepositorio;

@RestController
@RequestMapping("/api/documentacao")
public class DocumentacaoControlador {

    @Autowired
    private ExercicioRepositorio exercicioRepo;

    @GetMapping
    public List<ExercicioResposta> listarDocumentacao() {
        return exercicioRepo.findAll().stream().map(ex -> new ExercicioResposta(
            ex.getNumero(),
            ex.getDescricao(),
            ex.getCasos().stream().map(ct -> new CasoDeTesteResposta(
                ct.getCod(),
                ct.getDescricao(),
                ct.getCondicoes(),
                ct.getPassos(),
                ct.getResultadoEsperado(),
                ct.getRequisitos()
            )).collect(Collectors.toList())
        )).collect(Collectors.toList());
    }
}