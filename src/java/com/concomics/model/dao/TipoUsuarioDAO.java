/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model.dao;

import com.concomics.model.bo.TipoUsuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ramon
 */
public class TipoUsuarioDAO implements GenericoDAO<TipoUsuario>{
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConComicDPU"); 
    EntityManager em = emf.createEntityManager();
   

    @Override
    public void criar(TipoUsuario objeto) {
        
    }

    @Override
    public void deletar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(TipoUsuario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoUsuario> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
