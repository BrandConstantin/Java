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
    
    boolean verdadero = true;
 
        System.out.println("Introduce la primera hora:");
        int  hora1 = teclado.nextInt();
        System.out.println("Y los minutos");
        int minuto1 = teclado.nextInt();
        

        
        System.out.println("Introduce la segunda hora:");
       int  hora2 = teclado.nextInt();
        System.out.println("Y los minutos");
       int  minuto2 = teclado.nextInt();
       System.out.print("===================================================================\n");      
       
       verdadero = true;
        
        if (hora2 <= hora1) {
            System.err.println("La segunda hora debe ser posterior a la primera.");
            verdadero = false;
        } else if (((hora1 < 0) || (hora1 > 23)) || ((hora2 < 0) || (hora2 > 23))){
            System.err.println("Introduce una hora correcta (0-23)");        
            verdadero = false;
        } else {
            System.out.println("Entre primera hora  y la seguna hora hay un total de");
            System.out.print(((hora2 * 60 * 60) -(hora1 * 60 * 60)) + "segundos");       
            verdadero = true;
        }
  }
}