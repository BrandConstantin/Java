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
public class PackMan {
    public static void main(String[] args){
        int altura = 10;
        String caracter = "#";
        String espacios = " ";

        for (int i = 1; i <= altura; i++) {           
            for (int j = i; j > (altura / 2); j--) {
                System.out.print(caracter + " ");
            }            
            
            for (int j = i; j <= (altura / 2); j++) {
                System.out.print(caracter + " ");
            }

            System.out.println(" ");
        }    
    }    
}