/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.concomics.model.dao;

import com.concomics.model.bo.Usuario;
import com.concomics.util.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class UsuarioDAO implements GenericoDAO<Usuario>{

    
    @Override
    public void criar(Usuario usuario) {
        PreparedStatement ps;
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "INSERT INTO Usuario (nome_usuario, senha_usuario, email_usuario, tipousuario_usuario_fk)"+
                            "VALUES(?,?,?,?)";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getEmail());
            ps.setInt(4, usuario.getTipoUsuarioFk());
            
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
            
            String sql = "DELETE FROM Usuario WHERE id_usuario = ?";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setLong(1, id);
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            
                throw new RuntimeException(ex);
        }
    }

    @Override
    public void atualizar(Usuario usuario) {
        PreparedStatement ps;
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "UPDATE Usuario SET nome_usuario = ?, senha_usuario = ?, email_usuario = ?\" +\n" +
                         " \" WHERE id_usuario = ?\"";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, usuario.getNome());
            ps.setString(3, usuario.getSenha());
            ps.setString(3, usuario.getEmail());
            ps.setLong(4, usuario.getId_usuario());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<Usuario> listar() {
        PreparedStatement ps;
        ResultSet rts = null;
        List<Usuario> listaUsuario = new ArrayList<Usuario>();
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "SELECT * FROM Usuario";
            ps = conexao.prepareStatement(sql);
            rts = ps.executeQuery();
            
            //`Para cada usuário no banco...
            while(rts.next()){
                
                //cria um novo objeto usuario...
                Usuario usr = new Usuario();
                
                //inserindo seus dados do banco no novo usuário...
                usr.setId_usuario(rts.getLong("id_usuario"));
                usr.setNome(rts.getString("nome_usuario"));
                usr.setEmail(rts.getString("email_usuario"));
                usr.setSenha(rts.getString("senha_usuario"));
                usr.setTipoUsuarioFk(rts.getInt("tipousuario_usuario"));
                
                //e add cada novo usuario à lista de usuarios
                listaUsuario.add(usr);
                
            }
            
            rts.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
        return listaUsuario;
    }
    
    public boolean autenticacao(Usuario usr){
        
        PreparedStatement ps;
        ResultSet rts;
        
        String emailUsr = usr.getEmail();
        String senhaUsr = usr.getSenha();
            
        String email = new String("");
        String senha = new String("");
        String nome = new String("");
        long id = 0;
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "SELECT * FROM Usuario WHERE email_usuario='"+emailUsr+"' AND senha_usuario='"+senhaUsr+"'";
            
            ps = conexao.prepareStatement(sql);
            rts = ps.executeQuery();
            
            while(rts.next()){
                
                email = rts.getString("email_usuario");
                senha = rts.getString("senha_usuario");
                nome = rts.getString("nome_usuario");
                id = rts.getLong("id_usuario");
            }
            
            
            rts.close();
            ps.close();
            conexao.close();
            
        } catch(SQLException ex){
            
            throw new RuntimeException(ex);
        }
        
        //verifica se o usuário existe
        if(emailUsr.equals(email) && senhaUsr.equals(senha)){

            usr.setNome(nome);
            usr.setId_usuario(id);

            return true;
            
        } else{
        
            return false;
        }
    } 
    
}
