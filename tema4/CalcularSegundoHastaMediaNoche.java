/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los
 * segundos que faltan para llegar a la medianoche.
 *
 * @author Costy
 */
import java.util.Scanner;
public class CalcularSegundoHastaMediaNoche {

  public static void main(String[] args) {
    Scanner tecla = new Scanner (System.in);

    System.out.println("CALCULAR SEGUNDOS HASTA MEDIA NOCHE");
    System.out.println("===============================================");
    
    System.out.print("Introduzca la hora (00-23): ");
    int hora = tecla.nextInt();
    
    System.out.print("Ahora introduzca los minutos: ");
    int minutos = tecla.nextInt();
    
    int horaRestante = 0;
    int minutoRestante;
    int segundos = 0;
  
    if((hora > 1) && (hora < 23)){
        horaRestante = 23 - hora;
        if((minutos >= 0) && (minutos < 60)){
            minutoRestante = 60 - minutos;
            segundos = (((horaRestante * 60) + minutoRestante) * 60);
        } else {
            System.err.println("Datos introducidos incorrectamente!"); 
        }
    } else if (hora == 0){
        minutoRestante = 60 - minutos;
        segundos = (((horaRestante * 60) + minutoRestante) * 60);
    } else {
        System.err.println("Datos introducidos incorrectamente!");
    }
    System.out.printf("Hasta media noche faltan %d segundos", segundos);
  }
}
