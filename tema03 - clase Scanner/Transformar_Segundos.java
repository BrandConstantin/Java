/*
 *
 * Dada una cantidad de tiempo de segundos, expresar ese mismo tiempo en forma de horas, minutos y segundos.
 * Recordar que un minuto son sesenta segundos y una hora son sesenta minutos.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Transformar_Segundos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        long segundosEntrada;
        int segundosSalida;
        int minutosSalida;
        int horasSalida;
        
        System.out.print("Introduzca la cantidad de segundos: ");
        segundosEntrada = lector.nextLong();
        
        minutosSalida = (int)segundosEntrada / 60;
        segundosSalida = (int)segundosEntrada % 60;
        
        horasSalida = minutosSalida / 60;
        minutosSalida = minutosSalida % 60;
        
        System.out.printf("%d segundos son %d horas, %d minutos, %d segundos.\n", segundosEntrada, horasSalida, minutosSalida, segundosSalida);
    }
}
