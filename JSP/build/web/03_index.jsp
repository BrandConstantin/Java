<%-- 
    Document   : 03_index
    Created on : 08-feb-2019, 17:19:45
    Author     : brand
--%>
<%-- Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola”
seguido del nombre introducido. El nombre se deberá recoger mediante un
formulario.--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Index formulario</title>
    </head>
    <body>
        <form method="post" action="03_formulario.jsp">
            <table>
                <tr>
                    <td><h1>Escriba aqui tu nombre</h1></td>
                </tr>
                <tr>
                    <td><input type="text" name="nombre">
                        <input type="submit" value="Enviar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
