package com.avaliacao.tsoftware.dominio.modelos.casos;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exercicio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exercicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_exercicio")
    private UUID id;

    @Column(name = "n_exercicio")
    private Integer numero;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(
        mappedBy = "exercicio",
        fetch = FetchType.EAGER
    )
    private List<CasoDeTeste> casos;
}