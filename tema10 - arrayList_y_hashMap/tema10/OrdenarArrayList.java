/*
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados
 * en un objeto de la clase ArrayList.
 */
package tema10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class OrdenarArrayList {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        int num;
        int i;
        
        for(i = 0; i < 10; i++){
            System.out.print("Introduce número " + (i + 1) + ": ");
            a.add(num = t.nextInt());
        }
        
        System.out.println("################################");
        System.out.println("Los número introducidos són: " + a);
        System.out.println("################################");
        
        Collections.sort(a);
        
        System.out.println("Los números ordenados son: " + a);
        
        //para ordenar de mayor a menor se utiliza este bloque
        /*
        for(Integer num: a){
            b.add(0, n);
        }
        
        System.out.print("Los números ordenados de mayor a menor son: " + b);
        */
    }
}
