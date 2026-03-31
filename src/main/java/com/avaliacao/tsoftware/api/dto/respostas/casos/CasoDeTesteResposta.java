package com.avaliacao.tsoftware.api.dto.respostas.casos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CasoDeTesteResposta {

    private Integer cod;
    private String descricao;
    private String preCondicoes;
    private String passos;
    private String resultadoEsperado;
    private String requisitosNaoFuncionais;
}