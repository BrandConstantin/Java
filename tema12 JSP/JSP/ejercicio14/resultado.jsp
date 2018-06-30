
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
        int i = 1;
        int num1 = 0;
        int num2 = 1;
        int suma;
        int elemento = Integer.parseInt(request.getParameter("numero"));

        do {  
            if (elemento == 1){
                out.print("0");  
            } else {
                out.print(num1 + " ");
                do{
                    suma = num1 + num2;
                    out.print(num2 + " ");
                    num1 = num2;
                    num2 = suma;
                }while (i++ < (elemento - 1));
            }
        }while (i < elemento);
        %>
    </body>
</html>
