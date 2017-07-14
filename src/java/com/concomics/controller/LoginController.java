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
@WebServlet(name = "login", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/Login.jsp");
        dispatcher.forward(request, response);
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        HttpSession session = request.getSession();
        
        Usuario novoUsr = new Usuario();
        novoUsr.setEmail(request.getParameter("emailLogin"));
        novoUsr.setSenha(request.getParameter("senhaLogin"));
        
         UsuarioDAO usrVerifica = new UsuarioDAO();
        
        if(usrVerifica.autenticacao(novoUsr)){
                
            session.setAttribute("usuarioAtual",novoUsr); 
            
            //response.sendRedirect("view/index.jsp");
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/index.jsp");
            dispatcher.forward(request, response);
            
        } else{
            
            session.setAttribute("error", "Email ou senha não encontrados");
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/Login.jsp");
            dispatcher.forward(request, response);
        }
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
