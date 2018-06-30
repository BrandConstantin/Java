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
public class Piramide_VerticeAbajo {
    public static void main(String[] args){
        int altura = 9;
        String caracter = "#";
        String espacios = " ";
        
        for (int i = altura; i >= 1; i--) {
            for (int j = i; j <= 10; j++) {
                System.out.print(espacios);
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(caracter + " ");
            }

            System.out.println(" ");
        }
    }
}
