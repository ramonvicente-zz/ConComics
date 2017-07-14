/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model.bo;

/**
 *
 * @author Ramon Vicente
 */
public class Historia {
    
    private long id_historia;
    private String titulo;
    private String descricao;
    private String capa;
    private String historia;
    private int generoFk;
    private int usuarioFk;
    private int catalogoFk;

    public long getId_historia() {
        return id_historia;
    }

    public void setId_historia(long id_historia) {
        this.id_historia = id_historia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public int getGeneroFk() {
        return generoFk;
    }

    public void setGeneroFk(int generoFk) {
        this.generoFk = generoFk;
    }

    public int getUsuarioFk() {
        return usuarioFk;
    }

    public void setUsuarioFk(int usuarioFk) {
        this.usuarioFk = usuarioFk;
    }

    public int getCatalogoFk() {
        return catalogoFk;
    }

    public void setCatalogoFk(int catalogoFk) {
        this.catalogoFk = catalogoFk;
    }
    
    
    
}
