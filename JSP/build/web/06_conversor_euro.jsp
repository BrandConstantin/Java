<%-- 
    Document   : 06_conversor_euro
    Created on : 08-feb-2019, 17:42:30
    Author     : brand
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Conversor</title>
    </head>
    <body>
            <h1>Conversor de Pesetas a Euros</h1>
    <table>
        <tr>
            <td>
                <%
                Double pesetas = Double.valueOf(request.getParameter("pesetas"));
                Double resultado = pesetas / 166.386;
                DecimalFormat formato = new DecimalFormat("0.00");
                out.print(formato.format(resultado));
                %>
            </td>
            <td><p>Euros</p></td>
        </tr>
    </table>
    </body>
</html>
