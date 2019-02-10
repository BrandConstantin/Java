<%-- 
    Document   : 18_index
    Created on : 10-feb-2019, 20:06:26
    Author     : brand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>Apuesta</title>
    </head>
    <body>
        <div>
            <h1>Apuesta!</h1>
            <%
                int euros = Integer.parseInt(request.getParameter("euros"));
                int apuesta = (int) (Math.random() * 10);
                String[] imagen = {"euros.jpg", "limon.jpg", "calavera.jpg", "igual.jpg",
                    "igual.jpg", "igual.jpg", "igual.jpg", "igual.jpg", "igual.jpg", "igual.jpg"};
                String[] mensaje = {"Has duplicado tu dinero", "Has perdido la mitad de tu dinero",
                    "Has perdido todo tu dinero", "Sigues teniendo el mismo dinero",
                    "Sigues teniendo el mismo dinero", "Sigues teniendo el mismo dinero",
                    "Sigues teniendo el mismo dinero", "Sigues teniendo el mismo dinero",
                    "Sigues teniendo el mismo dinero", "Sigues teniendo el mismo dinero"};

                if (apuesta == 0) {
                    euros *= 2;
                } else if (apuesta == 1) {
                    euros /= 2;
                } else if (apuesta == 2) {
                    euros = 0;
                } else {
                    euros = euros;
                }
            %>

            <img src="img/<%= imagen[apuesta]%>"><br>
            <h2><%= mensaje[apuesta]%></h2>

            <% if ((apuesta == 0) || (apuesta == 1) || (apuesta == 3) || (apuesta == 4)
						|| (apuesta == 5) || (apuesta == 6) || (apuesta == 7)
						|| (apuesta == 8) || (apuesta == 9)) {%>
            <table>
                <tr>
                    <td>Credito inicial <%= request.getParameter("euros")%></td>
                    <td><p>Credito actual <%= euros%> €</p></td>
                <tr>
                    <td>
                        <form method="post" action="18_apuesta.jsp">
                            <input type="hidden" name="euros" value="<%= euros%>">
                            <input type="submit" value="Apuesta">
                        </form>
                    </td>
                    <td>
                        <form method="post" action="18_terminado.jsp">
                            <input type="hidden" name="euros" value="<%= euros%>">
                            <input type="submit" value="Abandono">
                        </form>
                    </td>
                </tr>                
                <% } else { %>
                <form method="post" action="18_index.jsp">
                    <input type="submit" value="Jugar de nuevo">
                </form>
                <%  }%> 
                </tr>
            </table>
        </div>
    </body>
</html>
