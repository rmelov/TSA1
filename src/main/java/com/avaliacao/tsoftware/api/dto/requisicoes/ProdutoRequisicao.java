package com.avaliacao.tsoftware.api.dto.requisicoes;

import java.math.BigDecimal;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequisicao {

    @NotBlank(message = "{nome.obrigatorio}")
    @Size(
        min = 3,
        max = 100,
        message = "{nome.restricao}"
    )
    private String nome;

    @NotNull(message = "{preco.obrigatorio}")
    @Positive(message = "{preco.restricao}")
    private BigDecimal preco;

    @NotNull(message = "{quantidade.obrigatoria}")
    @Min(
        value = 0,
        message = "{quantidade.restricao}"
    )
    private Integer quantidade;
}