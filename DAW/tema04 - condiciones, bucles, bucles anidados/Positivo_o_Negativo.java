/*
 * Leer un numero y mostrar si es positivo o negativo
 * Leer numeros hasta que se introduce un 0
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Positivo_o_Negativo {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        
        System.out.print("Introduce un número: ");
        num = tecla.nextInt();
        
        while(num != 0){
            if(num > 0){
                System.err.println("Número positivo");

                System.out.print("Introduce numero:");
                num = tecla.nextInt();          
            }
            
            if(num < 0){
                System.err.println("Número negativo");

                System.out.print("Introduce numero:");
                num = tecla.nextInt();    
            }
        }  
        
        if(num == 0){
            System.out.println("Programa finalizado!");
        }
    }    
}
