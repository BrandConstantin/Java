/*
 * Pedir 5 calificaciones y decir si hay algún suspenso
 */
package tema.pkg0.b.condicionales.y.bucles;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Alumnos_Suspensos {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        boolean suspenso = false;
        int contarSuspensos = 0;
        
        System.out.println("Mostrar alumnos suspensos");
        System.out.println("==================================");
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Introduce la nota del " + i + " alumno: ");
            num = tecla.nextInt();
            
            if(num <= 4){
                suspenso = true;
                contarSuspensos++;
            }
        }
        
        if(suspenso == true){
            System.out.println("Hay alumnos suspensos");
        }
        System.out.println("Hay un total de " + contarSuspensos + 
                " alumnos suspensos");
    }
}
