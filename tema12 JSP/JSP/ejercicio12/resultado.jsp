
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
        <title>Resultado</title>
    </head>
    <body>
    <%
    int mes = Integer.parseInt(request.getParameter("mes"));
    int anio = Integer.parseInt(request.getParameter("anio"));
    String[] nombreMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                          "Agosto", "Septiembre", "Noviembre", "Diciembre"};
    
    Calendar miCalendario = Calendar.getInstance();
    miCalendario.set(anio, mes - 1, 1); 
    
    int diasTotales = miCalendario.getActualMaximum(Calendar.DAY_OF_MONTH);
    
    int dia1 = miCalendario.get(Calendar.DAY_OF_MONTH);
    if (dia1 == 1){
        dia1 = 7;
    } else {
        dia1--;
    }
    
    int columna = 1;
    %>
    
    <% out.print(nombreMes[mes - 1] + " " + anio);%>
    
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
            </td></tr>
        </tr>
    </table>
    </body>
</html>
