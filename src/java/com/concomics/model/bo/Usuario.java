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
public class Usuario {
    
    private long id_usuario;
    private String nome;
    private String email;
    private String senha;
    private int tipoUsuarioFk;
    boolean valido;

    
    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getTipoUsuarioFk() {
        return tipoUsuarioFk;
    }

    public void setTipoUsuarioFk(int tipoUsuarioFk) {
        this.tipoUsuarioFk = tipoUsuarioFk;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
    
    public boolean isValid() {
         return valido;
	}

      public void setValid(boolean novoValido) {
         valido = novoValido;
	}	


    @Override
    public String toString() {
        return '}' + "Usuario{" + "id_usuario=" + id_usuario + ", nome=" + nome + ", email=" + email + ", tipoUsuarioFk=" + tipoUsuarioFk;
    }
    
    
    
}
