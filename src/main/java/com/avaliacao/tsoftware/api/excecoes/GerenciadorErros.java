package com.avaliacao.tsoftware.api.excecoes;

import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GerenciadorErros {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> tratarErro400(MethodArgumentNotValidException ex) {

        var erros = ex.getFieldErrors().stream()
        .map(err -> err.getField() + ": " + err.getDefaultMessage())
        .collect(Collectors.toList());
        
        return ResponseEntity.badRequest().body(erros);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> tratarErroRegraNegocio(RuntimeException ex) {
        
        if (
            ex.getMessage().contains("email.existente") || 
            ex.getMessage().contains("nome.restricao")
        ) {
            
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
        return ResponseEntity.internalServerError().body(ex.getMessage());
    }
}