<%-- Realiza una aplicación que calcule la media de tres notas. --%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <h1>Calcular Media 3 Notas</h1>

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
