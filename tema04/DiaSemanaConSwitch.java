/*
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
 * del día de la semana.
 *
 * @author Costy
 */
import java.util.Scanner;
public class DiaSemanaConSwitch {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Escribe el numero corespondiente al dia");
        System.out.println("====================================================");
        
        int opcion = tecla.nextInt();
        String dia;
        
        switch (opcion){
            case 1:
                dia = "LUNES";
                System.out.printf("El dia es " + dia);
                break;
            case 2:
                dia = " MARTES";
                System.out.printf("El dia es " + dia);
                break;
            case 3:
                dia = "MIERCOLES";
                System.out.printf("El dia es " + dia);
                break;
            case 4:
                dia = "JUEVES";
                System.out.printf("El dia es " + dia);
                break;
            case 5:
                dia = "VIERNES";
                System.out.printf("El dia es " + dia);
                break;
            case 6:
                dia = "SABADO";
                System.out.printf("El dia es " + dia);
                break;
            case 7:
                dia = "DOMINGO";
                System.out.printf("El dia es " + dia);
            default:
                System.err.println("Has introducido un numero incorrecta!");
        }
    }
}
