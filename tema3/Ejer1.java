/**
 * Realiza un programa que pida dos números y que luego muestre el resultado de 
 * su multiplicación.
 *
 * @author Costy
 */

public class Ejer1 {
  public static void main(String[] args) {

  System.out.println("Introduce un numero: ");
  int primNum = Integer.parseInt(System.console().readLine());
  
  System.out.println("Introduce otro numero: ");
  int segNum = Integer.parseInt(System.console().readLine());

  System.out.println("La multiplicación de los dos numeros es " + (primNum *
                     segNum)); 
  }
}
