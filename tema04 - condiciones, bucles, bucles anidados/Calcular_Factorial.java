/*
 * Calcular factorial
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Calcular_Factorial {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        double factorial = 1;
        int num;
        int x;
        
        System.out.print("Introduce un número: ");
        num = tecla.nextInt();
        
        //factorial de un numero es numero * numero-1 * numero-2* hasta 1
        for(x = num; x > 0; x--){
            factorial *= x;
        }
        
        System.out.print("Factorial " + num + " = " + factorial);
    }
}
