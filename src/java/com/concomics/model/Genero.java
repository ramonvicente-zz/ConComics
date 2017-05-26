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
public class Genero {
    
    private long id_genero;
    private String descricao;
    
    public long getId_genero() {
        return id_genero;
    }

    public void setId_genero(long id_genero) {
        this.id_genero = id_genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Genero{" + "id_genero=" + id_genero + ", descricao=" + descricao + '}';
    }
    
    
}
