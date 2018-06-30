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
public class Rombo_Relleno {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);   
        
        System.out.print("Introduce altura del rombo: ");
        int altura = datos.nextInt();
        System.out.print("Introduce el caracter a dibujar el rombo: ");
        String caracter = datos.next();
        
        if (altura > 3) {
            for (int i = 1; i <= altura - 1; i++){
                for (int j = altura; j > i; j--){
                    System.out.print(" ");
                } 
                
                for (int  j =1; j <= i; j++){
                    System.out.print(caracter + " ");
                }
                
                System.out.println();
            }
            
            for (int i = altura; i > 0; i--){
                for (int k = altura; k > i; k--){
                    System.out.print(" ");
                 }
                
                for (int j =1; j <= i; j++){
                    System.out.print(caracter + " ");
                }
                
                System.out.println();
            }
       }else{
            System.out.println("Introduce una altura superior a 3");
        }
    }
}
