/*
 * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 */

package tema8;

import java.util.Scanner;
public class Ejercicio03_siguientePrimo {

    public static void main(String[] args) {
       Scanner tecla = new Scanner(System.in);

       System.out.println("Introduce un número:");
       System.out.println("(Devolvera el siguiente primo, al número introducido)");
       System.out.println("----------------------------------------------------");
       int x = tecla.nextInt();
       
        System.out.print("El número primo siguiente es " + funciones.VariasMate.siguientePrimo(x));

    }
    
}
