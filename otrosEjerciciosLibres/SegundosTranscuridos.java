/**
* Realiza una programa que calcule los segundos transcurridos entre dos horas de un día. Para cada hora del día
* se introduce la hora y los minutos. Se da por hecho que el usuario introduce los datos correctamente y que la
* segunda hora es posterior a la primera.
* Ejemplo:
* Primera hora
* Hora: 19
* Minuto: 10
* Segunda hora.
* Hora: 20
* Minuto: 15
* Entre las 19:10h y las 20:15 hay 4500 segundos.
* 
* @author costy
 */
import java.util.Scanner;

public class SegundosTranscuridos {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("AVERIGUAR LOS SEGUNDOS TRANSCURIDOS");
    
    int hora1;
    int minuto1;
    int hora2;
    int minuto2;
    boolean verdadero = true;
 
        System.out.println("Introduce la primera hora:");
        hora1 = teclado.nextInt();
        System.out.println("Y los minutos");
        minuto1 = teclado.nextInt();
        

        
        System.out.println("Introduce la segunda hora:");
        hora2 = teclado.nextInt();
        System.out.println("Y los minutos");
        minuto2 = teclado.nextInt();
        
        verdadero = true;
        
        if (hora2 <= hora1) {
            System.err.println("La segunda hora debe ser posterior a la primera.");
            verdadero = false;
        } else if (((hora1 < 0) || (hora1 > 23)) || ((hora2 < 0) || (hora2 > 23))){
            System.err.println("Introduce una hora correcta (0-23)");        
            verdadero = false;
        } else {
            System.out.println("Entre " + hora1 + " primera hora" + " y la seguna hora " + hora2 + " hay un total de");
            System.out.print(((hora2 * 60 * 60) -(hora1 * 60 * 60)) + "segundos");       
            verdadero = true;
        }
  }
}