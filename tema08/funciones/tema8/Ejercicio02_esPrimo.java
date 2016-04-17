/*
 * Devuelve verdadero si el número que se pasa como parámetro
 * es primo y falso en caso contrario.
 */

package tema8;

import java.util.Scanner;
public class Ejercicio02_esPrimo {

    public static void main(String[] args) {
       Scanner tecla = new Scanner(System.in);

       System.out.println("Introduce un número:");
       int x = tecla.nextInt();
       
       if(funciones.VariasMate.esPrimo(x)){
           System.out.print("El número es primo");
       }else {
           System.out.print("El número no es primo");
       }
    }
    
}
