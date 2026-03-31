package com.avaliacao.tsoftware.api.dto.respostas.casos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExercicioResposta {
    
    private Integer numero;
    private String descricao;
    private List<CasoDeTesteResposta> casos;
}