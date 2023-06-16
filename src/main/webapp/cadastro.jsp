<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Cadastro de clientes</h1>
		<form action="/basedeclientes/cliente" method="post">
			Nome do cliente: 
			<input type="text" name="nome"/> 
			
			Cidade do cliente:
			<input type="text" name="city"/>
			
			Contato do cliente:
			<input type="text" name="phone" />
			
			<input type="submit" />
			
			
		</form>
	</div>
</body>
</html>