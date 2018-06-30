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
                System.out.print (caracter);
            }
             
            System.out.println("");
            
            //los espacios en blanco
            for (i = 1; i <= (altura / 2 + 1); i++) {
                for (j = i; j <= 10; j++) {
                    if(j == altura){
                        System.out.println(caracter);
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }   
            
            //la ultima linea
            for(i = 0; i < altura; i++){
                //la parte superior
                System.out.print (caracter);
            }
       }else{
            System.out.println("Introduce una altura superior a 4");
        }
    }
}
