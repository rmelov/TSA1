package com.avaliacao.tsoftware.dominio.servicos.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacao.tsoftware.api.dto.requisicoes.UsuarioRequisicao;
import com.avaliacao.tsoftware.dominio.repositorios.EmailRepositorio;

@Service
public class UsuarioValidacao {

    @Autowired private EmailRepositorio emailRepo;

    public void validar(UsuarioRequisicao requisicao) {

        if (emailRepo.findByEndereco(requisicao.getEmail()).isPresent()) {
            throw new RuntimeException("{email.existente}");
        }
    }
}