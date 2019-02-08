<%-- 
    Document   : 04_calcular_media
    Created on : 08-feb-2019, 17:26:45
    Author     : brand
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Media</title>
    </head>
    <body>
        <%
            double primerNumero = Double.valueOf(request.getParameter("a"));
            double segundoNumero = Double.valueOf(request.getParameter("b"));
            double tercerNumero = Double.valueOf(request.getParameter("c"));
            double media = ((primerNumero + segundoNumero + tercerNumero) / 3);
            DecimalFormat decimales = new DecimalFormat("0.00");
        %>
        <p class="especial">Y la media es:</p>
        <%
            out.print(decimales.format(media));
        %>
    </body>
</html>
