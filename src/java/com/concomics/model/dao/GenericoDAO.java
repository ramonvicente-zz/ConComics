/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.concomics.model.dao;

import java.util.List;

/**
 *
 * @author aluno
 */
public interface GenericoDAO<T> {
    
    public boolean criar(T objeto);
    public boolean deletar(T objeto);
    public boolean atualizar(T objeto);
    public List<T> listar();
    
}
