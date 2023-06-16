<%@page import="java.util.List"%>
<%@page import="br.com.baseclientes.servlet.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Listagem de clientes:</h1>
	<ul>
		<%
			List<Cliente> clienteLista = (List<Cliente>)request.getAttribute("clientes");
			for (Cliente cliente : clienteLista) {
		%>
			<li> Nome: <%= cliente.getClientName() %>, Cidade: <%= cliente.getClientCity() %>, Contato: <%= cliente.getClientePhone() %></li>
		<%
			}
		%>
	</ul>
</body>
</html>