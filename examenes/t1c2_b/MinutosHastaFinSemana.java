/*
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y
minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana
comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos,
anterior al viernes a las 15:00h.
 */
package t1c2_b;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class MinutosHastaFinSemana {
     public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("CALCULAR MINUTOS HASTA FIN DE SEMANA");
        System.out.println("------------------------------------------------------------------------------");
        
        System.out.println("Introduzca el dia (de lunes [1] a viernes [5]");
        int diaUno = t.nextInt();
        System.out.println("Introduzca la hora [0-23]: ");
        int horaActual = t.nextInt();
        System.out.println("Introsuzca los minutos [0-60]");
        int minutosActual = t.nextInt();
        System.out.println("--------------------------------------------------------------------------------");
        
        int minutosDeHoy = 0;
        int minutosHastaViernes = 0;
        int minutosDeViernes = 15 * 60;
        int minutosTotales = 0;
        int diaRestante = 4 - diaUno;
        
        if(diaUno <= 5){
            minutosDeHoy = ((24 - horaActual) * 60) - minutosActual;
            minutosHastaViernes = ((24 * 60) * diaRestante) + minutosDeHoy + minutosDeViernes;
            //minutosTotales = minutosDeHoy + minutosHastaViernes + minutosDeViernes;
        }
        
        System.out.println("Hata el fin de semana quedan " + minutosHastaViernes + " minutos");
     }
}
