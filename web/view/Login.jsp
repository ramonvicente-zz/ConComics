<%-- 
    Document   : Login
    Created on : 24/04/2017, 18:30:57
    Author     : ramones
--%>

<%@page import="java.util.Date"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Pinball Website Template | Home :: w3layouts</title>
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
		<script src="public/js/jquery.min.js"></script>
        <!----start-dropdown--->
         
        <!----//End-dropdown--->
		<!---//End-click-drop-down-menu----->
	</head>
	<body>
		<!---start-wrap---->
			<!---start-header---->
			<nav class="navbar navbar-default navbar-fixed-top header">
				<div class="wrap">
				<div class="logo navbar-headr">
					<!--<a href="index.html"><img src="images/logo.png" title="pinbal" /></a>-->
                                        <a class="navbar-brand" href="#">ConComics</a>
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
						<input type="text" name="pesquisaMenu" class="inline"/>
                                                <button type="submit" href="#" class="btn btn-default btn-lg">
                                                    <span class="glyphicon glyphicon-search"></span>
                                                </button>
                                                
					</form>
				</div>
				<div class="userinfo">
					<div class="user collapse navbar-collapse">
						<ul class="nav navbar-nav navbar-right">
                                                    <%String email = request.getParameter("${usuario.email}");%>
                                                    <% if( email == ""){ %>
                                                        <li><a href="#">Login</a></li>
                                                        <li><a href="#">Cadastrar-se</a></li>
                                                    <%}else{ %>
                                                        <li class="dropdown">
                                                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Olá, <%session.getAttribute("nome");%>
                                                              <span class="caret"></span>
                                                            </a>
                                                            <ul class="dropdown-menu">
                                                              <li><a href="#">Meu Perfil</a></li>
                                                              <li><a href="#">Meus Catálogos</a></li>
                                                              <li><a href="#">Minha Lista</a></li>
                                                              <li><a href="#">Encerrar Sessão</a></li>
                                                            </ul>
                                                        </li>
                                                    <% } %>
						</ul>
					</div>
				</div>
				<div class="clear"> </div>
			</div>
		</nav>
                <div class="container-fluid">
                    <div class="text-center">
                      <h2>Pricing</h2>
                      <h4>Choose a payment plan that works for you</h4>
                    </div>
                    <div class="row">
                      <div class="col-sm-12">
                        <div class="panel panel-default text-center">
                          <div class="panel-heading">
                            <h1>Login</h1>
                          </div>
                          <div class="panel-body">
                            <form action="LoginController" method="POST">
                                Email: <input type="email" name="emailLogin"><br><br>
                                Senha: <input type="password" name="senhaLogin"><br><br>
                                <button type="submit">Entrar</button><br>
                            </form>
                              
                              <%session.getAttribute("emailLogin");%>
                          </div>
                        </div>
                      </div>
                    </div>
                </div>
        </body>
</html>
