<%-- 
    Document   : index
    Created on : 15-jun-2016, 10:45:44
    Author     : BrinCo
--%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TIRADA DADOS</title>
        <meta name="author" content="constantin">
        <link rel="stylesheet" href="css/css.css">
  </head>
  <body>
    <div>
      <h1>TIRADA DADOS</h1>
        <%
            int dadoUno = 0;
            int dadoDos = 0;
            int dadoTres = 0;
            
            do {
                dadoUno = (int)(Math.random() * 6) + 1;
                dadoDos = (int)(Math.random() * 6) + 1;
                dadoTres = (int)(Math.random() * 6) + 1;
                
                out.print("<img width=\"150\" height=\"150\" src='img/dado" + dadoUno + ".png'>");
                out.print("<img width=\"150\" height=\"150\" src='img/dado" + dadoDos + ".png'>");
                out.print("<img width=\"150\" height=\"150\" src='img/dado" + dadoTres + ".png'>");
                out.print("<br>");
            } while((dadoUno != dadoDos)&&(dadoUno != dadoTres)&&(dadoDos != dadoTres));
        %>
    </div>
  </body>
</html>
