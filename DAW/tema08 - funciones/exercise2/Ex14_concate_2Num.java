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
public class Ex14_concate_2Num {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        long numInicial = teclado.nextInt();
        System.out.println("introduce otro número");
        long numFinal = teclado.nextInt();

        System.out.println("-------------------------------------------------------");


        System.out.println("Los dos número juntos son\n:" + functions.Functions2.juntarNumeros(numInicial, numFinal));

  }    
}
