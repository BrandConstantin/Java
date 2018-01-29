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
public class Menor_a_Mayor {
    public static void main(String[] args) {

        int[] numero = new int[15];
        int[] ordenado = new int[15];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

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

        //sacar el máximo
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < min) {
                min = numero[i];
            }else if(numero[i] > max){
                max = numero[i];
            }else{
                numero[i] = numero[i];
            }
        }

        while (min != numero[0]) {
            max = numero[14];

            for (int j = numero.length - 1; j > 0; j--) {
                numero[j] = numero[j - 1];
                
            }
            numero[0] = max;
        }
        
        System.out.println("\n");

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
