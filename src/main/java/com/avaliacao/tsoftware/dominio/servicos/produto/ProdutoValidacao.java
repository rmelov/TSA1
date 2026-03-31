package com.avaliacao.tsoftware.dominio.servicos.produto;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacao.tsoftware.dominio.modelos.Produto;
import com.avaliacao.tsoftware.dominio.repositorios.ProdutoRepositorio;

@Service
public class ProdutoValidacao {

    @Autowired
    private ProdutoRepositorio repo;

    public void validar(Produto produto) {

        if (produto.getNome() == null || produto.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("{nome.obrigatorio}");
        }

        int length = produto.getNome().length();
        if (length < 3 || length > 100) {
            throw new IllegalArgumentException("{nome.restricao}");
        }

        if (produto.getId() == null && repo.findByNome(produto.getNome()).isPresent()) {
            throw new IllegalArgumentException("{nome.restricao}");
        }

        if (produto.getPreco() == null || produto.getPreco().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("{preco.restricao}");
        }

        if (produto.getQuantidade() == null || produto.getQuantidade() < 0) {
            throw new IllegalArgumentException("{quantidade.restricao}");
        }
    }
}