<%-- Realiza un conversor de euros a pesetas. --%>

<%@page import="java.text.DecimalFormat"%>
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
            <td>
                <%
                Double euros = Double.valueOf(request.getParameter("euros"));
                Double resultado = euros * 166.386;
                DecimalFormat formato = new DecimalFormat("0.00");
                out.print(formato.format(resultado));
                %>
            </td>
            <td><p>Pesetas</p></td>
        </tr>
    </table>
</body>
</html>
