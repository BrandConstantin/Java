/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
 * toca a primera hora ese día.
 *
 * @author Costy
 */
import java.util.Scanner;
public class AsignaturaPrimeraHoraSwitch {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Escribe un dia de la semana y te digo que asignatura te toca");
        System.out.println("====================================================");
        
        int opcion = tecla.nextInt();
        
        switch (opcion){
            case 1: 
                System.out.println("Lunes te toca FOL  a la primera hora");
            break;
            case 2: 
                System.out.println("Martes te toca BD  a la primera hora");
            break;
            case 3: 
                System.out.println("Miercoles te toca PROG  a la primera hora");
            break;
            case 4: 
                System.out.println("Jueves te toca SI  a la primera hora");
            break;
            case 6: 
                System.out.println("Viernes te toca LM  a la primera hora");
            break;
            default: 
                System.err.println("Has escojido una opcion invalida!!");    
        }
    }
}
