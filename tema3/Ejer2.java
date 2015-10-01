/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
 * convertir debe ser introducida por teclado.
 *
 * @author Costy
 */

public class Ejer2 {
  public static void main(String[] args) {

  System.out.println("Dime la cantidad de euros que quieres convertir : ");
    
    double euros = Double.parseDouble(System.console().readLine());  
     
    int conversor = (int)(euros * 166.34);
    
    System.out.printf("Los %.2f convertidos son %d", euros, conversor);
  }
}
