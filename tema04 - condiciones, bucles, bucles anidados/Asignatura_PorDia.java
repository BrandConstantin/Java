/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 */
package tema04;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author BrandConstantin
 */
public class Asignatura_PorDia {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Introduce el dia de la semana: ");
        String dia = toUpperCase(t.next());
        
        switch(dia){
            case "LUNES": 
                System.out.println("El dia " + dia + " toca la asignatura EIE");
                break;
            case "MARTES":
                System.out.println(" El dia " + dia + " toca la asignatura DIW");
                break;
            case "MIERCOLES":
                System.out.println("El dia " + dia + " toca la asignatura DWEC");
                break;
            case "JUEVES":
                System.out.println("El dia " + dia + " toca la asignatura DWES");
                break;
            case "VIERNES":
                System.out.println("El dia " + dia + " toca la asignatura DWEC");
                break;
            default:
                System.out.println("Dia incorrecto!");
                break;
        }
    }    
}
