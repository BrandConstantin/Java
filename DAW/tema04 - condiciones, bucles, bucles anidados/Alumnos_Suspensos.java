/*
 *  Pedir 5 calificaciones y decir si hay algún suspenso
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Alumnos_Suspensos {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int nota;
        int alumSuspenso = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Alumno " + i);
            System.out.print("Introduce nota: ");
            nota = tecla.nextInt();
            
            if(nota <= 4){
                alumSuspenso++;
            }
        }
        
        if(alumSuspenso <= 0){
            System.out.println("-------------------------");
            System.out.println("No hay alumnos suspensos!");
        }else{
            System.out.println("-------------------------");
            System.out.println("Hay un total de " + alumSuspenso + " alumnos suspensos");
        }
    }
}
