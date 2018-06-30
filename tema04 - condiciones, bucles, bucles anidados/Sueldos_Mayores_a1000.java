/*
 * Pedir 5 sueldos y decir cuantos hay más de 1000 euros
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Sueldos_Mayores_a1000 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int sueldo = 0;
        int sumaSueldosMayor = 0;
        int sumaSueldosTotal = 0;
        int mayorMil = 0;

        for (int i = 1; i < 6; i++) {
            System.out.print("Introduce sueldo " + i + ": ");
            sueldo = tecla.nextInt();
                    
            if(sueldo >= 1000){
                mayorMil++;
                sumaSueldosMayor += sueldo;
            }           
            
            sumaSueldosTotal += sueldo;
        }
        System.out.println("==================================");  
        
        System.out.println("Hay un total de " + mayorMil + " sueldos mayores a 1000€");
        System.out.println("La suma de los sueldos mayores de 1000€ es de " + sumaSueldosMayor);
        System.out.println("La suma total de los sueldos es de " + sumaSueldosTotal);
    }
}
