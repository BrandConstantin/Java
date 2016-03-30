/*
 * Mostar el orden de los numeros dentro del array
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Orden_Array {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[] = new int[10];
        int i;

        for(i = 0; i < 10; i++){
            System.out.println("Introduzca número: ");
            t[i] = tec.nextInt();
        }
        
        System.out.println("Los numeros introducidos son: ");
        System.out.println("================================");
        
        for(i = 0; i <= t.length -1; i++){
            System.out.print(t[i] + " ");
            System.out.println(t[(t.length - 1) - i]);
        }
    }
}
