/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
 * toca a primera hora ese día.
 *
 * @author Costy
 */
import java.util.Scanner;
public class AsignaturaPrimeraHoraIf {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Escribe un dia de la semana y te digo que asignatura te toca");
        System.out.println("====================================================");
        
        String dia = tecla.next();
        
        if ((dia.equals("lunes")) || (dia.equals("1"))){
            System.out.println("Lunes por la mañana te toca FOL");
        } else if ((dia.equals("martes")) || (dia.equals("2"))){
            System.out.println("Martes por la mañana te toca BD");
        } else if ((dia.equals("miercoles")) || (dia.equals("3"))){
            System.out.println("Miercoles por la mañana te toca PROG");
        } else if ((dia.equals("jueves")) || (dia.equals("4"))){
            System.out.println("Jueves por la mañana te toca SI");
        } else if ((dia.equals("viernes")) || (dia.equals("5"))){
            System.out.println("Viernes por la mañana te toca LM");
        } else {
            System.err.println("Has introducido un dia incorrecto!");
        } 

    }
}
