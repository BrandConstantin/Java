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
public class Ex11_add_digitoUltimo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        long numIntrod = teclado.nextLong();

        System.out.println("Añade un número (el número se colocara por detras)");
        int digitos = teclado.nextInt();

        System.out.println("-------------------------------------------------------");

        System.out.println("El nuevo número es:" + functions.Functions2.pegaPorDetras(numIntrod, digitos));

    }
}
