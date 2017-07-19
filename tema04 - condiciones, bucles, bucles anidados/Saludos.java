/*
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Saludos {
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
                    
            System.out.println("-----------------------------------------------");
            
            switch(hora){
                case 6:
                case 7: 
                case 8:
                case 9: 
                case 10:
                case 11:
                case 12:
                    System.out.println("Buenos dias!");
                    break;
                case 13: 
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20: 
                    System.out.println("Buenas tarde!");
                    break;
                case 21: case 22: case 23: case 24: case 0: case 1: case 2: case 3: case 4: case 5:                    
                    System.out.println("Buenas noches!");
                    break;
            }
        }
    }
}
