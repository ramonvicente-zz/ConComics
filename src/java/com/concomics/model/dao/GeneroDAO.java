/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model.dao;

import com.concomics.model.bo.Genero;
import com.concomics.model.bo.Usuario;
import com.concomics.util.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramon
 */
public class GeneroDAO implements GenericoDAO<Genero>{

    @Override
    public void criar(Genero objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Genero objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Genero> listar() {
        PreparedStatement ps;
        ResultSet rts = null;
        List<Genero> listaGenero = new ArrayList<Genero>();
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "SELECT * FROM Genero";
            ps = conexao.prepareStatement(sql);
            rts = ps.executeQuery();
            
            //`Para cada usuário no banco...
            while(rts.next()){
                
                //cria um novo objeto usuario...
                Genero genero = new Genero();
                
                //inserindo seus dados do banco no novo usuário...
                genero.setId_genero(rts.getLong("id_genero"));
                genero.setDescricao(rts.getString("descricao_genero"));

                
                //e add cada novo usuario à lista de usuarios
                listaGenero.add(genero);
                
            }
            
            rts.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
        return listaGenero;
    }
    
}
