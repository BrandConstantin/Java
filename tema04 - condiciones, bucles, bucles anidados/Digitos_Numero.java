/*
 * Contar digitos de un número
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Digitos_Numero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.print("Introduce un número: ");
        num = teclado.nextInt();
        
        System.out.println("-------------------------------------");
        
        if(num < 10){
            System.out.println("Tiene 1 digito");
        }else if(num < 100){
            System.out.println("Tiene 2 digitos");
        }else if(num < 1000){
            System.out.println("Tiene 3 digitos");
        }else if(num < 10000){
            System.out.println("Tiene 4 digitos");
        }else if(num < 100000){
            System.out.println("Tiene 5 digitos");
        }else if(num < 1000000){
            System.out.println("Tiene 6 digitos");
        }else if(num < 10000000){
            System.out.println("Tiene 7 digitos");
        }else if(num < 100000000){
            System.out.println("Tiene 8 digitos");
        }else if(num < 1000000000){
            System.out.println("Tiene 9 digitos");
        }else{
            System.out.println("Me he hartado de contar!");
        }
    }   
}
