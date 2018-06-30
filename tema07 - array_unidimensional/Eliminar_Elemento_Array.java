/*
 * Eliminar elemento de la posición indicada
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Eliminar_Elemento_Array {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] numero = new int[8];
        int ultimo = 0;
        int posicion = 0;

        //llenan el array de números y los muestra
        for (int i = 0; i < numero.length; i++) {
//            System.out.print("Introduce un número: ");
//            numero[i] = tec.nextInt();
            numero[i] = (int) (Math.random() * 30);
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

        System.out.print("Elimina la posición (0 - 7): ");
        posicion = tec.nextInt();

        System.out.println("");

        //desplazamos todos los elementos desde la posicion hasta el final
        //la i llega hasta la penúltima posición 
        for (int i = posicion; i < numero.length - 1; i++) {
            numero[i] = numero[i + 1];
        }
        
        //reemplazamos la ultima posicion con 0
        numero[7] = 0;

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
