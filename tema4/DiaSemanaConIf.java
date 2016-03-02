/*
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
 * del día de la semana.
 *
 * @author Costy
 */
import java.util.Scanner;
public class DiaSemanaConIf {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Escribe el numero corespondiente al dia");
        System.out.println("====================================================");
        
        String opcion = tecla.next();
        
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
