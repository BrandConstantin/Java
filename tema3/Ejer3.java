/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Costy
 */

public class Ejer3 {
  public static void main(String[] args) {

  System.out.println("Dime la cantidad de pesetas que quieres convertir : ");
    
    int pesetas = Integer.parseInt(System.console().readLine());  
     
    double conversor = (double)(pesetas / 166.34);
    
    System.out.printf("Los %d convertidos son %.2f", pesetas, conversor);
  }
}
