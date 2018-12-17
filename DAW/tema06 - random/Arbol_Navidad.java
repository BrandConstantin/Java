/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Arbol_Navidad {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        System.out.print("Introduzca la altura del arbol:\n ");
        int alturaIntrod = datos.nextInt();
        System.out.print("Dibuja bombillas en el arbol:\n");
        String bombilla = datos.next();
        System.out.print("===================================================================\n");

        String caracter = "&";
        
        for (int i = 0; i <= alturaIntrod; i++){
            //espacios ante de la piramide
            for (int j = alturaIntrod; j > i; j--){
                System.out.print(" ");
            } 
            
            //dibujar piramide
            for (int  j = 0; j < i; j++){
                int numero = (int)(Math.random() * j);
                
                //dibujar las bombillas
                if (numero == (int)(Math.random() * j) + 1) {
                    System.out.print(bombilla + " ");
                }else{//sino dibujar caracter
                    System.out.print(caracter + " ");
                }
            }

            System.out.println();
        }
    }
}
