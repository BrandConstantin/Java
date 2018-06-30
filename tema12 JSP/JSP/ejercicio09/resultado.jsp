
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body background="img/desierto.jpg" >
    <h1>Piramide</h1>
    <ul>
        <%
            
        int numIntrod = Integer.parseInt(request.getParameter("numero"));
        
        int numero = 1;
        int a;
        int espacio = numIntrod - 1;

        while(numero <= numIntrod){
            for (a = 1; a <= espacio; a++){
                out.print("&nbsp;&nbsp;&nbsp;");
                out.print("&nbsp;&nbsp;&nbsp;");
                out.print("&nbsp;&nbsp;&nbsp;");
                out.print("&nbsp;&nbsp;&nbsp;");
                out.print("&nbsp;&nbsp;&nbsp;");
            }
            for (a = 1; a < numero * 2; a++) {
                out.print("<img src=\"img/bolitas.png\">");
            }
            out.println("<br>");
            numero++;
            espacio--;
        }
        %>
    </ul>
</body>
</html>
