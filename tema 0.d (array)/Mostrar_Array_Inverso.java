/*
 * pedir numeros y mostrar el array inverso
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Array_Inverso {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[] = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Introduzca un número: ");
            System.out.println("================================");
            t[i] = Integer.parseInt(tec.nextLine());
        }
        
        System.out.println("Los numeros introducidos son: ");
        System.out.println("================================");
        
        for(int i = 0; i < t.length; i++){
            System.out.print(t[i] + " ");
        }

        System.out.println("\nLos numeros rotados son: ");
        System.out.println("================================");

        for(int j = t.length - 1; j >= 0; j--){
            System.out.print(t[j] + " ");
        }
    }
}
