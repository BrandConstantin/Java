/*
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class SegundosHastaMediaNoche {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);        
        
        System.out.println("Que hora es? ");
        int hora = t.nextInt();      
        
        if(hora <= 24 || hora >= 0){
            while(hora > 24 || hora < 0){
                System.out.println("Hora incorrecta! Vuelve a intentarlo");
                System.out.println("Que hora es? ");
                hora = t.nextInt();
            }
                    
            System.out.println("Y cuantos minutos? ");
            int minutos = t.nextInt();
            
            while(minutos > 60 || minutos < 0){
                System.out.println("Minutos incorrectos! Vuelve a intentarlo");
                System.out.println("Cuantos minutos? ");
                minutos = t.nextInt();
            }
                    
            System.out.println("-----------------------------------------------");
            
            int horasRestantes;
            int minutosRestantes;
            int segundosRestantes;
                         
            if(hora == 0 || hora == 00){
                horasRestantes = 24;
            }
            
            horasRestantes = 24 - hora;
            minutosRestantes = 60 * horasRestantes;
            segundosRestantes = minutosRestantes * 60;

            System.out.println("Quedan un total de " + horasRestantes + " horas");
            System.out.println("Quedan un total de " + minutosRestantes + " minutos");
            System.out.println("Quedan un total de " + segundosRestantes + " segundos");
            //hora = t.nextInt();
        }
    }
}
