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
public class Rotar_Array_Derecha2 {
    public static void main(String[] args) {

        int[] numero = new int[15];
        int[] cambiado = new int[15];

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
           
        // pasa el ultimo numero primero, el primero segundo, el segundo tercero etc
        int aux = numero[14];
        
        for (int i = numero.length - 1; i > 0; i--) {
            numero[i] = numero[i - 1];
        }
        numero[0] = aux;

        //mostrar array cambiado
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }
    }    
}
