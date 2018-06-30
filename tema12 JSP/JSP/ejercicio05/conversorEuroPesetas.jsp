<%-- Realiza un conversor de euros a pesetas. --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <h1>Conversor de Euros a Pesetas</h1>
    <table>
        <tr>
            <td>Introduce Cantidad Euros:</td>
            <td><form method="get" action="resultado.jsp">
                 <input type="text" name="euros"/>
                </form>
            </td>
            <td><p>€</p></td>
        </tr>
        <tr><td colspan="3"><input type="submit" value="Enviar"></td></tr>
    </table>
</body>
</html>
