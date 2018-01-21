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
public class Ex18_transform_DecimalBinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Transformar número de decimal a binario");
        System.out.println("Introduce número decimal:");
        long num = teclado.nextInt();

        System.out.println("-------------------------------------------------------");

        System.out.println("El número decimal es " + functions.Functions2.decimal_Binario(num));

  }    
}
