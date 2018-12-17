/*
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Dia_dela_Semana_2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Introduce el dia de la semana (de 1 a 7): ");        
        String opcion = t.next();
        
        if (opcion.equals("1")){
            System.out.print("Es LUNES");
        } else if (opcion.equals("2")){
            System.out.print("Es MARTES");
        } else if (opcion.equals("3")){
            System.out.print("Es MIERCOLES");
        } else if (opcion.equals("4")){
            System.out.print("Es JUEVES");
        } else if (opcion.equals("5")){
            System.out.print("Es VIERNES");
        } else if (opcion.equals("6")){
            System.out.print("Es SABADO");
        } else if (opcion.equals("7")){
            System.out.print("Es DOMINOG");
        } else {
            System.err.print("Opción erronea!! ");
        }
    }
}
