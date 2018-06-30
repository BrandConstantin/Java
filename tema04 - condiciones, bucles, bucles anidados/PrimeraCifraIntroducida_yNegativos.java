/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class PrimeraCifraIntroducida_yNegativos {
    public static void main(String[] args) {   
        Scanner tecla = new Scanner(System.in);
        
        int digito = 0;
        
        System.out.println("PRIMERA CIFRA INTRODUCIDA POR TECLADO (numero formado por 5 cifras)");
        System.out.println("================================================");

        System.out.println("Introduce un numero no muy largo");
        int num = tecla.nextInt();
        System.out.println("-----------------------------------------------------------");
            
       //para números positivos 
        if(num >= 0 && num < 10){
            digito = num;
            System.out.print("El número positivo tiene 1 digito:  = ");
            System.out.println(digito);
        }else if(num >= 10 && num < 100){
            digito = num / 10;
            System.out.print("El número positivo tiene 2 digito:  = ");
            System.out.println(digito);
        }else if(num >= 100 && num < 1000){
            digito = num / 100;
            System.out.print("El número positivo tiene 3 digito:  = ");
            System.out.println(digito);
        }else if(num >= 1000 && num < 10000){
            digito = num / 1000;
            System.out.print("El número positivo tiene 4 digito:  = ");
            System.out.println(digito);
        }else if(num >= 10000 && num < 100000){
            digito = num / 10000;
            System.out.print("El número positivo tiene 5 digito:  = ");
            System.out.println(digito);
        }else if(num >= 100000 && num < 1000000){
            digito = num / 100000;
            System.out.print("El número positivo tiene 6 digito:  = ");
            System.out.println(digito);
        } else if(num < 0 && num > -10){
            digito = num;
            System.out.print("El número negativo tiene 1 digito:  = ");
            System.out.println(digito);
        }else if(num <= -10 && num > -100){
            digito = num / 10;
            System.out.print("El número negativo tiene 2 digito:  = ");
            System.out.println(digito);
        }else if(num <= -100 && num > -1000){
            digito = num / 100;
            System.out.print("El número negativo tiene 3 digito:  = ");
            System.out.println(digito);
        }else if(num <= -1000 && num > -10000){
            digito = num / 1000;
            System.out.print("El número negativo tiene 4 digito:  = ");
            System.out.println(digito);
        }else if(num <= -10000 && num > -100000){
            digito = num / 10000;
            System.out.print("El número negtivo tiene 5 digito:  = ");
            System.out.println(digito);
        }else if(num <= -100000 && num > -1000000){
            digito = num / 100000;
            System.out.print("El número negativo tiene 6 digito:  = ");
            System.out.println(digito);
        } else {
             System.out.print("Error: Demasiada cifras introducidas!");
         }
    }    
}
