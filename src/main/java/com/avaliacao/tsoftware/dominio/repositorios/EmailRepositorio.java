package com.avaliacao.tsoftware.dominio.repositorios;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.tsoftware.dominio.modelos.Email;

public interface EmailRepositorio extends JpaRepository<Email, UUID>{

    Optional<Email> findByEndereco(String endereco);
}