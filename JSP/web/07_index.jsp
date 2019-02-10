<%-- 
    Document   : 07_index
    Created on : 10-feb-2019, 17:25:11
    Author     : brand
--%>
<%-- Realiza una aplicación que pida un número y que luego muestre la tabla de
multiplicar de ese número. El resultado se debe mostrar en una tabla ( <table>
en HTML).--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Multiplicar</title>
    </head>
    <body>
        <h1>Introduce un numero:</h1>
        <form method="post" action="07_multiplicar.jsp">
            <input type="number" name="numero"/>
            <input type="submit" value="Aceptar">
        </form>
    </body>
</html>
