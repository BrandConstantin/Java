/*
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa debe ordenar
 * palabras en lugar de números.
 */
package tema10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class OrdenarPalabrasDeArrayList {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        ArrayList<String> a = new ArrayList<String>();
        
        String palabra;
        int i;
        
        for(i = 0; i < 10; i++){
            System.out.print("Introduce " + (i + 1) + " palabra: ");
            a.add(palabra = t.nextLine());
        }
        
        System.out.println("################################");
        System.out.println("Las palabras introducidas són: " + a);
        System.out.println("################################");
        
        Collections.sort(a);
        
        System.out.println("Las palabras ordenadas son: " + a);
    }
}
