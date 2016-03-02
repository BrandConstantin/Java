/*
 * Devuelve el dígito que está en la posición n de un número entero. Se empieza 
 * contando por el 0 y de izquierda a derecha.
 */
package tema8;
import java.util.Scanner;
public class Ejercicio07 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero");
    long numIntrod = teclado.nextLong();
    
    System.out.println("Introduce un digito");
    int digito = teclado.nextInt();
        
    System.out.println("-------------------------------------------------------");

    
    System.out.println("El digito esta en la posicion:" + funciones.VariasMate.posicionDigito(numIntrod, digito));

  }
}
