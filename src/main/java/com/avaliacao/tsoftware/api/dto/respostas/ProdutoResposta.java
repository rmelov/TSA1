package com.avaliacao.tsoftware.api.dto.respostas;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProdutoResposta {

    private UUID id;
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;
}