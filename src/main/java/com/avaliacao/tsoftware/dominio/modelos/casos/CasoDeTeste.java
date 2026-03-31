package com.avaliacao.tsoftware.dominio.modelos.casos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "caso_de_teste")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CasoDeTeste {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_caso_de_teste")
    private Integer cod;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "pre_condicoes")
    private String condicoes;

    @Column(name = "passos")
    private String passos;

    @Column(name = "resultado_esperado")
    private String resultadoEsperado;

    @Column(name = "requisitos_nao_funcionais")
    private String requisitos;

    @ManyToOne
    @JoinColumn(name = "id_exercicio")
    private Exercicio exercicio;
}