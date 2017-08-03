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
public class Caracter_X {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int altura=0;
        int aux = altura;
        int i;
        int k;
        int j = 0;
        int l;
        int m;
        int a;
        int espacios = 1;
        
        System.out.println("Este programa creara una X");
        System.out.print("Por favor introduce la altura \n");
        System.out.print("===================================================================\n");
        altura = teclado.nextInt();
        System.out.print("===================================================================\n");

        for(i = 0; i < altura; i++){
            if (i < (altura / 2)){
                //espacio iquierda arriba
                for (j = 0; j < espacios; j++){
                    System.out.print(" ");
                }          
                
                //el palo izquierda arriba
                System.out.print("@");
                
                //espacio entre palo izquierdo y derecho arriba
                 for (k = espacios; k < (altura - 2); k++){
                    System.out.print(" ");
                  }
                 
                 //palo izquierda abajo
                 System.out.print("@");    
            } else {
                //espacio izquierda abajo
                 for (k = j; k > 0; k--){
                    System.out.print(" ");
                  }
                 
                 //palo izquierda abajo
                 System.out.print("@");
                 
                 //espacio entre palo izquierdo y derecho
                 for (m = k; m < aux; m++){
                     System.out.print(" ");
                 }
                 
                 //palo derecha abajo
                 System.out.print("@");
                 aux += 2;
                  j--;
            }
            espacios++;
            System.out.println(" ");
        }
    }   
}
