<%-- 
    Document   : 13_index
    Created on : 10-feb-2019, 18:48:29
    Author     : brand
--%>
<%--Escribe un programa que muestre los n primeros términos de la serie de 
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y el 
resto se calcula sumando los dos anteriores, por lo que tendríamos que los 
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Seria Fibonacci</title>
    </head>
    <body>
        <div>
            <h1>Seria Fibonacci</h1>
            <form method="post" action="13_fibonacci.jsp">
                <p>Escribe un número</p><input type="text" name="numero"/></br>
                <br><br>
                <input type="submit" name="Enviar"></input>
            </form>
        </div>
    </body>
</html>
