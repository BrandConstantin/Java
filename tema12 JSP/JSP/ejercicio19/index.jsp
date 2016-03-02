<%--Crea el juego “Apuesta y gana”. El usuario debe introducir inicialmente una 
cantidad de dinero. A continuación aparecerá por pantalla una imagen de forma 
aleatoria. Si sale una calavera, el usuario pierde todo su dinero y termina el 
juego. Si sale medio limón, el usuario pierde la mitad del dinero y puede seguir
jugando con esa cantidad o puede dejar de jugar. Si sale el gato chino de la 
suerte, el usuario multiplica por dos su dinero y puede seguir jugando con esa 
cantidad o puede dejar de jugar.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body background="img/cesped-artificial.jpg" >
    <div>
    <h1>Apuesta y gana!</h1>
    <form action="apuesta.jsp" method="post" validate>
        <p>Escribe la cantidad de euros que quieres apostar:</p>
        <input type="number" name="euros" placeholder="€">
        <input type="submit" name="Apostar" value="Apostar">
    </form>
    </div>
</body>
</html>

