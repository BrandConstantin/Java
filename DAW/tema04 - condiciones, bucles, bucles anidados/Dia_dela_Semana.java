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
public class Dia_dela_Semana {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Introduce el dia de la semana (de 1 a 7): ");
        int dia = t.nextInt();
        
        switch(dia){
            case 1: 
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("Dia incorrecto!");
                break;
        }
    }
}
