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
public class Crucifix_b {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);   
        
        System.out.print("Introduce altura del crucifix: ");
        int altura = datos.nextInt();
        System.out.print("Introduce el caracter a dibujar: ");
        String caracter = datos.next();
        
        int i;
        int j;
        
        System.out.println("--------------------------------");
        
        if (altura > 3) {
            for(i = 0; i <= altura; i++){
                if(i == altura){                   
                    //la parte de enmedio
                    for(j = 0; j < altura; j++){
                       System.out.print("#") ;
                    }
                }else {
                    //la parte de arriba
                    for(j = 0; j < (altura / 2); j++){
                        System.out.print(" ") ;
                    }
                    
                     System.out.println(caracter) ;
                 }	
            }
            
            System.out.println() ;
            
            //la parte de abajo
            for(j = 0; j < altura; j++){
                for(int k = 0; k < (altura / 2); k++){
                    System.out.print(" ") ;
                }
                
                System.out.println(caracter) ;
            }


       }else{
            System.out.println("Introduce una altura superior a 3");
        }
    }
}
