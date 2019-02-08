<%-- 
    Document   : 01_mostrar_datos
    Created on : 08-feb-2019, 17:06:29
    Author     : brand
--%>
<%-- Crea una aplicación web en Java que muestre tu nombre y tus datos personales
por pantalla. La página principal debe ser un archivo con la extensión jsp .
Comprueba que se lanzan bien el servidor y el navegador web. Observa los
mensajes que da el servidor. Fíjate en la dirección que aparece en la barra de
direcciones del navegador.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Mostrar Datos</title>
    </head>
    <body>
        <div>
            <h1>Información Personal</h1>
            <% out.print("<h3>Constantin Brindusoiu</h3>"); %>
            <%
                out.println("<p>Desarrollo Aplicaciones Web</p>");
                out.println("<p>IES Campanilla</p>");
                out.println("<p>Programación</p>");
            %>
            <% out.println("<i>Profesor: Jose Luis</i>");%>
        </div>
    </body>
</html>
