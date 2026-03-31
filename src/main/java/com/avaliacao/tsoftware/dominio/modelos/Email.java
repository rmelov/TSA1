package com.avaliacao.tsoftware.dominio.modelos;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "email")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
        name = "id_email",
        updatable = false,
        nullable = false
    )
    private UUID id;

    @jakarta.validation.constraints.Email(message = "{email.invalido}")
    @Column(
        name = "endereco",
        unique = true,
        nullable = false
    )
    private String endereco;

    @OneToOne
    @JoinColumn(
        name = "id_usuario",
        unique = true,
        nullable = false
    )
    private Usuario usuario;
}