<%-- 
    Document   : 04_index
    Created on : 08-feb-2019, 17:26:33
    Author     : brand
--%>
<%-- Realiza una aplicación que calcule la media de tres notas. --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Calcular Media</title>
    </head>
    <body>
        <h1>Calcular Media 3 Notas</h1>
        <form method="get" action="04_calcular_media.jsp">
            <p class="especial">Nota 1</p><input type="number" name="a"/></br>
            <p class="especial">Nota 2</p><input type="number" name="b"/></br>
            <p class="especial">Nota 3</p><input type="number" name="c"/></br>
            <br><br>
            <input type="submit" name="Enviar"></input>
        </form>
    </body>
</html>
