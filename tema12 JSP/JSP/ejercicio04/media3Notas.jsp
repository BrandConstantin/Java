<%-- Realiza una aplicación que calcule la media de tres notas. --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <h1>Calcular Media 3 Notas</h1>
    <form method="get" action="resultado.jsp">
        <p class="especial">Nota 1</p><input type="text" name="a"/></br>
        <p class="especial">Nota 2</p><input type="text" name="b"/></br>
        <p class="especial">Nota 3</p><input type="text" name="c"/></br>
        <br><br>
        <input type="submit" name="Enviar"></input>
    </form>
</body>
</html>
