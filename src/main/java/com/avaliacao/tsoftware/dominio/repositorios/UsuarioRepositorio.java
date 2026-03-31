package com.avaliacao.tsoftware.dominio.repositorios;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.tsoftware.dominio.modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, UUID>{
    
    Optional<Usuario> findByNome(String nome);
}