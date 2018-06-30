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
public class Maximo_DivisorComun_Tabla {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int maximDivisor;
        int t[] = new int[15];

        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * 1000 + 1);
        }

        System.out.println("Los números son: ");
        System.out.println("----------------------------------------");

        for (int i = 0; i < t.length; i++) {
            System.out.print("|_" + t[i] + "_|");
        }

        System.out.println("\n-----------------------------------------");
        maximDivisor = functions.Functions.maximDivisor(t);
        System.out.println("El maximo divisor es " + maximDivisor);
    }
}
