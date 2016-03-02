<%-- Realiza un conversor de pesetas a euros. --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <h1>Conversor de Pesetas a Euros</h1>
    <table>
        <tr>
            <td>Introduce Cantidad Pesetas:</td>
            <td><form method="get" action="resultado.jsp">
                 <input type="text" name="pesetas"/>
                </form>
            </td>
            <td><p>Pesetas</p></td>
        </tr>
        <tr><td colspan="3"><input type="submit" name="Enviar"></td></tr>
    </table>
</body>
</html>
