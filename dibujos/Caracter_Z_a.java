/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Caracter_Z_a {
    public static void main(String[] args) {   
        Scanner teclado = new Scanner(System.in);

        int altura = 0;
        int posicion = 0;
        
       System.out.print("Introduce la altura:");
       altura = teclado.nextInt();
       System.out.print ("Introduce el caracter:");
       String caracter = teclado.next();
       System.out.print("===================================================================\n");
       
       if (altura > 4) {
            for (int i = 1; i <= altura; i++) {
                if (i == 1 || i == altura) {
                    while (posicion < altura) {
                        System.out.print (caracter);
                        posicion++;
                    }
                } else {
                     while (posicion < (altura - i)) {
                         System.out.print (" ");
                         posicion++;
                      }
                     while (posicion == altura - i) {
                        System.out.print (caracter);
                         posicion++;
                     }
               }
                System.out.println ();
                posicion = 0;
            }   
        } else {
            System.err.println ("NO has introducido una altura mas grande que 4!");
       }
    }    
}
