<%-- 
    Document   : 17_elTrile
    Created on : 10-feb-2019, 20:00:32
    Author     : brand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>El Trile</title>
    </head>
    <body>
        <h1>El Trile</h1>
        <%
            int bola = (int) (Math.random() * 3);
            int vaso = Integer.parseInt(request.getParameter("vaso"));

            String[] imagen = {"img/vaso.jpg", "img/vaso.jpg", "img/vaso.jpg"};
            imagen[bola] = "img/vaso1.jpg";
            String mensaje;

            if (bola == vaso) {
                mensaje = "Enhorabuena, has acertado <a href=\"17_index.jsp\">Vuelve a intentarlo</a>";
            } else {
                mensaje = "<a href=\"17_index.jsp\">Vuelve a intentarlo</a>";
            }
        %>
        <table>
            <tr>
                <td><img src="<%= imagen[0]%>"></td>
                <td><img src="<%= imagen[1]%>"></td>
                <td><img src="<%= imagen[2]%>"></td>
            </tr>
        </table>
        <%= mensaje%>
    </body>
</html>
