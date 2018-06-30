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
public class Ex01_esCapicua {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("Introduce un número:");
        long num = tecla.nextLong();

        if (functions.Functions2.esCapicua(num)) {
            System.out.print("El número es capicua");
        } else {
            System.out.print("El número no es capicua");
        }
    }
}
