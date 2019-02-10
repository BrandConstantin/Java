<%-- 
    Document   : 18_index
    Created on : 10-feb-2019, 20:06:26
    Author     : brand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Apuesta</title>
    </head>
    <body>
        <div>
            <h1>Apuesta!</h1>
            <%
                int euros = Integer.parseInt(request.getParameter("euros"));
            %>
            <h2>Ha conseguido <%= euros%></h2>
        </div>
    </body>
</html>
