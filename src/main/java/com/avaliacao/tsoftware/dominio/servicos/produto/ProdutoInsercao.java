package com.avaliacao.tsoftware.dominio.servicos.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacao.tsoftware.dominio.modelos.Produto;
import com.avaliacao.tsoftware.dominio.repositorios.ProdutoRepositorio;

import jakarta.transaction.Transactional;

@Service
public class ProdutoInsercao {

    @Autowired
    private ProdutoValidacao validacao;

    @Autowired
    private ProdutoRepositorio repo;

    @Transactional
    public Produto inserirOuAtualizar(Produto produto) {

        validacao.validar(produto);

        return repo.findByNome(
            produto.getNome()
        )
        .orElseGet(() -> repo.save(produto));
    }
}