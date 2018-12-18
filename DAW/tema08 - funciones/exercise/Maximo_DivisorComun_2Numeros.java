/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Maximo_DivisorComun_2Numeros {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int a;
        int b;
        int maximDivisor;

        System.out.println("Introduce número: ");
        a = tecla.nextInt();
        System.out.println("Introduce el seguno número: ");
        b = tecla.nextInt();
        System.out.println("----------------------------------------");

        maximDivisor = functions.Functions.maximDivisor(a, b);
        System.out.println("El maximo divisor comun de " + a + " y " + b
                + " es " + maximDivisor);
    }
}
