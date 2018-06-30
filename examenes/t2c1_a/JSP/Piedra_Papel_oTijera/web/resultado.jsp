<%-- 
    Document   : resultado
    Created on : 13-jun-2016, 11:28:15
    Author     : BrinCo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PIEDRA PAPEL TIJERA</title>
        <meta name="author" content="constantin">
        <link rel="icon" type="image/png" href="imagenes/tijera.jpg">
        <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    <div class="head">
      <h1>PIEDRA -- PAPEL -- TIJERA</h1>
      <% 
        if(request.getParameter("foto") != null){
            String resultado = " ";
            int foto = (Integer.parseInt(request.getParameter("foto")));
            int mensaje = ((int)(Math.random() * 3) + 1);

            if(foto == mensaje){
                resultado = "EMPATE";
            }

            switch(foto){
                case 1:
                    if(mensaje == 2){
                        resultado = "HAS PERDIDO";
                    }
                    
                    if(mensaje == 3){
                        resultado = "HAS GANADO!!!";
                    }
                break;
                
                case 2:
                    if(mensaje == 1){
                        resultado = "HAS GANADO!!!";
                    }
                    
                    if(mensaje == 3){
                        resultado = "HAS PERDIDO";
                    }
                break;
                
                case 3:
                    if(mensaje == 1){
                        resultado = "HAS PERDIDO";
                    }
                    
                    if(mensaje == 2){
                        resultado = "HAS GANADO!!!";
                    }
                break;
            }
            out.print(""
              +"<div class='head'>"
              +"<p>TÚ</p>"
              +"<img src='imagenes/foto-"+foto+".png'/>"
              +"<p style='font-size: 50px;'>VS</p>"
              +"<p>LA MÁQUINA</p>"
              +"<img src='imagenes/foto-"+mensaje+".png'/>"
              +"</div>");
            out.print("<h2>"+resultado+"</h2>");
        }
    %>
    <br>
    <a href="./">Volver a jugar</a>
    </div>
  </body>
</html>
