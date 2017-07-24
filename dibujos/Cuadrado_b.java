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
public class Cuadrado_b {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);    
        
        System.out.print("Introduce altura del cuadrado: ");
        int altura = datos.nextInt();
        System.out.print("Introduce el caracter a dibujar del cuadrado: ");
        String caracter = datos.next();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println("");
        }
    }
}
