/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model;

/**
 *
 * @author ramones
 */
public class Avaliacao {
    
    private long id_avaliacao;
    private int nota;

    public long getId_avaliacao() {
        return id_avaliacao;
    }

    public void setId_avaliacao(long id_avaliacao) {
        this.id_avaliacao = id_avaliacao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "id_avaliacao=" + id_avaliacao + ", nota=" + nota + '}';
    }
    
}
