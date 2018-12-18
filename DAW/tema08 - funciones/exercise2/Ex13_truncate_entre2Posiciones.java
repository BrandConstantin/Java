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
public class Ex13_truncate_entre2Posiciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        long numIntrod = teclado.nextLong();

        System.out.println("Elije número inicial");
        int numInicial = teclado.nextInt();
        System.out.println("Elije número final");
        int numFinal = teclado.nextInt();

        System.out.println("-------------------------------------------------------");

        System.out.println("El nuevo número es:" + functions.Functions2.trozoDeNumero(numIntrod, numInicial, numFinal));

    }
}
