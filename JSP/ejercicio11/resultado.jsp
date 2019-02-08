
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
    <%
    out.print(request.getParameter("mes") + " " + request.getParameter("anio"));
    
    int columna = 1;
    int diasTotales = Integer.parseInt(request.getParameter("diastotales"));
    int dia1 = Integer.parseInt(request.getParameter("dia1"));
    %>
    <table>
        <tr>
            <th>LUNES</th>
            <th>MARTES</th>
            <th>MIÉRCOLES</th>
            <th>JUEVES</th>
            <th>VIERNES</th>
            <th>SÁBADO</th>
            <th>DOMINGO</th>
        </tr>
        <tr>
            <%
            for(int i = 1; i < diasTotales + dia1; i++){
                if (i >= dia1){
                    out.print("<td>" + (i - dia1 + 1) + "</td>");
                } else {
                    out.print("<td> </td>");
                }
                columna++;
                if (columna == 8){
                    out.println("</tr><tr>");
                    columna = 1;
                }
            }
            %>
            </td>
        </tr>
    </table>
    </body>
</html>
