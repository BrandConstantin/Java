/*
 * Cuenta el número de dígitos de un número entero.
 */

package tema8;
import java.util.Scanner;

public class Ejercicio05_contarDigitos {
  public static void main(String[] args) {   

    Scanner tecla = new Scanner(System.in);
    
    System.out.println("CONTAR DIGITOS DE UN NUMERO");
    System.out.println("============================================");

    System.out.println("Escribe un numero y te digo de cuantos digitos esta formado");
    int num = tecla.nextInt();
        
    System.out.println("El numero tiene " + funciones.VariasMate.digitos(num) + " digitos");

  }
}
