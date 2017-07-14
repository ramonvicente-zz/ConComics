/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.model.dao;

import com.concomics.model.bo.Avaliacao;
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
public class AvaliacaoDAO implements GenericoDAO<Avaliacao>{

    @Override
    public void criar(Avaliacao avaliacao) {
        PreparedStatement ps;
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "INSERT INTO avaliacao (nota_avaliacao, quadrinho_avaliacao_afk) VALUES(?, ?)";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setInt(1, avaliacao.getNota());
            ps.setInt(2, avaliacao.getQuadrinhoFk());
            
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
            
            String sql = "DELETE FROM avaliacao WHERE id_avaliacao = ?";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setLong(1, id);
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void atualizar(Avaliacao avaliacao) {
        PreparedStatement ps;
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "UPDATE avaliacao SET nota_avaliacao = ?, quadrinho_avaliacao_afk = ? WHERE id = ?";
            
            ps = conexao.prepareStatement(sql);
            
            ps.setInt(1, avaliacao.getNota());
            ps.setLong(2, avaliacao.getId_avaliacao());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<Avaliacao> listar() {
        PreparedStatement ps;
        ResultSet rts = null;
        List<Avaliacao> listaAvaliacao = new ArrayList<Avaliacao>();
        
        try(Connection conexao = new ConexaoFactory().getConnection()){
            
            String sql = "SELECT * FROM avaliacao";
            ps = conexao.prepareStatement(sql);
            rts = ps.executeQuery();
            
            //`Para cada usuário no banco...
            while(rts.next()){
                
                //cria um novo objeto usuario...
                Avaliacao avaliacao = new Avaliacao();
                
                //inserindo seus dados do banco no novo usuário...
                avaliacao.setId_avaliacao(rts.getLong("id_avaliacao"));
                avaliacao.setNota(rts.getInt("nota_avaliacao"));
                avaliacao.setQuadrinhoFk(rts.getInt("quadrinho_avaliacao_afk"));
                
                //e add cada novo usuario à lista de usuarios
                listaAvaliacao.add(avaliacao);
                
            }
            
            rts.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        }
        return listaAvaliacao;
    }
    
}
