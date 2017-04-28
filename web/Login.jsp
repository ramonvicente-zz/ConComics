<%-- 
    Document   : Login
    Created on : 24/04/2017, 18:30:57
    Author     : ramones
--%>

<%@page import="java.util.Date"%>
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
                                    
                                <ul class="nav navbar-nav navbar-right">
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
						<input type="text" /><input type="submit" value="" />
					</form>
				</div>
				<div class="userinfo">
					<div class="user">
						<ul>
							<li><a href="#"><img src="public/images/user-pic.png" title="user-name" /><span>Ipsum</span></a></li>
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
                            <h1>Basic</h1>
                          </div>
                          <div class="panel-body">
                            <p><strong>20</strong> Lorem</p>
                            <p><strong>15</strong> Ipsum</p>
                            <p><strong>5</strong> Dolor</p>
                            <p><strong>2</strong> Sit</p>
                            <p><strong>Endless</strong> Amet</p>
                            <% 
                                Date data = new Date();
                            %>
                            <%=
                               data %>
                          </div>
                        </div>
                      </div>
                    </div>
        </body>
</html>
