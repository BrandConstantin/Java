<%-- Realiza una aplicación que pida un número y que luego muestre la tabla de
multiplicar de ese número. El resultado se debe mostrar en una tabla ( <table>
en HTML).--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <h1>Introduce un numero:</h1>
<form method="post" action="resultado.jsp">
    <input type="text" name="numero"/>
    <input type="submit" value="Aceptar">
</form>
</body>
</html>
