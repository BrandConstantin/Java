<%-- 
    Document   : 19_index
    Created on : 10-feb-2019, 20:13:22
    Author     : brand
--%>
<%-- Crea una aplicación que dibuje un tablero de ajedrez mediante una tabla html 
 generada con bucles usando JSP y que sitúe dentro del tablero un alfil y un 
caballo en posiciones aleatorias. Las dos figuras no pueden estar colocadas en 
la misma casilla. Las filas y las columnas del tablero deben estar etiquetadas 
correctamente. --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Ajedrez</title>
    </head>
    <body>
        <div>
            <table>
                <tr><td></td><td>a</td><td>b</td><td>c</td><td>d</td><td>e</td><td>f</td><td>g</td><td>h</td><td></td></tr>
                <%
                    String color = "";
                    String imagen = "";

                    int filaAlfil;
                    int columnaAlfil;
                    int filaCaballo;
                    int columnaCaballo;

                    do {

                        // Coordenadas del alfil
                        filaAlfil = (int) (Math.random() * 8) + 1;
                        columnaAlfil = (int) (Math.random() * 8);

                        // Coordenadas del caballo
                        filaCaballo = (int) (Math.random() * 8) + 1;
                        columnaCaballo = (int) (Math.random() * 8);

                    } while ((filaAlfil == filaCaballo) && (columnaAlfil == columnaCaballo));

                    for (int fila = 8; fila > 0; fila--) {
                        out.print("<tr><td>" + fila + "</td>");
                        for (int columna = 0; columna < 8; columna++) {

                            // Determina el color de la casilla
                            if ((((fila % 2) + (columna % 2)) % 2) == 0) {
                                color = "blanco";
                            } else {
                                color = "negro";
                            }

                            // Determina la imagen que se inserta en la casilla
                            if ((fila == filaAlfil) && (columna == columnaAlfil)) {
                                imagen = "img/alfil.jpg";
                            } else if ((fila == filaCaballo) && (columna == columnaCaballo)) {
                                imagen = "img/caballo.png";
                            } else {
                                imagen = "img/transparente.png";
                            }
                            out.print("<td class=\"" + color + "\"><img src=\"img/" + imagen + "\"></td>");
                        }
                        out.print("<td>" + fila + "</td></tr>");
                    }
                %>
                <tr><td></td><td>a</td><td>b</td><td>c</td><td>d</td><td>e</td><td>f</td><td>g</td><td>h</td><td></td></tr>
            </table>
        </div>
    </body>
</html>
