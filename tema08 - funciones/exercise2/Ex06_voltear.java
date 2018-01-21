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
public class Ex06_voltear {

    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);

        System.out.println("Voltear Número");
        System.out.println("============================================");

        System.out.println("Escribe un numero");
        int num = tecla.nextInt();

        System.out.println("El numero volteado es " + functions.Functions2.volteado(num));

    }
}
