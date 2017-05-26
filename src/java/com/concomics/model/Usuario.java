/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model;

import java.awt.image.BufferedImage;

/**
 *
 * @author Ramon Vicente
 */
public class Usuario {
    
    private long id_usuario;
    private String nome;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    private String email;
    private String sobre;
    private String senha;
    private BufferedImage foto;
    
    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSobre() {
        return sobre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nome=" + nome + ", email=" + email + ", sobre=" + sobre + '}';
    }
    
    
    
}
