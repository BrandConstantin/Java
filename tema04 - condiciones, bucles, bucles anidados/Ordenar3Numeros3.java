/*
 * Ordenar 3 números de mayor a menor
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Ordenar3Numeros3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        
        System.out.print("Introduce un número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();
        System.out.print("Introduce el tercer número: ");
        num3 = teclado.nextInt();
        
        System.out.println("-------------------------------------");
        
        if(num1 > num2 && num2 > num3){
            System.out.println(num1 + " - " + num2 + " - " + num3);
        } else if(num1 > num3 && num3 > num2){
            System.out.println(num1 + " - " + num3 + " - " + num2);
        } else if(num2 > num1 && num1 > num3){
            System.out.println(num2 + " - " + num1 + " - " + num3);
        } else if(num2 > num3 && num3 > num1){
            System.out.println(num2 + " - " + num3 + " - " + num1);
        } else if(num3 > num1 && num1 > num2){
            System.out.println(num3 + " - " + num1 + " - " + num2);
        } else if(num3 > num2 && num2 > num1){
            System.out.println(num3 + " - " + num2 + " - " + num1);
        } else if(num1 == num2 || num2 == num3 || num1 == num3){
            //en caso de empate se ordenar de la misma manera que se piden
            System.out.println(num1 + " - " + num2 + " - " + num3);
        }
    }    
}
