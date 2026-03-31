package com.avaliacao.tsoftware.dominio.repositorios.casos;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;

public interface ExercicioRepositorio extends JpaRepository<Exercicio, UUID> {
 
    Optional<Exercicio> findByNumero(Integer numero);
}