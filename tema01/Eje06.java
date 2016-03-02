/**
 *Escribe un programa que pinte por pantalla una pirámide rellena a base de asteriscos. La
 *base de la pirámide debe estar formada por 9 asteriscos.
 * 
 *@author Costy
 */

public class Eje06 { // Clase principal
  public static void main(String[] args) {

    System.out.println("Dibujo Piramide");
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";

    System.out.println(rojo + " " + " " + " " + " " + "*" + " " + " " + " " +" ");
    System.out.println(verde + " " + " " + " " + "*" + blanco + "*" + "*" + " " + " " +" ");
    System.out.println(morado + " " + " " + "*" + "*" + "*" + "*" + "*" + " " +" ");
    System.out.println(naranja + " " + "*" + blanco+  "*" + naranja + "*" + "*" + "*" + blanco + "*" + "*" +" ");
    System.out.println(azul + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" +"*");
     
  }
}
