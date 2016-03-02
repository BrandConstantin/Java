<%-- Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola”
seguido del nombre introducido. El nombre se deberá recoger mediante un
formulario.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
</head>
<body>
    <form method="post" action="formulario.jsp">
    <table>
    <tr>
        <td><h1>Escriba aqui tu nombre</h1></td>
    </tr>
    <tr>
        <td><input type="text" name="enviarForm">
            <input type="submit" value="Enviar"></td>
    </tr>
    </table>
    </form>
</body>
</html>
