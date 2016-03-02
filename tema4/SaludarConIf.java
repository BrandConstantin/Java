/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
 * toca a primera hora ese día.
 *
 * @author Costy
 */
import java.util.Scanner;
public class SaludarConIf {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Escribe la hora por teclado");
        System.out.println("====================================================");
        
        int hora = tecla.nextInt();
        
       if ((hora >= 6) && (hora <= 12)){
           System.out.println("Buenos Dias!");
       } else if ((hora >= 13) && (hora <= 20)){
           System.out.println("Buenos Tarde!");
       } else if (((hora >= 21) || (hora <= 23) || (hora >= 1) || (hora <= 5)) || (hora == 0)){
           System.out.println("Buenos Noches!");
       } else {
           System.err.println("Has introducido una hora incorrecta!");
       }
    }
}
