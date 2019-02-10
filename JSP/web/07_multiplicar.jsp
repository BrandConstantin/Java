<%-- 
    Document   : 07_multiplicar
    Created on : 10-feb-2019, 17:25:23
    Author     : brand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Multiplicar</title>
    </head>
    <body>
        <h1>Tabla Multiplicar</h1>
        <!--con lista-->
        <ul>
            <% int numero = Integer.parseInt(request.getParameter("numero")); %>
            <%
                for (int i = 0; i <= 10; i++) {
                    out.print("<li>" + i + " \t * ");
                    out.print(numero + " \t = ");
                    out.print("\t " + i * numero);
                    out.print("</li>");
                }
            %>
        </ul>
        <!--con tabla-->
        <table>
            <% numero = Integer.parseInt(request.getParameter("numero")); %>
            <%
                for (int i = 0; i <= 10; i++) {
                    out.print("<tr><td>" + i + " \t * ");
                    out.print(numero + " \t = ");
                    out.print("\t " + i * numero);
                    out.print("</td</tr>");
                }
            %>
        </table>
    </body>
</html>