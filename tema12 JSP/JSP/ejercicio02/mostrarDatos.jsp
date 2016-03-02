<%-- Mejora el programa anterior de tal forma que la apariencia de la página
web que muestra el navegador luzca más bonita mediante la utilización de
CSS (utiliza siempre ficheros independientes para CSS para no mezclarlo con
HTML).--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
</head>
<body>
    <h1>Información Personal</h1>
    <table>
    <tr>
      <% out.print("<td colspan=\"3\"><h3>Constantin Brindusoiu</h3></td>");
      %>
    </tr>
    <tr>
      <%out.println("<td><p>Desarrollo Aplicaciones Web</p></td>");
        out.println("<td><p>IES Campanilla</p></td>");
        out.println("<td><p>Programación</p></td>");
      %>
    </tr>
    <tr>
      <% out.println("<td colspan=\"3\"><i><b>Profesor: Jose Luis</b></i></td>");
      %>
    </tr>
    </table>
</body>
</html>