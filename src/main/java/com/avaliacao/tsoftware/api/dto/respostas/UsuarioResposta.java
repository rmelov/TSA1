package com.avaliacao.tsoftware.api.dto.respostas;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioResposta {
    
    private UUID id;
    private String nome;
    private String email;
}