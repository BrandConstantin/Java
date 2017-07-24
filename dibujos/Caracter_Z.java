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
public class Caracter_Z {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);   
        
        System.out.print("Introduce altura de la letra Z: ");
        int altura = datos.nextInt();
        System.out.print("Introduce el caracter a dibujar la letra: ");
        String caracter = datos.next();
        
        int i;
        int j;
        int posicion = altura;
        
        System.out.println("--------------------------------");
        
        if (altura > 4) {           
            for(i = 0; i < altura; i++){
                //la parte superior
                while (posicion < altura) {
                    System.out.print (caracter);
                    posicion++;
                }
            }
             
            System.out.println("");
            
            for(i = altura; i > 0; i--){
                //los espacios en blanco
                for (int k = 0; k < altura; k++) {
                    while(posicion < 0){
                        System.out.print(caracter);
                    }
                    
                    posicion--;
                }
                System.out.println("@");
            }
            
            /*for(i = 0; i < altura; i++){
                //la barra diagonal
               while (posicion == altura - i) {
                   System.out.print (caracter);
                    posicion++;
                }
                //System.out.println ();
                //posicion = 0;
            }*/
       }else{
            System.out.println("Introduce una altura superior a 4");
        }
    }
}
