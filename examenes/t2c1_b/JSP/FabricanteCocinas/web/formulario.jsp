<%-- 
    Document   : formulario
    Created on : 14-jun-2016, 12:50:04
    Author     : BrinCo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FABRICANTE COCINA</title>
        <meta name="author" content="constantin">
        <link rel="stylesheet" href="css/css.css">
  </head>
  <body>
        <div>
            <h1 style="text-align:center">Tu cocina configurada: </h1>
            <%
                String acabado = request.getParameter("acabado");
                String asa = request.getParameter("asa");
                String electro = request.getParameter("electro");
                
                if((acabado.equals("madera"))&&(asa.equals("larga"))) {
                    out.print("<img alt=\"madera-larga\" src=\"./imagenes/maderalargo.jpg\">");
                }
                
                if((acabado.equals("naranja"))&&(asa.equals("larga"))) {
                    out.print("<img alt=\"naranja-larga\" src=\"./imagenes/naranjalargo.jpg\">");
                }
                if((acabado.equals("verde"))&&(asa.equals("larga"))) {
                    out.print("<img alt=\"verde-larga\" src=\"./imagenes/verdelargo.jpg\">");
                }
                
                if((acabado.equals("madera"))&&(asa.equals("corta"))) {
                    out.print("<img alt=\"madera-corta\" src=\"./imagenes/maderacorto.jpg\">");
                }
                
                if((acabado.equals("naranja"))&&(asa.equals("corta"))) {
                    out.print("<img alt=\"naranja-corta\" src=\"./imagenes/naranjacorto.jpg\">");
                }
                
                if((acabado.equals("verde"))&&(asa.equals("corta"))) {
                    out.print("<img alt=\"verde-corta\" src=\"./imagenes/verdecorto.jpg\">");
                }
                
                int precio = 0;
                int precioElectro = 0;
                
                if(acabado.equals("madera")) {
                    precio = 9000;
                } else {
                    precio = 8000;
                }
                
                if(electro.equals("comprar")) {
                    precioElectro = 4500;
                }
                
                double iva = ((precioElectro + precio) * 0.21);
                double total = iva + (precioElectro + precio);
            %>
            
            <br>
            <br>
            <table>
                <tr>
                    <td>Precio Base</td>
                    <td><%=precio %></td>
                </tr>
                <tr>
                    <td>Precio Electrodomésticos</td>
                    <td><%= precioElectro %></td>
                </tr>
                <tr>
                    <td>IVA</td>
                    <td><%= iva  %></td>
                </tr>
                <tr>
                    <td>Total</td>
                    <td><%= total  %></td>
                </tr>
            </table>
        </div>
  </body>
</html>
