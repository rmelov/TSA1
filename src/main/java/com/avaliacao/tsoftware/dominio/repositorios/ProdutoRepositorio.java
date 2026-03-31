package com.avaliacao.tsoftware.dominio.repositorios;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.tsoftware.dominio.modelos.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, UUID>{
    
    Optional<Produto> findByNome(String nome);
}