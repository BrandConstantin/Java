/*
 * 
 * Añade un dígito a un número por delante.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Ejercicio12_pegaDigitoDelante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        long numIntrod = teclado.nextLong();

        System.out.println("Añade un número (el número se colocara por delante)");
        int digitos = teclado.nextInt();

        System.out.println("-------------------------------------------------------");


        System.out.println("El nuevo número es:" + funciones.VariasMate.pegaPorDelante(numIntrod, digitos));

  }
}
