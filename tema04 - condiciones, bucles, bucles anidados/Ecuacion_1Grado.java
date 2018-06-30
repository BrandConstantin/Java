/*
 *Realiza un programa que resuelva una ecuación de primer grado (del tipo ax +
 * b = 0).
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Ecuacion_1Grado {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Dime cuanto es a: ");
        int a = t.nextInt();
        System.out.println("Dime cuanto es b: ");
        int b = t.nextInt();

        System.out.println("............................................");
              
        double resultado = (double)((0 - b) - a);
        System.out.printf("El resultado de la formula \"ax + b = 0\" es %.2f\n", resultado);
    }
}
