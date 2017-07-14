<%-- 
    Document   : Login
    Created on : 24/04/2017, 18:30:57
    Author     : ramones
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho.jsp" />

                <div class="container-fluid">
                    <div class="row">
                      <div class="col-sm-12">
                        <div class="panel panel-default text-center">
                          <div class="panel-heading">
                            <h1>Acesse</h1>
                          </div>
                          <div class="panel-body">
                              ${sessionScope.error}
                            <form action="login" method="POST">
                                Email: <input type="email" name="emailLogin" required><br><br>
                                Senha: <input type="password" name="senhaLogin" required><br><br>
                                <button type="submit">Entrar</button><br>
                            </form>
                          </div>
                        </div>
                      </div>
                    </div>
                    <h2 style="text-align: center">OU</h2>
                    <div class="row">
                      <div class="col-sm-12">
                        <div class="panel panel-default text-center">
                          <div class="panel-heading">
                            <h1>Cadastre-se</h1>
                          </div>
                          <div class="panel-body">
                            <form action="cadastro" method="POST">
                                Nome: <input type="text" name="nomeCadastro" required><br><br>
                                Email: <input type="email" name="emailCadastro" required><br><br>
                                Senha: <input type="password" name="senhaCadastro" required><br><br>
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
