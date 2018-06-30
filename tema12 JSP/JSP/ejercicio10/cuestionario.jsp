<%-- Realiza un cuestionario con 10 preguntas tipo test. Cada pregunta acertada 
sumará un punto. El programa mostrará al final la calificación obtenida.
Pásale el cuestionario a tus compañeros y pídeles que lo hagan para ver qué tal
andan de conocimientos Utiliza radio buttons en las preguntas
del cuestionario.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <div>
    <h1>Cuestionario:</h1>
<form method="post" action="resultado.jsp">
    <p>1. Cual es la capital de Italia?</p><br>
        <input type="radio" name="p1" value="1"> Roma</input></br>
        <input type="radio" name="p1" value="0"> Atena</input></br>
        <input type="radio" name="p1" value="0"> Madrid</input></br></br>
    <p>2. Zara es una marca Española?</p><br>
        <input type="radio" name="p2" value="1"> Si</input></br>
        <input type="radio" name="p2" value="0"> No</input></br>
        <input type="radio" name="p2" value="0"> No, es Catalana</input></br></br>
    <p>3. Bosnia es un pais de Asia</p><br>
        <input type="radio" name="p3" value="1"> No</input></br>
        <input type="radio" name="p3" value="0"> Si</input></br>
    <p>4. Ha ganado España mas de 3 veces el Eurovisión?</p><br>
        <input type="radio" name="p4" value="1"> No</input></br>
        <input type="radio" name="p4" value="0"> Si</input></br>
        <input type="radio" name="p4" value="0"> 4 veces</input></br>
    <p>5. Napoleon Bonaparte era frances?</p><br>
        <input type="radio" name="p5" value="0"> No</input></br>
        <input type="radio" name="p5" value="1"> Si</input></br></br>
    <p>6. Noruega es un pais central-europeo?</p><br>
        <input type="radio" name="p6" value="1"> No</input></br>
        <input type="radio" name="p6" value="0"> Si</input></br>
    <p>7. Es Sevilla una ciudad de Andalucia?</p><br>
        <input type="radio" name="p7" value="0"> No</input></br>
        <input type="radio" name="p7" value="1"> Si</input></br>
    <p>8. Es Europa el continente viejo porque tiene el mayor numero de habitantes?</p>
        <input type="radio" name="p8" value="0"> No</input></br>
        <input type="radio" name="p8" value="0"> Si</input></br>
    <p>9. Tiene Europa la superficie mas grande que el pais EEUU?</p><br>
        <input type="radio" name="p9" value="1"> No</input></br>
        <input type="radio" name="p9" value="0"> Son casi iguales</input></br>
        <input type="radio" name="p9" value="0"> Si</input></br>
    <p>10. En Europa, la Union Europea se ha constituido despues de la I Guerra Mundial?</p><br>
        <input type="radio" name="p10" value="1"> Si</input></br>
        <input type="radio" name="p10" value="0"> No</input></br>
    <input type="submit" value="Enviar Para">
</form>
    </div>
</body>
</html>

