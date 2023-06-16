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
	Cliente cadastrado com sucesso! </br>
	Nome da empresa cadastrada: ${ nome }
</div>
<div>
	<form action="/basedeclientes/listagem" method="get">
		<input type="submit" value="Exibir lista de clientes">
	</form>
</div>
</body>
</html>