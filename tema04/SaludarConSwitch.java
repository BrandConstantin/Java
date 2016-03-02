/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
 * toca a primera hora ese día.
 *
 * @author Costy
 */
import java.util.Scanner;
public class SaludarConSwitch {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Escribe la hora por teclado");
        System.out.println("====================================================");
        
        int hora = tecla.nextInt();
        
        switch (hora){
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Buenos Dias!"); 
            break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Buenos Tarde!"); 
            break;
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Buenos Noches!"); 
            break;
            default:
                System.err.println("Has introducido una hora incorrecta!");
        }
    }
}
