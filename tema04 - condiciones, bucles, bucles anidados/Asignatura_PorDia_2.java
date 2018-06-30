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
public class Asignatura_PorDia_2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Introduce el dia de la semana: ");
        String dia = toUpperCase(t.next());
        
        if ((dia.equals("LUNES")) || (dia.equals("1"))){
            System.out.println("Lunes por la mañana te toca FOL");
        } else if ((dia.equals("MARTES")) || (dia.equals("2"))){
            System.out.println("Martes por la mañana te toca BD");
        } else if ((dia.equals("MIERCOLES")) || (dia.equals("3"))){
            System.out.println("Miercoles por la mañana te toca PROG");
        } else if ((dia.equals("JUEVES")) || (dia.equals("4"))){
            System.out.println("Jueves por la mañana te toca SI");
        } else if ((dia.equals("VIERNES")) || (dia.equals("5"))){
            System.out.println("Viernes por la mañana te toca LM");
        } else {
            System.err.println("Has introducido un dia incorrecto!");
        } 
    }    
}
