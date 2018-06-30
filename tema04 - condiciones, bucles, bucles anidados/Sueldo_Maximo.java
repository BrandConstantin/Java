/*
 * Introducir sueldos y mostrar el mayor
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Sueldo_Maximo {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int sueldo = 0;
        int sumaSueldosMayor = 0;
        int sumaSueldosTotal = 0;
        int mayorMil = 0;
        int sueldoMax = Integer.MIN_VALUE;

        for (int i = 1; i < 6; i++) {
            System.out.print("Introduce sueldo " + i + ": ");
            sueldo = tecla.nextInt();
                    
            if(sueldo >= 1000){
                if(sueldo > sueldoMax){
                    sueldoMax = sueldo;
                }
                
                mayorMil++;
                sumaSueldosMayor += sueldo;
            }           
            
            sumaSueldosTotal += sueldo;
        }
        System.out.println("==================================");  
        
        System.out.println("Hay un total de " + mayorMil + " sueldos mayores a 1000€");
        System.out.println("La suma de los sueldos mayores de 1000€ es de " + sumaSueldosMayor);
        System.out.println("La suma total de los sueldos es de " + sumaSueldosTotal);
        System.out.println("El sueldo maximo es " + sueldoMax);
    }
}
