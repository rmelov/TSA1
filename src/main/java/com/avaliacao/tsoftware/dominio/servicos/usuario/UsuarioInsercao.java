package com.avaliacao.tsoftware.dominio.servicos.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacao.tsoftware.api.dto.requisicoes.UsuarioRequisicao;
import com.avaliacao.tsoftware.dominio.modelos.Email;
import com.avaliacao.tsoftware.dominio.modelos.Usuario;
import com.avaliacao.tsoftware.dominio.repositorios.EmailRepositorio;
import com.avaliacao.tsoftware.dominio.repositorios.UsuarioRepositorio;

import jakarta.transaction.Transactional;

@Service
public class UsuarioInsercao {

    @Autowired
    private UsuarioValidacao validacao;

    @Autowired
    private UsuarioRepositorio repo;

    @Autowired
    private EmailRepositorio emailRepo;

    @Transactional
    public void executar(UsuarioRequisicao requisicao) {
        
        validacao.validar(requisicao);

        Usuario usuario = new Usuario();
        usuario.setNome(requisicao.getNome());
        usuario.setSenha(requisicao.getSenha());
        repo.save(usuario);

        Email email = new Email();
        email.setEndereco(requisicao.getEmail());
        email.setUsuario(usuario);
        emailRepo.save(email);
    }
}