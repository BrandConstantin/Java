<%-- 
    Document   : 10_cuestionario
    Created on : 10-feb-2019, 18:11:04
    Author     : brand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Cuestinario</title>
    </head>
    <body>
        <h1>Puntuación:</h1>
        <%
            int punto = 0;

            for (int x = 1; x < 11; x++) {
                punto += Integer.parseInt(request.getParameter("p" + x));
            }

            out.print(punto);
        %>
    </body>
</html>
