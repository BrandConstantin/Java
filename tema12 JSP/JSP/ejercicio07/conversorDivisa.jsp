<%-- Realiza un conversor de pesetas a euros. --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <h1>Conversor Divisas</h1>
    <table>
        <tr>
            <td colspan="2">Elije conversor:</td>
        </tr>
        <tr>
            <td>Euros-Pesetas</td>
            <td>Pesetas-Euros</td>
        </tr>
        <tr>
            <td colspan="2"><img src="img/conv.png" alt="conversor" title="conversor" 
                     width="300px" height="300px">
            </td>
        </tr>
        <tr>
            <td><form method="get" action="../ejercicio05/resultado.jsp">
                    <input type="text" name="euros"/>
                </form>
            </td>                
            <td><form method="get" action="../ejercicio06/resultado.jsp">
                    <input type="text" name="pesetas"/>
                </form>
            </td>
        </tr>
        <tr><td colspan="2"><input type="submit" name="Enviar"></td></tr>
    </table>
    </form>
</body>
</html>
