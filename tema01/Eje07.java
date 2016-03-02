/**
 *Igual que el programa anterior, pero esta vez la pirámide estará hueca (se debe ver
 *únicamente el contorno hecho con asteriscos).
 * 
 *@author Costy
 */

public class Eje07 { // Clase principal
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println(blanco + "Dibujo Piramide");
    System.out.println(rojo + " " + " " + " " + " " + "*" + " " + " " + " " +" ");
    System.out.println(verde + " " + " " + " " + "*" +  " " + "*" + " " + " " +" ");
    System.out.println(morado + " " + " " + "*" + " " + " " + " " + "*" + " " +" ");
    System.out.println(naranja + " " + "*" +  " " + " " + " " + " " + " " + "*" +" ");
    System.out.println(azul + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" +"*");   
  }
}
