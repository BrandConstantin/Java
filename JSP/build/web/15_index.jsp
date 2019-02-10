<%-- 
    Document   : 15_index
    Created on : 10-feb-2019, 18:59:04
    Author     : brand
--%>
<%--Realiza una aplicación que muestre la tirada aleatoria de tres dados de póker. Utiliza
imágenes de dados reales.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Poker</title>
    </head>
<body background="img/cesped-artificial.jpg" >
    <div>
    <h1>Dados Poker</h1>
    
        <p>F5 para generar numeros de dado</p>
        <%
        String[] dado = {"7.jpg", "8.jpg", "as.jpg", "j.jpg", "q.jpg", "k.jpg"};
        
        for(int i = 0; i < 3; i++){
            String carta = dado[(int)(Math.random() * 6)];
            out.print("<img src=\"img/" + carta + "\">");
        }
        %>
    </div>
    </body>
</html>
