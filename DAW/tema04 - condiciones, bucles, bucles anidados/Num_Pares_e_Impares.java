/*
 * Leer un numero y mostrar si es par o impar
 * Leer numeros hasta que se introduce un 0
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Num_Pares_e_Impares {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int num = 1;
        
        while(num != 0){
            System.out.print("Introduce un número: ");
            num = tecla.nextInt();
            
            if(num % 2 == 0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
            
            if(num == 0){
                System.out.println("Programa finalizado!");
            }
        }
    }
}
