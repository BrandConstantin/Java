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
public class Saludos2 {
     public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Introduce la hora: ");
        int hora = t.nextInt();

        if(hora >= 21 && hora <= 24 || hora >= 1 && hora < 6 || hora == 0){
            System.out.println("Buenas noches!");
        }else if(hora > 12 && hora <= 20 ){
            System.out.println("Buenas tarde");
        }else if(hora >= 6 && hora <= 12){
            System.out.println("Buenos dias!");
        }else{
            System.out.println("Hora erronea!");
        }
    }   
}
