/*
 * Le quita a un número n dígitos por detrás (por la derecha).
 */
package tema8;
import java.util.Scanner;
public class Ejercicio09 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero");
    long numIntrod = teclado.nextLong();
    
    System.out.println("Cuantos digitos queires quitar?");
    int digitos = teclado.nextInt();
        
    System.out.println("-------------------------------------------------------");

    
    System.out.println("El nuevo número es:" + funciones.VariasMate.quitaPorDetras(numIntrod, digitos));

  }
}
