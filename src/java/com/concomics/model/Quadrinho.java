/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model;

/**
 *
 * @author Ramon Vicente
 */
public class Quadrinho {
    
    private long id_quadrinho;
    private String titulo;
    private String descricao;
    //falta a capa

    public long getId_quadrinho() {
        return id_quadrinho;
    }

    public void setId_quadrinho(long id_quadrinho) {
        this.id_quadrinho = id_quadrinho;
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

    @Override
    public String toString() {
        return "Quadrinho{" + "id_quadrinho=" + id_quadrinho + ", titulo=" + titulo + ", descricao=" + descricao + '}';
    }
    
    
}
