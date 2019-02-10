<%-- 
    Document   : 14_generar_numeros
    Created on : 10-feb-2019, 18:53:02
    Author     : brand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            static boolean esPrimo(int numero) {
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        %>
        <%
            int numero;
            for (int i = 0; i < 100; i++) {
                numero = (int) (Math.random() * 200) + 1;
                if (esPrimo(numero)) {
                    out.print("<span class='rojo'> " + numero + " </span>");
                } else {
                    out.print(" " + numero + " ");
                }
            }
        %>
    </body>
</html>
