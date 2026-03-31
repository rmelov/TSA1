package com.avaliacao.tsoftware.api.dto.requisicoes;

import com.avaliacao.tsoftware.dominio.configuracao.RegraSenha;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequisicao {

    @NotBlank(message = "{nome.obrigatorio}")
    private String nome;

    @NotBlank(message = "{email.obrigatorio}")
    @Email(message = "{email.invalido}")
    private String email;

    @NotBlank(message = "{senha.obrigatoria}")
    @Size(
        min = 8,
        message = "{senha.tamanho}"
    )
    @Pattern(
        regexp = RegraSenha.REGEX_SENHA,
        message = "{senha.regra}"
    )
    private String senha;
}