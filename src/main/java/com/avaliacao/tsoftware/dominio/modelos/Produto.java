package com.avaliacao.tsoftware.dominio.modelos;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
        name = "id_produto",
        updatable = false,
        nullable = false
    )
    private UUID id;

    @NotBlank(message = "{nome.obrigatorio}")
    @Size(
        min = 3,
        max = 100,
        message = "{nome.restricao}"
    )
    @Column(
        name = "nome",
        nullable = false
    )
    private String nome;

    @NotNull(message = "{preco.obrigatorio}")
    @Positive(message = "{preco.restricao}")
    @Column(
        name = "preco",
        nullable = false
    )
    private BigDecimal preco;

    @NotNull(message = "{quantidade.obrigatoria}")
    @Min(
        value = 0,
        message = "{quantidade.restricao}"
    )
    @Column(
        name = "quantidade",
        nullable = false
    )
    private Integer quantidade;
}