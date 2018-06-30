/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

/**
 *
 * @author BrandConstantin
 */
public class Piramide_VerticeDerecha {
    public static void main(String[] args){
        int altura = 10;
        String caracter = "#";
        String espacios = " ";
        
        //la parte de arriba
        for (int i = 1; i <= altura; i++) {          
            for (int j = i; j > (altura / 2); j--) {
                System.out.print(caracter + " ");
            } 

            System.out.println(" ");         
        }   
        
        //la parte de abajo
        for (int i = 1; i <= altura; i++) {             
            for (int j = (altura / 2); j >= i; j--) {
                System.out.print(caracter + " ");
            }

            System.out.println(" ");            
        }    
    }    
}
