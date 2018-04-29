<%-- 
    Document   : resuldado
    Created on : 13-jun-2016, 10:24:29
    Author     : BrinCo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RASCA y GANA</title>
        <meta name="author" content="constantin">
        <link rel="icon" type="image/png" href="images/rasca.jpg">
        <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    <div class="head"><h1>Participa!! Siempre se ganan premios!</h1>
      <h2>El número extraido es....</h2>
      <% 
          int numeroGanador = ((int)(Math.random() * 6) + 1);
          out.print("<img src='images/rasca" + numeroGanador + ".jpg'/>");
          if(request.getParameter("numero") != null){
              int numeroUser = (Integer.parseInt(request.getParameter("numero")));
              if(numeroUser == numeroGanador){
                  out.print(""
                  +"<h2>Has ganado un MÓVIL!!!!!</h2>"
                  +"<img src='images/iphone.jpg'/>");
              }else{
                  out.print(""
                  +"<h2>Tienes un regalo de consolación</h2>"
                  +"<img src='images/euro.jpg'/>");
              }
          }
      %>
      <br>
      <a href="./">Vuelve a jugar</a>
    </div>
  </body>
</html>
