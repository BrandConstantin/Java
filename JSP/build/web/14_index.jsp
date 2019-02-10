<%-- 
    Document   : 14_index
    Created on : 10-feb-2019, 18:52:47
    Author     : brand
--%>
<%--Realiza una aplicación que genere 100 números aleatorios del 1 al 200. Los 
primos deberán aparecer en un color diferente al resto.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Generar Números</h1>
            <form method="post" action="14_generar_numeros.jsp">
                <p>Pulsa el boton y te generare 100 numeros aleatorios</p>
                <p>(de 1 a 200)</p>
                <br><br>
                <input type="submit" name="Enviar"></input>
            </form>
        </div>
    </body>
</html>
