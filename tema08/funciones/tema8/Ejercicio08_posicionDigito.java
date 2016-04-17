/*
 * Da la posición de la primera ocurrencia de un dígito dentro de un número
 * entero. Si no se encuentra, devuelve -1.
 */
package tema8;
import java.util.Scanner;
public class Ejercicio08_posicionDigito {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero");
    long numIntrod = teclado.nextLong();
    
    System.out.println("Introduce un digito");
    int digito = teclado.nextInt();
        
    System.out.println("-------------------------------------------------------");

    
    System.out.println("El digito esta en la posicion:" + funciones.VariasMate.posicionOcurencia(numIntrod, digito));

  }
}
