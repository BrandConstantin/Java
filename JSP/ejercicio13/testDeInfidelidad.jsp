<%--Transforma el test de infidelidad realizado anteriormente para consola en 
una aplicación web.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../estilos.css" media="screen" />
    </head>
<body>
    <div>
    <h1>Test de Infidelidad</h1>
<form method="post" action="resultado.jsp">
    <p>1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?</p><br>
        <input type="radio" name="p1" value="1"> SI</input></br>
        <input type="radio" name="p1" value="0"> NO</input></br>
        
    <p>2. Ha aumentado sus gastos de vestuario?</p><br>
        <input type="radio" name="p2" value="1"> SI</input></br>
        <input type="radio" name="p2" value="0"> NO</input></br>
        
    <p>3. Ha perdido el interés que mostraba anteriormente por ti?</p><br>
        <input type="radio" name="p3" value="1"> SI</input></br>
        <input type="radio" name="p3" value="0"> NO</input></br>
        
    <p>4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
        arregla el pelo y se asea con más frecuencia (si es mujer)?</p><br>
        <input type="radio" name="p4" value="1"> SI</input></br>
        <input type="radio" name="p4" value="0"> NO</input></br>
        
    <p>5. No te deja que mires la agenda de su teléfono móvil</p><br>
        <input type="radio" name="p5" value="1"> SI</input></br>
        <input type="radio" name="p5" value="0"> NO</input></br>
        
    <p>6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante?</p><br>
        <input type="radio" name="p6" value="1"> SI</input></br>
        <input type="radio" name="p6" value="0"> NO</input></br>
        
    <p>7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?</p><br>
        <input type="radio" name="p7" value="1"> SI</input></br>
        <input type="radio" name="p7" value="0"> NO</input></br>
        
    <p>8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?</p>
        <input type="radio" name="p8" value="1"> SI</input></br>
        <input type="radio" name="p8" value="0"> NO</input></br>
        
    <p>9. Has notado que últimamente se perfuma más?</p><br>
        <input type="radio" name="p9" value="1"> SI</input></br>
        <input type="radio" name="p9" value="0"> NO</input></br>
        
    <p>10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo?</p><br>
        <input type="radio" name="p10" value="1"> SI</input></br>
        <input type="radio" name="p10" value="0"> NO</input></br>
    <input type="submit" value="Enviar">
</form>
    </div>
</body>
</html>

