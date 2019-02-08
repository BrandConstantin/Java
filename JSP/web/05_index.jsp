<%-- 
    Document   : 05_index
    Created on : 08-feb-2019, 17:35:25
    Author     : brand
--%>
<%-- Realiza un conversor de euros a pesetas. --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Conversor</title>
    </head>
    <body>
        <h1>Conversor de Euros a Pesetas</h1>
        <table>
            <form method="get" action="05_conversor_pesetas.jsp">
                <tr>
                    <td>Introduce Cantidad Euros:</td>
                    <td><input type="number" name="euros"/></td>
                    <td><p>€</p></td>
                </tr>
                <tr><td colspan="3"><input type="submit" value="Enviar"></td></tr>
            </form>

        </table>
    </body>
</html>
