
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
        int puntos = 0;
        
        for(Integer i = 1; i < 11; i++){
            puntos += Integer.parseInt(request.getParameter("p" + i.toString()));
        }
        
        if (puntos >= 0 && puntos <= 10) {
        out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");
         } else if (puntos >= 11 && puntos <= 22){
        out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente " +
                                "será algo sin importancia. No bajes la guardia.");
         } else {
        out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona." + 
                            " Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabez");
         }
        %>
    </body>
</html>
