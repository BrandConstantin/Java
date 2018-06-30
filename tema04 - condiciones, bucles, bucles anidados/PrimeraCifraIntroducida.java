/*
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class PrimeraCifraIntroducida {
   public static void main(String[] args) {   
    Scanner tecla = new Scanner(System.in);
  
    System.out.println("PRIMERA CIFRA INTRODUCIDA POR TECLADO ");
    System.out.println("================================================");

    System.out.println("Introduce un numero");
    int num = tecla.nextInt();
    
    int digito;
    System.out.println("-----------------------------------------------------");
    
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
    }else{
        System.out.println("Demasiada cifras introducidas!");
    }
   }
}
