/*
 * Leer un numero y mostrar su cuadrado
 * Leer numeros hasta que se introduce un negativo
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Num_al_Cuadrado {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int num = 1;
        int cuadrado;    
        
        while(num >= 0){
            System.out.print("Introduce un número: ");
            num = tecla.nextInt();
                        
            if(num >= 0){
                System.out.println("Num al cuadrado: " + (num * num));
            }else{
                System.out.println("Programa finalizado!");
            }
        }
        
    }
}
