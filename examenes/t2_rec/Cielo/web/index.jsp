<%-- 
    Document   : index
    Created on : Jun 19, 2016, 12:21:05 PM
    Author     : BrinCo
--%>

<%--Realiza un programa en JSP que pinte el cielo sobre una página web con elementos
generados de forma aleatoria. El fondo de la página debe ser azul. Los elementos se jocarán en una tabla de
10x10. Cada celda de la tabla puede estar vacía o tener un elemento. La probabilidad de que esté
vacía es del 50%. Los elementos pueden ser el Sol, una nube, un pájaro, un avión o un platillo volante.
El Sol no puede aparecer más de una vez; el resto de elementos sí se puede repetir.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
<div align="center">
    <%
        int[][] t = new int[25][25];
        int i;
        int j;
        int imagen = 0;

        for (i = 0; i < t.length; i++) {
            for (j = 0; j < t.length; j++) {
                t[i][j] = (int) (Math.random() * 2);

            }
        }

        int sol = 4;
        int solFila = (int) (Math.random() * 10);
        int solCol = (int) (Math.random() * 10);

        for (i = 0; i < t.length; i++) {
            for (j = 0; j < t.length; j++) {
                if ((i == solFila) && (j == solCol)) {
                    t[i][j] = sol;
                }
            }
        }

        for (i = 0; i < t.length; i++) {
            for (j = 0; j < t.length; j++) {
                if (t[i][j] == 0) {
                    out.print(" VACIO   ");
                }
                
                if (t[i][j] == 4) {
                    out.print("<img src=\"img/sol.png\" style=\"width:75px; height:65px\">");
                }
                
                if (t[i][j] == 1) {
                    imagen = (int) (Math.random() * 4);

                    switch (imagen) {
                        case 0:
                            out.print("<img src=\"img/avion.png\" style=\"width:75px; height:65px\">");
                            break;
                        case 1:
                            out.print("<img src=\"img/nube.png\" style=\"width:75px; height:65px\">");
                            break;
                        case 2:
                            out.print("<img src=\"img/pajaro.png\" style=\"width:75px; height:65px\">");
                            break;
                        case 3:
                            out.print("<img src=\"img/platillo.png\" style=\"width:75px; height:65px\">");
                            break;
                        default:
                    }
                }
            }
            
            out.print("<br>");
        }


    %>
</div>
</body>
</html>