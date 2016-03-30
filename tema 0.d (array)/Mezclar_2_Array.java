/*
 * Mezclar 2 array de forma que 1º de A con el 1ºB y el 2º de A con el 2º de B
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mezclar_2_Array {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];//debe tener doble de tamaño
        int i;
        int j = 0;

        //leemos tabla a
        System.out.println("Tabla A");
        for(i = 0; i < 5; i++){
            System.out.println("Introduzca número: ");
            a[i] = tec.nextInt();
        }
            
        System.out.println("============================");
        
        //leemos tabla b
        System.out.println("Tabla B");
        for(i = 0; i < 5; i++){
            System.out.println("Introduzca número: ");
            b[i] = tec.nextInt();
        }
        
        //asignamos valores a la tabla c
        for(i = 0; i < 5; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        
        System.out.println("RESULTADO: ");
        System.out.println("================================");
        
        for(j = 0; j < 10; j++){
            System.out.print(c[j] + " ");
        }
        System.out.println("");
    }
}
