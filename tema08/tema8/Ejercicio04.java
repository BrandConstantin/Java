/*
 * Dada una base y un exponente devuelve la potencia.
 */

package tema8;
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {   
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Escribe el base (numero entero positivo)");
    int base = teclado.nextInt();
    
    System.out.println("Escribe la exponente (numero entero positivo)");
    int expo = teclado.nextInt();
   
    System.out.println("La potencia es " + (funciones.VariasMate.potencia(base, expo)));
  }
}
