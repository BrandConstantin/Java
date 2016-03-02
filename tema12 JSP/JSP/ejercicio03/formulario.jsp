<%-- Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola”
seguido del nombre introducido. El nombre se deberá recoger mediante un
formulario.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
</head>
<body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <h1>Hola</h1>
    <p>
    <% out.print(request.getParameter("enviarForm"));%></p>
</body>
</html>
