/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar 
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author costy
 */

public class Ejer01 {
  public static void main(String[] args) {   
    
    int totalDados = 0;;

    int dado1 = (int)(Math.random()*6) + 1;    
    System.out.println("La primera tirada de datos es: " + dado1);

    int dado2 = (int)(Math.random()*6) + 1;    
    System.out.println("La segunda tirada de datos es: " + dado2 );

    int dado3 = (int)(Math.random()*6) + 1;
    System.out.println("La tercera tirada de datos es: " + dado3);

    totalDados = dado1 + dado2 + dado3;
    System.out.println("Has acumulado " + totalDados + " puntos");
  }
}
