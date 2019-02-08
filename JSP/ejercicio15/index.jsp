<%--Realiza una aplicación que genere 100 números aleatorios del 1 al 200. Los 
primos deberán aparecer en un color diferente al resto.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <div>
    <h1>Generar Números</h1>
    <form method="post" action="generar100Numeros.jsp">
        <p>Pulsa el boton y te generare 100 numeros aleatorios</p>
        <p>(de 1 a 200)</p>
        <br><br>
        <input type="submit" name="Enviar"></input>
    </form>
    </div>
</body>
</html>

