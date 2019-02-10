<%-- 
    Document   : 16_configurar_coche
    Created on : 10-feb-2019, 19:46:33
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
        <table>
            <h1>Aston Martin</h1>
            <%
                String coche = request.getParameter("coche");
                String tapiceria = request.getParameter("tapiceria");
		
                out.print("<img src=\"img/" + coche + ".png\">");
                out.println("<img src=\"img/" + tapiceria + ".png\">");
            %>
        </table>
    </body>
</html>
