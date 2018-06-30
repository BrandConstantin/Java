
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
        <title>Configurar Coche</title>
    </head>
    <body>
        <table>
        <h1>Aston Martin</h1>
        <%
        //String[] dado = {"astonAzul.png", "AstonBlanco.png", "astonGris.png", "astonMadagascar.png", "stonOcellus.png",
          //              "astonVolcano.png", "interiorNegro.png", "interiorRojo.png"};
        
        String coche = request.getParameter("coche");
        String tapiceria = request.getParameter("tapiceria");
        //String cocheFinal = coche + tapiceria;
        
        /*if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonAzul.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorNegro.png \"></td></tr>");
        }else if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonAzul.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorRojo.png \"></td></tr>");
        }else if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonBlanco.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorNegro.png \"></td></tr>");
        }else if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonBlanco.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorRojo.png \"></td></tr>");
        }else if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonGris.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorNegro.png \"></td></tr>");
        }else if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonGris.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorRojo.png \"></td></tr>");
        }else if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonOcellus.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorNegro.png \"></td></tr>");
        }else if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonOcellus.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorRojo.png \"></td></tr>");
        }else if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonVolcano.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorNegro.png \"></td></tr>");
        }else if((coche.equals(coche)) && (tapiceria.equals(tapiceria))){
            out.print("<tr><td><img src=\"img/astonVolcano.png \"></td></tr>" + 
                    "<tr><td><img src=\"img/interiorRojo.png \"></td></tr>");
        }*/
        %>
        <%
        out.print("<img src=\"img/" + coche + ".png\">");
        out.println("<img src=\"img/" + tapiceria + ".png\">");
        %>
        </table>
    </body>
</html>
