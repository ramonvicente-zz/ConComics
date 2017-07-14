<%-- 
    Document   : cabecalho
    Created on : 09/06/2017, 16:50:35
    Author     : ramon
--%>

<%@page import="com.concomics.model.bo.Usuario"%>
<%@page import="javax.xml.crypto.Data"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
    <head>
            <title>ConComics</title>
            <meta charset="utf-8"/>
            <link href="public/css/style.css" rel='stylesheet' type='text/css' />
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="shortcut icon" type="image/x-icon" href="public/images/fav-icon.png" />
            <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

            <!----webfonts---->
            <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
            <!----//webfonts---->
            <!-- Global CSS for the page and tiles -->
            <link rel="stylesheet" href="public/css/bootstrap.min.css">
            <!-- //Global CSS for the page and tiles -->
            <!---start-click-drop-down-menu----->
            <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
            <script src="public/js/bootstrap.min.js"></script>
    <!----start-dropdown--->

    <!----//End-dropdown--->
            <!---//End-click-drop-down-menu----->
    </head>
    <body>

        <nav class="navbar navbar-default navbar-fixed-top header">
            <div class="wrap">
            <div class="logo navbar-headr">
                    <!--<a href="index.html"><img src="images/logo.png" title="pinbal" /></a>-->
                    <a class="navbar-brand" href="inicio">ConComics</a>
            </div>

            <ul class="nav navbar-nav">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Navegar
                  <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                  <li><a href="#">Aventura</a></li>
                  <li><a href="#">Ação</a></li>
                  <li><a href="#">Terror</a></li>
                  <li><a href="#">Ficição</a></li>
                </ul>
            </li>
            </ul>

            <div class="top-searchbar">
                <form>
                    <input type="text" name="pesquisaMenu">
                    <button type="submit" class="btn btn-default btn-lg">
                        <span class="glyphicon glyphicon-search"></span>
                    </button>
                </form>
            </div>
            <div class="userinfo">
                <div class="user collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <% Usuario atualUsr = (Usuario) session.getAttribute("usuarioAtual"); 

                              if(atualUsr!=null){
                        %>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Olá, <%=atualUsr.getNome()%>!
                                      <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu">
                                      <li><a href="#">Meu Perfil</a></li>
                                      <li><a href="catalogos">Minhas Histórias</a></li>
                                      <li><a href="estante">Minha Lista</a></li>
                                      <li><a href="${pageContext.request.contextPath}/logout">Encerrar Sessão</a></li>
                                    </ul>
                                </li>

                         <%} else{%>
                                <li><a href="login">Acesse já!</a></li>
                         <%}%>

                    </ul>
                </div>
            </div>
        </div>
        </nav>
            <br><br><br><br><br><br><br><br><br>
