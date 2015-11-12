/**
 *Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere 
 * convertir deberá estar almacenada en una variable.
 *
 * @author Costy
 */

public class Ejer5 {
  public static void main(String[] args) {

    int pesetas = 500;
    double conversor;

    
    conversor = (double)pesetas / 166.33;
    
    System.out.println("Me puede cambiar estos 500 pesetas en euros?");
    System.out.printf("Aqui tiene usted %.2f euros ", conversor);
  }
}
