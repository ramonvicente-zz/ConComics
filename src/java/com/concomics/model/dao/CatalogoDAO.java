/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model.dao;

import com.concomics.model.bo.Catalogo;
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
public class CatalogoDAO implements GenericoDAO<Catalogo>{

    @Override
    public void criar(Catalogo catalogo) {
        
        PreparedStatement ps;
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "INSERT INTO Catalogo (titulo_catalogo, Usuario_id_usuario) VALUES(?,?)";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, catalogo.getTitulo());
            ps.setInt(2, catalogo.getUsuarioFk());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
        
    }

    @Override
    public void deletar(long id) {
        PreparedStatement ps;
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "DELETE FROM catalogo WHERE id_catalogo = ?";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setLong(1, id);
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void atualizar(Catalogo catalogo) {
        
        PreparedStatement ps;
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "UPDATE catalogo SET titulo_catalogo = ?, usuario_id_catalogo_fk = ?, WHERE id_catalogo = ?\"";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, catalogo.getTitulo());
            ps.setInt(2, catalogo.getUsuarioFk());

            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<Catalogo> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Catalogo> catalogosDeUsuario(int usuarioId){
        
        PreparedStatement ps;
        ResultSet rts = null;
        List<Catalogo> listaCatalogo = new ArrayList<Catalogo>();
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "SELECT * FROM Catalogo WHERE Usuario_id_usuario=?";
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, usuarioId);
            rts = ps.executeQuery();
            
            //`Para cada catalogo no banco...
            while(rts.next()){
                
                //cria um novo objeto catalogo...
                Catalogo catalogo = new Catalogo();
                
                //inserindo seus dados do banco no novo catalogo...
                catalogo.setId_catalogo(rts.getInt("id_catalogo"));
                catalogo.setTitulo(rts.getString("titulo_catalogo"));
                catalogo.setUsuarioFk(rts.getInt("Usuario_id_usuario"));
                
                //e add cada novo catalogo à lista de catalogos
                listaCatalogo.add(catalogo);
                
            }
            
            rts.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
        
        return listaCatalogo;
    }
    
}
