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
public class Ex03_siguientePrimo {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("Introduce un número:");
        System.out.println("(Devolvera el siguiente primo, al número introducido)");
        System.out.println("----------------------------------------------------");
        int x = tecla.nextInt();

        System.out.print("El número primo siguiente es " + functions.Functions2.siguientePrimo(x));

    }
}
