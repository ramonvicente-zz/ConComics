/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model.dao;

import com.concomics.model.bo.Historia;
import com.concomics.util.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ramon
 */
public class HistoriaDAO implements GenericoDAO<Historia>{

    @Override
    public void criar(Historia historia) {
        PreparedStatement ps;
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "INSERT INTO Historia (titulo_historia, descricao_historia, historia, Catalogo_id_catalogo, usuario_id, genero_id_genero, capa_historia)"+
                            "VALUES(?,?,?,?,?,?,?)";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, historia.getTitulo());
            ps.setString(2, historia.getDescricao());
            ps.setString(3, historia.getHistoria());
            ps.setInt(4, historia.getCatalogoFk());
            ps.setInt(5, historia.getUsuarioFk());
            ps.setInt(6, historia.getGeneroFk());
            ps.setString(7, "public/images/capas/default.png");
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void deletar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Historia objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Historia> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
