/*
 *  Haz un programa que pida por teclado la fecha de nacimiento de una persona (día, mes, año) y que calcule y 
 * muestre al usuario su número de la suerte. El número de la suerte se calcula sumando el día, mes y año de la 
 * fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma. 
 * Por ejemplo: si la fecha de nacimiento es 12/07/1980, calculamos el número de la suerte así: 
 * 12+7+1980 = 1999; 1+9+9+9 = 28. Número de la suerte: 28. 
 * 
 *@author costy
 */
import java.util.Scanner;
public class NumeroSuerte {
 
    public static void main(String[] args) {
        
        String fecha;
        String cadenaSuma;
        int dia;
        int mes;
        int anio;
        int suma;
        int total;
 
        Scanner teclado = new Scanner( System.in );
        System.out.println("Cálculo del número de la suerte a partir de la fecha de nacimiento.");
        System.out.println("===================================================================");         
        System.out.print ("Introduzca su fecha de nacimiento en el formato mm/dd/aaaa:");
        fecha = teclado.nextLine();
      
        dia = Integer.parseInt(fecha.substring(0,2));
        mes = Integer.parseInt(fecha.substring(3,5));
        anio = Integer.parseInt(fecha.substring(6,10));
        suma = dia + mes + anio;
        
        //Convierto la variable entera "suma" a String. A continuación sumo las conversiones a entero obtenidas de las diferentes subcadenas.
        cadenaSuma = Integer.toString(suma);
        total = Integer.parseInt(cadenaSuma.substring(0,1)) + Integer.parseInt(cadenaSuma.substring(1,2)) +
                 Integer.parseInt(cadenaSuma.substring(2,3)) + Integer.parseInt(cadenaSuma.substring(3,4));
 
        System.out.println ("Tu número de la suerte es el: " + total);
    }
}

