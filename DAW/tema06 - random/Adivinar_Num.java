/*
 * Adivinar número
 */
package tema06;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Adivinar_Num {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int numIntrod = -1;
        int numAdivinar;
        int intentos = 0;
        
        numAdivinar = (int)(Math.random() * 100) + 1;
        
        while(numIntrod != numAdivinar){
            System.out.println("Adivina un número de 0 a 100: ");
            numIntrod = tecla.nextInt();
            
            intentos++;
            
            if(numIntrod < numAdivinar){
                System.out.println("Introduce un número MAYOR");
            }else if(numIntrod > numAdivinar){
                System.out.println("Introduce un número MENOR");
            }else{
                System.out.println("Enhorabuena adivinaste el número despues de " + intentos + " intentos");
            }            
        }
    }
}
