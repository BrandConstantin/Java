<%-- --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <h1>Tabla Multiplicar</h1>
    <ul>
        <% int numero = Integer.parseInt(request.getParameter("numero")); %>
        <%
        for(int i = 0; i <= 10; i++) {
        out.print("<li>" + i + "\t * ");
        out.print(numero + " \t = ");
        out.print("\t " + i * numero);
        out.print("</li>");
        }
        %>
    </ul>
</body>
</html>
