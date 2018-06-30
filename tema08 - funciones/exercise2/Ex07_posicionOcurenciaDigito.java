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
public class Ex07_posicionOcurenciaDigito {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /////////////////////
        // NO FUNCIONABLE

        System.out.println("Introduce un numero");
        long numIntrod = teclado.nextLong();

        System.out.println("Introduce un digito");
        int digito = teclado.nextInt();

        System.out.println("-------------------------------------------------------");

        System.out.println("El digito esta en la posicion:" + functions.Functions2.posicionDigito(numIntrod, digito));

    }
}
