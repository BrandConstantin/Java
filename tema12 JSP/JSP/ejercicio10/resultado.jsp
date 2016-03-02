<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Puntuación:</h1>
    <%
    int punto = 0;
    
    int resultado = 0;
    for (int x = 1; x < 11; x++){
        punto += Integer.parseInt(request.getParameter("p" + x)); 
        resultado = punto + resultado;
    }

    out.print(punto);
    %>
    </body>
</html>
