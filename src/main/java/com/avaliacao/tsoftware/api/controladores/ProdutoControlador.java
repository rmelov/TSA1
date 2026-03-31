package com.avaliacao.tsoftware.api.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.tsoftware.api.dto.requisicoes.ProdutoRequisicao;
import com.avaliacao.tsoftware.dominio.modelos.Produto;
import com.avaliacao.tsoftware.dominio.servicos.produto.ProdutoInsercao;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoControlador {

    @Autowired
    private ProdutoInsercao insercao;

    @PostMapping
    public ResponseEntity<String> cadastrar(@Valid @RequestBody ProdutoRequisicao requisicao){

        Produto produto = new Produto();
        produto.setNome(requisicao.getNome());
        produto.setPreco(requisicao.getPreco());
        produto.setQuantidade(requisicao.getQuantidade());

        insercao.inserirOuAtualizar(produto);

        return ResponseEntity.status(HttpStatus.CREATED).body("ok");
    }
}