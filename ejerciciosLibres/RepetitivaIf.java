/*
 *
 * @author costy
 */

import java.util.Scanner;

public class RepetitivaIf {
    public static void main(String[] args){
        
        Scanner tecla = new Scanner(System.in);
        int a, b, aux;
        
        System.out.println("Introduce un valor para a");
        a = tecla.nextInt();
        System.out.println("Introduce un valor para b");
        b = tecla.nextInt();
        
        //intercambio de valores
        aux = a;
        a = b;
        b = aux;
        System.out.println("Tras el intercambios los valores son " + a + " y " +
                b);
    }
}