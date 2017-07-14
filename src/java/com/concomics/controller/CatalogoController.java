/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.concomics.controller;

import com.concomics.model.bo.Catalogo;
import com.concomics.model.bo.Usuario;
import com.concomics.model.dao.CatalogoDAO;
import com.concomics.model.dao.GeneroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aluno
 */
@WebServlet(name = "catalogos", urlPatterns = {"/catalogos"})
public class CatalogoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        Usuario usuarioId = (Usuario) session.getAttribute("usuarioAtual");
        int id = (int) usuarioId.getId_usuario();
        
        CatalogoDAO catalogo = new CatalogoDAO();
        request.setAttribute("catalogos",catalogo.catalogosDeUsuario(id));
        
        GeneroDAO generos = new GeneroDAO();
        request.setAttribute("generos",generos.listar());
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/meus_catalogos.jsp");
        dispatcher.forward(request, response);
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String titulo = request.getParameter("tituloCatalogo");
        String idUsuario = request.getParameter("usuarioCatalogo");
        
        Catalogo novoCatalogo = new Catalogo();
        CatalogoDAO catalogoDao = new CatalogoDAO();
        
        novoCatalogo.setTitulo(titulo);
        novoCatalogo.setUsuarioFk(Integer.parseInt(idUsuario));
        
        catalogoDao.criar(novoCatalogo);
        
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
