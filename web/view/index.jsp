
<%@page import="com.concomics.model.bo.Usuario"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho.jsp" />

		<% Usuario atualUsr = (Usuario) session.getAttribute("usuarioAtual");
                
                if(atualUsr!=null){
                %>     
     
                <%= atualUsr.getEmail()%>
               <%}%>
               
               <c:out value="${sessionScope.atualUsr.getEmail()}"/>
	</body>
</html>


