<%-- 
    Document   : 17_index
    Created on : 10-feb-2019, 20:00:41
    Author     : brand
--%>
<%--Crea la aplicación “El Trile”. Deben aparecer tres cubiletes por pantalla y
el usuario deberá seleccionar uno de ellos. Para dicha selección se puede usar 
un formulario con radio-button, una lista desplegable, hacer clic en el cubilete 
o lo que resulte más fácil. Se levantarán los tres cubiletes y se verá si estaba 
o no la bolita dentro del que el usuario indicó, así mismo, se mostrará un
mensaje diciendo “Lo siento, no has acertado” o “¡Enhorabuena!, has encontrado 
la bolita”. La probabilidad de encontrar la bolita es de 1/3.--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
        <title>El Trile</title>
    </head>
    <body background="img/cesped-artificial.jpg" >
        <div>
            <h1>El Trile</h1>
            <table>
                <tr>
                    <td><a href="17_elTrile.jsp?vaso=0"><img src="img/vaso.jpg"  alt="vaso"></a></td>
                    <td><a href="17_elTrile.jsp?vaso=1"><img src="img/vaso.jpg"  alt="vaso"></a></td>
                    <td><a href="17_elTrile.jsp?vaso=2"><img src="img/vaso.jpg"  alt="vaso"></a></td>
                </tr>
            </table>
        </div>
    </body>
</html>
