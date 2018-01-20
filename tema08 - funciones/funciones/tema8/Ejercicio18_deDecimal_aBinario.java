/*
 * 
 * Escribe un programa que pase de decimal a binario
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Ejercicio18_deDecimal_aBinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Transformar número de decimal a binario");
        System.out.println("Introduce número decimal:");
        long num = teclado.nextInt();

        System.out.println("-------------------------------------------------------");

        System.out.println("El número decimal es " + funciones.VariasMate.decimal_Binario(num));

  }
}
