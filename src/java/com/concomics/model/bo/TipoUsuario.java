/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ramon Vicente
 */

public class TipoUsuario implements Serializable {
    

    private long id_tipo_usuario;
    
    private String descricao;

    public long getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(long id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tipo_Usuario{" + "id_tipo_usuario=" + id_tipo_usuario + ", descricao=" + descricao + '}';
    }
    
    
}
