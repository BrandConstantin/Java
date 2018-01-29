/*
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Pares_Impares {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] numero = new int[8];
        String naranja = "\033[33m";
        String azul = "\033[34m";        
        String morado = "\033[35m";

        //pide 8 números
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduce " + (i + 1) + " número: ");
            numero[i] = Integer.parseInt(num.nextLine());
        }

        System.out.println("--------------------------------------------------");

        //sacar el mínimo y el máximo
        for (int i = 0; i < numero.length; i++) {
            //diferenciar pares de impares
            if ((numero[i] % 2) == 0) {
                System.out.println(morado + numero[i] + azul + "\tPAR");
            } else {
                System.out.println(morado + numero[i] + naranja + "\tIMPAR");
            }
        }
    }
}
