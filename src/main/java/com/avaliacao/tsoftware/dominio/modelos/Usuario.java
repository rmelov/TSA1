package com.avaliacao.tsoftware.dominio.modelos;

import java.util.UUID;

import com.avaliacao.tsoftware.dominio.configuracao.RegraSenha;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
        name = "id_usuario",
        updatable = false,
        nullable = false
    )
    private UUID id;

    @Column(
        name = "nome",
        nullable = false
    )
    private String nome;

    @NotBlank(message = "{senha.obrigatoria}")
    @Size(
        min = 8,
        message = "{senha.tamanho}"
    )
    @Pattern(
        regexp = RegraSenha.REGEX_SENHA,
        message = "{senha.regra}"
    )
    @Column(
        name = "senha",
        nullable = false
    )
    private String senha;
}