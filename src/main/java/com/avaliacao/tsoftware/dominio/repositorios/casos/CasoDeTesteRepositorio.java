package com.avaliacao.tsoftware.dominio.repositorios.casos;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;

public interface CasoDeTesteRepositorio extends JpaRepository<CasoDeTeste, UUID> {

    List<CasoDeTeste> findByExercicioNumero(Integer numero);
}