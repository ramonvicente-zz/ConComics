
<%@page import="com.concomics.model.bo.Catalogo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.concomics.model.bo.Usuario"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho.jsp" />

<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <h2>Meus Catálogos</h2>
            <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#catalogoModal">Novo Catálogo</button>
            <br><br>
        </div>
        
        <c:forEach items="${catalogos}" var="catalogo"> 
        <div class="container">
           <div class="row">
                <div class="col-sm-12">
                  <div class="panel panel-default">
                    <div class="panel-heading">
                      <h1><c:out value="${catalogo.titulo}"/></h1>
                      <button type="button" class="btn btn-info btn-lg right text-right" data-toggle="modal" data-target="#${catalogo.titulo}">Nova Historia</button>
                    </div>
                    <div class="panel-body">
                      <form action="login" method="POST">
                          Email: <input type="email" name="emailLogin" required><br><br>
                          Senha: <input type="password" name="senhaLogin" required><br><br>
                          <button type="submit">Entrar</button><br>
                      </form>
                    </div>
                  </div>
                </div>
            </div>
        </div>
         <!--Modal de História-->
        <div id="${catalogo.titulo}" class="modal fade" role="dialog">
          <div class="modal-dialog">

            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Nova História</h4>
              </div>

              <div class="modal-body">
                <form action="historias" method="POST">
                    Título: <input type="text" class="form-control" name="tituloHistoria"><br>
                    Gênero: <select name="generoHistoria" class="form-control">
                                <option value="">Selecione um gênero</option>
                                <c:forEach items="${generos}" var="genero">
                                    <option value="<c:out value="${genero.id_genero}"/>"><c:out value="${genero.descricao}"/></option>
                                </c:forEach>
                            </select><br><br>
                                Sinopse:<textarea class="form-control" rows="4" cols="30" name="descricaoHistoria"></textarea>
                    <h3>História</h3>
                    <textarea class="form-control" rows="10" cols="70" name="historia"></textarea>
                    <input type="hidden" name="usuarioHistoria" value="<c:out value="${catalogo.usuarioFk}"/>" >
                    <input type="hidden" name="catalogoHistoria" value="<c:out value="${catalogo.id_catalogo}"/>">
                    <br><br>
              </div>
              <div class="modal-footer">
                    <button type="submit" class="btn btn-success">Publicar</button>
                </form>
              </div>
            </div>
          </div>
        </div>
        </c:forEach>
    </div>
</div>

<!--Modal de Catalogo-->
<div id="catalogoModal" class="modal fade" role="dialog">
  <div class="modal-dialog">
      
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Novo Catálogo</h4>
      </div>
         <% Usuario atualUsr = (Usuario) session.getAttribute("usuarioAtual");%>
      <div class="modal-body">
        <form action="catalogos" method="POST">
            Título: <input type="text" name="tituloCatalogo">
            <input type="hidden" name="usuarioCatalogo" value="<%=atualUsr.getId_usuario()%>">
            <br><br>
      </div>
      <div class="modal-footer">
            <button type="submit" class="btn btn-default">Adicionar</button>
        </form>
      </div>
    </div>
  </div>
</div>  


</body>
</html>
