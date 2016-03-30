/*
 * Leer 5 numeros y mostralo en el orden introducido
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_5_Num {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.println("Introduzca un número: ");
            System.out.println("================================");
            t[i] = tec.nextInt();
        }
        
        System.out.println("Los numeros introducidos son: ");
        System.out.println("================================");
        
        for(int i = 0; i < t.length; i++){
            System.out.print(t[i] + " ");
        }
    }
    
}
