/*
 * Mezclar 2 array de forma que 3 de A con 3 de B etc
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mezclar_2_Array_De3dn3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int a[] = new int[6];
        int b[] = new int[6];
        int c[] = new int[12];//debe tener doble de tamaño
        int i = 0;
        int j = 0;
        int k;

        //leemos tabla a
        System.out.println("Tabla A");
        for(i = 0; i < 6; i++){
            System.out.println("Introduzca número: ");
            a[i] = tec.nextInt();
        }
            
        System.out.println("============================");
        
        //leemos tabla b
        System.out.println("Tabla B");
        for(i = 0; i < 6; i++){
            System.out.println("Introduzca número: ");
            b[i] = tec.nextInt();
        }
    
        //asignamos valores a la tabla c de 3 en 3
        while(i < 6){
            //copiamos 3 de a
            for(k = 0; k < 3; k++){
                c[j] = a[i + k];
                j++;
            }
            //copiamos 3 de b
            for(k = 0; k < 3; k++){
                c[j] = b[i+ k];
                j++;
            }
            
            //despues de copiar 3 de cada tabla incrementamos i en 3
            i += 3;
        }
        
        System.out.println("RESULTADO: ");
        System.out.println("================================");
        
        for(j = 0; j < 12; j++){
            System.out.print(c[j] + " ");
        }
        System.out.println("");
    }
}
