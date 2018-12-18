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
public class Ex02_esPrimo {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int x = tecla.nextInt();

        if (functions.Functions2.esPrimo(x)) {
            System.out.print("El número es primo");
        } else {
            System.out.print("El número no es primo");
        }
    }
}
