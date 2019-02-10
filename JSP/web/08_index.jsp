<%-- 
    Document   : 08_index
    Created on : 10-feb-2019, 17:29:52
    Author     : brand
--%>
<%-- Realiza una aplicación que pinte una pirámide. La altura se pedirá en un
formulario. La pirámide estará hecha de bolitas, ladrillos o cualquier otra
imagen.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Dibujar Piramide</title>
    </head>
    <body>
        <h1>Introduce la altura de la piramide:</h1>
        <form method="post" action="08_piramide.jsp">
            <input type="number" name="numero"/>
            <input type="submit" value="Aceptar">
        </form>
    </body>
</html>
