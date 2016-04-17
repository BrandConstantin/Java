/*
 * 
 * Escribe un programa que pase de binario a decimal.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Ejercicio17_deBinario_aDecimal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Transformar número de binario a decimal");
        System.out.println("Introduce número binario:");
        long num = teclado.nextInt();

        System.out.println("-------------------------------------------------------");

        long decimal = 0;
        System.out.println("El número decimal es " + funciones.VariasMate.binario_Decimal(num));

  }
}
