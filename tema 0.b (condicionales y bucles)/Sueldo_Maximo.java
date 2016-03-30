/*
 * Introducir sueldos y mostrar el mayor
 */
package tema.pkg0.b.condicionales.y.bucles;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Sueldo_Maximo {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int sueldo;
        int sueldoMax = 0;
        int numSueldos;
        
        System.out.println("Mostrar el sueldo máximo");
        System.out.println("==================================");
        
        System.out.println("Cuantos sueldos quieres meter?");
        numSueldos = tecla.nextInt();
        System.out.println("==================================");
        for(int i = 1; i <= numSueldos; i++){
            System.out.println("Introduce sueldo:");
            sueldo = tecla.nextInt();
            
            if(sueldo > sueldoMax){
                sueldoMax = sueldo;
            }
        }
        System.out.println("El sueldo máxmo es " + sueldoMax);
    }
}
