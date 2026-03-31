package com.avaliacao.tsoftware.dominio.servicos.casos;

import com.avaliacao.tsoftware.dominio.modelos.casos.CasoDeTeste;
import com.avaliacao.tsoftware.dominio.modelos.casos.Exercicio;

public abstract class Base {

    public abstract Integer getNumeroExercicio();
    public abstract CasoDeTeste fornecerDados(Exercicio exercicio);

    protected CasoDeTeste montar(
        Exercicio exe,
        String desc,
        String cond,
        String passos,
        String res,
        String req
    ){
        CasoDeTeste ct = new CasoDeTeste();
        ct.setExercicio(exe);
        ct.setDescricao(desc);
        ct.setCondicoes(cond);
        ct.setPassos(passos);
        ct.setResultadoEsperado(res);
        ct.setRequisitos(req);
        return ct;
    }
}