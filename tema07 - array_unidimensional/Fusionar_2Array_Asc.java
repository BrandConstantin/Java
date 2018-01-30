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
public class Fusionar_2Array_Asc {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];
        int i, j;
        int k = 0;

        //I array
        System.out.println("TABLA A");
        for (i = 0; i < a.length; i++) {
//            System.out.print("Introduce número (de forma ascendente):");
//            a[i] = tec.nextInt();
            a[i] = (int) (Math.random() * 30);
            System.out.print(a[i] + " ");
        }
        
        //II array
        System.out.println("\nTABLA B");
        for (j = 0; j < b.length; j++) {
//            System.out.print("Introduce número (de forma ascendente):");
//            b[j] = tec.nextInt();
            b[j] = (int) (Math.random() * 30);
            System.out.print(b[j] + " ");
        }

        //III array
        //fusionamos arrays
//        while ((i < 5) && (j < 5)) {
//            if (a[i] < b[j]) {
//                c[k] = a[i];
//                i++;
//            } else {
//                c[k] = b[j];
//                j++;
//            }
//            k++;
//        }

        //copiamos el array a en c y el array b en c
        for (k = 0; k < c.length; k++) {

//            if (i == 5) {
//                while (j < 5) {
//                    c[k] = b[j];
//                    j++;
//                }
//            } else {
//                while (i < 5) {
//                    c[k] = a[i];
//                    i++;
//                }
//            }

            if(a[i] < b[j]){
                c[k] = a[i];
                k++;
            }else{
                c[k] = b[j];
                k++;
            }
        }

        System.out.println("\n");

        //mostrar array final
        for (k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");
        }
//        }
    }
}
