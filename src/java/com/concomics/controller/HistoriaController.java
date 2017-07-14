/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concomics.controller;

import com.concomics.model.bo.Historia;
import com.concomics.model.dao.HistoriaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ramones_
 */
@WebServlet(name = "historias", urlPatterns = {"/historias"})
public class HistoriaController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
        
        Historia novaHistoria = new Historia();
        
        novaHistoria.setTitulo(request.getParameter("tituloHistoria"));
        novaHistoria.setGeneroFk(Integer.parseInt(request.getParameter("generoHistoria")));
        novaHistoria.setDescricao(request.getParameter("descricaoHistoria"));
        novaHistoria.setHistoria(request.getParameter("historia"));
        novaHistoria.setUsuarioFk(Integer.parseInt(request.getParameter("usuarioHistoria")));
        novaHistoria.setCatalogoFk(Integer.parseInt(request.getParameter("catalogoHistoria")));
        
        HistoriaDAO historiaDAO = new HistoriaDAO();
        
        historiaDAO.criar(novaHistoria);
        
        response.sendRedirect("catalogos");
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
