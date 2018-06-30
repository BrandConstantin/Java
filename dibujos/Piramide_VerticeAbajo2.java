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
public class Piramide_VerticeAbajo2 {
    public static void main(String[] args){
        int altura = 10;
        String caracter = "#";
        
        for(int i = altura; i >= 1; i--) {
            for(int z = i; z >= 1; z--) {
                System.out.print(caracter); 
            }
            
            System.out.println(" "); 
        }
    }
}
