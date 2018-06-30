/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Desplazar_Num_nPosiciones {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] numero = new int[8];
        int ultimo = 0;

        //llenan el array de números y los muestra
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduce un número: ");
            numero[i] = tec.nextInt();
            //numero[i] = (int) (Math.random() * 30);
        }

        System.out.println("");

        //Mostras el indice y sus numeros guardados en el array
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }

        System.out.println("");

        System.out.print("Cuantas posiciones quieres desplazar un número (0 - 8) : ");
        int desplazar = tec.nextInt();

        if (desplazar < 8) {
            //a partir del indice final + 1 añade los demas números menos el ultimo
            for (int vuelta = 0; vuelta < desplazar; vuelta++) {
                //guardamos el ultimo elemento
                ultimo = numero[7];

                //desplazamos los elementos hacia ultima posición
                for (int i = 6; i >= 0; i--) {
                    numero[i + 1] = numero[i];
                }

                //el ultimo indice al ser empujado fuera del array se coloca primero
                numero[0] = ultimo;
            }
        } else {
            System.out.println("Opción erronea!");
        }

        //Mostras el indice y sus numeros guardados en el array
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }
    }
}
