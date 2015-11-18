/**
 *
 * @author costy
 *
 * Dada una cantidad de tiempo de segundos, expresar ese mismo tiempo en forma 
 * de horas, minutos y segundos.
 * Recordar que un minuto son sesenta segundos y una hora son sesenta minutos.
*/
import java.util.Scanner;

public class HorasMinutosSegundos {

  public static void main(String[] args) {

    int segundosEntrada;
    int segundosSalida;
    int minutosSalida;
    int horasSalida;
          
    System.out.println("HORAS, MINUTOS Y SEGUNDOS");      
    System.out.println("-------------------------");      
    
    System.out.print("Introduzca la cantidad de segundos: ");
    Scanner lector = new Scanner(System.in);
    segundosEntrada = lector.nextInt();

    minutosSalida= segundosEntrada / 60;   
    segundosSalida = segundosEntrada % 60;
    
    horasSalida= minutosSalida / 60;
    minutosSalida = minutosSalida % 60;

    System.out.printf("%d segundos son %d horas, %d minutos, %d segundos" + 
           ".\n", segundosEntrada, horasSalida, minutosSalida, segundosSalida);
  }
}
