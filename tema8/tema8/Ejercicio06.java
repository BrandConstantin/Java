/*
 * Le da la vuelta a un número.
 */

package tema8;
import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {   

    Scanner tecla = new Scanner(System.in);
    
    System.out.println("Voltear Número");
    System.out.println("============================================");

    System.out.println("Escribe un numero");
    int num = tecla.nextInt();
        
    System.out.println("El numero volteado es " + funciones.VariasMate.volteado(num));

  }
}
