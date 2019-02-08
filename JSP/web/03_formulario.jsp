<%-- 
    Document   : 03_formulario
    Created on : 08-feb-2019, 17:20:05
    Author     : brand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>JSP Page</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        <h1>Hola</h1>
        <p>
            <% out.print(request.getParameter("nombre"));%></p>
    </body>
</html>
