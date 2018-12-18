/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Ex17_transform_BinarioDecimal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Transformar número de binario a decimal");
        System.out.println("Introduce número binario:");
        long num = teclado.nextInt();

        System.out.println("-------------------------------------------------------");

        long decimal = 0;
        System.out.println("El número decimal es " + functions.Functions2.binario_Decimal(num));

  }    
}
