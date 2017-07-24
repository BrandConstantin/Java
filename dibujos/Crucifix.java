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
public class Crucifix {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);   
        
        System.out.print("Introduce altura del crucifix: ");
        int altura = datos.nextInt();
        System.out.print("Introduce el caracter a dibujar: ");
        String caracter = datos.next();
        
        int i;
        int j;
        int espacios = (altura / 2);
        
        System.out.println("--------------------------------");
        
        if (altura > 3) {
            for (i = 0; i < altura; i++) {
                //los espacios
                for (int k = 0; k < espacios; k++) {
                    System.out.print(" ");
                    
                    //la parte de arriba
                    if(i == (espacios - 2)){
                        System.out.print(caracter);
                     }
                }                

                System.out.print(caracter);
                System.out.println(" ");                  
            }
       }else{
            System.out.println("Introduce una altura superior a 3");
        }
    }
}
