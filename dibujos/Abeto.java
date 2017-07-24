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
public class Abeto {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);    
        
        System.out.print("Introduce altura del abeto: ");
        int altura = datos.nextInt();
        System.out.print("Introduce el caracter a dibujar el abeto: ");
        String caracter = datos.next();
        
       int contador = 0;
       
       for (int i = 1; i <= altura; i++){
             contador++;
             for (int j = 1; j <= contador; j++){
                    for (int k = 0; k < j; k++){
                         System.out.print(caracter);
                       }
                   System.out.print("\n");
             }			
      }
    }
}
