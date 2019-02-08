<%-- 
    Document   : 06_index
    Created on : 08-feb-2019, 17:42:16
    Author     : brand
--%>
<%-- Realiza un conversor de pesetas a euros. --%>

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
            <form method="get" action="06_conversor_euro.jsp">
                <tr>
                    <td>Introduce Cantidad Pesetas:</td>
                    <td><input type="number" name="pesetas"/></td>
                    <td><p>Pesetas</p></td>
                </tr>
                <tr><td colspan="3"><input type="submit" name="Enviar"></td></tr>
            </form>
        </table>
    </body>
</html>
