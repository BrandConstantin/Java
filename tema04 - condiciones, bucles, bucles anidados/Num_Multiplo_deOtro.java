/*
 * Pedir un número y decir si es multiplo de otro
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Num_Multiplo_deOtro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Introduce un número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        num2 = teclado.nextInt();
        
        if(num1 % num2 == 0){
            System.out.println(num1 + " es multiplo de " + num2);
        }else{
            System.out.println(num1 + " no es multiplo de " + num2);
        }

        if(num2 % num1 == 0){
            System.out.println("Y " + num2 + " es multiplo de " + num1);
        }else{
            System.out.println("Y " + num2 + " no es multiplo de " + num1);
        }
    }
}
