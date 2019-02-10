<%-- 
    Document   : 16_index
    Created on : 10-feb-2019, 19:46:16
    Author     : brand
--%>
<%--Realiza un configurador del interior de un vehículo. El usuario puede
      elegir, mediante un formulario, el color de la tapicería – blanco, negro
      o berengena - y el material de las molduras – madera o carbono. Se debe
      mostrar el interior del coche tal y como lo quiere el usuario.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>JSP Page</title>
    </head>
    <body background="img/cesped-artificial.jpg" >
        <div>
            <h1>Aston Martin</h1>
            <h3>Configura tu coche</h3>
            <form method="get" action="16_configurar_coche.jsp">
                <p>Color Coche</p> 
                <select name="coche">
                    <option value="astonAzul">Azul</option>
                    <option value="astonBlanco">Blanco</option>
                    <option value="astonMadagascar">Madagascar</option>
                    <option value="astonGris">Gris</option>
                    <option value="astonOcellus">Ocellus</option>
                    <option value="astonVolcano">Volcano</option>
                </select>
                <p>Color Tapiceria</p>
                <select name="tapiceria">
                    <option value="interiorNegro">Negro</option>
                    <option value="interiorRojo">Rojo</option>
                </select><br>
                <hr>
                <input type="submit" value="Enviar">
            </form>

        </div>
    </body>
</html>
