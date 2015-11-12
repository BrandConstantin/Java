/**
 *Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere 
 * convertir deberá estar almacenada en una variable.
 *
 * @author Costy
 */

public class Ejer4 {
  public static void main(String[] args) {

    double euros = 10;
    int pesetas;

    pesetas = (int)(euros * 166.386);
    
    System.out.println("Me puede cambiar estos 10 euros en pesetas?");
    System.out.printf("Aqui tiene usted %.2f transformado %d", euros, pesetas);
  }
}
