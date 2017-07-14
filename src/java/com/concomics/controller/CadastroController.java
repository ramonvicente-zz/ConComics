/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.concomics.controller;

import com.concomics.model.bo.Usuario;
import com.concomics.model.dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "cadastro", urlPatterns = {"/cadastro"})
public class CadastroController extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/login.jsp");
        dispatcher.forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sessao = request.getSession();
        Usuario novoUsr = new Usuario();
        
        String nome = request.getParameter("nomeCadastro");
        String email = request.getParameter("emailCadastro");
        String senha = request.getParameter("senhaCadastro");
        
        novoUsr.setNome(nome);
        novoUsr.setEmail(email);
        novoUsr.setSenha(senha);
        novoUsr.setTipoUsuarioFk(2);
        
        UsuarioDAO usrDAO = new UsuarioDAO();
        usrDAO.criar(novoUsr);
        
        /*sessao.setAttribute("nome", nome);
        sessao.setAttribute("e", nome);*/
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/index.jsp");
        dispatcher.forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
