/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_unidimensional;

/**
 *
 * @author brand
 */
public class Maximo_PrimeraPosicion {

    public static void main(String[] args) {

        int[] numero = new int[15];
        int max = Integer.MIN_VALUE;
        int numFinal = numero[14];

        //llenan el array de números y los muestra
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 30);
        }

        //Mostras el indice y sus numeros guardados en el array
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }

        //a partir del indice final + 1 añade los demas números menos el ultimo
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > max) {
                max = numero[i];
            } else {
                numero[i] = numero[i];
            }

            if (numero[i] == numero[14]) {
                numFinal = numero[i];
            }
        }

        //a partir del indice pasar los números a la derecha para colocar 1 el maximo
        for (int i = numero.length - 1; i > 0; i--) {
            numero[i] = numero[i - 1];
        }

        //el ultimo indice al ser empujado fuera del array se coloca primero
        numero[0] = max;

        System.out.println("");
        System.out.println("El número máximo es " + max);
        System.out.println("");

        //mostrar array cambiado
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }
    }
}
