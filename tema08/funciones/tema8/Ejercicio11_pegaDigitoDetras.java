/*
 * 
 * Añade un dígito a un número por detrás
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Ejercicio11_pegaDigitoDetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        long numIntrod = teclado.nextLong();

        System.out.println("Añade un número (el número se colocara por detras)");
        int digitos = teclado.nextInt();

        System.out.println("-------------------------------------------------------");


        System.out.println("El nuevo número es:" + funciones.VariasMate.pegaPorDetras(numIntrod, digitos));

  }
}
