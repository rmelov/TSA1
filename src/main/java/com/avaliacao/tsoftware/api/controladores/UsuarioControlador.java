package com.avaliacao.tsoftware.api.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.tsoftware.api.dto.requisicoes.UsuarioRequisicao;
import com.avaliacao.tsoftware.dominio.servicos.usuario.UsuarioInsercao;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioInsercao insercao;

    @PostMapping
    public ResponseEntity<String> cadastrar(@Valid @RequestBody UsuarioRequisicao requisicao) {
        insercao.executar(requisicao);
        return ResponseEntity.status(HttpStatus.CREATED).body("ok");
    }
}