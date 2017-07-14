/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model.bo;

/**
 *
 * @author ramones
 */
public class Catalogo {
    
    private long id_catalogo;
    private String titulo;
    private int usuarioFk;
    
    public int getUsuarioFk() {
        return usuarioFk;
    }

    public void setUsuarioFk(int usuarioFk) {
        this.usuarioFk = usuarioFk;
    }

    public long getId_catalogo() {
        return id_catalogo;
    }

    public void setId_catalogo(long id_catalogo) {
        this.id_catalogo = id_catalogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "id_catalogo=" + id_catalogo + ", titulo=" + titulo;
    }
    
    
}
